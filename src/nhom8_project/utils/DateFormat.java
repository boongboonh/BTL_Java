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
           //  System.out.println(ld);
            // System.out.println(ld.getYear());
            System.out.println(ld.getDayOfYear());
            return true;
        } catch (Exception e) {
          //  System.out.println();
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
           //  System.out.println(ld);
            // System.out.println(ld.getYear());
          
        } catch (Exception e) {
          //  System.out.println();
            new loginView().showMessage("Sai định dạng date, ví dụ 01/01/1970 ");
             return false;
        }   
    }
    public static void main(String[] args) {
        
        new DateFormat().DateParse("29/02/2001");
        new DateFormat().DateParse("01/03/2001");
//        LocalDate ldd = LocalDate.parse("2017/03/12");
//        System.out.println(ldd); 
                System.out.println("       ngu dot     ");
              System.out.println("       ngu dot     ".trim());
              
           //   new DateFormat().DateNow();
 //       System.out.println(new DateFormat().Year(LocalDate.now()));                    
           
    }

  
}