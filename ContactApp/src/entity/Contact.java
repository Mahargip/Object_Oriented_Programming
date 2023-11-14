/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mapam
 */
public class Contact {
    private String name;
    private String number;
    private String email;
    
    public Contact(String name, String number, String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
}
