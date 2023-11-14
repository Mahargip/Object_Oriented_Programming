/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak17_1;

/**
 *
 * @author mapam
 */
public class Burung extends Binatang{
    
    public void makan(){
        super.makan();
        System.out.println("burung makan biji-bijian");
    }
    
    public void berkembangBiak(){
        System.out.println("burung berkembang biak dengan cara bertelur");
    }
}
