package BUOIHOC9.QuanLySinhVienvaGiangVien;

import java.util.Scanner;

public class SinhVien extends Person {
    private String sinhVienID, email;
    private float dtb;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("vui lòng nhập Id: ");
        sinhVienID = sc.nextLine();
        System.out.println("Vui lòng nhập điểm trung bình : ");
        dtb = sc.nextInt();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
    }

    public void hienThiSinhVien() {
        super.hienThi();
        System.out.println("Id sinh viên : " + sinhVienID);
        System.out.println("Điểm trung bình  : " + dtb);
        System.out.println("Email : " + email);
    }

}
