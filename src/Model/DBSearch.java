/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class DBSearch {
    
 Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM logins where username='"+ name + "'");
 } catch (SQLException e) {
 }
 return rs;
 }

    
    

}
    