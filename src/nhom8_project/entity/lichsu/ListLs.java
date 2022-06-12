/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.lichsu;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import nhom8_project.utils.ReadWriteFile;

/**
 *
 * @author DELL
 */
public class ListLs {
    
    private final ArrayList<LichSu> list = new ReadWriteFile().ReadFileLs();

    
 
    public String Status(boolean status,String type){
       if(type.equals("Nhân viên")){ 
        if(status){
            return "Đang làm việc";
        }else{
            return "Đã sa thải";
        }
        } else if(type.equals("Hàng hóa")){
           return "Không"; 
        } else return "Không xác định";
            
    }
    
   
    
    public void setModel(DefaultTableModel tbModel){
        tbModel.setRowCount(0);
        int count=0;
        for(LichSu ls:list){
            Object[] row = new Object[]{++count,ls.getTime(),ls.getType(),ls.getId(),ls.getName(),ls.getActive(),
                Status(ls.getStatus(),ls.getType()),ls.getDescribe()};
            tbModel.addRow(row);
            
        }
        tbModel.fireTableDataChanged();
    }
   
     public void SetModel01(DefaultTableModel tbModel){
        tbModel.setRowCount(0);
        int count=0;
        for(LichSu ls:list){
            if(ls.getType().equals("Nhân viên")){
            Object[] row = new Object[]{++count,ls.getTime(),ls.getType(),ls.getId(),ls.getName(),ls.getActive(),
                Status(ls.getStatus(),ls.getType()),ls.getDescribe()};
            tbModel.addRow(row);
            }
        }
        tbModel.fireTableDataChanged();
    }
   
   public void SetModel02(DefaultTableModel tbModel){
        tbModel.setRowCount(0);
        int count=0;
        for(LichSu ls:list){
            if(ls.getType().equals("Hàng hóa")){
            Object[] row = new Object[]{++count,ls.getTime(),ls.getType(),ls.getId(),ls.getName(),ls.getActive(),
                Status(ls.getStatus(),ls.getType()),ls.getDescribe()};
            tbModel.addRow(row);
            }
        }
        tbModel.fireTableDataChanged();
    }
    
}
