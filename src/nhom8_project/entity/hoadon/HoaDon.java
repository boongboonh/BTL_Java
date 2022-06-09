/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.hoadon;

import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.entity.hanghoa.HangHoa;
import nhom8_project.entity.hanghoa.HangHoaList;
import nhom8_project.utils.DateFormat;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String maHoaDon,tenHoaDon,dateNhap,nhaSX,hangHoaID,sl;
    Pattern rgname = Pattern.compile("^[a-zA-Z'-'\sáàảãạăâắằấầặẵẫậéèẻ ẽẹêếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]*$"); 
    Pattern rgmhd = Pattern.compile("^[a-zA-Z0-9 _]*$");
    Pattern rgsl= Pattern.compile("^[0-9]*$");

    public String getHangHoaID() {
        return hangHoaID;
    }

    public boolean setHangHoaID(String hangHoaID) {
        boolean check=false;
        HangHoaList hhlist = new HangHoaList();
        HangHoa a = hhlist.FindByID(hangHoaID);
        while(true){
            if(hangHoaID!=null&&!hangHoaID.equals("")){
                if(a!=null){
                   this.hangHoaID=hangHoaID;
                    check=true;
               } else new loginView().showMessage("Mã hàng không tồn tại");
                                
           }else{
                new loginView().showMessage("Mã hàng không được để trống");
            }
            break;
        }     
        return check;
    }

    public String getSl() {
        return sl;
    }
    public boolean setSl(String sl) {
        boolean check=false;
        while(true){
            if(sl!=null&&!sl.equals("")){
                if(rgsl.matcher(sl).find()){
                    this.sl =sl;
                    check=true;                     
            }else{
                    new loginView().showMessage("Số lượng chỉ nhập kí tự số ");
                }                
           }else{
                new loginView().showMessage("Số lượng không được để trống");
            }
            break;
        }
        return check; 
    }   
    public Pattern getRgname() {
        return rgname;
    }

    public void setRgname(Pattern rgname) {
        this.rgname = rgname;
    }

    public Pattern getRgmhd() {
        return rgmhd;
    }

    public void setRgmhd(Pattern rgmhd) {
        this.rgmhd = rgmhd;
    }
    
    public String getNhaSX() {
        return nhaSX;
    }

    public boolean setNhaSX(String nhaSX) {      
       boolean check=false;
        while(true){
            if(nhaSX!=null&&!nhaSX.equals("")){
                if(rgname.matcher(nhaSX).find()){
                    this.nhaSX = nhaSX;
                    check=true;                     
            }else{
                    new loginView().showMessage("Nhà sản xuất chỉ nhập kí tự");
                }                
           }else{
                new loginView().showMessage("Nhà sản xuất không được để trống");
            }
            break;
        }
        return check;
    }
    
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
       this.maHoaDon=maHoaDon;
    }

    public String getTenHoaDon() {
        return tenHoaDon;
    }

    public boolean setTenHoaDon(String tenHoaDon) {  
       boolean check=false;
        while(true){
            if(tenHoaDon!=null&&!tenHoaDon.equals("")){
                if(rgname.matcher(tenHoaDon).find()){
                 this.tenHoaDon = tenHoaDon;
                  check=true;                  
            }else{
                    new loginView().showMessage("Tên hoá đơn chỉ nhập kí tự");
                }                
           }else{
                new loginView().showMessage("Tên hoá đơn không được để trống");
            }
            break;
        }
        return check;
    }

    public String getDateNhap() {
        return dateNhap;
    }

    public void setDateNhap() {
        this.dateNhap = new DateFormat().DateNow();
    }

    public HoaDon() {
    }

    @Override
    public String toString() {
        return maHoaDon+";"+tenHoaDon+";"+sl+";"+dateNhap+";"+nhaSX+";"+hangHoaID;
    }

    public HoaDon(String maHoaDon, String tenHoaDon, String sl,String dateNhap, String nhaSX,String hangHoaID) {
        this.maHoaDon = maHoaDon;
        this.tenHoaDon = tenHoaDon;
        this.sl=sl;
        this.dateNhap = dateNhap;
        this.nhaSX = nhaSX;
        this.hangHoaID=hangHoaID;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.maHoaDon, other.maHoaDon);
    }
    

   
    
}
