/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak17_1;

/**
 *
 * @author mapam
 */
public class Test {
    public static void main(String args[]){
        Binatang loveBird = new Burung();
        Binatang cat = new Mamalia();
        Mamalia dolphin = new Mamalia();
        
        loveBird.bernafas();
        loveBird.makan();
        loveBird.berkembangBiak();
        
        cat.bernafas();
        cat.makan();
        cat.berkembangBiak();
        
        dolphin.berkembangBiak();
    }
}
