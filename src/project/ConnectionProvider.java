/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("om.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","isu@2password");
            return con;
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
            
        }
                
                
    }
            
            
}
  