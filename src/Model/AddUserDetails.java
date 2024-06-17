/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;

public class AddUserDetails {
    private Statement stmt;

    public void UserDetails(String UserID, String UserName, String Address) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO userdetails (UserID, UserName, Address,) VALUES ('" + UserID + "','" + UserName + "', '" + Address + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
