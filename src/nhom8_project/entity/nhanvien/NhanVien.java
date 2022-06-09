/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.nhanvien;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    private String id,name,address,email,userName,password,birthday,phone,chucVu,sex,described;
    private boolean status=true;


    // bắt  lỗi regex
       Pattern rgname = Pattern.compile("^[a-zA-Z'-'\sáàảãạăâắằấầặẵẫậéèẻ ẽẹếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]*$"); 
       Pattern rgemail = Pattern.compile("^\\w+@\\w+(\\.\\w+){1,2}$");
       Pattern rgphone = Pattern.compile("^0\\d+{9}$");
       Pattern rgdate = Pattern.compile("^(?:(?:31(\\\\/|-|\\\\.)(?:0?[13578]|1[02]))\\\\1|(?:(?:29|30)(\\\\/|-|\\\\.)(?:0?[13-9]|1[0-2])\\\\2))(?:(?:1[6-9]|[2-9]\\\\d)?\\\\d{2})$|^(?:29(\\\\/|-|\\\\.)0?2\\\\3(?:(?:(?:1[6-9]|[2-9]\\\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\\\d|2[0-8])(\\\\/|-|\\\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\\\4(?:(?:1[6-9]|[2-9]\\\\d)?\\\\d{2})$");
      
        public String getDescribed() {
        return described;
    }

    public boolean setDescribed(String described) {
        boolean check=false;
        if(described!=null&&!described.equals("")){
            this.described=described;
            check=true;
        }
        return check;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
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
                    this.userName=null;
                    this.password=null;
                    break;
                case 2:
                    this.chucVu="Bảo vệ";
                    this.userName=null;
                    this.password=null;
                    break;
            }
        
    }
    public void setUserName( String name){
         this.userName=name;
    }
    public String getUserName() {
        
        return userName;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
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
    public void setPassword(String pass){
//        boolean check=false;
//        Pattern p = Pattern.compile(".{6,}");
//        if(p.matcher(pass.trim()).find()){
//          this.password=pass.trim();
//          check=true;
//        }else{
//             new loginView().showMessage("Password phải lớn hơn 6 kí tự");  
//        }
//        return check;
        password=pass;
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
                if(rgdate.matcher(birthday).find()){
                this.birthday =birthday;
                check=true;
            }else{
                    new loginView().showMessage("Ngày tháng định dạng theo dd/MM/yyyy"); 
                    break;
                }
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
    public NhanVien(){       
    }
    public NhanVien(String id, String name, String birthday, String address, String email, String phone,String chucvu,String sex,String userName,String password,boolean status,String describ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.phone = phone;
        this.chucVu=chucvu;
        this.sex = sex;
        this.status=status;
        described=describ;
    }

    @Override
    public String toString() {
            return id+";"+name+";"+birthday+";"+address+";"+email+";"+phone+";"+chucVu+";"+sex+";"+userName+";"+password+";"+status+";"+described;
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
