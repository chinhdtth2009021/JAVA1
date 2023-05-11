package BUOIHOC9.QuanLyThuVien;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTL, String tenTaiLieu, String tenTacGia, int sobanPhatHanh, String tenTacGia1, int soTrang) {
        super(maTL, tenTaiLieu, tenTacGia, sobanPhatHanh);
        this.tenTacGia = tenTacGia1;
        this.soTrang = soTrang;
    }

    public Sach() {

    }

    @Override
    public String getTenTacGia() {
        return tenTacGia;
    }

    @Override
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả : ");
        this.tenTacGia = sc.nextLine();
//        System.out.println("Nhập số trang : ");
        do {
            System.out.println("Nhập số trang : ");
            this.soTrang= sc.nextInt();
            if (this.soTrang <= 0) {
                System.out.println("số tráng không hợp lệ , vui lòng nhập lại : ");
            }
        } while (this.soTrang <= 0);
    }

    @Override
    public void hienthi() {
        System.out.println("DANH SÁCH SÁCH LÀ : ");
        super.hienthi();
        System.out.println("Tên tác giả : " + this.tenTacGia);
        System.out.println("Số trang là : " + this.soTrang);
    }
}
