/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MICHELLE
 */
import java.sql.*;
public class connectDB {
    
    public static Connection myconnection(){
        Connection conn;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/storagemanagement", "root", "");
             return conn;            
        }catch(Exception e){
            System.out.println("Error Connection!");
            return null;
        }
    }        
}
