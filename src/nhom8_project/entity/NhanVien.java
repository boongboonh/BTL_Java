
package nhom8_project.entity;


public class NhanVien {
    public String nhanVienID;      //PK
    public String accountName;
    public String accountPass;
    public String tenNhanVien;
    public String ngaySinh;
    public String gioiTinh;
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
    public NhanVien(String nhanVienID, String tenNhanVien, String ngaySinh, String gioiTinh, String diaChi, String SDT, String email) {
        this.nhanVienID = nhanVienID;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
      
    }
    
    
}
