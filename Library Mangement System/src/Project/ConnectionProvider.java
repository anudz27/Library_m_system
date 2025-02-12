/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author Shashini anuththara
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/LIB","root","user");
        return con;
        }
        catch(Exception e)
        {
           System.out.println(e);
           return null;
        }
    }
    
}
