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
import nhom8_project.entity.NhanVien;



/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public void WriteToNhanVien(List<NhanVien> list){
        try {
            FileWriter fw = new FileWriter("nhanvien.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for(NhanVien nv : list){
                bw.write(nv.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            System.out.println("Không tìm thấy file nhanvien.txt");
        }
    }
    public List<NhanVien> ReadFromNhanVien(){
           List<NhanVien> list = new ArrayList<>();
        try {
         
            FileReader fr = new FileReader("nhanvien.txt");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
               line= br.readLine();
               if(line==null){
                   break;
               }
               String txt[] = line.split(";");               
               list.add( new NhanVien(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],Integer.parseInt(txt[6]),Integer.parseInt(txt[7]),Boolean.parseBoolean(txt[8]),txt[9],txt[10]));
                 
              
            }
           
        } catch (Exception e) {
            System.out.println("Không tìm thấy file!");

        }
        return list;
    }
    public static void main(String[] args) {
            ReadWriteFile rwf= new ReadWriteFile();
//            
//            NhanVien a = new NhanVien("0","1","@","3","4","5","6","7",8,9,true);
//            List<NhanVien> list = new ArrayList<>();
//            list.add(a);
//            rwf.WriteToNhanVien(list);
  //          rwf.ReadFromAccount();
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
