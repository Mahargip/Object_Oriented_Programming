/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_2;

/**
 *
 * @author mapam
 */
public class User {
    private String id;
    private String phone;
    private String username;
    private String password;
    
    public User() {
        
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }
    
    public boolean login(String username, String password) {
        return true;
    }
    
//    public boolean login(String phone, String password) {
//        if (this.phone.equals(phone) && this.password.equals(password)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
   
}
