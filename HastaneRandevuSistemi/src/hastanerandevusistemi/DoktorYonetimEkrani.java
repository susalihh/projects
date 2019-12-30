/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DoktorYonetimEkrani extends javax.swing.JFrame {

    
    public DoktorYonetimEkrani() {
        initComponents();     
        modelim.setRowCount(0);
        Object[] kolonlar = {"ID Numarası","Ad","Soyad","Branş"};
        satirlar = new Object[4];
        modelim.setColumnIdentifiers(kolonlar);
        table.setModel(modelim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        kayitSilButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        kayitListeleButton = new javax.swing.JButton();
        kayitGuncelleButton = new javax.swing.JButton();
        doktorAdTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        doktorSoyadTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        kayitEkleButton = new javax.swing.JButton();
        bransComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(82, 179, 217));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        kayitSilButton.setBackground(new java.awt.Color(82, 179, 217));
        kayitSilButton.setText("KAYIT SİL");
        kayitSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitSilButtonActionPerformed(evt);
            }
        });

        idTextField.setBackground(new java.awt.Color(149, 165, 166));
        idTextField.setText("ID Numarası ile");
        idTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idTextFieldMouseClicked(evt);
            }
        });

        kayitListeleButton.setBackground(new java.awt.Color(82, 179, 217));
        kayitListeleButton.setText("LİSTELE");
        kayitListeleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitListeleButtonActionPerformed(evt);
            }
        });

        kayitGuncelleButton.setBackground(new java.awt.Color(82, 179, 217));
        kayitGuncelleButton.setText("GÜNCELLE");
        kayitGuncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitGuncelleButtonActionPerformed(evt);
            }
        });

        doktorAdTextField.setBackground(new java.awt.Color(149, 165, 166));
        doktorAdTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Soyadı:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Adı:");

        doktorSoyadTextField.setBackground(new java.awt.Color(149, 165, 166));
        doktorSoyadTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Branşı");

        kayitEkleButton.setBackground(new java.awt.Color(82, 179, 217));
        kayitEkleButton.setText("EKLE");
        kayitEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitEkleButtonActionPerformed(evt);
            }
        });

        bransComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BESLENME VE DİYET", "ÇOCUK SAĞLIĞI VE HASTALIKLARI", "FİZİKSEL TIP VE REHABİLİTASYON", "GÖZ HASTALIKLARI", "KULAK - BURUN - BOĞAZ HASTALIKLARI", "ORTOPEDİ", "PSİKİYATRİ" }));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kayitListeleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kayitGuncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(kayitEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doktorAdTextField)
                    .addComponent(doktorSoyadTextField)
                    .addComponent(bransComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idTextField, jButton1, kayitEkleButton, kayitGuncelleButton, kayitListeleButton, kayitSilButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doktorAdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doktorSoyadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bransComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(kayitSilButton))
                    .addComponent(kayitListeleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayitGuncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayitEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doktorlar Yönetim Paneli");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel modelim = new DefaultTableModel();;
    Object[] kolonlar;
    Object[] satirlar;
    private void kayitListeleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitListeleButtonActionPerformed

        modelim.setRowCount(0);
        ResultSet rs ;       
        DoktorIslemler di = new DoktorIslemler();
        rs = di.doktorGetir();

        try {
            while(rs.next()){
                satirlar[0] = rs.getString("doktorId");
                satirlar[1] = rs.getString("doktorAd");
                satirlar[2] = rs.getString("doktorSoyad");
                satirlar[3] = rs.getString("doktorBrans");
                modelim.addRow(satirlar);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        table.setModel(modelim);       
    }//GEN-LAST:event_kayitListeleButtonActionPerformed

    private void idTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTextFieldMouseClicked
        idTextField.setText("");
    }//GEN-LAST:event_idTextFieldMouseClicked

    private void kayitSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitSilButtonActionPerformed
        int hastaId = Integer.parseInt(idTextField.getText());
        
        DoktorIslemler di = new DoktorIslemler(hastaId,null,null,null);
        di.doktorKayitSil();       
    }//GEN-LAST:event_kayitSilButtonActionPerformed

    private void kayitEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitEkleButtonActionPerformed
        String ad = doktorAdTextField.getText();
        String soyad = doktorSoyadTextField.getText();
        String brans= String.valueOf(bransComboBox.getSelectedItem());
              
        DoktorIslemler di = new DoktorIslemler(0,ad,soyad,brans);
        di.doktorKayitEkle();
        JOptionPane.showMessageDialog(null, "Kayıt Eklendi");
    }//GEN-LAST:event_kayitEkleButtonActionPerformed

    private void kayitGuncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitGuncelleButtonActionPerformed
        String ad = doktorAdTextField.getText();
        String soyad = doktorSoyadTextField.getText();
        String brans= String.valueOf(bransComboBox.getSelectedItem());  
        
        DoktorIslemler di = new DoktorIslemler(id,ad,soyad,brans);
        di.doktorKayitGuncelle();
        JOptionPane.showMessageDialog(null, "Kayıt Güncellendi");
    }//GEN-LAST:event_kayitGuncelleButtonActionPerformed
    int id=0;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        id = Integer.parseInt(modelim.getValueAt(table.getSelectedRow(),0).toString()) ;
        doktorAdTextField.setText(modelim.getValueAt(table.getSelectedRow(),1).toString());
        doktorSoyadTextField.setText(modelim.getValueAt(table.getSelectedRow(),2).toString());
        bransComboBox.setSelectedItem(modelim.getValueAt(table.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        YoneticiEkrani ye = new YoneticiEkrani();
        ye.setVisible(true);
        ye.pack();
        ye.setLocationRelativeTo(null);
        ye.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorYonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorYonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorYonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorYonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorYonetimEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bransComboBox;
    private javax.swing.JTextField doktorAdTextField;
    private javax.swing.JTextField doktorSoyadTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kayitEkleButton;
    private javax.swing.JButton kayitGuncelleButton;
    private javax.swing.JButton kayitListeleButton;
    private javax.swing.JButton kayitSilButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
