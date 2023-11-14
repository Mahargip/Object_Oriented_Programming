/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_1;

/**
 *
 * @author mapam
 */
public class User {
    public String id;
    public String phone;
    public String username;
    public String password;
    
    public User() {
        
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password) || this.phone.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    
//    public boolean login(String phone, String password) {
//        if (this.phone.equals(phone) && this.password.equals(password)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
   
}
