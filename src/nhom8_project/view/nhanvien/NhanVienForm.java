/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhom8_project.view.nhanvien;

import java.awt.LayoutManager;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nhom8_project.view.loginView;

public class NhanVienForm extends javax.swing.JFrame {

    public NhanVienForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        conten = new javax.swing.JPanel();
        bangNoiDung = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conten.setLayout(new java.awt.BorderLayout());
        conten.add(bangNoiDung, java.awt.BorderLayout.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(212, 40));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Home-icon-16.png"))); // NOI18N
        jMenu1.setText("Bán hàng");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon2/Box.png"))); // NOI18N
        jMenu2.setText("Hàng hoá");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/new-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Xem danh sách hàng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Calendar_16x16.png"))); // NOI18N
        jMenuItem3.setText("Kiểm soát hạn sử dụng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        jMenu3.setText("khách hàng");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        jMenuItem4.setText("Thêm khách hàng");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/logout-icon-16.png"))); // NOI18N
        jMenu4.setText("Đăng xuất");

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/logout-icon-16.png"))); // NOI18N
        menuLogout.setText("Đăng xuất");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu4.add(menuLogout);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Button-Close-icon-16.png"))); // NOI18N
        jMenu5.setText("Thoát");

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Button-Close-icon-16.png"))); // NOI18N
        exitMenu.setText("Thoát");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu5.add(exitMenu);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất tài khoản không?", "Thông báo", JOptionPane.YES_NO_OPTION) == 0) {
            //Đóng hộp thoại
            this.dispose();
            //Mở hộp thoại login
            new loginView().setVisible(true);
        }
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?", "Thông báo", JOptionPane.YES_NO_OPTION) == 0) {
            //Đóng hộp thoại
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        PhieuBanHang a = new PhieuBanHang();
        String title = "Tạo hoá đơn";
        if (checkTab(title) == true) {//true không trùng -> tạo tab mới 
            bangNoiDung.addTab(title, a.getContentPane());
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        xemHang b = new xemHang();
        String title = "Xem hàng";
        if (checkTab(title) == true) {//true không trùng -> tạo tab mới 
            bangNoiDung.addTab(title, b.getContentPane());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            kiemSoatHSD a = new kiemSoatHSD();
            String title = "Kiểm soát HSD";
            if (checkTab(title) == true) {//true không trùng -> tạo tab mới 
                bangNoiDung.addTab(title, a.getContentPane());
            }
        } catch (ParseException ex) {
            Logger.getLogger(NhanVienForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TaoDataKhachHang a = new TaoDataKhachHang();
        String title = "Thêm khách hàng";
        if (checkTab(title) == true) {//true không trùng -> tạo tab mới 
            bangNoiDung.addTab(title, a.getContentPane());
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    //check tab có bị trùng ko
    public boolean checkTab(String a) {

        for (int i = 0; i < bangNoiDung.getTabCount(); i++) {
            if (bangNoiDung.getTitleAt(i).compareTo(a) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
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
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane bangNoiDung;
    private javax.swing.JPanel conten;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenuItem menuLogout;
    // End of variables declaration//GEN-END:variables
}
