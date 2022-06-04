
package nhom8_project.entity;

import java.util.concurrent.atomic.AtomicInteger;


public class HoaDon {
    
    
    public String hoaDonID;    //PK
    public int soLuong;
    public String thoiGian;
    public String khachHangID; //FK
    public String nhanVienID;  //FK
    public String hangHoaID;   //FK

    public String getHoaDonID() {
        return hoaDonID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public String getKhachHangID() {
        return khachHangID;
    }

    public String getNhanVienID() {
        return nhanVienID;
    }

    public String getHangHoaID() {
        return hangHoaID;
    }

    public void setHoaDonID(String hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setKhachHangID(String khachHangID) {
        this.khachHangID = khachHangID;
    }

    public void setNhanVienID(String nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public void setHangHoaID(String hangHoaID) {
        this.hangHoaID = hangHoaID;
    }
    
    public HoaDon(){
        
    }

    public HoaDon(String hoaDonID, int soLuong, String thoiGian, String khachHangID, String nhanVienID, String hangHoaID) {
        this.hoaDonID = hoaDonID;
        this.soLuong = soLuong;
        this.thoiGian = thoiGian;
        this.khachHangID = khachHangID;
        this.nhanVienID = nhanVienID;
        this.hangHoaID = hangHoaID;
    }
  
}
