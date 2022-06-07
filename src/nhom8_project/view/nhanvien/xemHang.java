/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhom8_project.view.nhanvien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom8_project.entity.HangHoa;
import static nhom8_project.view.nhanvien.PhieuBanHang.hh;

/**
 *
 * @author Admin
 */
public class xemHang extends javax.swing.JFrame {

    public static ArrayList<HangHoa> hh = new ArrayList<HangHoa>();

    public xemHang() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        readFileHH();
        themLoaiHang();

        hienThi();

    }

    public void readFileHH() {
        String file = "HangHoa.txt";
        try {
            hh.clear();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] data = lines[i].toString().split(",");
                HangHoa a = new HangHoa();

                a.hangHoaID = data[0];
                a.tenHang = data[1];
                a.donViTinh=data[2];
                a.soLuongCon = Integer.parseInt(data[3]);
                a.soLuongBan = Integer.parseInt(data[4]);
                a.NSX = data[5];
                a.HSD = data[6];
                a.giaBan = Integer.parseInt(data[7]);
                a.loaiHang = data[8];
                a.hoaDonNhapID = data[9];

                hh.add(a);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "không tìm thấy file");
        } catch (NumberFormatException e1) {

            //JOptionPane.showMessageDialog(this, e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            //JOptionPane.showMessageDialog(this, e2);          
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex);

        }
    }

    public void themLoaiHang() {

        for (int i = 0; i < hh.size(); i++) {
            if (xetLap(hh.get(i).loaiHang) == true) {
                cbbLoaiHang.addItem(hh.get(i).loaiHang);
            }

        }

    }

    public boolean xetLap(String a) {
        for (int i = 0; i < cbbLoaiHang.getItemCount(); i++) {
            if (a.compareTo(cbbLoaiHang.getItemAt(i)) == 0) {
                return false;
            }
        }
        return true;
    }

    public void hienThi() {
        DefaultTableModel table = (DefaultTableModel) bangSP.getModel();

        if (cbbLoaiHang.getSelectedItem().toString().compareTo("Tất cả") == 0) {
            table.setRowCount(0);
            for (int i = 0; i < hh.size(); i++) {

                table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).giaBan, hh.get(i).soLuongCon+" "+hh.get(i).donViTinh,hh.get(i).soLuongBan+" "+hh.get(i).donViTinh, hh.get(i).NSX, hh.get(i).HSD});
            }
        } else {
            table.setRowCount(0);
            for (int i = 0; i < hh.size(); i++) {
                if (cbbLoaiHang.getSelectedItem().toString().compareTo(hh.get(i).loaiHang) == 0) {

                    table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).giaBan, hh.get(i).soLuongCon+" "+hh.get(i).donViTinh,hh.get(i).soLuongBan+" "+hh.get(i).donViTinh, hh.get(i).NSX, hh.get(i).HSD});
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bangSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inputLoc = new javax.swing.JTextField();
        cbbLoaiHang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bangSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bangSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng", "Tên hàng", "Giá", "Số lượng còn", "Số lượng bán", "NSX", "HSD"
            }
        ));
        jScrollPane1.setViewportView(bangSP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon2/Folder.png"))); // NOI18N
        jLabel1.setText("Loại hàng");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Search_24x24.png"))); // NOI18N
        jButton1.setText("Lọc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inputLoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbbLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cbbLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiHangActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("XEM THÔNG TIN HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLoaiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiHangActionPerformed
        inputLoc.setText("");
        hienThi();
    }//GEN-LAST:event_cbbLoaiHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String tukhoa = inputLoc.getText();
        cbbLoaiHang.setSelectedIndex(0);
        DefaultTableModel table = (DefaultTableModel) bangSP.getModel();
        table.setRowCount(0);
        for (int i = 0; i < hh.size(); i++) {
            if (hh.get(i).tenHang.toLowerCase().indexOf(tukhoa.toLowerCase()) >= 0||hh.get(i).hangHoaID.toLowerCase().indexOf(tukhoa.toLowerCase()) >= 0||String.valueOf(hh.get(i).giaBan).indexOf(tukhoa) >= 0) {
                table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).giaBan, hh.get(i).soLuongCon,hh.get(i).soLuongBan, hh.get(i).NSX, hh.get(i).HSD});
            }
        }
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
            java.util.logging.Logger.getLogger(xemHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xemHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xemHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xemHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xemHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangSP;
    private javax.swing.JComboBox<String> cbbLoaiHang;
    private javax.swing.JTextField inputLoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
