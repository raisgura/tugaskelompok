/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import config.Database;
import java.awt.Color;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author darwisy
 */
public class ReportPembayaran extends javax.swing.JFrame {
    private Connection conn =new Database().connect();
    private DefaultTableModel model;
    /**
     * Creates new form DataObat
     */
    public ReportPembayaran() {
        initComponents();

         
         initTable();
         loadData();
         

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPembayaran = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnPrintKd = new javax.swing.JButton();
        btnPrintTgl = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tglAkhir = new com.github.lgooddatepicker.components.DatePicker();
        tglAwal = new com.github.lgooddatepicker.components.DatePicker();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(193, 224, 244));

        tblPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPembayaran);

        jLabel2.setText("LAPORAN PEMBAYARAN");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnKembali.setText("Kembali");
        btnKembali.setBackground(new java.awt.Color(48, 222, 135));
        btnKembali.setBorder(null);
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setText(" Search...");
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnPrintKd.setText("CETAK BY KODE");
        btnPrintKd.setBackground(new java.awt.Color(51, 153, 255));
        btnPrintKd.setBorder(null);
        btnPrintKd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrintKd.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintKd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintKdActionPerformed(evt);
            }
        });

        btnPrintTgl.setText("CETAK");
        btnPrintTgl.setBackground(new java.awt.Color(51, 153, 255));
        btnPrintTgl.setBorder(null);
        btnPrintTgl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrintTgl.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTglActionPerformed(evt);
            }
        });

        jLabel9.setText("TANGGAL AWAL");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setText("TANGGAL AKHIR");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Pilih rentang tanggal untuk mencetak daftar pembayaran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(46, 46, 46)
                            .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(46, 46, 46)
                                .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnPrintTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnPrintKd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnPrintTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrintKd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void tblPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPembayaranMouseClicked

    }//GEN-LAST:event_tblPembayaranMouseClicked

    private void btnPrintTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTglActionPerformed
                try {
                        // Validate date selection
                        if (tglAwal.getDate() == null || tglAkhir.getDate() == null) {
                                JOptionPane.showMessageDialog(this, "Please select both start and end dates", "Warning", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
            
                        // 1. Prepare parameters
                        Map<String, Object> parameter = new HashMap<String, Object>();
                        parameter.put("awal", java.sql.Date.valueOf(tglAwal.getDate()));
                        parameter.put("akhir", java.sql.Date.valueOf(tglAkhir.getDate()));
            
                        // 2. Database connection
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/rumah_sakit",
                                "root",
                                ""
                            );
            
                        String reportPath ="C:\\Users\\acied\\OneDrive\\Documents\\NetBeansProjects\\rskita\\RumahSakitKita\\LPembayaran.jrxml";
                        JasperReport jr = JasperCompileManager.compileReport(reportPath);
                        JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn);
            
                        if (jp.getPages().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No data found for the selected date range");
                            } else {
                                JasperViewer viewer = new JasperViewer(jp, false);
                                viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                viewer.setVisible(true);
                            }
            
                        conn.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
    }//GEN-LAST:event_btnPrintTglActionPerformed

    private void btnPrintKdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintKdActionPerformed
        try {

        // 1. Prepare parameters
        Map<String, Object> parameter = new HashMap<String, Object>();
        String selectedNO = tblPembayaran.getValueAt(tblPembayaran.getSelectedRow(), 0).toString().trim();
        
        parameter.put("kd_pembayaran", selectedNO);

        // 2. Database connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/rumah_sakit",
            "root", 
            ""
        );

        String reportPath = "C:\\Users\\acied\\OneDrive\\Documents\\NetBeansProjects\\rskita\\RumahSakitKita\\LPembayaran.jrxml";
        JasperReport jr = JasperCompileManager.compileReport(reportPath);
        JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn);

        if (jp.getPages().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No data found for the selected date range");
        } else {
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            viewer.setVisible(true);
        }

        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
       
    }//GEN-LAST:event_btnPrintKdActionPerformed

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
            java.util.logging.Logger.getLogger(ReportPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportPembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPrintKd;
    private javax.swing.JButton btnPrintTgl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPembayaran;
    private com.github.lgooddatepicker.components.DatePicker tglAkhir;
    private com.github.lgooddatepicker.components.DatePicker tglAwal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
    model = new DefaultTableModel();
    model.addColumn("Kode Pembayaran");
    model.addColumn("Nama");
    model.addColumn("Tanggal Pembayaran");
    model.addColumn("Jenis Pembayaran");
    model.addColumn("Biaya Obat");
    model.addColumn("Biaya Perawatan");
    model.addColumn("Total Biaya");
    model.addColumn("Status Pembayaran");
    model.addColumn("Keterangan");
    
    tblPembayaran.setModel(model);
}

private void loadData() {
    model.setRowCount(0);
    String sql = "SELECT p.kd_pembayaran, p.no_registrasi, p.tgl_pembayaran, "
               + "p.jenis_pembayaran, p.biaya_obat, p.biaya_perawatan, "
               + "p.total_biaya, p.status_pembayaran, p.keterangan, "
               + "ps.nama_pasien "
               + "FROM pembayaran p "
               + "JOIN pendaftaran pd ON p.no_registrasi = pd.no_registrasi "
               + "JOIN pasien ps ON pd.kd_pasien = ps.kd_pasien";

    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("kd_pembayaran"),
                rs.getString("nama_pasien"),
                dateFormat.format(rs.getDate("tgl_pembayaran")),
                rs.getString("jenis_pembayaran"),
                rs.getBigDecimal("biaya_obat"),
                rs.getBigDecimal("biaya_perawatan"),
                rs.getBigDecimal("total_biaya"),
                rs.getString("status_pembayaran"),
                rs.getString("keterangan")
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading payment data: " + ex.getMessage());
        ex.printStackTrace();
    }
}
private void searchData() {
    String keyword = txtSearch.getText().trim();
    model.setRowCount(0);

    String sql = "SELECT p.kd_pembayaran, ps.nama_pasien, p.tgl_pembayaran, "
               + "p.jenis_pembayaran, p.biaya_obat, p.biaya_perawatan, "
               + "p.total_biaya, p.status_pembayaran, p.keterangan "
               + "FROM pembayaran p "
               + "JOIN pendaftaran pd ON p.no_registrasi = pd.no_registrasi "
               + "JOIN pasien ps ON pd.kd_pasien = ps.kd_pasien "
               + "WHERE p.kd_pembayaran LIKE ? OR "
               + "ps.nama_pasien LIKE ? OR "
               + "p.jenis_pembayaran LIKE ? OR "
               + "p.status_pembayaran LIKE ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        String searchPattern = "%" + keyword + "%";
        stmt.setString(1, searchPattern);
        stmt.setString(2, searchPattern);
        stmt.setString(3, searchPattern);
        stmt.setString(4, searchPattern);

        ResultSet rs = stmt.executeQuery();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("kd_pembayaran"),
                rs.getString("nama_pasien"),
                dateFormat.format(rs.getDate("tgl_pembayaran")),
                rs.getString("jenis_pembayaran"),
                rs.getBigDecimal("biaya_obat"),
                rs.getBigDecimal("biaya_perawatan"),
                rs.getBigDecimal("total_biaya"),
                rs.getString("status_pembayaran"),
                rs.getString("keterangan")
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error saat mencari data: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
}
    


}
    
