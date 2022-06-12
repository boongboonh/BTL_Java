/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nhom8_project.view.admin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import nhom8_project.entity.hoadon.HoaDonList;
import nhom8_project.entity.hanghoa.HangHoa;
import nhom8_project.entity.hanghoa.HangHoaList;
import nhom8_project.entity.lichsu.LichSu;
import nhom8_project.utils.DateFormat;
import nhom8_project.utils.ReadWriteFile;

/**
 *
 * @author Admin
 */
public class HangHoaManagementPanel extends javax.swing.JPanel {
    private NhanVienManagementPanel nvmp = new NhanVienManagementPanel();
    private HoaDonList hdlist;
    private HangHoaList hhlist;
    private DefaultTableModel tbModel=null;
    private Object [] Title=new Object[]{"STT","Mã Hàng Hoá","Tên Hàng Hoá"
    ,"Ngày Sản Xuất","Hạn Sử Dụng","Loại","Giá Nhập","Giá Bán"
    };
    private String mhd;
    /**
     * Creates new form HangHoaManagementPanel
     */
    public HangHoaManagementPanel() {
        initComponents();
        btnEditHHM.setEnabled(false);
        btnDelete.setEnabled(false);
        initTable();
        SelectRowTable();
    }
    public void initTable(){
        hhlist= new HangHoaList();
        tbModel = new DefaultTableModel();
        tbModel.setColumnIdentifiers(Title);
        hhlist.setModel(tbModel);
        tableHHM.setModel(tbModel);
    }

