/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak13_2;

/**
 *
 * @author mapam
 */
public class Derived extends Base{
    int i = -1;
    
    public static void main(String args[]){
        Base b = new Derived();
        System.out.println(b.i);
        b.amethod();
    }
    
    public void amethod(){
        System.out.println("Derived.amethod()");
    }
}
