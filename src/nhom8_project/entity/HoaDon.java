
package nhom8_project.entity;


public class HoaDon {
    public int hoaDonID;    //PK
    public long tongTien;
    public String thoiGian;
    public int khachHangID; //FK
    public int nhanVienID;  //FK
    public int hangHoaID;   //FK

    public int getHoaDonID() {
        return hoaDonID;
    }

    public long getTongTien() {
        return tongTien;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public int getKhachHangID() {
        return khachHangID;
    }

    public int getNhanVienID() {
        return nhanVienID;
    }

    public int getHangHoaID() {
        return hangHoaID;
    }

    public void setHoaDonID(int hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setKhachHangID(int khachHangID) {
        this.khachHangID = khachHangID;
    }

    public void setNhanVienID(int nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public void setHangHoaID(int hangHoaID) {
        this.hangHoaID = hangHoaID;
    }

    public HoaDon(){
        
    }
    public HoaDon(int hoaDonID, long tongTien, String thoiGian, int khachHangID, int nhanVienID, int hangHoaID) {
        this.hoaDonID = hoaDonID;
        this.tongTien = tongTien;
        this.thoiGian = thoiGian;
        this.khachHangID = khachHangID;
        this.nhanVienID = nhanVienID;
        this.hangHoaID = hangHoaID;
    }
    
}
