package com.company;

import java.util.Scanner;

public class bt5 {
    double dai, rong;
    public bt5(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public bt5() {
    }
    public double getRong() {
        return rong;
    }
    public double getDai() {
        return dai;
    }
    public void setRong(double rong) {
        this.rong = rong;
    }
    public void setDai(double dai) {
        this.dai = dai;
    }
    // tính diện tích
    double tinhDienTich() {
        return dai * rong;
    }
    // tính chu vi
    double tinhChuVi() {
        return (dai + rong) * 2;
    }
    public static void main(String[] args) {
        bt5 hcn = new bt5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
    }
}
