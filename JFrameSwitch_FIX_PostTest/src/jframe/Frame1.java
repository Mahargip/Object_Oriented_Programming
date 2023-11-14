/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mapam
 */
public class Frame1 extends BaseFrame {
    
    public Frame1(Main app) {
        super(app, "Calculator Lingkaran");
        ButtonSatu.setEnabled(false);
        
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                hitungLuasDanKeliling();
            }
        });
    }
    
    private void hitungLuasDanKeliling(){
        String inputText = InputSisiField.getText();        
        Hitung calculator = new CalculatorLingkaran();
        try {
            double radius = Double.parseDouble(inputText);
            double luas = calculator.hitungLuas(radius);
            double keliling = calculator.hitungKeliling(radius);
            luasnya.setText("Luas Lingkaran : " + luas);
            kelilingnya.setText("Keliling Lingkaran : " + keliling);
            suhunya.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.");
        }
    }
    
}


