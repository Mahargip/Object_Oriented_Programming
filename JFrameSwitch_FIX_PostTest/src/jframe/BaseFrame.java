
package jframe;

public class BaseFrame extends javax.swing.JFrame {
    private Main app;
    private StringBuilder historyText = new StringBuilder();
    private String title;
    private String currentFrameName;
    private String previousFrameName;
    
    public BaseFrame(Main app, String currentFrameName) {
        initComponents();
        this.app = app;
        this.currentFrameName = currentFrameName;
        this.previousFrameName = app.getPreviousFrameName();
        this.TextPrevious.setText(this.previousFrameName);
        this.PresentText.setText(currentFrameName);
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
        InputSisiField = new javax.swing.JTextField();
        InputSisiLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        luasnya = new javax.swing.JLabel();
        kelilingnya = new javax.swing.JLabel();
        suhunya = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PreviousLabel.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PreviousLabel.setText("Frame Sebelumnya :");

        PresentLabel.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PresentLabel.setText("Frame Sekarang   :");

        TextPrevious.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        TextPrevious.setText(" ");

        PresentText.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        PresentText.setText("Frame0");

        ButtonSatu.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSatu.setText("1");
        ButtonSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSatuActionPerformed(evt);
            }
        });

        ButtonDua.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonDua.setText("2");
        ButtonDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDuaActionPerformed(evt);
            }
        });

        ButtonTiga.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonTiga.setText("3");
        ButtonTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTigaActionPerformed(evt);
            }
        });

        ButtonEmpat.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonEmpat.setText("4");
        ButtonEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmpatActionPerformed(evt);
            }
        });

        ButtonLima.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonLima.setText("5");
        ButtonLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimaActionPerformed(evt);
            }
        });

        InputSisiLabel.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        InputSisiLabel.setText("Masukkan Angka   :");

        SubmitButton.setText("OK");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        luasnya.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        luasnya.setText("Hasil 1");

        kelilingnya.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        kelilingnya.setText("Hasil 2");

        suhunya.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        suhunya.setText("Hasil 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PresentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PreviousLabel))
                            .addComponent(InputSisiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PresentText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InputSisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SubmitButton)
                                .addGap(0, 155, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(luasnya, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kelilingnya, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(suhunya))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLima, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PresentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PresentText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InputSisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InputSisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(luasnya, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kelilingnya, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suhunya, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSatuActionPerformed
        dispose();
        this.app.frame1(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonSatuActionPerformed

    private void ButtonDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDuaActionPerformed
        dispose();
        this.app.frame2(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonDuaActionPerformed

    private void ButtonTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTigaActionPerformed
        dispose();
        this.app.frame3(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonTigaActionPerformed

    private void ButtonEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmpatActionPerformed
        dispose();
        this.app.frame4(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonEmpatActionPerformed

    private void ButtonLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimaActionPerformed

    }//GEN-LAST:event_ButtonLimaActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame0().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonDua;
    public javax.swing.JButton ButtonEmpat;
    public javax.swing.JButton ButtonLima;
    public javax.swing.JButton ButtonSatu;
    public javax.swing.JButton ButtonTiga;
    public javax.swing.JTextField InputSisiField;
    private javax.swing.JLabel InputSisiLabel;
    private javax.swing.JLabel PresentLabel;
    private javax.swing.JLabel PresentText;
    private javax.swing.JLabel PreviousLabel;
    public javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TextPrevious;
    public javax.swing.JLabel kelilingnya;
    public javax.swing.JLabel luasnya;
    public javax.swing.JLabel suhunya;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void setPrevious(String name) {
//        previous.setText(name);
//    }
}
