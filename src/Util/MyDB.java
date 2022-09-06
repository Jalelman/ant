/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Universite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javafx.collections.FXCollections.observableList;
import static javafx.collections.FXCollections.observableList;

/**
 *
 * @author Marwa
 */
public class MyDB {
    private final String URL = "jdbc:mysql://127.0.0.1:3306/ant";
    private final String USERNAME = "root";
    private final String PWD = "";
    private Connection c;
    private static MyDB instance;

    private MyDB() {
        try {
            c = DriverManager.getConnection(URL, USERNAME, PWD);
            System.out.println("cnx etablie ....");
        } catch (SQLException ex) {
            System.out.println("connexion echouer");
        }
    }

    public static MyDB getInstance() {
        if (instance == null) {
            instance = new MyDB();
        }

        return instance;
    }

    public Connection getCnx() {
        return c;
    }
    
}
