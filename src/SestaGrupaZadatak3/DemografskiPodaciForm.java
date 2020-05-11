/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SestaGrupaZadatak3;

import com.sun.javafx.css.CssError;
import java.awt.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Jana Jovanovic
 */
public class DemografskiPodaciForm extends javax.swing.JFrame {

    /**
     * Creates new form DemografskiPodaciForm
     */
    RegijeGUI regijaGUI = new RegijeGUI();

    
    private DefaultListModel<String> listModel=new DefaultListModel<String>();
    
    public DemografskiPodaciForm() {
        initComponents();
        listaOpstina.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ObrisiButton = new javax.swing.JButton();
        SacuvajButton = new javax.swing.JButton();
        DodajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOpstina = new javax.swing.JList<>();
        NatalitetTextField = new javax.swing.JTextField();
        NazivTextField = new javax.swing.JTextField();
        MortalitetTextField = new javax.swing.JTextField();
        MigracioniSaldoTextField = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demografski podaci po regionima");

        jLabel1.setText("Naziv");

        jLabel2.setText("Natalitet");

        jLabel3.setText("Mortalitet");

        jLabel4.setText("Migracioni saldo");

        ObrisiButton.setText("Obrisi");
        ObrisiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObrisiButtonActionPerformed(evt);
            }
        });

        SacuvajButton.setText("Sacuvaj");
        SacuvajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacuvajButtonActionPerformed(evt);
            }
        });

        DodajButton.setText("Dodaj");
        DodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaOpstina);

        NatalitetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatalitetTextFieldActionPerformed(evt);
            }
        });

        NazivTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazivTextFieldActionPerformed(evt);
            }
        });

        MortalitetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MortalitetTextFieldActionPerformed(evt);
            }
        });

        MigracioniSaldoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MigracioniSaldoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NazivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NatalitetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MortalitetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MigracioniSaldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(DodajButton)
                .addGap(33, 33, 33)
                .addComponent(SacuvajButton)
                .addGap(27, 27, 27)
                .addComponent(ObrisiButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NazivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NatalitetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(MortalitetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MigracioniSaldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DodajButton)
                    .addComponent(SacuvajButton)
                    .addComponent(ObrisiButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajButtonActionPerformed
        
       Regija novaRegija = new Regija();
       novaRegija.setNaziv(NazivTextField.getText());
       novaRegija.setNatalitet(Integer.parseInt(NatalitetTextField.getText()));
       novaRegija.setMortalitet(Integer.parseInt(MortalitetTextField.getText()));
       novaRegija.setMigracioniSaldo(Integer.parseInt(MigracioniSaldoTextField.getText()));
       
       if (regijaGUI.Dodaj(novaRegija)){
           listModel.removeAllElements();
            for (int i=0; i<regijaGUI.getRegioni().size(); i++){
               listModel.addElement(regijaGUI.getRegioni().get(i).toString());
           }  
       } else {
           listModel.addElement("GRESKA");
       }
       
    }//GEN-LAST:event_DodajButtonActionPerformed

    private void NatalitetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatalitetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NatalitetTextFieldActionPerformed

    private void NazivTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazivTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazivTextFieldActionPerformed

    private void MortalitetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortalitetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MortalitetTextFieldActionPerformed

    private void MigracioniSaldoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MigracioniSaldoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MigracioniSaldoTextFieldActionPerformed

    private void ObrisiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObrisiButtonActionPerformed
        // TODO add your handling code here:
        NazivTextField.setText("");
        NatalitetTextField.setText("");
        MortalitetTextField.setText("");
        MigracioniSaldoTextField.setText("");
    }//GEN-LAST:event_ObrisiButtonActionPerformed

    private void SacuvajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacuvajButtonActionPerformed
        try {
            // TODO add your handling code here:
            regijaGUI.SacuvajRegije();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemografskiPodaciForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SacuvajButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DemografskiPodaciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemografskiPodaciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemografskiPodaciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemografskiPodaciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemografskiPodaciForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DodajButton;
    private javax.swing.JTextField MigracioniSaldoTextField;
    private javax.swing.JTextField MortalitetTextField;
    private javax.swing.JTextField NatalitetTextField;
    private javax.swing.JTextField NazivTextField;
    private javax.swing.JButton ObrisiButton;
    private javax.swing.JButton SacuvajButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaOpstina;
    // End of variables declaration//GEN-END:variables
}