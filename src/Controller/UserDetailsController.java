/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class UserDetailsController {
    public static void UserDetails(String UserName, String Address, String UserID) {
        new Model.AddUserDetails().UserDetails(UserName, Address, UserID);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
}

