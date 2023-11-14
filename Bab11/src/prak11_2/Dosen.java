/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_2;

/**
 *
 * @author mapam
 */
public class Dosen extends User{
    private String pangkat;
    private String golongan;
    private String key;
    
    private String username;
    private String password;
    private String phone;
    
    public Dosen() {

    }
    
    public Dosen(String username, String password, String key){
        super(username, password);
        this.key = key;
    }
    
    public boolean login(String username, String password){
        return true;
    }
    
    public boolean login(String username, String password, String key){
        return true;
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
