package BUOIHOC5.BT3;

import java.util.Scanner;

public class HinhTron {
    private float bankinh;
    //    private final float pi =  3.14;
    double pi = Math.PI;

    public HinhTron() {
    }

    public HinhTron(float bankinh) {
        this.bankinh = bankinh;
    }

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }

    public void inputHinhTron() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập bán kính hình tròn: ");
        bankinh = sc.nextFloat();
    }

    public double chuViHinhTron() {
//        return (float) ((2 * this.bankinh) * 3.14);
        return (2 * this.bankinh) * pi;
    }

    public double dienTichHinhTron() {
        return this.bankinh * this.bankinh * pi;
    }
}
