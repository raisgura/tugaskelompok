/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import config.Database;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
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
public class ReportPasien extends javax.swing.JFrame {
    private Connection conn =new Database().connect();
    private DefaultTableModel model;
    /**
     * Creates new form DataObat
     */
    public ReportPasien() {
        initComponents();
        // Initialize status combo box
     
        
        
         
         initTable();
            loadData();
         clearForm();

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
        tblPendaftaran = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        tglAwal = new com.github.lgooddatepicker.components.DatePicker();
        tglAkhir = new com.github.lgooddatepicker.components.DatePicker();
        btnPrintPasien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPrintTgl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(193, 224, 244));

        tblPendaftaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPendaftaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPendaftaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPendaftaran);

        jLabel1.setText("TANGGAL AWAL");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setText("LAPORAN PENDAFTARAN PASIEN");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setText("TANGGAL AKHIR");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        btnPrintPasien.setText("CETAK BY NO REGISTRASI");
        btnPrintPasien.setBackground(new java.awt.Color(51, 153, 255));
        btnPrintPasien.setBorder(null);
        btnPrintPasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrintPasien.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPasienActionPerformed(evt);
            }
        });

        jLabel3.setText("Pilih rentang tanggal untuk mencetak daftar pasien");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrintPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(610, 610, 610)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnPrintTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnPrintTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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

    private void tblPendaftaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPendaftaranMouseClicked
        
    
    }//GEN-LAST:event_tblPendaftaranMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        this.dispose();
    
    
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnKembaliMouseClicked

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

        String reportPath = "C:\\Users\\acied\\OneDrive\\Documents\\NetBeansProjects\\rskita\\RumahSakitKita\\LPendaftaran.jrxml";
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

    private void btnPrintPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPasienActionPerformed
        try {

        // 1. Prepare parameters
        Map<String, Object> parameter = new HashMap<String, Object>();
        String selectedNO = tblPendaftaran.getValueAt(tblPendaftaran.getSelectedRow(), 0).toString().trim();
        
        parameter.put("no_registrasi", selectedNO);

        // 2. Database connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/rumah_sakit",
            "root", 
            ""
        );

        String reportPath = "C:\\Users\\acied\\OneDrive\\Documents\\NetBeansProjects\\rskita\\RumahSakitKita\\LPendaftaran.jrxml";
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
       
    }//GEN-LAST:event_btnPrintPasienActionPerformed

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
            java.util.logging.Logger.getLogger(ReportPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPrintPasien;
    private javax.swing.JButton btnPrintTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPendaftaran;
    private com.github.lgooddatepicker.components.DatePicker tglAkhir;
    private com.github.lgooddatepicker.components.DatePicker tglAwal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
    model = new DefaultTableModel();
    model.addColumn("No Registrasi");
    model.addColumn("Nama Pasien");
    model.addColumn("Tanggal Registrasi");
    model.addColumn("Nama Petugas");
    model.addColumn("Keluhan");
    model.addColumn("Diagnosa Awal");
    model.addColumn("Status");
    tblPendaftaran.setModel(model);
}

    private void loadData() {
    model.setRowCount(0);
    String sql = "SELECT p.no_registrasi, ps.nama_pasien, p.tgl_registrasi, "
               + "pm.nama_petugas, p.keluhan, p.diagnosa_awal, p.status "
               + "FROM pendaftaran p "
               + "JOIN pasien ps ON p.kd_pasien = ps.kd_pasien "
               + "JOIN petugas_medis pm ON p.kd_petugas = pm.kd_petugas";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("no_registrasi"),
                rs.getString("nama_pasien"),
                dateFormat.format(rs.getTimestamp("tgl_registrasi")),
                rs.getString("nama_petugas"),
                rs.getString("keluhan"),
                rs.getString("diagnosa_awal"),
                rs.getString("status")
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}
    
    
    
    private void clearForm() {
    
    tblPendaftaran.clearSelection();
}
    
    private void searchData() {
    String keyword = txtSearch.getText().trim();
    model.setRowCount(0);
    
    String sql = "SELECT p.no_registrasi, ps.nama_pasien, p.tgl_registrasi, "
               + "pm.nama_petugas, p.keluhan, p.diagnosa_awal, p.status "
               + "FROM pendaftaran p "
               + "JOIN pasien ps ON p.kd_pasien = ps.kd_pasien "
               + "JOIN petugas_medis pm ON p.kd_petugas = pm.kd_petugas "
               + "WHERE p.no_registrasi LIKE ? OR "
               + "ps.nama_pasien LIKE ? OR "
               + "pm.nama_petugas LIKE ? OR "
               + "p.keluhan LIKE ? OR "
               + "p.diagnosa_awal LIKE ? OR "
               + "p.status LIKE ?";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        String searchPattern = "%" + keyword + "%";
        for (int i = 1; i <= 6; i++) {
            stmt.setString(i, searchPattern);
        }
        
        ResultSet rs = stmt.executeQuery();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("no_registrasi"),
                rs.getString("nama_pasien"),
                dateFormat.format(rs.getTimestamp("tgl_registrasi")),
                rs.getString("nama_petugas"),
                rs.getString("keluhan"),
                rs.getString("diagnosa_awal"),
                rs.getString("status")
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
