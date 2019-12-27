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

/**
 *
 * @author Buğra
 */
public class HastaRandevuEkrani extends javax.swing.JFrame {
    int randevuHastaId;
    int randevuDoktorId;
    DefaultTableModel modelim = new DefaultTableModel();;
    Object[] kolonlar;
    Object[] satirlar;
    public HastaRandevuEkrani(int hastaid)
    {
        this.randevuHastaId=hastaid;
        initComponents();
        randevuListele();
    }
    
    public HastaRandevuEkrani() {
        initComponents();        
    }
    
    public void randevuListele(){
        
        modelim.setRowCount(0);
        Object[] kolonlar = {"Hasta","Doktor","Branş","Tarih","Saat"};
        satirlar = new Object[5];
        modelim.setColumnIdentifiers(kolonlar);

        ResultSet rs ;
        RandevuIslemler ri = new RandevuIslemler();
        rs = ri.randevuGetir();
        try {
        while(rs.next()){
        satirlar[0] = rs.getString("hastaAd")+ " " + rs.getString("hastaSoyad");
        satirlar[1] = rs.getString("doktorAd")+ " " + rs.getString("doktorSoyad");
        satirlar[2] = rs.getString("doktorBrans");
        satirlar[3] = rs.getString("randevuTarih");
        satirlar[4] = rs.getString("randevuSaat");
        modelim.addRow(satirlar);

        }
        } catch (SQLException e) {
        e.printStackTrace();
        }

        randevularTable.setModel(modelim);
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
        randevuAlButton = new javax.swing.JButton();
        bransComboBox = new javax.swing.JComboBox<>();
        tarihComboBox = new javax.swing.JComboBox<>();
        saatComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        randevularTable = new javax.swing.JTable();
        doktorlarComboBox = new javax.swing.JComboBox<>();
        geriButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(82, 179, 217));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        randevuAlButton.setBackground(new java.awt.Color(82, 179, 217));
        randevuAlButton.setText("RANDEVU AL");
        randevuAlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevuAlButtonActionPerformed(evt);
            }
        });

        bransComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BESLENME VE DİYET", "ÇOCUK SAĞLIĞI VE HASTALIKLARI", "FİZİKSEL TIP VE REHABİLİTASYON", "GÖZ HASTALIKLARI", "KULAK - BURUN - BOĞAZ HASTALIKLARI", "ORTOPEDİ", "PSİKİYATRİ" }));
        bransComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bransComboBoxİtemStateChanged(evt);
            }
        });
        bransComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bransComboBoxMouseClicked(evt);
            }
        });
        bransComboBox.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bransComboBoxİnputMethodTextChanged(evt);
            }
        });
        bransComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bransComboBoxActionPerformed(evt);
            }
        });

        tarihComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01.01.2020", "02.01.2020", "03.01.2020", "04.01.2020", "05.01.2020", "06.01.2020", "07.01.2020", "08.01.2020", "09.01.2020", "10.01.2020", "11.01.2020", "12.01.2020", "13.01.2020", "14.01.2020", "15.01.2020", "16.01.2020", "17.01.2020", "18.01.2020", "19.01.2020", "20.01.2020", "21.01.2020", "22.01.2020", "23.01.2020", "24.01.2020", "25.01.2020", "26.01.2020", "27.01.2020", "28.01.2020", "29.01.2020", "30.01.2020", "31.01.2020" }));

        saatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        randevularTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(randevularTable);

        doktorlarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doktorlar" }));
        doktorlarComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                doktorlarComboBoxİtemStateChanged(evt);
            }
        });
        doktorlarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktorlarComboBoxActionPerformed(evt);
            }
        });

        geriButton.setBackground(new java.awt.Color(255, 51, 51));
        geriButton.setText("Geri");
        geriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bransComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doktorlarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarihComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(randevuAlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(geriButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bransComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarihComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doktorlarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randevuAlButton)
                    .addComponent(geriButton))
                .addGap(45, 45, 45))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Randevular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void randevuAlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevuAlButtonActionPerformed
        
        String doktorlar= String.valueOf(doktorlarComboBox.getSelectedItem());

        String[] doktor = doktorlar.split(" ");
        String ad = doktor[0];
        String soyad= doktor[1];
        ResultSet rs ;
        DoktorIslemler di = new DoktorIslemler(0,ad,soyad,null);
        rs = di.doktorIdGetir();

        try {
        while(rs.next()){
        randevuDoktorId = rs.getInt("doktorId");
        }
        } catch (SQLException e) {
        e.printStackTrace();
        }     
        
        String randevuTarih = String.valueOf(tarihComboBox.getSelectedItem());
        String randevuSaat = String.valueOf(saatComboBox.getSelectedItem());

        RandevuIslemler ri = new RandevuIslemler(randevuDoktorId,randevuHastaId,randevuTarih,randevuSaat);
        ri.randevuEkle();        
        JOptionPane.showMessageDialog(null, "Randevu Alındı");
        randevuListele();
    }//GEN-LAST:event_randevuAlButtonActionPerformed
    
    private void bransComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bransComboBoxMouseClicked
        
    }//GEN-LAST:event_bransComboBoxMouseClicked

    private void bransComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bransComboBoxActionPerformed
         String brans= String.valueOf(bransComboBox.getSelectedItem());
        doktorlarComboBox.removeAllItems();
        
        ResultSet rs ;
        DoktorIslemler di = new DoktorIslemler(0,null,null,brans);
        rs = di.doktorBransGetir();
        

        try {
            while(rs.next()){
                doktorlarComboBox.addItem(rs.getString("doktorAd")+" "+rs.getString("doktorSoyad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bransComboBoxActionPerformed

    private void bransComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bransComboBoxİtemStateChanged

    }//GEN-LAST:event_bransComboBoxİtemStateChanged

    private void doktorlarComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_doktorlarComboBoxİtemStateChanged

    }//GEN-LAST:event_doktorlarComboBoxİtemStateChanged

    private void bransComboBoxİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bransComboBoxİnputMethodTextChanged
        
    }//GEN-LAST:event_bransComboBoxİnputMethodTextChanged

    private void doktorlarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktorlarComboBoxActionPerformed
            
    }//GEN-LAST:event_doktorlarComboBoxActionPerformed

    private void geriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriButtonActionPerformed
        GirisEkrani ge = new GirisEkrani();
        ge.setVisible(true);
        ge.pack();
        ge.setLocationRelativeTo(null);
        ge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_geriButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HastaRandevuEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaRandevuEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaRandevuEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaRandevuEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaRandevuEkrani().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bransComboBox;
    private javax.swing.JComboBox<String> doktorlarComboBox;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton randevuAlButton;
    private javax.swing.JTable randevularTable;
    private javax.swing.JComboBox<String> saatComboBox;
    private javax.swing.JComboBox<String> tarihComboBox;
    // End of variables declaration//GEN-END:variables
}
