/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak17_3;

/**
 *
 * @author mapam
 */
public class TestAbstract {
    public static void main(String args[]){
        Weapon weapon = new Knife();
        Weapon knife = new Knife();
        Weapon gun = new Gun(10);
        
        knife.attack();
        gun.attack();
        gun.attack();
        
        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack();
        gun2.attack();
        gun2.attack();
    }
}
