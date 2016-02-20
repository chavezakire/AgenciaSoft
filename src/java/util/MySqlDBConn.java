/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDBConn {
    
    private MySqlDBConn(){
        
    }
    
    static{
        try {
                Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }	
    }
    
    public static Connection obtenerConexion(){	
        // 1. Para referenciar al pool creamos un contexto JNDI
        // Java Naming and Directory Interface
        Connection cn = null;

        try {
                cn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/bdhotel", 
                                "root","admin");

                /*cn = DriverManager.getConnection(
                                "jdbc:mysql://192.168.0.103:3307/db_casino", 
                                "root","root");*/

        } catch (SQLException e) {
                e.printStackTrace();
        }	
        return cn;	
    }
}
