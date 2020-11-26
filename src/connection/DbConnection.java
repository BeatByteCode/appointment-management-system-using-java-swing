/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nick
 */
public class DbConnection {

    /**
     *
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_2","root","");
        }
         catch (ClassNotFoundException | SQLException e) {
               System.out.println("Error: "+e);
           }
        return conn;
    }
}
