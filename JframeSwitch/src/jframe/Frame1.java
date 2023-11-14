/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import controller.*;

/**
 *
 * @author mapam
 */
public class Frame1 extends javax.swing.JFrame {
    private MainFrame app;
    private String className;
    
    public Frame1(MainFrame app) { 
        initComponents();
        this.app = app;
        className = app.nameFrame();
        TextPrevious.setText(className);
        ButtonDua.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PreviousLabel = new javax.swing.JLabel();
        PresentLabel = new javax.swing.JLabel();
        TextPrevious = new javax.swing.JLabel();
        PresentText = new javax.swing.JLabel();
        ButtonSatu = new javax.swing.JButton();
        ButtonDua = new javax.swing.JButton();
        ButtonTiga = new javax.swing.JButton();
        ButtonEmpat = new javax.swing.JButton();
        ButtonLima = new javax.swing.JButton();
        ButtonEnam = new javax.swing.JButton();
        ButtonTujuh = new javax.swing.JButton();
        ButtonDelapan = new javax.swing.JButton();
        ButtonSembilan = new javax.swing.JButton();
        ButtonSepuluh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PreviousLabel.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PreviousLabel.setText("Frame Sebelumnya :");

        PresentLabel.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PresentLabel.setText("Frame Sekarang   :");

        TextPrevious.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        TextPrevious.setText(" ");

        PresentText.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PresentText.setText("Frame1");

        ButtonSatu.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSatu.setText("0");
        ButtonSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSatuActionPerformed(evt);
            }
        });

        ButtonDua.setBackground(new java.awt.Color(153, 204, 255));
        ButtonDua.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonDua.setText("1");
        ButtonDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDuaActionPerformed(evt);
            }
        });

        ButtonTiga.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonTiga.setText("2");
        ButtonTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTigaActionPerformed(evt);
            }
        });

        ButtonEmpat.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonEmpat.setText("3");
        ButtonEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmpatActionPerformed(evt);
            }
        });

        ButtonLima.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonLima.setText("4");
        ButtonLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimaActionPerformed(evt);
            }
        });

        ButtonEnam.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonEnam.setText("5");
        ButtonEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnamActionPerformed(evt);
            }
        });

        ButtonTujuh.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonTujuh.setText("6");
        ButtonTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTujuhActionPerformed(evt);
            }
        });

        ButtonDelapan.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonDelapan.setText("7");
        ButtonDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelapanActionPerformed(evt);
            }
        });

        ButtonSembilan.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSembilan.setText("8");
        ButtonSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSembilanActionPerformed(evt);
            }
        });

        ButtonSepuluh.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSepuluh.setText("9");
        ButtonSepuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSepuluhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PresentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PreviousLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PresentText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonLima, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSepuluh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLima, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PresentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PresentText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSepuluh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSatuActionPerformed
        dispose();
        app.showFrame0();
    }//GEN-LAST:event_ButtonSatuActionPerformed

    private void ButtonDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDuaActionPerformed
        dispose();
        app.showFrame1();
    }//GEN-LAST:event_ButtonDuaActionPerformed

    private void ButtonTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTigaActionPerformed
        dispose();
        app.showFrame2();
    }//GEN-LAST:event_ButtonTigaActionPerformed

    private void ButtonEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmpatActionPerformed
        dispose();
        app.showFrame3();
    }//GEN-LAST:event_ButtonEmpatActionPerformed

    private void ButtonLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimaActionPerformed
        dispose();
        app.showFrame4();
    }//GEN-LAST:event_ButtonLimaActionPerformed

    private void ButtonEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnamActionPerformed
        dispose();
        app.showFrame5();
    }//GEN-LAST:event_ButtonEnamActionPerformed

    private void ButtonTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTujuhActionPerformed
        dispose();
        app.showFrame6();
    }//GEN-LAST:event_ButtonTujuhActionPerformed

    private void ButtonDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelapanActionPerformed
        dispose();
        app.showFrame7();
    }//GEN-LAST:event_ButtonDelapanActionPerformed

    private void ButtonSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSembilanActionPerformed
        dispose();
        app.showFrame8();
    }//GEN-LAST:event_ButtonSembilanActionPerformed

    private void ButtonSepuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSepuluhActionPerformed
        dispose();
        app.showFrame9();
    }//GEN-LAST:event_ButtonSepuluhActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelapan;
    private javax.swing.JButton ButtonDua;
    private javax.swing.JButton ButtonEmpat;
    private javax.swing.JButton ButtonEnam;
    private javax.swing.JButton ButtonLima;
    private javax.swing.JButton ButtonSatu;
    private javax.swing.JButton ButtonSembilan;
    private javax.swing.JButton ButtonSepuluh;
    private javax.swing.JButton ButtonTiga;
    private javax.swing.JButton ButtonTujuh;
    private javax.swing.JLabel PresentLabel;
    private javax.swing.JLabel PresentText;
    private javax.swing.JLabel PreviousLabel;
    private javax.swing.JLabel TextPrevious;
    // End of variables declaration//GEN-END:variables
}
