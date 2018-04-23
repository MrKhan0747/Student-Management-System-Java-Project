/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONNECTION="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false"; 
    
    public static Connection connection()
    {
                Connection con=null;
                
        try {
            con=DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                return con;
                
    
    }
    
}
