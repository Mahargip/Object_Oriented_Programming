/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_2;

/**
 *
 * @author mapam
 */
public class Mahasiswa extends User{
    private Dosen dosenWali;
    private String kelas;
    
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String username, String password, String phone){
        super(username, password, phone);
    }
    
//     public void setUsername(String username){
//        this.username = username;
//    }
//    
//    public void setPassword(String password){
//        this.password = password;
//    }
//    
//    public void setPhone(String phone){
//        this.phone = phone;
//    }
    
    
}
