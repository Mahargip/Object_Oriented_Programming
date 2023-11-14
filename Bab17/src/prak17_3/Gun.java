/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak17_3;

/**
 *
 * @author mapam
 */
public class Gun extends Weapon{
    public int bullet;
    
    public Gun(int bullets){
        this.bullet = bullets;
    }
    
    public void attack(){
        bullet-=1;
        System.out.println("Senjata");
        System.out.println("Menembakkan peluru");
        System.out.println("Sisa peluru : " + bullet);
    }
}
