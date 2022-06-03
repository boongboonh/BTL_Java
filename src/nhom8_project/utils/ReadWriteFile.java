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
import nhom8_project.entity.NhanVien;



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
                System.out.println(line);
                String txt[]=line.split(";");
                list.add( new NhanVien(txt[0],txt[1],txt[2],txt[3],txt[4],txt[5],txt[6],txt[7],txt[8],txt[9],Boolean.parseBoolean(txt[10]),txt[11]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error readformnhanvien");
        }
        return list;
    }

    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
            ReadWriteFile rwf= new ReadWriteFile();
            ArrayList<NhanVien> list = new ArrayList<NhanVien>();          
            NhanVien b= new NhanVien();
            b.setId("2022nv1");
            list.add(b);
           // rwf.WriteToFile(list, "nhanvien.dat",true);
            int index = rwf.ReadFromNhanVien().indexOf(b);
                //    rwf.ReadFromNhanVien().remove(1);
                     System.out.println(index);
                  
    }
}
