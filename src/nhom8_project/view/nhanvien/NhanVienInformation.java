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
import nhom8_project.entity.NhanVien;
import static nhom8_project.view.loginView.nv;

/**
 *
 * @author Admin
 */
public class NhanVienInformation extends javax.swing.JFrame {

    public static ArrayList<NhanVien> nv = new ArrayList<NhanVien>();

    public NhanVienInformation() {
        initComponents();
        setLocationRelativeTo(null);
        readFileNV();

        hienThi();
    }

    public void hienThi() {
        for (int i = 0; i < nv.size(); i++) {
            if (nv.get(i).nhanVienID.compareTo(nhom8_project.view.nhanvien.NhanVienForm.MANHANVIEN) == 0) {
                outPutID.setText("Mã nhân viên: " + nv.get(i).nhanVienID);
                outPutUseName.setText("Tên đăng nhập: " + nv.get(i).accountName);
                outPutPass.setText("Mật khẩu đăng nhập: " + nv.get(i).accountPass);
                outPutTen.setText("Họ tên: " + nv.get(i).tenNhanVien);
                outPutGioiTinh.setText("Giới tính: " + nv.get(i).gioiTinh);
                outPutNgaySinh.setText("Ngày sinh: " + nv.get(i).ngaySinh);
                outPutSDT.setText("Số điện thoại: " + nv.get(i).SDT);
                outputDiaChi.setText("Địa chỉ: " + nv.get(i).diaChi);
                outPutEmail.setText("Email: " + nv.get(i).email);
                break;
            }
        }

    }

    public void readFileNV() {
        String file = "NhanVien.txt";

        try {
            nv.clear();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            //DefaultTableModel tbmd = (DefaultTableModel) jTable1.getModel();

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] data = lines[i].toString().split(",");
                NhanVien a = new NhanVien();

                a.nhanVienID = data[0];
                a.accountName = data[1];
                a.accountPass = data[2];
                a.tenNhanVien = data[3];
                a.ngaySinh = data[4];
                a.gioiTinh = data[5];
                a.diaChi = data[6];
                a.SDT = data[7];
                a.email = data[8];
                nv.add(a);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "không tìm thấy file nhân viên");
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
        outPutID = new javax.swing.JLabel();
        outPutUseName = new javax.swing.JLabel();
        outPutPass = new javax.swing.JLabel();
        outPutSDT = new javax.swing.JLabel();
        outPutNgaySinh = new javax.swing.JLabel();
        outPutGioiTinh = new javax.swing.JLabel();
        outputDiaChi = new javax.swing.JLabel();
        outPutEmail = new javax.swing.JLabel();
        outPutTen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        outPutID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutID.setText("mã nhân viên");

        outPutUseName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutUseName.setText("Tên đăng nhập");

        outPutPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutPass.setText("mật khẩu");

        outPutSDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutSDT.setText("sdt");

        outPutNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutNgaySinh.setText("ngày sinh");

        outPutGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutGioiTinh.setText("giới tính");

        outputDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outputDiaChi.setText("địa chỉ");

        outPutEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutEmail.setText("email");

        outPutTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outPutTen.setText("tên");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outPutGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutTen, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutPass, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutUseName, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outPutID, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(outPutID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outPutUseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outPutPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(outPutTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outPutSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outPutNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outPutGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outPutEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outPutEmail;
    private javax.swing.JLabel outPutGioiTinh;
    private javax.swing.JLabel outPutID;
    private javax.swing.JLabel outPutNgaySinh;
    private javax.swing.JLabel outPutPass;
    private javax.swing.JLabel outPutSDT;
    private javax.swing.JLabel outPutTen;
    private javax.swing.JLabel outPutUseName;
    private javax.swing.JLabel outputDiaChi;
    // End of variables declaration//GEN-END:variables
}
