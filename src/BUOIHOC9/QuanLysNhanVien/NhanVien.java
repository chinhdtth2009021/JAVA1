package BUOIHOC9.QuanLysNhanVien;

//lớp abstract/ trừu tượng là lớp có thể chứa các hàm abstract
//đặc điểm: không tạo được đối tượng trực tiếp
public abstract class NhanVien {
    //    thuộc tính
    private String maNV;
    private String ngayKyhd;

    //    hàm: hàm có body và hàm abstract

    public NhanVien() {
        super();
    }

    public NhanVien(String maNV, String ngayKyhd) {
        this.maNV = maNV;
        this.ngayKyhd = ngayKyhd;
    }
    //    public void NhanVien() {
//
//    }
}
