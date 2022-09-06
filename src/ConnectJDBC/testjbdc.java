/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marwa
 */
public class testjbdc {
    public static void main(String[] args) {
        // TODO code application logic here
        final String URL="jdbc:mysql://127.0.0.1:3306/ant";
        final String USERNAME="root";
        final String PWD="";
        Connection c;
        
        try {
            c = DriverManager.getConnection(URL, USERNAME, PWD);
            System.out.println("cnx etablie ....");
        } catch (SQLException ex) {
            System.out.println("cnx echouer"); 
        }   
    }
}
