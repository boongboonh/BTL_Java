/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhom8_project.view.nhanvien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom8_project.entity.HangHoa;

/**
 *
 * @author Admin
 */
public class kiemSoatHSD extends javax.swing.JFrame {

    public static DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static ArrayList<HangHoa> hh = new ArrayList<HangHoa>();

    public kiemSoatHSD() throws ParseException {
        initComponents();
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        readFileHH();
        lochang();

    }

    public void readFileHH() {
        String file = "HangHoa.txt";
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] data = lines[i].toString().split(",");
                HangHoa a = new HangHoa();

                a.hangHoaID = data[0];
                a.tenHang = data[1];
                a.donViTinh = data[2];
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bangSPvsHSD = new javax.swing.JTable();
        btSrearch = new javax.swing.JButton();
        inputSearch = new javax.swing.JTextField();
        cbbLocHang = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("THÔNG TIN HẠN SỬ DỤNG");

        bangSPvsHSD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bangSPvsHSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng", "Tên hàng", "Số lượng còn", "Số lượng bán", "HSD còn lại"
            }
        ));
        jScrollPane2.setViewportView(bangSPvsHSD);

        btSrearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSrearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Search_24x24.png"))); // NOI18N
        btSrearch.setText("Tìm");
        btSrearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSrearchActionPerformed(evt);
            }
        });

        inputSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cbbLocHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbLocHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Sản phẩm hết hạn", "Sản phẩm chưa hết hạn" }));
        cbbLocHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(cbbLocHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSrearch)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbLocHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSrearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLocHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocHangActionPerformed
        try {
            lochang();
        } catch (ParseException ex) {
            Logger.getLogger(kiemSoatHSD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbLocHangActionPerformed

    private void btSrearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSrearchActionPerformed
        String tukhoa = inputSearch.getText();
        cbbLocHang.setSelectedIndex(0);
        DefaultTableModel table = (DefaultTableModel) bangSPvsHSD.getModel();
        table.setRowCount(0);
        for (int i = 0; i < hh.size(); i++) {
            if ((hh.get(i).tenHang).indexOf(tukhoa) >= 0) {
                try {
                    table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).soLuongCon + " " + hh.get(i).donViTinh, hh.get(i).soLuongBan + " " + hh.get(i).donViTinh, kiemtraHSD(hh.get(i).HSD)});
                } catch (ParseException ex) {
                    Logger.getLogger(kiemSoatHSD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btSrearchActionPerformed

    public void lochang() throws ParseException {
        DefaultTableModel table = (DefaultTableModel) bangSPvsHSD.getModel();

        if (cbbLocHang.getSelectedItem().toString().compareTo("Tất cả") == 0) {
            table.setRowCount(0);
            for (int i = 0; i < hh.size(); i++) {

                table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).soLuongCon + " " + hh.get(i).donViTinh, hh.get(i).soLuongBan + " " + hh.get(i).donViTinh, kiemtraHSD(hh.get(i).HSD)});
            }
        } else if (cbbLocHang.getSelectedItem().toString().compareTo("Sản phẩm hết hạn") == 0) {
            table.setRowCount(0);

            for (int i = 0; i < hh.size(); i++) {
                if (tinhNgayHSD(hh.get(i).HSD) <= 0) {

                    table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).soLuongCon + " " + hh.get(i).donViTinh, hh.get(i).soLuongBan + " " + hh.get(i).donViTinh, kiemtraHSD(hh.get(i).HSD)});
                }
            }
        } else {
            table.setRowCount(0);
            for (int i = 0; i < hh.size(); i++) {
                if (tinhNgayHSD(hh.get(i).HSD) > 0) {

                    table.addRow(new Object[]{hh.get(i).hangHoaID, hh.get(i).tenHang, hh.get(i).soLuongCon + " " + hh.get(i).donViTinh, hh.get(i).soLuongBan + " " + hh.get(i).donViTinh, kiemtraHSD(hh.get(i).HSD)});
                }
            }
        }
    }

    public String kiemtraHSD(String b) throws ParseException {
        if (tinhNgayHSD(b) > 0) {
            String a = String.valueOf(tinhNgayHSD(b));
            return a +" ngày";
        } else {
            return "Hết hạn sử dụng";
        }
    }

    public long tinhNgayHSD(String a) throws ParseException {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        String day1 = timeNow();
        String day2 = a;
        Date d1 = simpleDateFormat.parse(day1);
        Date d2 = simpleDateFormat.parse(day2);
        // Định nghĩa 2 mốc thời gian ban đầu
        Date date1 = d1;
        Date date2 = d2;

        c1.setTime(date1);
        c2.setTime(date2);

        // tính số ngày giữa 2 mốc thời gian
        long noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);

        return noDay;
    }

    public String timeNow() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        return time;
    }

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
            java.util.logging.Logger.getLogger(kiemSoatHSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiemSoatHSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiemSoatHSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiemSoatHSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new kiemSoatHSD().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(kiemSoatHSD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangSPvsHSD;
    private javax.swing.JButton btSrearch;
    private javax.swing.JComboBox<String> cbbLocHang;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
