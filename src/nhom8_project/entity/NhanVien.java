
package nhom8_project.entity;


public class NhanVien {
    public String nhanVienID;      //PK
    public String accountName;
    public String accountPass;
    public String tenNhanVien;
    public String ngaySinh;
    public String gioiTinh;
    public long luong;
    public int soNgayLam;
    public String diaChi;
    public String SDT;
    public String email;

    public String getNhanVienID() {
        return nhanVienID;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public long getLuong() {
        return luong;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setNhanVienID(String nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public NhanVien(){
        
    }
    public NhanVien(String nhanVienID, String tenNhanVien, String ngaySinh, String gioiTinh, long luong, int soNgayLam, String diaChi, String SDT, String email) {
        this.nhanVienID = nhanVienID;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.soNgayLam = soNgayLam;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
      
    }
    
    
}
