/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhom8_project.view.admin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

//import nhom8_project.view.admin.NhanVienManagementPanel;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class Admin extends javax.swing.JFrame {
    private NhanVienManagementPanel nvmp;
    private HangHoaManagementPanel hhmp;
    private HoaDonManagementPanel khmp;
    private LuongThuongManagement ltm;
    private History hm;
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        //Cho hộp thoại ra giữa màn hình
        //setLocationRelativeTo(null);
        //Hộp thoại full màn hình
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        //new khohanglist().DienKhoHang();
        closeTab();
    }

    public void addTabbedPaneNV(){
        if(nvmp ==null){
        nvmp = new NhanVienManagementPanel();
        // Lấy icon 
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"));
        // Add jpanel NhanVienManagementPanel vào tabbedpane
        tabpaneAdmin.addTab("Quản Lý Nhân Viên", icon, nvmp,"Quản lý nhân viên");
        }
        tabpaneAdmin.setSelectedComponent(nvmp);
    }
    public void addTabbedPaneHH(){
        if(hhmp ==null){
            hhmp = new HangHoaManagementPanel();
           // ImageIcon icon= new ImageIcon("Nhom8_project\\src\\nhom8_project\\icon\\gpa-icon.png");
            ImageIcon icon = new ImageIcon(getClass().getResource("/nhom8_project/icon/gpa-icon.png"));

          tabpaneAdmin.addTab("Quản Lý Hàng Hoá", icon, hhmp);
        }
        tabpaneAdmin.setSelectedComponent(hhmp);
    }
    public void addTabbedPaneKH(){
        if(khmp==null){
            khmp = new HoaDonManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/nhom8_project/icon2/News.png"));
            tabpaneAdmin.addTab("Quản Lý Hoá Đơn",icon, khmp);
        }
        tabpaneAdmin.setSelectedComponent(khmp);
    }
    public void Logout(){
        //Đóng hộp thoại
        this.dispose();
        //Mở hộp thoại login
        new loginView().setVisible(true);
    }
    public void addTabbedPaneLT(){
        if(ltm ==null){
        ltm = new LuongThuongManagement();
        // Lấy icon 
        ImageIcon icon;
            icon = new ImageIcon(getClass()
                    .getResource("/nhom8_project/icon3/Check_32x32.png"));
        // Add jpanel NhanVienManagementPanel vào tabbedpane
        tabpaneAdmin.addTab("Lương thưởng", icon, ltm,"Lương thưởng");
        }
        tabpaneAdmin.setSelectedComponent(ltm);
    }
     
    public void addTabbedPaneLS(){
        if(hm ==null){
        hm = new History();
        // Lấy icon 
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"));
        // Add jpanel NhanVienManagementPanel vào tabbedpane
        tabpaneAdmin.addTab("Lịch sử", icon, hm);
        }
        tabpaneAdmin.setSelectedComponent(hm);
    }
    
      public void closeTab() {
        tabpaneAdmin.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int index = tabpaneAdmin.getSelectedIndex();
                    if (tabpaneAdmin.getTabCount() > 1) {
                        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tắt giao diện này không?", "Thông báo", JOptionPane.YES_NO_OPTION) == 0) {
                            tabpaneAdmin.remove(index);
                        }
                    }
                }
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        ToolbarBtnLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        ToolbarBtnQLNV = new javax.swing.JButton();
        ToolbarQLHH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        ToolbarBtnAbout = new javax.swing.JButton();
        tabpaneAdmin = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogoutAdmin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ht_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuManagementNhanvien = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        menuQLHH = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jToolBar1.setRollover(true);

        ToolbarBtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Login-icon-16.png"))); // NOI18N
        ToolbarBtnLogout.setText("Đăng xuất");
        ToolbarBtnLogout.setFocusable(false);
        ToolbarBtnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolbarBtnLogout.setMaximumSize(new java.awt.Dimension(63, 70));
        ToolbarBtnLogout.setMinimumSize(new java.awt.Dimension(63, 70));
        ToolbarBtnLogout.setPreferredSize(new java.awt.Dimension(63, 70));
        ToolbarBtnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolbarBtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolbarBtnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(ToolbarBtnLogout);
        jToolBar1.add(jSeparator4);

        ToolbarBtnQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        ToolbarBtnQLNV.setText("Quản lý nhân viên");
        ToolbarBtnQLNV.setFocusable(false);
        ToolbarBtnQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolbarBtnQLNV.setMaximumSize(new java.awt.Dimension(106, 70));
        ToolbarBtnQLNV.setMinimumSize(new java.awt.Dimension(106, 70));
        ToolbarBtnQLNV.setPreferredSize(new java.awt.Dimension(106, 70));
        ToolbarBtnQLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolbarBtnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolbarBtnQLNVActionPerformed(evt);
            }
        });
        jToolBar1.add(ToolbarBtnQLNV);

        ToolbarQLHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/gpa-icon.png"))); // NOI18N
        ToolbarQLHH.setText("Quản lý hàng hoá");
        ToolbarQLHH.setFocusable(false);
        ToolbarQLHH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolbarQLHH.setMaximumSize(new java.awt.Dimension(104, 70));
        ToolbarQLHH.setMinimumSize(new java.awt.Dimension(104, 70));
        ToolbarQLHH.setPreferredSize(new java.awt.Dimension(104, 70));
        ToolbarQLHH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolbarQLHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolbarQLHHActionPerformed(evt);
            }
        });
        jToolBar1.add(ToolbarQLHH);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon2/News.png"))); // NOI18N
        jButton1.setText("Quản lý hoá đơn");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(98, 70));
        jButton1.setMinimumSize(new java.awt.Dimension(98, 70));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Diary.png"))); // NOI18N
        jButton3.setText("Lịch Sử");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(98, 70));
        jButton3.setMinimumSize(new java.awt.Dimension(98, 70));
        jButton3.setPreferredSize(new java.awt.Dimension(98, 70));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon3/Check_32x32.png"))); // NOI18N
        jButton2.setText("Lương Thưởng");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(98, 70));
        jButton2.setMinimumSize(new java.awt.Dimension(98, 70));
        jButton2.setPreferredSize(new java.awt.Dimension(98, 70));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator3);

        ToolbarBtnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-help-about-icon-16.png"))); // NOI18N
        ToolbarBtnAbout.setText("Giới Thiệu");
        ToolbarBtnAbout.setFocusable(false);
        ToolbarBtnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolbarBtnAbout.setMaximumSize(new java.awt.Dimension(80, 70));
        ToolbarBtnAbout.setMinimumSize(new java.awt.Dimension(80, 70));
        ToolbarBtnAbout.setPreferredSize(new java.awt.Dimension(80, 70));
        ToolbarBtnAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolbarBtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolbarBtnAboutActionPerformed(evt);
            }
        });
        jToolBar1.add(ToolbarBtnAbout);

        jMenu1.setText("Hệ thống");

        menuLogoutAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuLogoutAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Login-icon-16.png"))); // NOI18N
        menuLogoutAdmin.setText("Đăng xuất");
        menuLogoutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutAdminActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogoutAdmin);
        jMenu1.add(jSeparator1);

        ht_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ht_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        ht_exit.setText("Thoát");
        ht_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ht_exitActionPerformed(evt);
            }
        });
        jMenu1.add(ht_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        menuManagementNhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuManagementNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        menuManagementNhanvien.setText("Nhân Viên");
        menuManagementNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManagementNhanvienActionPerformed(evt);
            }
        });
        jMenu2.add(menuManagementNhanvien);
        jMenu2.add(jSeparator2);

        menuQLHH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/gpa-icon.png"))); // NOI18N
        menuQLHH.setText("Hàng Hoá");
        menuQLHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLHHActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLHH);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon2/News.png"))); // NOI18N
        jMenuItem1.setText("Hoá Đơn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Help-icon-16.png"))); // NOI18N
        menuAbout.setText("Giới Thiệu");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu3.add(menuAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpaneAdmin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabpaneAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ht_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ht_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ht_exitActionPerformed

    private void menuQLHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLHHActionPerformed
        try {
             addTabbedPaneHH();
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }
       
    }//GEN-LAST:event_menuQLHHActionPerformed

    private void ToolbarBtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolbarBtnLogoutActionPerformed
         try {
             Logout();
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }
       
    }//GEN-LAST:event_ToolbarBtnLogoutActionPerformed

    private void menuManagementNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManagementNhanvienActionPerformed
     try {
             addTabbedPaneNV();
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }          
    }//GEN-LAST:event_menuManagementNhanvienActionPerformed

    private void ToolbarBtnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolbarBtnQLNVActionPerformed
        try {
             addTabbedPaneNV();
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }  
    }//GEN-LAST:event_ToolbarBtnQLNVActionPerformed

    private void menuLogoutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutAdminActionPerformed
        try {
             Logout();
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }  
    }//GEN-LAST:event_menuLogoutAdminActionPerformed

    private void ToolbarBtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolbarBtnAboutActionPerformed
          try {
            new AboutProjectDialog(this,true).setVisible(true);
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }  
        
    }//GEN-LAST:event_ToolbarBtnAboutActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        try {
             new AboutProjectDialog(this, true).setVisible(true);   
        } catch (Exception e) {
            nvmp.showMessageError(e.getMessage());
        }  
        
           
    }//GEN-LAST:event_menuAboutActionPerformed

    private void ToolbarQLHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolbarQLHHActionPerformed
        try {
              addTabbedPaneHH();
        } catch (Exception e) {
             new loginView().showMessage("Lỗi mở hàng hoá");
        }
      
    }//GEN-LAST:event_ToolbarQLHHActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            addTabbedPaneKH();
        } catch (Exception e) {
            new loginView().showMessage("Lỗi mở hoá đơn");
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            addTabbedPaneKH();
        } catch (Exception e) {
            new loginView().showMessage("Lỗi mở hoá đơn");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addTabbedPaneLS();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addTabbedPaneLT();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToolbarBtnAbout;
    private javax.swing.JButton ToolbarBtnLogout;
    private javax.swing.JButton ToolbarBtnQLNV;
    private javax.swing.JButton ToolbarQLHH;
    private javax.swing.JMenuItem ht_exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuLogoutAdmin;
    private javax.swing.JMenuItem menuManagementNhanvien;
    private javax.swing.JMenuItem menuQLHH;
    private javax.swing.JTabbedPane tabpaneAdmin;
    // End of variables declaration//GEN-END:variables
}
