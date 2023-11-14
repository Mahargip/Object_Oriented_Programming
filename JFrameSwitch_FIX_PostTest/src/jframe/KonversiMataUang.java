/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author mapam
 */
public class KonversiMataUang extends Konvert implements Konversi {
    @Override
    public double convert(double amount) {
        return amount / 15000;
    }
}

