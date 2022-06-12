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
import nhom8_project.entity.nhanvien.NhanVien;
import nhom8_project.entity.hoadon.HoaDon;
import nhom8_project.entity.hanghoa.HangHoa;
import nhom8_project.entity.lichsu.LichSu;
import nhom8_project.entity.luongthuong.LuongThuong;


/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public  void WriteToNhanVien(ArrayList<NhanVien> list,String file,boolean append){
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
    public  void WriteToHoaDon(ArrayList<HoaDon> list,String file,boolean append){
        try {
            FileWriter fw = new FileWriter(file,append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(HoaDon kh: list){
                bw.write(kh.toString());
                bw.newLine();
            }           
            bw.close();
            fw.close();                
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
        }
    }
    public  ArrayList<HoaDon> ReadFromHoaDon(){
        ArrayList<HoaDon> list = new ArrayList<>();
        try {
            FileReader fr=new FileReader("hoadonnhap.dat");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
                String txt[]=line.split(";");
                list.add(new HoaDon(txt[0], txt[1], txt[2], txt[3], txt[4], txt[5]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error readformhoadon");
        }
        return list;
    }
    public  void WriteToHangHoa(ArrayList<HangHoa> list,String file,boolean append){
        try {
            FileWriter fw = new FileWriter(file,append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(HangHoa hh:list){
                bw.write(hh.toString());
                bw.newLine();
            }           
            bw.close();
            fw.close();                
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
        }
    }
    public  ArrayList<HangHoa> ReadFromHangHoa(){
        ArrayList<HangHoa> list = new ArrayList<>();
        try {
            FileReader fr=new FileReader("hanghoa.dat");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
                String txt[]=line.split(";");
                list.add(new HangHoa(txt[0], txt[1], txt[2], txt[3], txt[4], txt[5], txt[6], txt[7], txt[8],txt[9]));
            }  
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error readformhanghoa");
        }
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
    
}
