package BUOIHOC5.BT3;

import java.util.Scanner;

public class HinhChuNhat {
    private float canhdai, canhrong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float canhdai, float canhrong) {
        this.canhdai = canhdai;
        this.canhrong = canhrong;
    }

    public float getCanhdai() {
        return canhdai;
    }

    public void setCanhdai(float canhdai) {
        this.canhdai = canhdai;
    }

    public float getCanhrong() {
        return canhrong;
    }

    public void setCanhrong(float canhrong) {
        this.canhrong = canhrong;
    }

    public void inputHinhChuNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài  hình chữ nhật: ");
        this.canhdai = sc.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        this.canhrong = sc.nextFloat();
    }

    public float chuViHinhChuNhat() {
        return (this.canhdai + this.canhrong) * 2;
    }

    public float dienTichChuNhat() {
        return this.canhdai * this.canhrong;
    }
}
