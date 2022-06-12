/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.luongthuong;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.utils.DateFormat;
import nhom8_project.view.loginView;


/**
 *
 * @author Admin
 */
public class LuongThuong implements Serializable {
    private String Id,Name,Salary,Month,Year,WorkingDay,ThPh,Tong;
    private boolean Status=false;
    
    Pattern rgworkingday = Pattern.compile("[0-9]{0,2}");
    Pattern rgsalary = Pattern.compile("[0-9]{0,5}");
    Pattern rgmonth = Pattern.compile("[0-9]{1,2}");
    Pattern rgyear = Pattern.compile("[0-9]{4}");
    
    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    public String getMonth() {
        return Month;
    }

    public boolean setMonth(String Month) {
        boolean check= false;
        while(true){
           if(Month!=null&&!Month.equals("")){
               if(rgmonth.matcher(Month).find()){
                if( Integer.parseInt(Month)>0 && Integer.parseInt(Month)<13 ){
                this.Month =Month;
                check=true;
                }
                else if(Integer.parseInt(Month)<1){
                         new loginView().showMessage("Tháng phải lớn hơn 0");
                        
                    }
                
                    else {
                        new loginView().showMessage("Tháng phải  nhỏ hơn 13");
                        
                    }
                }   else{
                        new loginView().showMessage("Phải nhập số không được nhập chữ hay ký tự đặc biệt cho Tháng");                
                    }
            
            }   else{
                    new loginView().showMessage("Tháng không được để trống");                
            }
         break;  
        }
       return check;
    }
    
    public String getYear() {
        return Year;
    }

    public boolean setYear(String Year) {
        boolean check= false;
        while(true){
           if(Year!=null&&!Year.equals("")){
               if(rgyear.matcher(Year).find()){
                
                this.Year =Year;
                check=true;
                
                }   else{
                        new loginView().showMessage("Phải nhập số không được nhập chữ hay ký tự đặc biệt cho năm");                
                    }
            
            }   else{
                    new loginView().showMessage("Năm không được để trống");                
            }
         break;  
        }
       return check;
    }
    
    public String getId() {
        return Id;
    }
    
    public void setId(String id) {
        this.Id=id;
        }
    
    public String getThPh() {
        return ThPh;
    }
    
    public void setTong(String tong) {
        this.Tong=tong;
        }
    
    public String getTong() {
        return Tong;
    }
    
    public void setThPh(String thph) {
        this.ThPh=thph;
        }
    
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        this.Name=name;
        }
    
    public String getSalary() {
        return Salary;
    }

    public boolean setSalary(String Salary) {
        boolean check= false;
        int i = Integer.parseInt(Salary);
        while(true){
           if(Salary!=null&&!Salary.equals("")){ 
                
               if(rgsalary.matcher(Salary).find()){
                
                   if( i>0&&i<10000){
                        this.Salary =Salary;
                        check=true;
                        return check;
                    }
                
                    else if(i<=0){
                         new loginView().showMessage("Mức lương cơ bản phải lớn hơn 0");
                        
                    }
                
                    else {
                        new loginView().showMessage("Mức lương cơ bản phải nhỏ hơn hơn 10000");
                        
                    }
                   
                }   else{
                        new loginView().showMessage("Phải nhập số không được nhập chữ hay ký tự đặc biệt cho Lương cơ bản");                
                    }
                   
            
            }       
                else{
                    new loginView().showMessage("Lương cơ bản không được để trống"); 
                    
                }
           break;
        }
       return check;
    }
    
    public String getWorkingDay() {
        return WorkingDay;
    }
    
    public boolean setWorkingDay(String WorkingDay) {
        boolean check= false;
        int i = Integer.parseInt(WorkingDay);
        while(true){
           if(WorkingDay!=null&&!WorkingDay.equals("")){ 
                
               if(rgworkingday.matcher(WorkingDay).find()){
                
                   if( i>0&&i<31){
                        this.WorkingDay =WorkingDay;
                        check=true;
                        return check;
                    }
                
                    else if(i<=0){
                         new loginView().showMessage("Số ngày làm phải lớn hơn 0");
                        
                    }
                
                    else {
                        new loginView().showMessage("Số ngày làm nhỏ hơn 31");
                        
                    }
                }   else{
                        new loginView().showMessage("Phải nhập số không được nhập chữ hay ký tự đặc biệt cho Số ngày làm");                
                    }
                   
            
            }       
                else{
                    new loginView().showMessage("Số ngày làm không được để trống"); 
                    
                }
         break;  
        }
       return check;
        }
    
     public LuongThuong(){       
    }
     
    public LuongThuong(String id,String name, String salary,String thph, String month,String year, String workingday,boolean status, String tong) {
        this.Id = id;
        this.Name = name;
        this.Salary = salary;
        this.ThPh=thph;
        this.Month = month;
        this.Year = year;
        this.WorkingDay = workingday;       
        this.Status=status;        
        this.Tong=tong;
    }
    
     @Override
    public String toString() {
            return Id+";"+Name+";"+Salary+";"+ThPh+";"+Month+";"+Year+";"+WorkingDay+";"+Status+";"+Tong;
    }
   
    
    
    
}    
    

        
 