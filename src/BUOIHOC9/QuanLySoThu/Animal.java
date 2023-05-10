package BUOIHOC9.QuanLySoThu;

import java.util.Scanner;

public abstract class Animal {
    private String ten;
    private int tuoi;
    private String mota;

    public Animal() {
    }
    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String mota) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mota = mota;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public abstract String tiengkeu();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên con vật:  ");
        this.ten = sc.nextLine();
        System.out.println("Nhập mô tả :  ");
        this.mota = sc.nextLine();

        do {
            System.out.println("Nhập tuổi ");
            this.tuoi = sc.nextInt();
            if (this.tuoi <= 0) {
                System.out.println("Tuổi không hợp lệ vui lòng nhập lại :");
            }
        } while (this.tuoi <= 0);
    }
}
