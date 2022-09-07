/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mohamed
 */
public class MyDb1 {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/dina";
    private final String USERNAME = "root";
    private final String PWD = "";
    private Connection c;
    private static MyDb1 instance;

    private MyDb1() {
        try {
            c = DriverManager.getConnection(URL, USERNAME, PWD);
            System.out.println("cnx etablie ....");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static MyDb1 getInstance() {
        if (instance == null) {
            instance = new MyDb1();
        }

        return instance;
    }

    public Connection getCnx() {
        return c;
    }

}
