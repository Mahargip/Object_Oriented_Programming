
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

        ButtonEnam.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonEnam.setText("6");
        ButtonEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnamActionPerformed(evt);
            }
        });

        ButtonTujuh.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonTujuh.setText("7");
        ButtonTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTujuhActionPerformed(evt);
            }
        });

        ButtonDelapan.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonDelapan.setText("8");
        ButtonDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelapanActionPerformed(evt);
            }
        });

        ButtonSembilan.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSembilan.setText("9");
        ButtonSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSembilanActionPerformed(evt);
            }
        });

        ButtonSepuluh.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        ButtonSepuluh.setText("10");
        ButtonSepuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSepuluhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PresentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PreviousLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PresentText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ButtonSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonLima, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PresentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PresentText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
        dispose();
        this.app.frame5(this.currentFrameName);
        this.app.addHistory(this.title);

    }//GEN-LAST:event_ButtonLimaActionPerformed

    private void ButtonEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnamActionPerformed
        dispose();
        this.app.frame6(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonEnamActionPerformed

    private void ButtonTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTujuhActionPerformed
        dispose();
        this.app.frame7(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonTujuhActionPerformed

    private void ButtonDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelapanActionPerformed
        dispose();
        this.app.frame8(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonDelapanActionPerformed

    private void ButtonSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSembilanActionPerformed
        dispose();
        this.app.frame9(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonSembilanActionPerformed

    private void ButtonSepuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSepuluhActionPerformed
        dispose();
        this.app.frame10(this.currentFrameName);
        this.app.addHistory(this.title);
    }//GEN-LAST:event_ButtonSepuluhActionPerformed

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
    public javax.swing.JButton ButtonDelapan;
    public javax.swing.JButton ButtonDua;
    public javax.swing.JButton ButtonEmpat;
    public javax.swing.JButton ButtonEnam;
    public javax.swing.JButton ButtonLima;
    public javax.swing.JButton ButtonSatu;
    public javax.swing.JButton ButtonSembilan;
    public javax.swing.JButton ButtonSepuluh;
    public javax.swing.JButton ButtonTiga;
    public javax.swing.JButton ButtonTujuh;
    private javax.swing.JLabel PresentLabel;
    private javax.swing.JLabel PresentText;
    private javax.swing.JLabel PreviousLabel;
    private javax.swing.JLabel TextPrevious;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void setPrevious(String name) {
//        previous.setText(name);
//    }
}
