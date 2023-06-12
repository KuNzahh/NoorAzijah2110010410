/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import DataSet.dsPinjaman;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class framePinjaman extends javax.swing.JFrame {
    dsPinjaman datsetPnjmn;
    /**
     * Creates new form framePinjaman
     */
    public framePinjaman() {
        initComponents();
        this.setLocationRelativeTo(null);
        datsetPnjmn = new dsPinjaman();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdpinjmn = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        txtTotPinj = new javax.swing.JTextField();
        txtJumang = new javax.swing.JTextField();
        txtSttsPmbyrn = new javax.swing.JTextField();
        cmbAcc = new javax.swing.JComboBox<>();
        cmbStts = new javax.swing.JComboBox<>();
        cmbJnsPinj = new javax.swing.JComboBox<>();
        btnTmbhPinjmn = new javax.swing.JButton();
        btnTmpilPinjmn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel1.setText("Tambah Data Pinjaman");

        jLabel2.setText("Id Pinjaman");

        jLabel3.setText("Jenis Pinjaman");

        jLabel4.setText("Tanggal");

        jLabel5.setText("Total Pinjaman");

        jLabel6.setText("Status");

        jLabel7.setText("Jumlah Angsuran");

        jLabel8.setText("Status Pembayaran");

        jLabel9.setText("Acc");

        txtSttsPmbyrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSttsPmbyrnActionPerformed(evt);
            }
        });

        cmbAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "TERIMA", "TOLAK" }));

        cmbStts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Baru", "Lama" }));

        cmbJnsPinj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Pinjam Cepat", "Pinjam Sedang", "Pinjam Lama" }));

        btnTmbhPinjmn.setText("Tambah Data Pinjaman");
        btnTmbhPinjmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmbhPinjmnActionPerformed(evt);
            }
        });

        btnTmpilPinjmn.setText("Tampil Data");
        btnTmpilPinjmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmpilPinjmnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdpinjmn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotPinj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSttsPmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJnsPinj, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnTmbhPinjmn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTmpilPinjmn)
                .addGap(114, 114, 114))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbAcc, cmbJnsPinj, cmbStts, txtJumang, txtSttsPmbyrn, txtTgl, txtTotPinj});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtIdpinjmn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbJnsPinj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotPinj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbStts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJumang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSttsPmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTmbhPinjmn)
                    .addComponent(btnTmpilPinjmn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSttsPmbyrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSttsPmbyrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSttsPmbyrnActionPerformed

    private void btnTmbhPinjmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmbhPinjmnActionPerformed
        // TODO add your handling code here:
        datsetPnjmn.isiidPinjaman(Integer.valueOf(txtIdpinjmn.getText()));
        datsetPnjmn.isiJnspinj(cmbJnsPinj.getSelectedItem().toString());
        datsetPnjmn.isiTgl(txtTgl.getText());
        datsetPnjmn.isiTotpinj(txtTotPinj.getText());
        datsetPnjmn.isiStts(cmbStts.getSelectedItem().toString());
        datsetPnjmn.isiJmlangsurn(txtJumang.getText());
        datsetPnjmn.isiSttsbyr(txtSttsPmbyrn.getText());
        datsetPnjmn.isiAcc(cmbStts.getSelectedItem().toString());
        
        String Pesan = "Data Berhasil Disimpan Ke Array";
        JOptionPane.showMessageDialog(this, Pesan);
    }//GEN-LAST:event_btnTmbhPinjmnActionPerformed

    private void btnTmpilPinjmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmpilPinjmnActionPerformed
        // TODO add your handling code here:
        String isiPesan = "Id Pinjaman : " + datsetPnjmn.getDatasetIdPinjaman().get(0)+
                          "\nJenis Pinjaman : " + datsetPnjmn.getDatasetJnspinj().get(0) +
                          "\nTanggal : " + datsetPnjmn.getDatasetTgl().get(0)+
                        "\nTotal Pinjaman : " + datsetPnjmn.getDatasetTotpinj().get(0)+
                        "\nStatus : " + datsetPnjmn.getDatasetStts().get(0)+
                        "\nJumlah Angsuran : " + datsetPnjmn.getDatasetJmlangsurn().get(0)+
                        "\nStatus Pembayaran : " + datsetPnjmn.getDatasetSttsbyr().get(0)+
                        "\nACC : " + datsetPnjmn.getDatasetAcc().get(0);
        JOptionPane.showMessageDialog(this, isiPesan);
    }//GEN-LAST:event_btnTmpilPinjmnActionPerformed

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
            java.util.logging.Logger.getLogger(framePinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTmbhPinjmn;
    private javax.swing.JButton btnTmpilPinjmn;
    private javax.swing.JComboBox<String> cmbAcc;
    private javax.swing.JComboBox<String> cmbJnsPinj;
    private javax.swing.JComboBox<String> cmbStts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIdpinjmn;
    private javax.swing.JTextField txtJumang;
    private javax.swing.JTextField txtSttsPmbyrn;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTotPinj;
    // End of variables declaration//GEN-END:variables
}
