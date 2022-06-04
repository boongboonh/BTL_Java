
package nhom8_project.entity;


public class HangHoa {
    public String hangHoaID;
    public String tenHang;
    public String donViTinh;
    public int soLuongCon;
    public int soLuongBan;
    public String HSD;
    public String NSX;
    public int giaBan;
    public String loaiHang;
    public String hoaDonNhapID;

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public String getHangHoaID() {
        return hangHoaID;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public String getHSD() {
        return HSD;
    }

    public String getNSX() {
        return NSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public String getHoaDonNhapID() {
        return hoaDonNhapID;
    }

    public void setHangHoaID(String hangHoaID) {
        this.hangHoaID = hangHoaID;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public void setHoaDonNhapID(String hoaDonNhapID) {
        this.hoaDonNhapID = hoaDonNhapID;
    }

    
    public HangHoa(){
        
    }

    public HangHoa(String hangHoaID, String tenHang, String donViTinh, int soLuongCon, int soLuongBan, String HSD, String NSX, int giaBan, String loaiHang, String hoaDonNhapID) {
        this.hangHoaID = hangHoaID;
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.soLuongCon = soLuongCon;
        this.soLuongBan = soLuongBan;
        this.HSD = HSD;
        this.NSX = NSX;
        this.giaBan = giaBan;
        this.loaiHang = loaiHang;
        this.hoaDonNhapID = hoaDonNhapID;
    }

   

    
    
}
