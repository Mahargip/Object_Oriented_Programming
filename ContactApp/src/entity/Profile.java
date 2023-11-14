/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mapam
 */
public class Profile {
    private String myName;
    private String myNumber;
    private String myEmail;
    
    public Profile(String myNumber, String myEmail){
        this.myNumber = myNumber;
        this.myEmail = myEmail;
    }
    
    public Profile(String myName, String myNumber, String myEmail){
        this.myName = myName;
        this.myNumber = myNumber;
        this.myEmail = myEmail;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public void setMyEmail(String myEmail) {
        this.myEmail = myEmail;
    }
    
    
}
