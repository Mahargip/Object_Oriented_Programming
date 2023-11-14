/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_1;

/**
 *
 * @author mapam
 */
public class Mahasiswa extends User{
    public Dosen dosenWali;
    public String kelas;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String username, String password){
        this.username = username;
        this.password = password;
    }
    
     public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    
}
