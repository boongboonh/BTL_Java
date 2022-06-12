/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class DateFormat {
    public int Year(LocalDate a){
        return a.getYear();
    }
    public String DateNow(){
         DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        try {
            LocalDateTime ld=  LocalDateTime.now();
            return ld.format(dtf);
        } catch (Exception e) {
            System.out.println("Lỗi DateNow");
        }
        return null;
    }
    public boolean DateParse(String date){
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
             LocalDate ld = LocalDate.parse(date, dtf);         
            return true;
        } catch (Exception e) {    
            new loginView().showMessage("Sai định dạng date, ví dụ 01/01/1970 ");
             return false;
        }   
       
    }
    public boolean DatebiggerDate(String date1,String date2){
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
             LocalDate ld1 = LocalDate.parse(date1, dtf);
             LocalDate ld2 = LocalDate.parse(date2, dtf);
             if(ld1.getYear()<ld2.getYear()){
                 return true;
             }else if(ld1.getYear()==ld2.getYear()&&ld1.getMonthValue()<ld2.getMonthValue()){
                 return true;
             }else if(ld1.getYear()==ld2.getYear()&&ld1.getMonthValue()==ld2.getMonthValue()&&ld1.getDayOfYear()<ld2.getDayOfYear()){
                 return true;
             }          
             else{
                 new loginView().showMessage("Hạn sử dụng phải lớn hơn Ngày sản xuất ");
                  return false;
             }   
        } catch (Exception e) {
            new loginView().showMessage("Sai định dạng date, ví dụ 01/01/1970 ");
             return false;
        }   
    }
}