/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.hanghoa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import nhom8_project.entity.hoadon.HoaDon;
import nhom8_project.utils.ReadWriteFile;

/**
 *
 * @author Admin
 */
public class HangHoaList {
    private ArrayList<HangHoa> list = new ReadWriteFile().ReadFromHangHoa();

    public ArrayList<HangHoa> getList() {
        return list;
    }
    public HangHoa FindByID(String id){
        for(HangHoa a :list){
            if(a.getHangHoaID().equals(id)){
                return a;
            }
        }
        return null;
    }
  

    public boolean DeleteByID(String id){
        for(HangHoa hh:list){
            if(hh.getHangHoaID().equals(id)){
                list.remove(hh);
                return true;
            }
        }
        return false;
    }
    public void setModel(DefaultTableModel tbmodel){
        tbmodel.setRowCount(0);
        int count=0;
        for(HangHoa hh:list){
            Object [] row = new Object[]{
                ++count,hh.getHangHoaID(),hh.getTenHang(),hh.getNSX(),hh.getHSD(),hh.getLoaiHang(),
                hh.getGiaNhap(),hh.getGiaBan()
            };
            tbmodel.addRow(row);
        }
       tbmodel.fireTableDataChanged();
  
    }
    public int setModelList(DefaultTableModel tbmodel,ArrayList<HoaDon> listhd){
        tbmodel.setRowCount(0);
        int count=0;
        int total=0;
        for(HoaDon hd:listhd){
            for(HangHoa hh:list){
                if(hd.getHangHoaID().equals(hh.getHangHoaID())){
                        total +=Integer.parseInt(hh.getGiaNhap())*Integer.valueOf(hd.getSl());
                        Object [] row = new Object[]{
                        ++count,hh.getHangHoaID(),hh.getTenHang(),hd.getSl(),
                        hh.getGiaNhap(),Integer.parseInt(hh.getGiaNhap())*Integer.valueOf(hd.getSl())
                };
            tbmodel.addRow(row);
                }
           
        }
        }
        
       tbmodel.fireTableDataChanged();
       return total;
    }
}
