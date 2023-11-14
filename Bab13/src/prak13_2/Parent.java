/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak13_2;

/**
 *
 * @author mapam
 */
public class Parent {
    private void method1(){
        System.out.println("Parent's method1()");
    }
    
    public void method2(){
        System.out.println("Parent's method2()");
        method1();
    }
}
