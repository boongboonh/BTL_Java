/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import nhom8_project.entity.User;


/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public void WriteToFile(List<User> list){
        try {
            FileWriter fw = new FileWriter("account.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(User u : list){
                bw.write(u.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public List<User> ReadFromFile(){
           List<User> list = new ArrayList<>();
        try {
         
            FileReader fr = new FileReader("account.txt");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
               line= br.readLine();
               if(line==null){
                   break;
               }
               String txt[] = line.split(";");             
               list.add(new User(txt[0],txt[1]));
            }
           
        } catch (Exception e) {
            System.out.println("Không tìm thấy file!");

        }
        return list;
    }
    public static void main(String[] args) {
            ReadWriteFile rwf= new ReadWriteFile();
      //        List<User> list = new ArrayList<>();
//        list.add(new User("admin","12345678"));
//        list.add(new User("nhanvien1","12345678"));
//        list.add(new User("nhanvien2","12345678"));
 //       rwf.WriteToFile(list);
//          List<User> list = rwf.ReadFromFile();
//          for(User u:list){
//              System.out.println(u);
//              if(u.getUserName()== "admin" && u.getPassword()== "12345678"){
//            System.out.println("Hi bro");
//            Admin a = new Admin();
//            a.setVisible(true);
//          }
          
//    }
    }
}
