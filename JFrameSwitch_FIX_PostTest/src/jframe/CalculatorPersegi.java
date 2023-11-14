/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author mapam
 */
public class CalculatorPersegi extends Hitung implements Calculator {
    @Override
    public double hitungLuas(double side) {
        return side * side;
    }

    @Override
    public double hitungKeliling(double side) {
        return 4 * side;
    }
}

