
package nhom8_project.entity2;


public class NhanVien {
        public String id;
        public String name;
        public String birthday;
        public String address;
        public String email;
        public String phone;
        public String chucvu;
        public String sex;
        public String usename;
        public String password;
        public String status;
        public String mota;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getChucvu() {
        return chucvu;
    }

    public String getSex() {
        return sex;
    }

    public String getUsename() {
        return usename;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public String getMota() {
        return mota;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    
    public NhanVien(){
        
    }

    public NhanVien(String id, String name, String birthday, String address, String email, String phone, String chucvu, String sex, String usename, String password, String status, String mota) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.chucvu = chucvu;
        this.sex = sex;
        this.usename = usename;
        this.password = password;
        this.status = status;
        this.mota = mota;
    }
    
    
    
}
