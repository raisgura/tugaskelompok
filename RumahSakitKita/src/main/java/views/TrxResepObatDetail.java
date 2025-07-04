/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import config.Database;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author darwisy
 */
public class TrxResepObatDetail extends javax.swing.JFrame {
    private Connection conn =new Database().connect();
    private DefaultTableModel model;
    private String kodeResep; // Class variable to store the kode

    /**
     * Creates new form DataObat
     */
    public TrxResepObatDetail(String kodeResep) {
        initComponents();

        
        this.kodeResep = kodeResep;
        initTable();
        loadData(kodeResep);
        clearForm();
        loadObatDataToComboBox(obat);

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
        tblResepDetail = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kdResep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        obat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jumlahObat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kdDetail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 189, 89));

        tblResepDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tblResepDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResepDetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResepDetail);

        btnBatal.setBackground(new java.awt.Color(51, 51, 51));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setBorder(null);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("KODE RESEP");

        kdResep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kdResep.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DETAIL RESEP OBAT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("OBAT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ATURAN PAKAI");

        btnKembali.setBackground(new java.awt.Color(48, 222, 135));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorder(null);
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKembaliMouseEntered(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(48, 222, 135));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 51));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 51));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
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

        obat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        obat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("JUMLAH");

        jumlahObat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jumlahObat.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        kdDetail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("KODE DETAIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364)
                .addComponent(jLabel2)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(kdResep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(obat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jumlahObat, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(59, 59, 59)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kdDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtSearch)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdResep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(kdDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(obat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahObat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       simpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        clearForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblResepDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResepDetailMouseClicked
      int row = tblResepDetail.getSelectedRow();
        if (row >= 0) {
            // Get selected medicine details
            String kodeDetail = tblResepDetail.getValueAt(row, 0).toString();
            String kodeResep = tblResepDetail.getValueAt(row, 1).toString();
            String namaObat = tblResepDetail.getValueAt(row, 2).toString();
            String jumlah = tblResepDetail.getValueAt(row, 3).toString();
            String aturanPakai = tblResepDetail.getValueAt(row, 4).toString();

            // Set the values in form fields
            kdDetail.setText(kodeDetail);
            kdDetail.setEnabled(false);

            kdResep.setText(kodeResep);
            kdResep.setEnabled(false);

            // Find and select the medicine in combo box
            selectComboBoxItemByPartialText(obat, namaObat);
            jumlahObat.setText(jumlah);
            jTextArea1.setText(aturanPakai);
        }
    }//GEN-LAST:event_tblResepDetailMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        this.dispose();

        new TrxResepObat().setVisible(true);
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliMouseEntered

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jumlahObat;
    private javax.swing.JTextField kdDetail;
    private javax.swing.JTextField kdResep;
    private javax.swing.JComboBox<String> obat;
    private javax.swing.JTable tblResepDetail;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        model = new DefaultTableModel();
        model.addColumn("Kode Detail");
        model.addColumn("Kode Resep");
        model.addColumn("Nama Obat");
        model.addColumn("Jumlah");
        model.addColumn("Aturan Pakai");
        tblResepDetail.setModel(model);
    }
    
    private void loadData(String kdResep) {
        model.setRowCount(0); // Clear existing data

        String sql = "SELECT rd.kd_detail, rd.kd_resep, o.nama_obat, rd.jumlah, rd.aturan_pakai " +
                     "FROM detail_resep rd " +
                     "JOIN obat o ON rd.kd_obat = o.kd_obat " +
                     "WHERE rd.kd_resep = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kdResep);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kd_detail"),
                    rs.getString("kd_resep"),
                    rs.getString("nama_obat"),
                    rs.getInt("jumlah"),
                    rs.getString("aturan_pakai")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                "Error loading detail resep: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    private void simpanData() {
        // Validate required fields
        if (obat.getSelectedItem() == null || 
            jumlahObat.getText().trim().isEmpty() || 
            jTextArea1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua field yang diperlukan!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate jumlah is numeric
        try {
            Integer.parseInt(jumlahObat.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO detail_resep (kd_detail, kd_resep, kd_obat, jumlah, aturan_pakai) VALUES (?, ?, ?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Extract medicine code from combo box
            String selectedObat = obat.getSelectedItem().toString();
            String kodeObat = selectedObat.split(" - ")[0];

            // Set parameters
            stmt.setString(1, kdDetail.getText().trim());
            stmt.setString(2, kodeResep);
            stmt.setString(3, kodeObat);
            stmt.setInt(4, Integer.parseInt(jumlahObat.getText().trim()));
            stmt.setString(5, jTextArea1.getText().trim());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Detail resep berhasil ditambahkan");
            loadData(kodeResep);
            clearForm();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, 
                "Format data obat tidak valid. Pastikan format 'KODE - NAMA'",
                "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(this, 
                    "Obat ini sudah ada dalam resep. Gunakan edit untuk mengubah.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Error: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void editData() {
    int selectedRow = tblResepDetail.getSelectedRow();
    
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan diedit", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate required fields
    if (obat.getSelectedItem() == null || 
        jumlahObat.getText().trim().isEmpty() || 
        jTextArea1.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap isi semua field yang diperlukan!", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate jumlah is numeric
    try {
        Integer.parseInt(jumlahObat.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka!", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String kodeDetail = tblResepDetail.getValueAt(selectedRow, 0).toString();
    String sql = "UPDATE detail_resep " +
                 "SET kd_obat = ?, jumlah = ?, aturan_pakai = ? " +
                 "WHERE kd_detail = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        // Extract medicine code from combo box
        String selectedObat = obat.getSelectedItem().toString();
        String kodeObat = selectedObat.split(" - ")[0];

        // Set parameters
        stmt.setString(1, kodeObat);
        stmt.setInt(2, Integer.parseInt(jumlahObat.getText().trim()));
        stmt.setString(3, jTextArea1.getText().trim());
        stmt.setString(4, kodeDetail);

        int updatedRows = stmt.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(this, "Detail resep berhasil diupdate");
            loadData(kodeResep);
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Data tidak ditemukan atau tidak ada perubahan", 
                "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error database: " + ex.getMessage(),
            "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void hapusData() {
        int selectedRow = tblResepDetail.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Apakah Anda yakin ingin menghapus obat ini dari resep?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String kodeDetail = tblResepDetail.getValueAt(selectedRow, 0).toString();
        String sql = "DELETE FROM detail_resep WHERE kd_detail = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kodeDetail);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Obat berhasil dihapus dari resep");
                loadData(kodeResep);
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                "Error: " + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
}
    private void clearForm() {
        loadObatDataToComboBox(obat);
        kdDetail.setText(generateKodeDetail());
        obat.setSelectedIndex(0);
        jumlahObat.setText("");
        jTextArea1.setText("");
        kdResep.setText(kodeResep);
        kdResep.setEditable(false);
        kdResep.setBackground(Color.WHITE);
        tblResepDetail.clearSelection();
        kdDetail.setEnabled(true);
}
    private void searchData() {
    String keyword = txtSearch.getText().trim();
    model.setRowCount(0);

    String sql = "SELECT rd.kd_detail, rd.kd_resep, o.nama_obat, rd.jumlah, rd.aturan_pakai " +
                 "FROM detail_resep rd " +
                 "JOIN obat o ON rd.kd_obat = o.kd_obat " +
                 "WHERE rd.kd_resep = ? AND " +
                 "(o.nama_obat LIKE ? OR rd.aturan_pakai LIKE ? OR rd.kd_detail LIKE ?)";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        String searchPattern = "%" + keyword + "%";
        stmt.setString(1, kodeResep);
        stmt.setString(2, searchPattern);
        stmt.setString(3, searchPattern);
        stmt.setString(4, searchPattern);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("kd_detail"),
                rs.getString("kd_resep"),
                rs.getString("nama_obat"),
                rs.getInt("jumlah"),
                rs.getString("aturan_pakai")
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error saat mencari data: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
}
    private void loadObatDataToComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();  // Clear existing items

        String sql = "SELECT kd_obat, nama_obat, jenis_obat, stok, satuan, tanggal_expired, produsen, harga " +
                     "FROM obat " +
                     "ORDER BY nama_obat";  // Optional: Sort by medicine name

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Format: "OBT0001 - Paracetamol 500mg (Stok: 100 Tablet)"
                String displayText = String.format(
                    "%s - %s (Stok: %d %s)",
                    rs.getString("kd_obat"),
                    rs.getString("nama_obat"),
                    rs.getInt("stok"),
                    rs.getString("satuan")
                );

                comboBox.addItem(displayText);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                this, 
                "Error loading medicine data: " + ex.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    private void selectComboBoxItemByPartialText(JComboBox<String> comboBox, String partialText) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).contains(partialText)) {
            comboBox.setSelectedIndex(i);
            return;
        }
    }
}

    private String generateKodeDetail() {
        String prefix = "DTR";
        String sql = "SELECT MAX(kd_detail) AS last_code FROM detail_resep WHERE kd_detail LIKE ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, prefix + "%");
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String lastCode = rs.getString("last_code");
                if (lastCode != null) {
                    int lastNumber = Integer.parseInt(lastCode.substring(prefix.length()));
                    return prefix + String.format("%04d", lastNumber + 1);
                }
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Error generating detail code: " + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        return prefix + "0001";
    }

    
}
    
