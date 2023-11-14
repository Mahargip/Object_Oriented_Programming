/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Frame3 extends BaseFrame {

    public Frame3(Main app) {
        super(app, "Konversi Suhu");
        ButtonTiga.setEnabled(false);
        
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                hitungLuasDanKeliling();
            }
        });
    }
    
    private void hitungLuasDanKeliling(){
        String inputText = InputSisiField.getText();
        Konvert suhu = new KonversiSuhu();        
        try {
            double amount = Double.parseDouble(inputText);

            double celcius = suhu.convert(amount);
            double fahrenheit = (celcius * 9/5) + 32;
            double kelvin = celcius + 273.15;
            luasnya.setText("Celcius : " + celcius);
            kelilingnya.setText("Fahrenheit: " + fahrenheit);
            suhunya.setText("Kelvin : " + kelvin);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.");
        }
    }
}

