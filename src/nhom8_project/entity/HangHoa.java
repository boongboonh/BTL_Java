
package nhom8_project.entity;


public class HangHoa {
    public int hangHoaID;
    public String tenHang;
    public int soLuongCon;
    public int soLuongBan;
    public String HSD;
    public String NSX;
    public String thoiGianNhap;
    public float giaNhap;
    public float giaBan;
    public int loaiHangID;
    public String nhaSX;

    public int getHangHoaID() {
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

    public String getThoiGianNhap() {
        return thoiGianNhap;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public int getLoaiHangID() {
        return loaiHangID;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public void setHangHoaID(int hangHoaID) {
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

    public void setThoiGianNhap(String thoiGianNhap) {
        this.thoiGianNhap = thoiGianNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setLoaiHangID(int loaiHangID) {
        this.loaiHangID = loaiHangID;
    }

    public HangHoa(){
        
    }

    public HangHoa(int hangHoaID, String tenHang, int soLuongCon, int soLuongBan, String HSD, String NSX, String thoiGianNhap, float giaNhap, float giaBan, int loaiHangID, String nhaSX) {
        this.hangHoaID = hangHoaID;
        this.tenHang = tenHang;
        this.soLuongCon = soLuongCon;
        this.soLuongBan = soLuongBan;
        this.HSD = HSD;
        this.NSX = NSX;
        this.thoiGianNhap = thoiGianNhap;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.loaiHangID = loaiHangID;
        this.nhaSX = nhaSX;
    }
    
}
