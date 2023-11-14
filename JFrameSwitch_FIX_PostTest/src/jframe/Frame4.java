/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Frame4 extends BaseFrame {
    public Frame4(Main app) {
        super(app, "Konversi Mata Uang");
        ButtonEmpat.setEnabled(false);
        
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                hitungLuasDanKeliling();
            }
        });
    }
    
    private void hitungLuasDanKeliling(){
        String inputText = InputSisiField.getText();
        Konvert uang = new KonversiMataUang();
        try {
            double amount = Double.parseDouble(inputText);
            double usd = uang.convert(amount);  
            double idr = usd * 15000;
            double pdr = usd * 0.8;
            luasnya.setText("Rupiah : " + idr);
            kelilingnya.setText("US Dollar: " + usd);
            suhunya.setText("Poundsterling : " + pdr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.");
        }
    }
}

