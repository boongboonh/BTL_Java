/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class DateFormat {
    public boolean DateParse(String date){
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
             LocalDate ld = LocalDate.parse(date, dtf);
           //  System.out.println(ld);
            // System.out.println(ld.getYear());
            return true;
        } catch (Exception e) {
          //  System.out.println();
            new loginView().showMessage("Sai định dạng date, ví dụ 01/01/1970 ");
             return false;
        }   
       
    }
    public static void main(String[] args) {
        
        new DateFormat().DateParse("29/02/2001");
//        LocalDate ldd = LocalDate.parse("2017/03/12");
//        System.out.println(ldd); 
                System.out.println("       ngu dot     ");
              System.out.println("       ngu dot     ".trim());
              
        
           
    }
}