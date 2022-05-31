
package nhom8_project.entity;


public class LoaiHang {
    public int loaiHangID;      //PK
    public String tenLoaiHang;

    public int getLoaiHangID() {
        return loaiHangID;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setLoaiHangID(int loaiHangID) {
        this.loaiHangID = loaiHangID;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    public LoaiHang(){
    }    
    public LoaiHang(int loaiHangID, String tenLoaiHang) {
        this.loaiHangID = loaiHangID;
        this.tenLoaiHang = tenLoaiHang;
    }
    
}
