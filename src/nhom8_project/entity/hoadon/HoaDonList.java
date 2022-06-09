/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.hoadon;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import nhom8_project.entity.hanghoa.HangHoa;
import nhom8_project.utils.ReadWriteFile;

/**
 *
 * @author Admin
 */
public class HoaDonList {
    private ArrayList<HoaDon> list = new ReadWriteFile().ReadFromHoaDon();
    public ArrayList<HoaDon> getList() {
        return list;
    }
    public HoaDon FindByID(String id){
        for(HoaDon kh:list){
            if(kh.getMaHoaDon().equals(id)){
                return kh;
            }
        }
        return null;
    }
    public boolean DeleteByID(String id){
        for(HoaDon kh:list){
            if(kh.getMaHoaDon().equals(id)){
                list.remove(kh);
                return true;
            }
        }
        return false;
    }
    public boolean checkMaHH(String id , String mhh){
        ArrayList<HoaDon> a=FindListHDByID(id);     
        if(a.size()>0){
            for(HoaDon hd: a){
                if(hd.getHangHoaID().equals(mhh)){
                    return true;
                }  
            }
                  
        }
        return false;
    }
    public ArrayList<HoaDon> FindListHDByID(String id){
        ArrayList<HoaDon> listhd = new ArrayList<>();
        for(HoaDon hd:list){
            if(hd.getMaHoaDon().equals(id)){
                listhd.add(hd);
            }          
        }
        return listhd;
    }
    public void setModel(DefaultTableModel tbmodel){
        tbmodel.setRowCount(0);
        int count=0;
        for(HoaDon kh:list){
            Object [] row = new Object[]{
                ++count,kh.getMaHoaDon(),kh.getTenHoaDon(),kh.getSl(),kh.getDateNhap(),kh.getNhaSX(),kh.getHangHoaID()
            };
            tbmodel.addRow(row);
        }
       tbmodel.fireTableDataChanged();
  
    }
    public void setModelByID(DefaultTableModel tbmodel ,String id){
        tbmodel.setRowCount(0);
        int count=0;
        for(HoaDon hd:FindListHDByID(id)){          
            Object [] row = new Object[]{
                ++count,hd.getMaHoaDon(),hd.getTenHoaDon(),hd.getSl(),hd.getDateNhap(),hd.getNhaSX(),hd.getHangHoaID()
            };
            tbmodel.addRow(row);
        }
       tbmodel.fireTableDataChanged();
    }
}
