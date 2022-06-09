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
import nhom8_project.entity.hoadon.HoaDon;
import nhom8_project.entity.hoadon.HoaDonList;
import nhom8_project.entity.hanghoa.HangHoa;
import nhom8_project.entity.hanghoa.HangHoaList;
import nhom8_project.utils.ReadWriteFile;

/**
 *
 * @author Admin
 */
public class HoaDonManagementPanel extends javax.swing.JPanel {
    private NhanVienManagementPanel nvmp = new NhanVienManagementPanel();
    private HoaDonList hdlist;
    private HangHoaList hhlist;
    private DefaultTableModel tbModel=null;
    private Object [] Title=new Object[]{"STT","Mã Hoá Đơn","Tên Hoá Đơn","Số Lượng","Ngày Nhập","Nhà Cung Cấp","Mã Hàng Hoá"};
    private String date,mahh;
    /**
     * Creates new form KhoHangManagementPanel
     */
    public HoaDonManagementPanel() {
        initComponents();
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDetail.setEnabled(false);     
        initTable();
        SelectRowTable();
    }
    public void initTable(){
        hdlist= new HoaDonList();
        tbModel = new DefaultTableModel();
        tbModel.setColumnIdentifiers(Title);
        hdlist.setModel(tbModel);
        table.setModel(tbModel);
    }
    public void initTableByID(String id){
        hdlist= new HoaDonList();
        tbModel = new DefaultTableModel();
        tbModel.setColumnIdentifiers(Title);
        hdlist.setModelByID(tbModel,id);
        table.setModel(tbModel);
    }
    public void SelectRowTable(){
        
       //Tạo danh sách lựa chọn của kho hàng trên bảng và thiết lập chỉ chọn 1
        ListSelectionModel listModel=table.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Thêm hàm sự kiện cho bảng table
        listModel.addListSelectionListener(new ListSelectionListener() {
            //Thêm hàng thay đổi giá trị lựa chọn
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //Lấy danh sách các hàng và các cột lựa chọn
                int rows[]=table.getSelectedRows();
                int cols[]=table.getSelectedColumns();
                //Nếu có hàng được lựa chọn thì chạy tiếp
                if(cols.length>0&&rows.length>0){
                    //Gán các giá trị từ bảng vào các ô TextField 
                    String ID=String.valueOf(table.getValueAt(rows[0],1));
                    String Name=String.valueOf(table.getValueAt(rows[0],2));
                    String Soluong=String.valueOf(table.getValueAt(rows[0],3));                    
                    String datenhap=String.valueOf(table.getValueAt(rows[0],4));
                    String ncc=String.valueOf(table.getValueAt(rows[0],5));                    
                    String Mhh=String.valueOf(table.getValueAt(rows[0],6));                    
                        txtsearch.setText(ID);
                        txtMaHD.setText(ID); 
                        txtTenHD.setText(Name);   
                        sl.setText(Soluong);
                        txtNCC.setText(ncc);
                        date=datenhap;
                        mhh.setText(Mhh);
                        mahh=Mhh;
                        txtTenHD.setEnabled(false);
                        txtNCC.setEnabled(false);
                        btnAdd.setEnabled(true);
                        btnEdit.setEnabled(true);
                        btnDetail.setEnabled(true);
                        btnDelete.setEnabled(true);          
                }
            }
        });                   
    }
    public void checkHDNull(){
        if(cbcheck.getSelectedIndex()==0){
            txtTenHD.setEnabled(true);
            txtNCC.setEnabled(true);
        }else if(cbcheck.getSelectedIndex()==1){
            txtTenHD.setEnabled(false);
            txtNCC.setEnabled(false);    
        }
    }
    @SuppressWarnings("unchecked")
    public boolean searchHD(String id){  
        ArrayList<HoaDon> a = hdlist.FindListHDByID(id);       
        if(a.size()>0){
            initTableByID(id);
            return true;
        }else{
            return false;
        }         
    }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenHD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNCC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mhh = new javax.swing.JTextField();
        sl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cbcheck = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Quản Lý Kho Hàng");

        jLabel2.setText("Mã hoá đơn :");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/search-icon-16.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Mã hoá đơn");

        txtMaHD.setEnabled(false);

        jLabel4.setText("Tên hoá đơn");

        jLabel5.setText("Nhà cung cấp");

        jLabel6.setText("Mã hàng hoá");

        jLabel7.setText("Số lượng");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/new-icon-16.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Actions-view-choose-icon-24.png"))); // NOI18N
        btnDetail.setText("Chi tiết");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom8_project/icon/Button-Close-icon-16.png"))); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbcheck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặt hàng chưa từng nhập", "Mặt hàng đã từng nhập" }));
        cbcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbcheck, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(txtTenHD)
                        .addComponent(mhh))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sl, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addComponent(txtNCC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mhh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void addHoaDon(){        
        hhlist= new HangHoaList();
         ArrayList<HangHoa> listread = hhlist.getList();
               while(true){
                    ArrayList<HoaDon> list = new ArrayList<HoaDon>();
                    HoaDon hd = new HoaDon();           
                    LocalDateTime dl= LocalDateTime.now();
                    if(cbcheck.getSelectedIndex()==0){
                        hd.setMaHoaDon(dl.getYear()+""+dl.getMonthValue()+""+dl.getDayOfYear()+""+dl.getHour()+""+dl.getMinute()+""+dl.getSecond()+"");    
                    }else if(cbcheck.getSelectedIndex()==1){
                        hd.setMaHoaDon(txtMaHD.getText());
                    }                 
                    if(!hd.setTenHoaDon(txtTenHD.getText().trim())){
                        break;
                    }
                    if(!hdlist.checkMaHH(txtMaHD.getText().trim(),mhh.getText().trim())){
                           if(!hd.setHangHoaID(mhh.getText().trim())){
                               break;
                           }
                    }else{
                        nvmp.showMessageError("Mã hàng hoá đã tồn tại trong mã hoá đơn này");
                         break;
                    }  
                    if(!hd.setSl(sl.getText().trim())){
                        break;
                    }
                    hd.setDateNhap();
                    if(!hd.setNhaSX(txtNCC.getText().trim())){
                        break;
                    }
                    //Them so luong vao  hang hoa
                    HangHoa a= hhlist.FindByID(mhh.getText().trim());
                    if(a!=null){
                        int slc = Integer.parseInt(sl.getText().trim())+Integer.parseInt(a.getSoLuongCon());
                        a.setSoLuongCon(String.valueOf(slc));
                        int index = listread.indexOf(a);
                        listread.remove(index);
                        listread.add(index, a);
                        new ReadWriteFile().WriteToHangHoa(listread,"hanghoa.dat",false);
                    }
                    list.add(hd);
                    new ReadWriteFile().WriteToHoaDon(list,"hoadon.dat",true);
                    nvmp.showMessageInf("Thêm thành công");                   
                    initTable();
                    ClearKH();
                    break;
        }      
    }
    public void EditHD(){   
     
        if(nvmp.showMessageConfirm("Bạn có chắc chắn muốn sửa", "Thông báo")==JOptionPane.YES_OPTION){                 
           hdlist = new HoaDonList();
           ArrayList<HoaDon> hdread = hdlist.getList();
           hhlist= new HangHoaList();
           ArrayList<HangHoa> listread = hhlist.getList();
               while(true){               
                    ArrayList<HoaDon> listhd= hdlist.FindListHDByID(txtMaHD.getText());                      
//                   HoaDon hd = new HoaDonList().FindByID(txtsearch.getText());
                if(listhd.size()>0){    
                        for(HoaDon hd:listhd){
                            if(hd.getHangHoaID().equals(mahh)){
                                int index= hdread.indexOf(hd);
                                hdread.remove(index);
                                if(!hdlist.checkMaHH(txtMaHD.getText().trim(),mhh.getText().trim())){
                                       if(!hd.setHangHoaID(mhh.getText().trim())){
                                        break;
                                     } 
                       
                                }else{
                                    nvmp.showMessageError("Mã hàng hoá đã tồn tại trong mã hoá đơn này");
                                break;
                                }  
                                int editsl = Integer.valueOf(hd.getSl());
                                if(!hd.setSl(sl.getText().trim())){
                                    break;
                                }                                  
                                //Them so luong vao  hang hoa
                                HangHoa a= hhlist.FindByID(mhh.getText().trim());
                                if(a!=null){
                                    int slc = Integer.parseInt(sl.getText().trim())+Integer.parseInt(a.getSoLuongCon())-editsl;
                                    a.setSoLuongCon(String.valueOf(slc));
                                    int indexhh = listread.indexOf(a);
                                    listread.remove(indexhh);
                                    listread.add(indexhh, a);
                                    new ReadWriteFile().WriteToHangHoa(listread,"hanghoa.dat",false);
                                }
                                hdread.add(index, hd);
                                new ReadWriteFile().WriteToHoaDon(hdread,"hoadon.dat",false);
                                nvmp.showMessageInf("Sửa thành công");
                                break;  
                                }
                            }       
                    }                  
                     break;
                  
                }
        }      

    }
    
    public void Delete(){    
       int x=nvmp.showMessageConfirm("Bạn chắc chắn muốn xoá không", "Thông báo");
       if(x==JOptionPane.YES_OPTION){                    
           hdlist = new HoaDonList();
           ArrayList<HoaDon> hdread = hdlist.getList();
           hhlist= new HangHoaList();
           ArrayList<HangHoa> listread = hhlist.getList();
           while(true){
                    ArrayList<HoaDon> listhd= hdlist.FindListHDByID(txtMaHD.getText());                  
                    if(listhd.size()>0){    
                        for(HoaDon hd:listhd){
                            if(hd.getHangHoaID().equals(mahh)){
                                 //Them so luong vao  hang hoa
                                 int editsl=Integer.valueOf(hd.getSl());
                                HangHoa a= hhlist.FindByID(mhh.getText().trim());
                                if(a!=null){
                                    int slc =Integer.parseInt(a.getSoLuongCon())-editsl;
                                    a.setSoLuongCon(String.valueOf(slc));
                                    int indexhh = listread.indexOf(a);
                                    listread.remove(indexhh);
                                    listread.add(indexhh, a);
                                    new ReadWriteFile().WriteToHangHoa(listread,"hanghoa.dat",false);
                                }
                                int index= hdread.indexOf(hd);
                                hdread.remove(index);                               
                                new ReadWriteFile().WriteToHoaDon(hdread,"hoadon.dat",false);
                                nvmp.showMessageInf("Xoá thành công");
                                break;  
                                }
                            }       
                    } 
             break;       }
           }
       }           
       
    public void ClearKH(){      
        txtsearch.setText("");
        txtMaHD.setText("");
        txtTenHD.setText("");
        sl.setText("");
        txtNCC.setText("");
        mhh.setText("");
        cbcheck.setSelectedIndex(0);

    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            EditHD();
            initTable();
        } catch (Exception e) {
            nvmp.showMessageError("Lỗi Sửa");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
             HoaDon a = hdlist.FindByID(txtMaHD.getText().trim());
             if(cbcheck.getSelectedIndex()==0 ){
                 if(a==null){
                    addHoaDon();
                 }else{
                     nvmp.showMessageError("Ma hoa don da ton tai");
                 }
                     
             }else
             if(cbcheck.getSelectedIndex()==1){
                   addHoaDon();
             }
        } catch (Exception e) {
            nvmp.showMessageError("Thêm bị lỗi ");
        }     

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try {
            Delete();
            initTable();
        } catch (Exception e) {
            nvmp.showMessageError("Xoá bị lỗi");
        }   

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        try {
            ClearKH();
            btnAdd.setEnabled(true);
            btnEdit.setEnabled(false);
            btnDetail.setEnabled(false);
            btnDelete.setEnabled(false);
            txtsearch.setText("");
        } catch (Exception e) {
            nvmp.showMessageError("Lỗi Clear");
        }    
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            if(searchHD(txtsearch.getText())){
            btnAdd.setEnabled(false);
            btnEdit.setEnabled(true);
            btnDetail.setEnabled(true);
            btnDelete.setEnabled(true); 
            }else{
                nvmp.showMessageError("Không tìm thấy mã hoá đơn "+txtsearch.getText());
            }     
        } catch (Exception e) {
            nvmp.showMessageError("Lỗi tìm kiếm");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
       hdlist = new HoaDonList();
       ArrayList<HoaDon> listhdbyid = hdlist.FindListHDByID(txtMaHD.getText());              
        new HoaDonDetailDialog(new Admin(), true,listhdbyid, txtMaHD.getText().trim(), 
                txtTenHD.getText().trim(),txtNCC.getText().trim(),date ).setVisible(true);
    }//GEN-LAST:event_btnDetailActionPerformed

    private void cbcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcheckActionPerformed
            checkHDNull();
    }//GEN-LAST:event_cbcheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbcheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField mhh;
    private javax.swing.JTextField sl;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNCC;
    private javax.swing.JTextField txtTenHD;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
