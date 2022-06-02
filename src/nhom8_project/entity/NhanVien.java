/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.utils.DateFormat;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    private String id,name,address,email,userName,password,birthday,phone,chucVu,sex;

    public String getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        if(sex){
          this.sex="Nam";
       }else if(!sex){
           this.sex="Nữ";      
        }
    }
    // bắt  lỗi regex
       Pattern rgname = Pattern.compile("^[a-zA-z ]+"); 
       Pattern rgemail = Pattern.compile("^\\w+@\\w+(\\.\\w+){1,2}$");
       Pattern rgphone = Pattern.compile("^0\\d+{9}");
    public String getChucVu() {
        return chucVu;
    }
    
    public void setChucVu(int chucvu,String id) {
        switch (chucvu) {
                case 0:
                    this.chucVu ="Bán hàng";
                    this.userName=id;
                    this.password="1234567";
                    break;
                case 1:
                   this.chucVu="Bảo trì hệ thống";
                    break;
                case 2:
                    this.chucVu="Bảo vệ";
                    break;
            }
        
    }
    public void setUserName( String name){
         this.userName=name;
    }
    public String getUserName() {
        
        return userName;
    }

//    public int getTotalSalary() {
//        return TotalSalary;
//    }
 

    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
//    public boolean setId(String id) {
//       ReadWriteFile rd=new ReadWriteFile();    
//       NhanVien a= new NhanVien();
//       a.id=id.trim();
//       for(NhanVien b : rd.ReadFromNhanVien()){
//           if(b.id.equals(a.id)){             
//               return false;
//           }
//       }
//       this.id = id.trim();
//       return true;
//        
//    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        boolean check =false;
        while(true){
           if(name!=null&&!name.equals("")){          
                if(rgname.matcher(name).find()){
                    this.name=name;       
                    check= true;
                }else{           
                 new loginView().showMessage("Tên chỉ chứa kí tự chữ");                           
                }
            }else{
               new loginView().showMessage("Tên không được để trống");             
           }
           break;
        }
        return check;
   
    }

    public String getAddress() {
        
        return address;
    }

    public boolean setAddress(String address) {     
        boolean check=false;
        while(true){
            if(address!=null&&!address.equals("")){
              this.address = address;
              check=true;
            }else{
                new loginView().showMessage("Địa chỉ không được để trống");         
        }
            break;
        }
        return check;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
       boolean check=false;
        while(true){
           if(email!=null&&!email.equals("")){
                if(rgemail.matcher(email).find()){
                    this.email=email;
                    check=true;               
                }else{         
                     new loginView().showMessage("Email không đúng định dạng , ví dụ email@gmail.com");                    
                }  
            }else{
                    new loginView().showMessage("Email không được bỏ trống");                       
                } 
           break;
        }
        return check;
    }
    public boolean setPassword(String pass){
        boolean check=false;
        Pattern p = Pattern.compile(".{6,}");
        if(p.matcher(pass.trim()).find()){
          this.password=pass.trim();
          check=true;
        }else{
             new loginView().showMessage("Password phải lớn hơn 6 kí tự");  
        }
        return check;
    }
    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean setBirthday(String birthday) {
        boolean check= false;
        while(true){
           if(birthday!=null&&!birthday.equals("")){
                if( new DateFormat().DateParse(birthday)){
                this.birthday =birthday;
                check=true;
            }else break;
            }   else{
                    new loginView().showMessage("Ngày tháng không được để trống");                
            }
           break;
        }
       return check;
    }

    public String getPhone() {
        return phone;
    }

    public boolean setPhone(String phone) {
        boolean check=false;
        while(true){
          if(phone!=null&&!phone.equals("")){
             if(rgphone.matcher(phone).find()){
                this.phone=phone;
                check=true;
                }else{
                 new loginView().showMessage("Số điện thoại chỉ chứa 10 kí tự số và bắt đầu từ số 0");                
             }
        }else{
           new loginView().showMessage("Số điện thoại không được để trống");          
        }  
           break;
        }
      return check;
       
    }

//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary=salary;
//    }
//
//    public int getWorkday() {
//        return workday;
//    }
//
//    public void setWorkday(int workday) {
//         this.workday=workday;
//    }

  
    public NhanVien(){       
    }
    public NhanVien(String id, String name, String birthday, String address, String email, String phone,String chucvu,String sex,String userName,String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.phone = phone;
//        this.salary = salary;
//        this.workday = workday;
        this.chucVu=chucvu;
        this.sex = sex;
//        this.TotalSalary=salary*workday;
    }

    @Override
    public String toString() {
            return id+";"+name+";"+birthday+";"+address+";"+email+";"+phone+";"+chucVu+";"+sex+";"+userName+";"+password;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.id, other.id);
    }
 
    
   
}
