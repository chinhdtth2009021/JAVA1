package BUOIHOC9.QuanLyThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
    private Date ngayPhatHanh;

    public Bao() {
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
        System.out.println("DANH SÁCH BÁO : ");
        super.hienthi();
        System.out.println("Ngày phát hành : " + this.ngayPhatHanh);
    }
}
