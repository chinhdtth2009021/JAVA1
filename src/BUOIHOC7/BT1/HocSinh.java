package BUOIHOC7.BT1;

public class HocSinh {
    private  String name, maSV;
    private  int namsinh;

    public HocSinh(String name, String maSV, int namsinh) {
        this.name = name;
        this.maSV = maSV;
        this.namsinh = namsinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void hienThiThongTin() {
        System.out.println("Họ tên: " + name + ", Mã HS: " + maSV + ", Năm sinh: " + namsinh);
    }
}
