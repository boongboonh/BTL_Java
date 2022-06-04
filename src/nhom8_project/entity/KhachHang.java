
package nhom8_project.entity;

public class KhachHang {
    public String khachHangID;     //PK
    public String tenKhachHang;
    public long soTienMua;
    public String diaChi;
    public String SDT;


    public String getKhachHangID() {
        return khachHangID;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public long getSoTienMua() {
        return soTienMua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setKhachHangID(String khachHangID) {
        this.khachHangID = khachHangID;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setSoTienMua(long soTienMua) {
        this.soTienMua = soTienMua;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    
    
    public KhachHang(){
        
    }

    public KhachHang(String khachHangID, String tenKhachHang, long soTienMua, String diaChi, String SDT) {
        this.khachHangID = khachHangID;
        this.tenKhachHang = tenKhachHang;
        this.soTienMua = soTienMua;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }
   
    
    
}
