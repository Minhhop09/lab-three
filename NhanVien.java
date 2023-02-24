public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;

    public NhanVien(){}

    public NhanVien(String tenNhanViString, double luongCoBan, double heSoLuong, double LUONG_MAX){
        this.tenNhanVien = tenNhanViString;
        this.luongCoBan = luongCoBan;
        this. heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public void setTenNhanVien(String tenNhanVien){
        this.tenNhanVien = tenNhanVien;
    }

    public void setLuongCoBan(double luongCoBan){
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
    }

    public void setLuongMax(double LUONG_MAX){
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien(){return this.tenNhanVien;}

    public double getLuongCoBan(){return this.luongCoBan;}

    public double getHeSoLuong(){return this.heSoLuong;}

    public double getLuongMax(){return this.LUONG_MAX;}

    public boolean tangLuong(double heSoLuong) {
        boolean result;
        result = (this.luongCoBan * heSoLuong > this.LUONG_MAX) ? false : true;
        if(!result){
            System.out.println("Không được phép tăng lương");
            return result;
        }
        return result;
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    public void inTTin(){
        System.out.println("Tên nhân viên: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println("Lương max : " + this.LUONG_MAX);
    }

}
