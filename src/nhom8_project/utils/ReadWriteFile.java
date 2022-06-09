/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import nhom8_project.entity.LuongThuong;
import nhom8_project.entity.NhanVien;
import nhom8_project.entity.LichSu;


/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public  void WriteToFile(ArrayList<NhanVien> list,String file,boolean append){
        try {
            FileWriter fw = new FileWriter(file,append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(NhanVien nv: list){
                bw.write(nv.toString());
                bw.newLine();
            }           
            bw.close();
            fw.close();                
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
        }
    }
    public  ArrayList<NhanVien> ReadFromNhanVien(){
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            FileReader fr=new FileReader("nhanvien.dat");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
//                System.out.println(line);
                String txt[]=line.split(";");
                list.add( new NhanVien(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6],txt[7],txt[8],txt[9],Boolean.parseBoolean(txt[10]),txt[11]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error readformnhanvien");
        }
//        System.out.println(list);
        return list;
    }
    
    public  void WriteFileLt(ArrayList<LuongThuong> list,String file,boolean append){
        try {
            FileWriter fw = new FileWriter(file,append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(LuongThuong lt: list){
                bw.write(lt.toString());
                bw.newLine();
            }           
            bw.close();
            fw.close();                
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
        }
    }
    
    public  ArrayList<LuongThuong> ReadFileLt(){
        ArrayList<LuongThuong> list = new ArrayList<>();
        try {
            FileReader fr=new FileReader("LuongThuong.dat");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
                String txt[]=line.split(";");
                list.add( new LuongThuong(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6],Boolean.parseBoolean(txt[7]),txt[8]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error ReadFileLt");
        }
        return list;
    }

    public  void WriteFileLs(ArrayList<LichSu> list,String file,boolean append){
        try {
            FileWriter fw = new FileWriter(file,append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(LichSu ls: list){
                bw.write(ls.toString());
                bw.newLine();
            }           
            bw.close();
            fw.close();                
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
        }
    }
    
    public  ArrayList<LichSu> ReadFileLs(){
        ArrayList<LichSu> list = new ArrayList<>();
        try {
            FileReader fr=new FileReader("LichSu.dat");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
                String txt[]=line.split(";");
                list.add( new LichSu(txt[0],txt[1],txt[2],txt[3],txt[4],Boolean.parseBoolean(txt[5]),txt[6]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error ReadFileLs");
        }
        return list;
    }
    
    
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
            ReadWriteFile rwf= new ReadWriteFile();
//            ArrayList<NhanVien> list = new ArrayList<NhanVien>();          
//            NhanVien b= new NhanVien();
//            b.setId("2022nv1");
//            list.add(b);
//           // rwf.WriteToFile(list, "nhanvien.dat",true);
//            int index = rwf.ReadFromNhanVien().indexOf(b);
//                //    rwf.ReadFromNhanVien().remove(1);
//                     System.out.println(index);
//                  System.out.println(rwf.ReadFromNhanVien());
    }

   
}
