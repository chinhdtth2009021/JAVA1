package BUOIHOC9.QuanLyTruongHoc;

import java.util.Scanner;

public class SinhVien extends Person{
    private String maSv;
    private String email;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSv, String email, float diemTB) {
        this.maSv = maSv;
        this.email = email;
        this.diemTB = diemTB;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên : ");
        this.maSv = sc.nextLine();
        System.out.println("Nhập Email sinh viên : ");
        this.email = sc.nextLine();

        do {
            System.out.println("Nhập điểm trung bình : ");
            this.diemTB = sc.nextFloat();
            if (this.diemTB < 0 || this.diemTB > 10) {
                System.out.println("Nhập không chính xác mời nhập lại : ");
            }
        } while (this.diemTB < 0 || this.diemTB > 10);
    }

    public String xepLoai() {
        if (this.diemTB < 5) {

            return "xếp loại yếu ";
        } else if (this.diemTB >= 5 && this.diemTB < 7) {
            return "xếp loại trung bình ";
        } else if (this.diemTB >= 7 && this.diemTB < 9) {
            return "xếp loại khá";
        } else if (this.diemTB > 9) {
            return "xếp hạng giỏi ";
        } else {
            return "xếp loại không chính xác, điểm nhập vào không đúng";
        }
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Mã sinh viên : " + this.maSv);
        System.out.println("Email sinh viên  : " + this.email);
        System.out.println("Xếp loại sinh viên : " + this.xepLoai());
    }
}
