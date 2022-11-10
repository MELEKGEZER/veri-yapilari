/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınuyazeditor;

import java.awt.Event;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.util.Stack;
import javax.swing.KeyStroke;

/**
 *
 * @author Fatih
 */
public class EditorPage extends javax.swing.JFrame {

    /**
     * Creates new form EditorPage
     */
    public EditorPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnKaydet = new javax.swing.JButton();
        btnIleri = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbFonts = new javax.swing.JComboBox<>();
        btnItalik = new javax.swing.JToggleButton();
        btnBold = new javax.swing.JToggleButton();
        cmbSize = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        btnKaydet.setText("Kaydet");

        btnIleri.setText("Undo");
        btnIleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIleriActionPerformed(evt);
            }
        });

        btnGeri.setText("Redo");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        cmbFonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFontsActionPerformed(evt);
            }
        });

        btnItalik.setText("İtalik");
        btnItalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalikActionPerformed(evt);
            }
        });

        btnBold.setText("Bold");
        btnBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoldActionPerformed(evt);
            }
        });

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "12", "14", "16", "18", "22", "24", "26", "28", "30", "32", "34", "48", "72" }));
        cmbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbFonts, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKaydet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIleri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGeri)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnItalik, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBold)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet)
                    .addComponent(btnIleri)
                    .addComponent(btnGeri)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFonts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItalik)
                    .addComponent(btnBold)
                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        Dugum sonEleman = (Dugum)undo.pop();
      
        redo.push(sonEleman);
        
        String yazi = jTextPane1.getText();
        
        String sonYazi = yazi.substring(0, sonEleman.index);
        
        jTextPane1.setText(sonYazi);
    }//GEN-LAST:event_btnGeriActionPerformed
    int i =0;
    int sonindex =0;
    Stack undo = new Stack();
    Stack redo = new Stack();
    private void jTextPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyChar() == ' ')
        {
            String yazi = jTextPane1.getText();
        
            String kelime = yazi.substring(sonindex, yazi.length()-1);
            
            undo.push(new Dugum(i, kelime));
            
            sonindex = i+1;
        }
        
        i++;
    }//GEN-LAST:event_jTextPane1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText(undo.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIleriActionPerformed
        // TODO add your handling code here:
        
        String yazi = jTextPane1.getText();
        Dugum sonEleman = (Dugum)redo.pop();
        
        yazi = yazi + " " + sonEleman.kelime;
        
        jTextPane1.setText(yazi);
        
        
        
    }//GEN-LAST:event_btnIleriActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilies = ge.getAvailableFontFamilyNames();
        for (String ff : fontFamilies) {
            cmbFonts.addItem(ff);
        }
        
        cmbSize.setSelectedItem("12");
        cmbFonts.setSelectedItem("Arial");
    }//GEN-LAST:event_formWindowOpened

    private void cmbFontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFontsActionPerformed
        // TODO add your handling code here:
        setFont();
    }//GEN-LAST:event_cmbFontsActionPerformed

    private void btnItalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalikActionPerformed
        // TODO add your handling code here:
        setFont();
    }//GEN-LAST:event_btnItalikActionPerformed

    private void btnBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoldActionPerformed
        // TODO add your handling code here:
        setFont();
    }//GEN-LAST:event_btnBoldActionPerformed

    private void cmbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSizeActionPerformed
        // TODO add your handling code here:
        setFont();
    }//GEN-LAST:event_cmbSizeActionPerformed

    public void setFont()
    {
        int size = Integer.parseInt(cmbSize.getSelectedItem().toString());
        if(btnItalik.isSelected() && btnBold.isSelected() == false)
        {
            Font font = new Font(cmbFonts.getSelectedItem().toString(), Font.ITALIC, size);
            jTextPane1.setFont(font);
        }
        else if(btnItalik.isSelected() == false && btnBold.isSelected())
        {
            Font font = new Font(cmbFonts.getSelectedItem().toString(), Font.BOLD, size);
            jTextPane1.setFont(font);
        }
        else
        {
            Font font = new Font(cmbFonts.getSelectedItem().toString(), Font.PLAIN, size);
            jTextPane1.setFont(font);
        }
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
            java.util.logging.Logger.getLogger(EditorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBold;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnIleri;
    private javax.swing.JToggleButton btnItalik;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JComboBox<String> cmbFonts;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private void UndoAction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
