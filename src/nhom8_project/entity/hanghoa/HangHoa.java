/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity.hanghoa;

import java.util.Objects;
import java.util.regex.Pattern;
import nhom8_project.utils.DateFormat;
import nhom8_project.view.loginView;

/**
 *
 * @author Admin
 */
public class HangHoa {
  private String hangHoaID,tenHang,donViTinh,soLuongBan,soLuongCon,HSD,NSX,giaNhap,giaBan,loaiHang;
  Pattern rgname = Pattern.compile("^[a-zA-Z'-'\sáàảãạăâắằấầặẵẫậéèẻ ẽẹếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]*$"); 
  Pattern rgmhh = Pattern.compile("^[a-zA-Z0-9 _]*$");
  Pattern rgsl= Pattern.compile("^[0-9]*$");

  public String getHangHoaID() {
        return hangHoaID;
    }

    public void setHangHoaID(String hangHoaID) {
        this.hangHoaID = hangHoaID;
    }

    public String getTenHang() {
        return tenHang;
    }

    public boolean setTenHang(String tenhh) {
        boolean check=false;
        while(true){
            if(tenhh!=null&&!tenhh.equals("")){
                if(rgname.matcher(tenhh).find()){
                    this.tenHang =tenhh;
                    check=true;                     
            }else{
                    new loginView().showMessage("Tên hàng hoá chỉ nhập kí tự chữ ");
                }                
           }else{
                new loginView().showMessage("Tên hàng hoá không được để trống");
            }
            break;
        }
        return check;      
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }
    public String getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(String soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public String getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(String soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }
    public boolean setHSD(String nsx,String hsd ) {
        boolean check= false;
        while(true){
           if(hsd!=null&&!hsd.equals("")){
                if( new DateFormat().DatebiggerDate(nsx, hsd)){
                this.HSD =hsd;
                check=true;
            }else break;
            }   else{
                    new loginView().showMessage("Hạn sử dụng không được để trống");                
            }
           break;
        }
       return check;
    }

    public String getNSX() {
        return NSX;
    }

   
    public boolean setNSX(String nsx) {
        boolean check= false;
        while(true){
           if(nsx!=null&&!nsx.equals("")){
                if( new DateFormat().DateParse(nsx)){
                this.NSX =nsx;
                check=true;
            }else break;
            }   else{
                    new loginView().showMessage("Ngày sản xuất không được để trống");                
            }
           break;
        }
       return check;
    }
    public String getGiaNhap() {
        return giaNhap;
    }
    public boolean setGiaNhap(String gianhap) {
       boolean check=false;
        while(true){
            if(gianhap!=null&&!gianhap.equals("")){
                if(rgsl.matcher(gianhap).find()){
                    this.giaNhap =gianhap;
                    check=true;                     
            }else{
                    new loginView().showMessage("Giá bán chỉ nhập kí tự số ");
                }                
           }else{
                new loginView().showMessage("Giá bán không được để trống");
            }
            break;
        }
        return check;
    }
    public String getGiaBan() {
        return giaBan;
    }
    public boolean setGiaBan(String giaban) {
       boolean check=false;
        while(true){
            if(giaban!=null&&!giaban.equals("")){
                if(rgsl.matcher(giaban).find()){
                    this.giaBan =giaban;
                    check=true;                     
            }else{
                    new loginView().showMessage("Giá bán chỉ nhập kí tự số ");
                }                
           }else{
                new loginView().showMessage("Giá bán không được để trống");
            }
            break;
        }
        return check;
    }
    public String getLoaiHang() {
        return loaiHang;
    }

    
    public void setLoaiHang(int loai) {
        switch (loai) {           
                case 0:
                    this.loaiHang ="Hàng mát";                 
                    break;
                case 1:
                    this.loaiHang="Hàng đông lạnh";                   
                    break;
                case 2:
                    this.loaiHang="Thực phẩm khô";                 
                    break;
                case 3:
                    this.loaiHang="Đồ uống"; 
                    break;
                case 4:
                    this.loaiHang="Bánh kẹo"; 
                    break;
                case 5:
                    this.loaiHang="Gia dụng"; 
                    break;
                case 6:
                    this.loaiHang="Khác"; 
                    break;
            }
    }
    public HangHoa() {
    }

    public HangHoa(String hangHoaID, String tenHang, String donViTinh, String soLuongBan, String soLuongCon, String HSD, String NSX,String giaNhap, String giaBan, String loaiHang) {
        this.hangHoaID = hangHoaID;
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.soLuongBan = soLuongBan;
        this.soLuongCon = soLuongCon;
        this.HSD = HSD;
        this.NSX = NSX;
        this.giaNhap=giaNhap;
        this.giaBan = giaBan;
        this.loaiHang = loaiHang;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final HangHoa other = (HangHoa) obj;
        return Objects.equals(this.hangHoaID, other.hangHoaID);
    }

    @Override
    public String toString() {
        return hangHoaID+";"+tenHang+";"+donViTinh+";"+soLuongBan+";"+soLuongCon+";"+HSD+";"+NSX+";"+giaNhap+";"+giaBan+";"+loaiHang;
    }
    
}
  
    
   
  
    

