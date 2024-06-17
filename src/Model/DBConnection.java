/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class DBConnection {
    static Connection conn;
    static Statement stat = null;

 public static Statement getStatementConnection() {
 try {
//Establish the connection
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 conn = DriverManager.getConnection(url, "root", "");
//Create the connection
 stat = conn.createStatement();

 } catch (Exception e) {
 e.printStackTrace();
 }
 return stat;
 }
 //Close the connection
public static void closeCon() throws SQLException {
 conn.close();
 }
public static Connection getConnection() {
  try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/dresspoint", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }}
}
