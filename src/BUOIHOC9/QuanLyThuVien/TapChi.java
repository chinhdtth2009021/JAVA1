package BUOIHOC9.QuanLyThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private Date ngayPhatHanh;

    public TapChi(int soPhatHanh, Date thangPhathanh) {
        this.soPhatHanh = soPhatHanh;
        this.ngayPhatHanh = thangPhathanh;
    }

    public TapChi(String maTL, String tenTaiLieu, String tenTacGia, int sobanPhatHanh, int soPhatHanh, Date thangPhathanh) {
        super(maTL, tenTaiLieu, tenTacGia, sobanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.ngayPhatHanh = thangPhathanh;
    }

    public TapChi() {

    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Số phát hành là : ");
        this.soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Ngày phát hành (dd/MM/yyyy): ");
        String ngayPhatHanhStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayPhatHanh = sdf.parse(ngayPhatHanhStr);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ. Vui lòng thử lại.");
        }
        System.out.println(this.ngayPhatHanh);
    }

    @Override
    public void hienthi() {
        System.out.println("DANH SÁCH TẠP CHÍ LÀ : ");
        super.hienthi();
        System.out.println("Số phát hành : " +this.soPhatHanh);
        System.out.println("Ngày phát hành : " +this.ngayPhatHanh);
    }
}
