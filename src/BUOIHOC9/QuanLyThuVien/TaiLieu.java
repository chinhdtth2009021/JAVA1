package BUOIHOC9.QuanLyThuVien;

import java.util.Scanner;

public class TaiLieu {
    private String maTL;
    private String tenTaiLieu;
    private String tenTacGia;
    private int sobanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenTaiLieu, String tenTacGia, int sobanPhatHanh) {
        this.maTL = maTL;
        this.tenTaiLieu = tenTaiLieu;
        this.tenTacGia = tenTacGia;
        this.sobanPhatHanh = sobanPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSobanPhatHanh() {
        return sobanPhatHanh;
    }

    public void setSobanPhatHanh(int sobanPhatHanh) {
        this.sobanPhatHanh = sobanPhatHanh;
    }
    public  void  input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu : ");
        this.maTL = sc.nextLine();
        System.out.println("Nhập tên tài liệu : ");
        this.tenTaiLieu = sc.nextLine();
        System.out.println("Nhập tên tác giả : ");
        this.tenTacGia = sc.nextLine();
        System.out.println("Nhập số bản phát hành ");
        this.sobanPhatHanh = sc.nextInt();
    }
    public void hienthi(){
        System.out.println("Mã tài liệu là : " + this.maTL);
        System.out.println("Tên tài liệu là : " + this.tenTaiLieu);
        System.out.println("Tên tác giả là : " + this.tenTacGia);
        System.out.println("Số phát hành là : " + this.sobanPhatHanh);
    }
}
