/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_1;

/**
 *
 * @author mapam
 */
public class Dosen extends User{
    public String pangkat;
    public String golongan;
    public String key;
    
    public Dosen() {

    }
    
    public Dosen(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public boolean login(String username, String password){
        if (this.username.equals(username) && this.password.equals(password) || this.phone.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean login(String username, String password, String key){
        if (this.username.equals(username) && this.password.equals(password) && this.key.equals(key) || this.phone.equals(username) && this.password.equals(password) && this.key.equals(key)) {
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
//
//    public boolean login(String phone, String password, String key){
//        if (this.phone.equals(phone) && this.password.equals(password) && this.key.equals(key)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void setKey(String key) {
        this.key = key;
    }
    
    
}
