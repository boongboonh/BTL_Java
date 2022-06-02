/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    private String id,name,address,email,userName,password,birthday,phone,chucVu;
//    private int salary,workday,TotalSalary;   
    private boolean male;
    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
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

    public void setName(String name) {
        this.name=name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       this.email=email.trim();
    }
    public void setPassword(String pass){
        Pattern p = Pattern.compile(".{6,}");
        if(p.matcher(pass.trim()).find()){
          this.password=pass.trim();
        }else{
             new loginView().showMessage("Password phải lớn hơn 6 kí tự");  
        }
    }
    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        
         this.birthday =birthday.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
      this.phone=phone.trim();
       
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public NhanVien(){       
    }
    public NhanVien(String id, String name, String birthday, String address, String email, String phone,String chucvu,boolean male,String userName,String password) {
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
        this.male = male;
//        this.TotalSalary=salary*workday;
    }

    @Override
    public String toString() {
            return id+";"+name+";"+birthday+";"+address+";"+email+";"+phone+";"+chucVu+";"+male+";"+userName+";"+password;
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
