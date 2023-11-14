/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Frame2 extends BaseFrame {

    public Frame2(Main app) {
        super(app, "Calculator Persegi");
        ButtonDua.setEnabled(false);
        
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                hitungLuasDanKeliling();
            }
        });
    }
    
    private void hitungLuasDanKeliling(){
        String inputText = InputSisiField.getText();
        Hitung calculator = new CalculatorPersegi();
        try {
            double radius = Double.parseDouble(inputText);
            double luas = calculator.hitungLuas(radius);
            double keliling = calculator.hitungKeliling(radius);
            luasnya.setText("Luas Persegi : " + luas);
            kelilingnya.setText("Keliling Persegi : " + keliling);
            suhunya.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.");
        }
    }
}

