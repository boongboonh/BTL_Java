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
import nhom8_project.entity.KhachHang;

/**
 *
 * @author Admin
 */
public class ShowKhachHang extends javax.swing.JFrame {

    public static ArrayList<KhachHang> kh = new ArrayList<KhachHang>();

    public ShowKhachHang() {
        initComponents();


        readFileKH();
        hienThi();
    }

    public void readFileKH() {
        String file = "KhachHang.txt";
        kh.clear();
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //DefaultTableModel tbmd = (DefaultTableModel) bangKhachHang.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] data = lines[i].toString().split(",");
                KhachHang a = new KhachHang();

                a.khachHangID = data[0];
                a.tenKhachHang = data[1];
                a.soTienMua = Integer.parseInt(data[2]);
                a.diaChi = data[3];
                a.SDT = data[4];

                kh.add(a);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "không tìm thấy file khách hàng");
        } catch (NumberFormatException e1) {

            //JOptionPane.showMessageDialog(this, e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            //JOptionPane.showMessageDialog(this, e2);          
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex);

        }
    }

    public void hienThi() {
        DefaultTableModel tablekh = (DefaultTableModel) bangKH.getModel();
        if (cbbLoaiKH.getSelectedItem().toString().compareTo("Tất cả") == 0) {
            tablekh.setRowCount(0);
            for (int i = 0; i < kh.size(); i++) {
                tablekh.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

            }
        } else if (cbbLoaiKH.getSelectedItem().toString().compareTo("Đồng") == 0) {
            tablekh.setRowCount(0);
            for (int i = 0; i < kh.size(); i++) {
                if (loaikh((int) kh.get(i).soTienMua).compareTo("đồng") == 0) {
                    tablekh.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

                }
            }
        } else if (cbbLoaiKH.getSelectedItem().toString().compareTo("Bạc") == 0) {
            tablekh.setRowCount(0);
            for (int i = 0; i < kh.size(); i++) {
                if (loaikh((int) kh.get(i).soTienMua).compareTo("bạc") == 0) {
                    tablekh.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

                }
            }
        } else if (cbbLoaiKH.getSelectedItem().toString().compareTo("Vàng") == 0) {
            tablekh.setRowCount(0);
            for (int i = 0; i < kh.size(); i++) {
                if (loaikh((int) kh.get(i).soTienMua).compareTo("vàng") == 0) {
                    tablekh.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

                }
            }
        } else if (cbbLoaiKH.getSelectedItem().toString().compareTo("Kim cương") == 0) {
            tablekh.setRowCount(0);
            for (int i = 0; i < kh.size(); i++) {
                if (loaikh((int) kh.get(i).soTienMua).compareTo("kim cương") == 0) {
                    tablekh.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

                }
            }
        }

    }

    
    
   public String loaikh(int a) {
        if (a <= 100000) {
            return "đồng";
        } else if (a > 100000 && a <= 500000) {
            return "bạc";
        } else if (a > 500000 && a < 1000000) {
            return "vàng";
        } else {
            return "kim cương";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbLoaiKH = new javax.swing.JComboBox<>();
        inputLocKH = new javax.swing.JTextField();
        btLocKH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangKH = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Danh sách khách hàng");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Person-Male-Light-icon-24.png"))); // NOI18N
        jLabel2.setText("Loại khách hàng:");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 30));

        cbbLoaiKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbLoaiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đồng", "Bạc", "Vàng", "Kim cương" }));
        cbbLoaiKH.setMinimumSize(new java.awt.Dimension(92, 30));
        cbbLoaiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiKHActionPerformed(evt);
            }
        });

        inputLocKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputLocKH.setPreferredSize(new java.awt.Dimension(71, 30));

        btLocKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLocKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Search_24x24.png"))); // NOI18N
        btLocKH.setText("Lọc");
        btLocKH.setPreferredSize(new java.awt.Dimension(72, 30));
        btLocKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocKHActionPerformed(evt);
            }
        });

        bangKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bangKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "SĐT", "Địa chỉ", "Số tiền mua hàng", "Khách hàng loại"
            }
        ));
        jScrollPane1.setViewportView(bangKH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputLocKH, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLocKH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLocKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLoaiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiKHActionPerformed
        inputLocKH.setText("");
        hienThi();
    }//GEN-LAST:event_cbbLoaiKHActionPerformed

    private void btLocKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocKHActionPerformed
       String tukhoa = inputLocKH.getText();
        cbbLoaiKH.setSelectedIndex(0);
        DefaultTableModel table = (DefaultTableModel) bangKH.getModel();
        table.setRowCount(0);
        for (int i = 0; i < kh.size(); i++) {
            if ((kh.get(i).tenKhachHang).indexOf(tukhoa) >= 0 || kh.get(i).khachHangID.indexOf(tukhoa) >= 0|| kh.get(i).SDT.indexOf(tukhoa)>=0||kh.get(i).diaChi.indexOf(tukhoa)>=0||String.valueOf(kh.get(i).soTienMua).indexOf(tukhoa)>=0) {
                table.addRow(new Object[]{kh.get(i).khachHangID, kh.get(i).tenKhachHang, kh.get(i).SDT, kh.get(i).diaChi, kh.get(i).soTienMua, loaikh((int) kh.get(i).soTienMua)});

            }
        }
    }//GEN-LAST:event_btLocKHActionPerformed

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
            java.util.logging.Logger.getLogger(ShowKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangKH;
    private javax.swing.JButton btLocKH;
    private javax.swing.JComboBox<String> cbbLoaiKH;
    private javax.swing.JTextField inputLocKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
