/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.luongthuong;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import nhom8_project.utils.ReadWriteFile;

public class ListLt {
    
   private ArrayList<LuongThuong> list = new ReadWriteFile().ReadFileLt();
   public ArrayList<LuongThuong> getList(){
        return list;
    }
   
    
    public void add(LuongThuong nv){
        list.add(nv);
    }
    public String Status(boolean status){
        if(status){
            return "Đã nhận";
        }else{
            return "Chưa nhận";
        }
    }
    
    public void setModel(DefaultTableModel tbModel){
        tbModel.setRowCount(0);
        int count=0;
        for(LuongThuong lt:list){
            Object[] row = new Object[]{
                ++count,lt.getId(),lt.getName(),lt.getSalary(),lt.getWorkingDay(),lt.getThPh(),lt.getMonth(),lt.getYear(),
                Status(lt.getStatus()),lt.getTong()
            };
        tbModel.addRow(row);
            
        }
        tbModel.fireTableDataChanged();
    }
    
    
    
    
    
    public ArrayList<LuongThuong> FindListLt(String id){
        ArrayList<LuongThuong> listlt = new ArrayList<>();
        for(LuongThuong lt:list){
            if(lt.getId().equals(id)){
                listlt.add(lt);
            }
            
        }
        return listlt;
    }
}