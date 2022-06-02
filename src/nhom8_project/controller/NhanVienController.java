/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.controller;

//import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import nhom8_project.entity.NhanVien;
import nhom8_project.entity.NhanVienList;
import nhom8_project.utils.DateFormat;
import nhom8_project.utils.ReadWriteFile;
//import nhom8_project.view.admin.Admin;
import nhom8_project.view.admin.NhanVienManagementPanel;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class NhanVienController {
       private NhanVienList nvlist = new NhanVienList();
    public void EditNVM(String id,String name,String bday,String address,String phone,String email,int chucvu,boolean nam,boolean nu){
         while(true){
      //  List<NhanVien> list = new ArrayList<NhanVien>();
      
       NhanVien nv = nvlist.FindById(id);
        nv.setId(id);
       // Gán regex để bắt lỗi 
       Pattern rgname = Pattern.compile("^[a-zA-z ]+"); 
       Pattern rgemail = Pattern.compile("^\\w+@\\w+(\\.\\w+){1,2}$");
       Pattern rgphone = Pattern.compile("^0\\d+{9}");
//       Pattern rgsalary = Pattern.compile("\\d+");
//       Pattern rgworkday=rgsalary;       
       //Kiểm tra Họ tên
       if(name!=null&&!name.trim().equals("")){          
            if(rgname.matcher(name.trim()).find()){
                 nv.setName(name);        
            }else{           
              new loginView().showMessage("Tên chỉ chứa kí tự chữ");
              break;         
            }
        }else{
           new loginView().showMessage("Tên không được để trống");
           break;
       }
         //Kiểm tra ngày sinh
         if(bday!=null&&!bday.trim().equals("")){
        if( new DateFormat().DateParse(bday.trim())){
            nv.setBirthday(bday);
        }else break;
    }   else{
             new loginView().showMessage("Ngày tháng không được để trống");
             break;
         }
        //Kiểm tra lương
//        if(salary!=null&&!salary.trim().equals("")){
//        if(rgsalary.matcher(salary.trim()).find()){
//           nv.setSalary(Integer.parseInt(salary));
//        }else{
//           new loginView().showMessage("Lương chỉ chứa kí tự số");
//           break;
//        }
//        }else{
//            new loginView().showMessage("Lương không được để trống");
//            break;
//        }
//        //Kiểm tra số ngày làm việc
//        if(workd!=null&&!workd.trim().equals("")){
//        if(rgworkday.matcher(workd.trim()).find()){
//           nv.setWorkday(Integer.parseInt(workd));
//        }else{
//           new loginView().showMessage("Số ngày làm  chỉ chứa kí tự số");
//           break;
//        }
//        }else{
//            new loginView().showMessage("Số ngày làm không được bỏ trống");
//            break;
//        }
        //Check addredss
        if(address!=null&&!address.trim().equals("")){
              nv.setAddress(address);
        }else{
            new loginView().showMessage("Địa chỉ không được để trống");
            break;
        }
      
        //Kiểm tra sdt
        if(phone!=null&&!phone.trim().equals("")){
             if(rgphone.matcher(phone.trim()).find()){
                nv.setPhone(phone);
                }else{
                 new loginView().showMessage("Số điện thoại chỉ chứa 10 kí tự số và bắt đầu từ số 0");
                break;
             }
        }else{
            new loginView().showMessage("Số điện thoại không được để trống");
            break;
        }
       
        //Kiểm tra email'
        if(email!=null&&!email.trim().equals("")){
        if(rgemail.matcher(email.trim()).find()){
          nv.setEmail(email);
        }else{         
         new loginView().showMessage("Email không đúng định dạng , ví dụ email@gmail.com");
         break;
        }  
        }else{
            new loginView().showMessage("Email không được bỏ trống");
            break;          
        }
        //Pass
        nv.setPassword("1234567");
        //Chức vụ
        if(chucvu==0){
            nv.setChucVu("Bán hàng");
        }else if(chucvu==1){
            nv.setChucVu("Bảo trì hệ thống");
        }else if(chucvu==2){
            nv.setChucVu("Bảo vệ");
        }
        //Giới tính
       if(nam==true){
          nv.setMale(true);
       }else if(nu==true){
           nv.setMale(false);
       }
        
        int index= nvlist.indexOf(nv);
        listread.remove(index);
        listread.add(index, nv);
        new ReadWriteFile().WriteToFile(listread,"nhanvien.dat",false);
        JOptionPane.showMessageDialog(new NhanVienManagementPanel(),"Sửa thành công");
        break;
        }
       
    }

  
    }
