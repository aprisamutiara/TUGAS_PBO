package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kacamoo extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    String id, nama, nomor, frame, mkanan, mkiri, skanan, skiri; 
    String warna = null; 
    
    public Kacamoo() {  
        initComponents();
        refreshData();
        kosong();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbFrame = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMkanan = new javax.swing.JTextField();
        txtSkiri = new javax.swing.JTextField();
        txtMkiri = new javax.swing.JTextField();
        txtSkanan = new javax.swing.JTextField();
        rbHitam = new javax.swing.JRadioButton();
        rbPutih = new javax.swing.JRadioButton();
        rbRose = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel3.setText("Nama lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 82, -1, -1));

        txtNama.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtNama.setPreferredSize(new java.awt.Dimension(224, 26));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 97, 224, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel4.setText("Nomor telepon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 132, -1, -1));

        txtNo.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtNo.setPreferredSize(new java.awt.Dimension(224, 26));
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 147, 224, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel5.setText("Frame kacamata");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 182, -1, -1));

        cbFrame.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cbFrame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kotak", "Bulat", "Cat eye" }));
        getContentPane().add(cbFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 197, 224, 26));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setText("Minus kanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 132, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel7.setText("Minus kiri");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 132, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel8.setText("Silinder kanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 182, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel9.setText("Silinder kiri");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 182, -1, -1));

        txtMkanan.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtMkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 147, 92, 26));

        txtSkiri.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtSkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 197, 92, 26));

        txtMkiri.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtMkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 147, 92, 26));

        txtSkanan.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtSkanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkananActionPerformed(evt);
            }
        });
        getContentPane().add(txtSkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 197, 92, 26));

        rbHitam.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbHitam);
        rbHitam.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbHitam.setText("Hitam");
        rbHitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHitamActionPerformed(evt);
            }
        });
        getContentPane().add(rbHitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 102, -1, -1));

        rbPutih.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbPutih);
        rbPutih.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbPutih.setText("Putih");
        getContentPane().add(rbPutih, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 102, -1, -1));

        rbRose.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbRose);
        rbRose.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbRose.setText("Rose gold");
        getContentPane().add(rbRose, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 102, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel10.setText("Warna");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 82, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("OPTIK KACAMOO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 8, -1, 16));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel2.setText("\"Pandangan anda prioritas kami\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 26, -1, -1));

        jPanel1.setBackground(new java.awt.Color(176, 246, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(649, 49));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(508, 175));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 66, -1, -1));

        jPanel3.setBackground(new java.awt.Color(176, 246, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 271, 241, 18));

        jPanel4.setBackground(new java.awt.Color(176, 246, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 271, 241, 18));

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Data yang masuk");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 269, -1, -1));

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama lengkap", "Nomor telepon", "Frame ", "Warna", "Minus kanan", "Minus kiri", "Silinder kanan", "Silinder kiri"
            }
        ));
        tableData.setPreferredSize(new java.awt.Dimension(619, 211));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 610, 220));

        jPanel5.setBackground(new java.awt.Color(255, 255, 240));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(176, 246, 255));
        txtId.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtId.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel12.setText("ID");

        btnTambah.setBackground(new java.awt.Color(255, 146, 125));
        btnTambah.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setBorder(null);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 146, 125));
        btnEdit.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 146, 125));
        btnHapus.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 146, 125));
        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton1.setText("Batal");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void refreshData(){
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Nama lengkap");
        model.addColumn("No telepon");
        model.addColumn("Frame");
        model.addColumn("Warna");
        model.addColumn("Minus kanan");
        model.addColumn("Minus kiri");
        model.addColumn("Silinder kanan");
        model.addColumn("Silinder kiri");
        tableData.setModel(model);
        try{
            this.stat = k.getConnection().prepareStatement("select * from tbkacamata");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4), 
                    rs.getString(5), 
                    rs.getString(6), 
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)      
                };
                model.addRow(data);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txtId.setText("");
        txtNama.setText("");
        txtNo.setText("");
        cbFrame.setSelectedItem("");
         if (rbHitam.isSelected()){
            warna = "";
        } else if (rbPutih.isSelected()){
            warna = "";
        } else if (rbRose.isSelected()){
            warna = "";
        }
        txtMkanan.setText("");
        txtMkiri.setText("");
        txtSkanan.setText("");
        txtSkiri.setText("");
        txtSkiri.setText("");
    }
    

    private void kosong(){
        txtId.setText(null);
        txtNama.setText(null);
        txtNo.setText(null);
        cbFrame.setSelectedItem(null);
        buttonGroup1.clearSelection();
        rbHitam.setSelected(false);
        rbPutih.setSelected(false);
        rbRose.setSelected(false);
        txtMkanan.setText("");
        txtMkiri.setText("");
        txtSkanan.setText("");
        txtSkiri.setText("");
        txtSkiri.setText("");
    }
    
    private void rbHitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHitamActionPerformed
  
    }//GEN-LAST:event_rbHitamActionPerformed

    private void txtSkananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkananActionPerformed

    }//GEN-LAST:event_txtSkananActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       
        if (rbHitam.isSelected()){
            warna = "Hitam";
        } else if (rbPutih.isSelected()){
            warna = "Putih";
        } else if (rbRose.isSelected()){
            warna = "Rose gold";
        }
       
        nama = txtNama.getText();
        nomor = txtNo.getText();
        frame = cbFrame.getSelectedItem().toString();
        mkanan = txtMkanan.getText();
        mkiri = txtMkiri.getText();
        skanan = txtSkanan.getText();
        skiri = txtSkiri.getText();
        
        if (nama.isEmpty() || nomor.isEmpty() || frame.isEmpty() || warna.isEmpty() || mkanan.isEmpty() || mkiri.isEmpty() || skanan.isEmpty() || skiri.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            return;
        }
        
        try {
            this.stat = k.getConnection().prepareStatement("select * from tbkacamata where id=?");
            stat.setString(1, txtId.getText());
            this.rs = this.stat.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Data sudah ada, tidak bisa menambahkan data duplikat");
                return;
            }

            this.stat = k.getConnection().prepareStatement("insert into tbkacamata (`nama`, `no_telp`, `frame`, `warna`, `minus_kanan`, `minus_kiri`, `silinder_kanan`, `silinder_kiri`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stat.setString(1, nama);
            stat.setString(2, nomor);
            stat.setString(3, frame);
            stat.setString(4, warna);
            stat.setString(5, mkanan);
            stat.setString(6, mkiri);
            stat.setString(7, skanan);
            stat.setString(8, skiri);
            stat.executeUpdate();
            refreshData(); 
            kosong();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        txtId.setText(model.getValueAt(tableData.getSelectedRow(), 0).toString());
        txtNama.setText(model.getValueAt(tableData.getSelectedRow(), 1).toString());
        txtNo.setText(model.getValueAt(tableData.getSelectedRow(), 2).toString());
        cbFrame.setSelectedItem(model.getValueAt(tableData.getSelectedRow(), 3).toString());
        String warna = model.getValueAt(tableData.getSelectedRow(), 4).toString();
        if (warna.equals("Hitam")) {
            rbHitam.setSelected(true);
            rbPutih.setSelected(false);
            rbRose.setSelected(false);
        } else if (warna.equals("Putih")) {
            rbPutih.setSelected(true);
            rbHitam.setSelected(false);
            rbRose.setSelected(false);
        } else if (warna.equals("Rose gold")) {
            rbRose.setSelected(true);
            rbPutih.setSelected(false);
            rbHitam.setSelected(false);
        }
        txtMkanan.setText(model.getValueAt(tableData.getSelectedRow(), 5).toString());
        txtMkiri.setText(model.getValueAt(tableData.getSelectedRow(), 6).toString());
        txtSkanan.setText(model.getValueAt(tableData.getSelectedRow(), 7).toString());
        txtSkiri.setText(model.getValueAt(tableData.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_tableDataMouseClicked

    
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        id = txtId.getText();
        try{
            stat = k.getConnection().prepareStatement("delete from tbkacamata where id=?");
            stat.setString(1, id);
            stat.executeUpdate();
            refreshData();
            kosong(); 
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (rbHitam.isSelected()){
            warna = "Hitam";
        } else if (rbPutih.isSelected()){
            warna = "Putih";
        } else if (rbRose.isSelected()){
            warna = "Rose gold";
        }

        id = txtId.getText();
        nama = txtNama.getText();
        nomor = txtNo.getText();
        frame = cbFrame.getSelectedItem().toString();
        mkanan = txtMkanan.getText();
        mkiri = txtMkiri.getText();
        skanan = txtSkanan.getText();
        skiri = txtSkiri.getText();

        try{
            stat = k.getConnection().prepareStatement("update tbkacamata set nama=?, no_telp=?, frame=?, warna=?, minus_kanan=?, minus_kiri=?, silinder_kanan=?, silinder_kiri=? where id=?");
            stat.setString(1, nama);
            stat.setString(2, nomor);
            stat.setString(3, frame);
            stat.setString(4, warna);
            stat.setString(5, mkanan);
            stat.setString(6, mkiri);
            stat.setString(7, skanan);
            stat.setString(8, skiri);
            stat.setString(9, id);
            stat.executeUpdate();
            refreshData();
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui");
            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        refreshData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       kosong();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kacamoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbHitam;
    private javax.swing.JRadioButton rbPutih;
    private javax.swing.JRadioButton rbRose;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMkanan;
    private javax.swing.JTextField txtMkiri;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSkanan;
    private javax.swing.JTextField txtSkiri;
    // End of variables declaration//GEN-END:variables
}
