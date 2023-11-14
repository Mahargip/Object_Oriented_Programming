/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak17_4;

/**
 *
 * @author mapam
 */
public class Printer implements Copier, Scanner{
    public void scanImage(){
        System.out.println("Scanning image...");
    }
    
    public void copyImage(){
        System.out.println("Copy image...");
    }
    
    public void printImage(){
        System.out.println("Print image...");
    }
}
