/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Statement;
public class AddBooks {

 Statement stmt;

public void Form(String name, String address, String gender,
String age) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO student VALUES('"+name+"', '"+address+"','"+gender+"', '"+age+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
}
}

 
