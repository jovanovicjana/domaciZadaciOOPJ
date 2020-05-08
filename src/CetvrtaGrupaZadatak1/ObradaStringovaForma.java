
package CetvrtaGrupaZadatak1;

import java.awt.Color;
import java.awt.Font;
import java.awt.im.InputContext;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ObradaStringovaForma extends javax.swing.JFrame {

    public ObradaStringovaForma() {
        initComponents();
        jPanel.setBorder(BorderFactory.createTitledBorder(null, "Unos stringa", 0, 1,new Font(Font.SERIF, Font.PLAIN,  10), Color.blue));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        userInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DuzinaStringaRadioButton = new javax.swing.JRadioButton();
        IspisStringaRadioButton = new javax.swing.JRadioButton();
        IspisStringaUnazadRadioButton = new javax.swing.JRadioButton();
        obradiButton = new javax.swing.JButton();
        obrisiButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rezultatObradeLabel = new javax.swing.JLabel();

        setTitle("Obrada stringova");
        setBackground(new java.awt.Color(203, 142, 81));
        setBounds(new java.awt.Rectangle(400, 100, 500, 500));

        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.setToolTipText("");
        jPanel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jPanel.setName(""); // NOI18N
        jPanel.setPreferredSize(new java.awt.Dimension(555, 228));

        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Unesite rečenicu:");

        myGroup.add(DuzinaStringaRadioButton);
        DuzinaStringaRadioButton.setText("Dužina stringa");
        DuzinaStringaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzinaStringaRadioButtonActionPerformed(evt);
            }
        });

        myGroup.add(IspisStringaRadioButton);
        IspisStringaRadioButton.setText("Ispis stringa");
        IspisStringaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IspisStringaRadioButtonActionPerformed(evt);
            }
        });

        myGroup.add(IspisStringaUnazadRadioButton);
        IspisStringaUnazadRadioButton.setText("Ispis stringa unazad");
        IspisStringaUnazadRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IspisStringaUnazadRadioButtonActionPerformed(evt);
            }
        });

        obradiButton.setText("Obradi");
        obradiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obradiButtonActionPerformed(evt);
            }
        });

        obrisiButton.setText("Obriši");
        obrisiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IspisStringaUnazadRadioButton)
                            .addComponent(IspisStringaRadioButton)
                            .addComponent(DuzinaStringaRadioButton)
                            .addComponent(jLabel1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userInput)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(obradiButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obrisiButton)))
                        .addGap(34, 34, 34))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DuzinaStringaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IspisStringaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IspisStringaUnazadRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obradiButton)
                    .addComponent(obrisiButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Rezultat obrade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(rezultatObradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rezultatObradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obrisiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiButtonActionPerformed
        userInput.setText("");
        rezultatObradeLabel.setText("");
    }//GEN-LAST:event_obrisiButtonActionPerformed

    private void IspisStringaUnazadRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IspisStringaUnazadRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IspisStringaUnazadRadioButtonActionPerformed

    private void IspisStringaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IspisStringaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IspisStringaRadioButtonActionPerformed

    private void DuzinaStringaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuzinaStringaRadioButtonActionPerformed
      
    }//GEN-LAST:event_DuzinaStringaRadioButtonActionPerformed

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
       
    }//GEN-LAST:event_userInputActionPerformed

    private void obradiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obradiButtonActionPerformed
        if (DuzinaStringaRadioButton.isSelected()){
            String unesenString = userInput.getText();
            int duzinaStringa = unesenString.length();
            rezultatObradeLabel.setText("Duzina stringa je " + duzinaStringa + " karktera");
        }
        else if (IspisStringaRadioButton.isSelected()){
            String unesenString = userInput.getText();
            rezultatObradeLabel.setText(unesenString);
        } 
        else if (IspisStringaUnazadRadioButton.isSelected()){
            String unesenString = userInput.getText();
            int duzinaStringa = unesenString.length();
            String obrnutString = "";
            for (int i=duzinaStringa-1; i>=0; i--){
                obrnutString += unesenString.charAt(i);
            }
            rezultatObradeLabel.setText(obrnutString);
        }
        
        
    }//GEN-LAST:event_obradiButtonActionPerformed

    public JTextField getUserInput() {
        return userInput;
    }

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ObradaStringovaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObradaStringovaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObradaStringovaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObradaStringovaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObradaStringovaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DuzinaStringaRadioButton;
    private javax.swing.JRadioButton IspisStringaRadioButton;
    private javax.swing.JRadioButton IspisStringaUnazadRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup myGroup;
    private javax.swing.JButton obradiButton;
    private javax.swing.JButton obrisiButton;
    private javax.swing.JLabel rezultatObradeLabel;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
