/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author mapam
 */
public class CalculatorLingkaran extends Hitung implements Calculator {    
    @Override
    public double hitungLuas(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double hitungKeliling(double radius) {
        return 2 * Math.PI * radius;
    }
}

