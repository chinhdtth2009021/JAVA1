package BUOIHOC9.QuanLyTruongHoc;

import java.util.Scanner;

public class Person {
    private String hoten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;

    public Person() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ vè tên : ");
        this.hoten = sc.nextLine();
//        System.out.println("Nhập giới tính : ");
//        this.gioitinh = sc.nextLine();
        do {
            System.out.println("Giới tính (M, F, O): ");
            this.ngaysinh = sc.nextLine();
        } while (!"M".equals(this.ngaysinh) && !"F".equals(this.ngaysinh) && !"O".equals(this.ngaysinh));

        System.out.println("Nhập ngày sinh : ");
        this.ngaysinh = sc.nextLine();
        System.out.println("Nhập địa chỉ : ");
        this.diachi = sc.nextLine();
    }
    public void  hienthi(){
        System.out.println("Họ và tên : " + this.hoten);
        System.out.println("Giới tính : " + this.gioitinh);
        System.out.println("Ngày sinh : " + this.ngaysinh);
        System.out.println("Địa chỉ : " + this.diachi);
    }

}