    public void SelectRowTable(){
        
       //Tạo danh sách lựa chọn của kho hàng trên bảng và thiết lập chỉ chọn 1
        ListSelectionModel listModel=tableHHM.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Thêm hàm sự kiện cho bảng table
        listModel.addListSelectionListener(new ListSelectionListener() {
            //Thêm hàng thay đổi giá trị lựa chọn
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //Lấy danh sách các hàng và các cột lựa chọn
                int rows[]=tableHHM.getSelectedRows();
                int cols[]=tableHHM.getSelectedColumns();
                //Nếu có hàng được lựa chọn thì chạy tiếp
                if(cols.length>0&&rows.length>0){
                    //Gán các giá trị từ bảng vào các ô TextField      
                   
                    String ID=String.valueOf(tableHHM.getValueAt(rows[0],1));
                    HangHoa a = hhlist.FindByID(ID);
                        txtSearch.setText(ID);
                        mhh.setText(ID); 
                        ten.setText(a.getTenHang());                          
                        nsx.setText(a.getNSX());
                        hsd.setText(a.getHSD());
                    switch (a.getLoaiHang()) {
                        case "Hàng mát":
                            cblh.setSelectedIndex(0);                         
                            break;
                        case "Hàng đông lạnh":
                            cblh.setSelectedIndex(1);                          
                            break;
                        case "Thực phẩm khô":
                            cblh.setSelectedIndex(2);
                            break;
                        case "Đồ uống":
                            cblh.setSelectedIndex(3);
                            break;
                        case "Bánh kẹo":
                            cblh.setSelectedIndex(4);
                            break;
                        case "Gia dụng":
                            cblh.setSelectedIndex(5);
                            break;
                        case "Khác":
                            cblh.setSelectedIndex(6);
                            break;
                        default:
                            break;
                    }
                        gianhap.setText(a.getGiaNhap());
                        giaxuat.setText(a.getGiaBan());
                        dvt.setText(a.getDonViTinh());
                        btnAddHHM.setEnabled(false);
                        btnEditHHM.setEnabled(true);
                        btnDelete.setEnabled(true);                       
                }
            }
        });                   
    }
  
    
    
    public boolean searchHH(String id){       
        HangHoa a = hhlist.FindByID(id);
        if(a!=null){
                        mhh.setText(id); 
                        ten.setText(a.getTenHang());                          
                        nsx.setText(a.getNSX());
                        hsd.setText(a.getHSD());
                    switch (a.getLoaiHang()) {
                        case "Hàng mát":
                            cblh.setSelectedIndex(0);                         
                            break;
                        case "Hàng đông lạnh":
                            cblh.setSelectedIndex(1);                          
                            break;
                        case "Thực phẩm khô":
                            cblh.setSelectedIndex(2);
                            break;
                        case "Đồ uống":
                            cblh.setSelectedIndex(3);
                            break;
                        case "Bánh kẹo":
                            cblh.setSelectedIndex(4);
                            break;
                        case "Gia dụng":
                            cblh.setSelectedIndex(5);
                            break;
                        case "Khác":
                            cblh.setSelectedIndex(6);
                            break;
                        default:
                            break;
                    }
                        gianhap.setText(a.getGiaNhap());
                        giaxuat.setText(a.getGiaBan());
                        dvt.setText(a.getDonViTinh());
                        btnAddHHM.setEnabled(false);
                        btnEditHHM.setEnabled(true);
                        btnDelete.setEnabled(true);  
                        return true;
        } else
        return false;
    }   
    public void addHH(){                
               while(true){
                    ArrayList<HangHoa> list = new ArrayList<HangHoa>();
                    HangHoa hh = new HangHoa();        
                    LocalDateTime dl= LocalDateTime.now();
                    String id=dl.getYear()+""+dl.getMonthValue()+""+dl.getDayOfYear()+""+dl.getHour()+""+dl.getMinute()+""+dl.getSecond()+"";
                     hh.setHangHoaID(id);  
                    if(!hh.setTenHang(ten.getText().trim())){
                        break;
                    }  
                  
                    if(!hh.setNSX(nsx.getText().trim())){
                        break;
                    }
                    if(!hh.setHSD(nsx.getText().trim(),hsd.getText().trim())){
                        break;
                    } 
                    hh.setLoaiHang(cblh.getSelectedIndex());
                    if(!hh.setGiaNhap(gianhap.getText().trim())){
                     break;
                    }
                    if(!hh.setGiaBan(giaxuat.getText().trim())){
                     break;
                    }
                    if(!hh.setDonViTinh(dvt.getText().trim())){
                        break;
                    }
                    
                    ArrayList<LichSu> listr = new ArrayList<LichSu>();
                    LichSu ls = new LichSu();
                    ls.setTime(new DateFormat().DateNow());
                    ls.setType("Hàng hóa");
                    ls.setId(id);
                    ls.setName(mhh.getText().trim());
                    ls.setActive("Thêm");
                    ls.setStatus(true);
                    ls.setDescribe("Không");
                    listr.add(ls);
                    new ReadWriteFile().WriteFileLs(listr,"LichSu.dat",true);
                    
                    hh.setSoLuongBan("0");
                    hh.setSoLuongCon("0");
                    list.add(hh);
                    new ReadWriteFile().WriteToHangHoa(list,"hanghoa.dat",true);
                    nvmp.showMessageInf("Thêm thành công");                   
                    initTable();
                    ClearHH();
                    break;
        }      
    }
    public void ClearHH(){      
        txtSearch.setText("");
        mhh.setText("");      
        ten.setText("");
        nsx.setText("");
        hsd.setText("");
        gianhap.setText("");
        giaxuat.setText("");
        dvt.setText("");
    }
    public void EditHH(){   
        if(nvmp.showMessageConfirm("Bạn có chắc chắn muốn sửa", "Thông báo")==JOptionPane.YES_OPTION){                 
           hhlist = new HangHoaList();
           ArrayList<HangHoa> hhread = hhlist.getList();
               while(true){                  
                        HangHoa hh = hhlist.FindByID(mhh.getText());
                    if(hh!=null){    
                        if(!hh.setTenHang(ten.getText())){
                            break;
                        }
                          hh.setSoLuongCon("0");
                    hh.setSoLuongBan("0");
                        if(!hh.setNSX(nsx.getText().trim())){
                        break;
                         }
                        if(!hh.setHSD(nsx.getText().trim(),hsd.getText().trim())){
                            break;
                        } 
                        hh.setLoaiHang(cblh.getSelectedIndex());
                        if(!hh.setGiaNhap(gianhap.getText().trim())){
                         break;
                        }
                        if(!hh.setGiaBan(giaxuat.getText().trim())){
                         break;
                        }  
                        if(!hh.setDonViTinh(dvt.getText().trim())){
                        break;
                        }
                        
                                ArrayList<LichSu> listr = new ArrayList<LichSu>();
                                LichSu ls = new LichSu();
                                ls.setTime(new DateFormat().DateNow());
                                ls.setType("Hàng hóa");
                                ls.setId(mhh.getText().trim());
                                ls.setName(ten.getText().trim());
                                ls.setActive("Sửa");
                                ls.setStatus(true);
                                ls.setDescribe("Không");
                                listr.add(ls);
                                new ReadWriteFile().WriteFileLs(listr,"LichSu.dat",true);                
                        
                                int index= hhread.indexOf(hh);
                                hhread.remove(index);
                                hhread.add(index, hh);
                                new ReadWriteFile().WriteToHangHoa(hhread,"hanghoa.dat",false);
                                nvmp.showMessageInf("Sửa thành công");
                                break;  
                                }
                          break;
   
                    }                  
                }
                  
     
    }
    public void Delete(){    
       int x=nvmp.showMessageConfirm("Bạn chắc chắn muốn xoá không", "Thông báo");
       if(x==JOptionPane.YES_OPTION){                      
           hhlist = new HangHoaList();  
           while(true){
               HangHoa hh  =hhlist.FindByID(mhh.getText());
               if(hh!=null){
                   if(hhlist.DeleteByID(hh.getHangHoaID())){      
                       
                        ArrayList<LichSu> listr = new ArrayList<LichSu>();
                        LichSu ls = new LichSu();
                        ls.setTime(new DateFormat().DateNow());
                        ls.setType("Hàng hóa");
                        ls.setId(mhh.getText());
                        ls.setName(ten.getText());
                        ls.setActive("Xóa hàng hóa");
                        ls.setStatus(false);
                        ls.setDescribe("Không");
                        listr.add(ls);
                        new ReadWriteFile().WriteFileLs(listr,"LichSu.dat",true);
                       
                       ArrayList<HangHoa> listread = hhlist.getList();
                       new ReadWriteFile().WriteToHangHoa(listread,"hanghoa.dat",false);
                       nvmp.showMessageInf("Xoá thành công"); 
                       break;
                        }      
                    }                                      
              break;
           }
       }          
       } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHHM = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mhh = new javax.swing.JTextField();
        ten = new javax.swing.JTextField();
        nsx = new javax.swing.JTextField();
        hsd = new javax.swing.JTextField();
        gianhap = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        btnEditHHM = new javax.swing.JButton();
        btnAddHHM = new javax.swing.JButton();
        btnClearHHM = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        giaxuat = new javax.swing.JTextField();
        cblh = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dvt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearchHH = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Quản lý hàng hoá");

        tableHHM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableHHM);

        jLabel13.setText("Ngày sản xuất");

        jLabel14.setText("Hạn sử dụng");

        jLabel15.setText("Loại hàng");

        jLabel16.setText("Mã hàng hoá");

        jLabel17.setText("Tên hàng hoá");

        jLabel18.setText("Giá nhập");

        jLabel19.setText("Giá xuất");

        mhh.setEnabled(false);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnEditHHM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnEditHHM.setText("Sửa");
        btnEditHHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditHHMActionPerformed(evt);
            }
        });

        btnAddHHM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/new-icon-16.png"))); // NOI18N
        btnAddHHM.setText("Thêm");
        btnAddHHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHHMActionPerformed(evt);
            }
        });

        btnClearHHM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Button-Close-icon-16.png"))); // NOI18N
        btnClearHHM.setText("Clear");
        btnClearHHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearHHMActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-view-choose-icon-24.png"))); // NOI18N
        jButton1.setText("Chi Tiết");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearHHM, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAddHHM, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditHHM, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditHHM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddHHM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClearHHM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        cblh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hàng mát", "Hàng đông lạnh", "Thực phẩm khô", "Đồ uống", "Bánh kẹo", "Gia dụng", "Khác" }));
        cblh.setSelectedIndex(6);

        jLabel1.setText("Đơn vị tính");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nsx, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(giaxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(mhh)
                    .addComponent(cblh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hsd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gianhap, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(dvt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mhh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nsx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hsd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cblh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel1)
                            .addComponent(dvt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(159, 159, 159))
        );

        jLabel22.setText("Mã hàng hoá  :");

        btnSearchHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/search-icon-16.png"))); // NOI18N
        btnSearchHH.setText("Tìm kiếm");
        btnSearchHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnSearchHH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jSeparator8))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(447, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnClearHHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearHHMActionPerformed
        try {
             ClearHH();
             initTable();
             btnAddHHM.setEnabled(true);
             btnEditHHM.setEnabled(false);
             btnDelete.setEnabled(false);
             txtSearch.setText("");
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_btnClearHHMActionPerformed

    private void btnSearchHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHHActionPerformed
        try {
            if(!searchHH(txtSearch.getText().trim())){
                nvmp.showMessageError("Ma hang khong ton tai");
            }
            
        } catch (Exception e) {
            nvmp.showMessageError("Tim kiem bị lỗi ");
        }
    }//GEN-LAST:event_btnSearchHHActionPerformed

    private void btnAddHHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHHMActionPerformed
         try {
                addHH();
        } catch (Exception e) {
            nvmp.showMessageError("Thêm bị lỗi ");
        }  
        
    }//GEN-LAST:event_btnAddHHMActionPerformed

    private void btnEditHHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditHHMActionPerformed
        try {
            EditHH();
            initTable();
        } catch (Exception e) {
            nvmp.showMessageError("Sua bi loi");
        }
    }//GEN-LAST:event_btnEditHHMActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try {
            Delete();
            initTable();
        } catch (Exception e) {
            nvmp.showMessageError("Xoá bị lỗi");
        }   

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
             hhlist= new HangHoaList();
            HangHoa a = hhlist.FindByID(mhh.getText());
            if(a!=null){
            new HangHoaDetailDialog(new Admin(), true, a.getTenHang(), a.getLoaiHang(), a.getSoLuongCon(), a.getNSX(),
                    a.getHSD(), a.getGiaNhap(), a.getGiaBan()).setVisible(true);
            }
        } catch (Exception e) {
            nvmp.showMessageError("Lỗi "+e.getMessage());
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHHM;
    private javax.swing.JButton btnClearHHM;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditHHM;
    private javax.swing.JButton btnSearchHH;
    private javax.swing.JComboBox<String> cblh;
    private javax.swing.JTextField dvt;
    private javax.swing.JTextField gianhap;
    private javax.swing.JTextField giaxuat;
    private javax.swing.JTextField hsd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField mhh;
    private javax.swing.JTextField nsx;
    private javax.swing.JTable tableHHM;
    private javax.swing.JTextField ten;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
