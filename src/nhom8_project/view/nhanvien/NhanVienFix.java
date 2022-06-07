/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhom8_project.view.nhanvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import nhom8_project.entity.NhanVien;
import static nhom8_project.view.nhanvien.NhanVienInformation.nv;

/**
 *
 * @author Admin
 */
public class NhanVienFix extends javax.swing.JFrame {

    public static ArrayList<NhanVien> nv = new ArrayList<NhanVien>();

    public NhanVienFix() {
        initComponents();
        setLocationRelativeTo(null);

        readFileNV();
        hienThi();
    }

    public void hienThi() {
        for (int i = 0; i < nv.size(); i++) {
            if (nv.get(i).nhanVienID.compareTo(nhom8_project.view.nhanvien.NhanVienForm.MANHANVIEN) == 0) {
                inputMaNV.setText(nv.get(i).nhanVienID);
                inputUserName.setText(nv.get(i).accountName);
                inputPass.setText(nv.get(i).accountPass);
                inputNgaySinh.setText(nv.get(i).ngaySinh);

                if (nv.get(i).gioiTinh.compareTo("Nam") == 0) {
                    radioNam.setSelected(true);
                } else {
                    radioNu.setSelected(true);
                }
                inputSDT.setText(nv.get(i).SDT);
                inputEmail.setText(nv.get(i).email);
                inputDiaChi.setText(nv.get(i).diaChi);
                inputTenNV.setText(nv.get(i).tenNhanVien);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputMaNV = new javax.swing.JTextField();
        radioNam = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        inputTenNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioNu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        inputDiaChi = new javax.swing.JTextField();
        inputNgaySinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SỬA THÔNG TIN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã NV");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 30));

        inputMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputMaNV.setEnabled(false);
        inputMaNV.setMinimumSize(new java.awt.Dimension(100, 30));
        inputMaNV.setPreferredSize(new java.awt.Dimension(400, 23));

        buttonGroup1.add(radioNam);
        radioNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioNam.setText("Nam");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 30));

        inputTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTenNV.setMinimumSize(new java.awt.Dimension(100, 30));
        inputTenNV.setPreferredSize(new java.awt.Dimension(400, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Giới tính");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 30));

        inputPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPass.setMinimumSize(new java.awt.Dimension(100, 30));
        inputPass.setPreferredSize(new java.awt.Dimension(400, 23));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tên NV");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 30));

        inputUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputUserName.setMinimumSize(new java.awt.Dimension(100, 30));
        inputUserName.setPreferredSize(new java.awt.Dimension(400, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tên đăng nhập");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 30));

        inputSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSDT.setMinimumSize(new java.awt.Dimension(100, 30));
        inputSDT.setPreferredSize(new java.awt.Dimension(400, 23));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 30));

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputEmail.setMinimumSize(new java.awt.Dimension(100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("SĐT");
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 30));

        buttonGroup1.add(radioNu);
        radioNu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioNu.setText("Nữ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Địa chỉ");
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 30));

        inputDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDiaChi.setMinimumSize(new java.awt.Dimension(100, 30));
        inputDiaChi.setPreferredSize(new java.awt.Dimension(400, 23));

        inputNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputNgaySinh.setMinimumSize(new java.awt.Dimension(100, 30));
        inputNgaySinh.setPreferredSize(new java.awt.Dimension(400, 23));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ngày sinh");
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioNam)
                                .addGap(76, 76, 76)
                                .addComponent(radioNu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNam)
                    .addComponent(radioNu)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon2/Document 1 Edit.png"))); // NOI18N
        jButton1.setText("Sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(377, 377, 377))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (inputDiaChi.getText().equals("")
                || inputEmail.getText().equals("")
                || inputNgaySinh.getText().equals("")
                || inputPass.getText().equals("")
                || inputSDT.getText().equals("")
                || inputTenNV.getText().equals("")
                || inputUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ thông tin!");
        } else {
            String check = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
            if (!inputNgaySinh.getText().matches(check)) {
                JOptionPane.showMessageDialog(null, "Nhập thời gian theo dd/mm/yyyy");
            } else if (!inputEmail.getText().matches("^[A-Za-z0-9_.]{6,32}@([a-zA-Z0-9]{2,12})(.[a-zA-Z]{2,12})+$")) {
                JOptionPane.showMessageDialog(null, "không đúng định dạng email(abc@gmail.com)");
            } else if (inputUserName.getText().equalsIgnoreCase("admin") == true) {
                JOptionPane.showMessageDialog(null, "không được đặt tên đăng nhập là admin");
            } else {
                for (int i = 0; i < nv.size(); i++) {
                    if (nv.get(i).nhanVienID.compareTo(nhom8_project.view.nhanvien.NhanVienForm.MANHANVIEN) == 0) {
                        nv.get(i).accountName = inputUserName.getText();
                        nv.get(i).accountPass = inputPass.getText();
                        nv.get(i).tenNhanVien = inputTenNV.getText();
                        nv.get(i).diaChi = inputDiaChi.getText();
                        nv.get(i).SDT = inputSDT.getText();
                        nv.get(i).email = inputEmail.getText();
                        nv.get(i).ngaySinh = inputNgaySinh.getText();
                        break;
                    }
                }
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu thông tin trên?", "Thông báo", JOptionPane.YES_NO_OPTION) == 0) {
                    ghiFileNV();
                    this.dispose();
                    new NhanVienInformation().setVisible(true);
                } else {
                    this.dispose();
                    new NhanVienInformation().setVisible(true);
                }

            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void ghiFileNV() {

        String fileWrite = "NhanVien.txt";

        try {

            File file = new File(fileWrite);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < nv.size(); i++) {
                pw.println(nv.get(i).nhanVienID + "," + nv.get(i).accountName + "," + nv.get(i).accountPass + "," + nv.get(i).tenNhanVien + "," + nv.get(i).ngaySinh + "," + nv.get(i).gioiTinh + "," + nv.get(i).diaChi + "," + nv.get(i).SDT + "," + nv.get(i).email);
            }
            pw.close();
            bw.close();
            fw.close();

            JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công");

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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
            java.util.logging.Logger.getLogger(NhanVienFix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienFix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienFix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienFix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienFix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputDiaChi;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputMaNV;
    private javax.swing.JTextField inputNgaySinh;
    private javax.swing.JTextField inputPass;
    private javax.swing.JTextField inputSDT;
    private javax.swing.JTextField inputTenNV;
    private javax.swing.JTextField inputUserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    // End of variables declaration//GEN-END:variables
}
