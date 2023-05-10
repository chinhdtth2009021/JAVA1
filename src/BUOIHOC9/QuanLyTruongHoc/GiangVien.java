package BUOIHOC9.QuanLyTruongHoc;

import java.util.Scanner;

public class GiangVien extends Person{
    private String LopDay;
    private float luongMotGio;
    private int soGioDay;

    public GiangVien() {
    }

    public String getLopDay() {
        return LopDay;
    }

    public void setLopDay(String lopDay) {
        LopDay = lopDay;
    }

    public float getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(float luongMotGio) {
        this.luongMotGio = luongMotGio;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        String s;

        do {
            System.out.println(" Nhập vào lớp dậy bắt đầu bằng (T,V,A,L,H,S)");
            s = sc.nextLine();
            s = s.toUpperCase();
            if (!s.startsWith("T") && !s.startsWith("A") && !s.startsWith("V") &&
                    !s.startsWith("L") && !s.startsWith("H") && !s.startsWith("S")) {
                System.out.println("Nhập không chính xác vui lòng nhập lại ");
            }
        } while (!s.startsWith("T") && !s.startsWith("A") && !s.startsWith("V") &&
                !s.startsWith("L") && !s.startsWith("H") && !s.startsWith("S"));
        this.LopDay = s;

        do {
            System.out.println("Vui lòng nhập số giờ dậy tháng này : ");
            this.soGioDay = sc.nextInt();
            if (this.soGioDay <= 0) {
                System.out.println(" Nhập không cính xác vui lòng nhập lại :");
            }
        } while (this.soGioDay <= 0);

        do {
            System.out.println("Mời nhập số lương một giờ ");
            this.luongMotGio = sc.nextFloat();
            if (this.luongMotGio <= 0) {
                System.out.println("hập chính xác vui lòng nhập lại : ");
            }
        } while (this.luongMotGio <= 0);
    }

    public Float tinhLuong() {
        if (this.LopDay.startsWith("T") || this.LopDay.startsWith("V") || this.LopDay.startsWith("A")) {
            return ((this.luongMotGio + 50000) * this.soGioDay);
        } else if (this.LopDay.startsWith("L") || this.LopDay.startsWith("H") || this.LopDay.startsWith("S")) {
            return ((this.luongMotGio - 20000) * this.soGioDay);
        }else {
            return (float) 0;
        }
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Lớp dậy : " + this.LopDay);
        System.out.println("Lương 1 giờ  : " + this.luongMotGio);
        System.out.println("Số gwof dậy tháng này : " + this.soGioDay);
        System.out.println("Lương tháng này : " + this.tinhLuong());
    }
}
