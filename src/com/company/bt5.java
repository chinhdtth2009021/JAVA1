package com.company;

import java.util.Scanner;

public class bt5 {
    double dai, rong;

    // khởi tạo phương thức constructor có tham số
    public bt5(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    //khởi tạo phương thức constructor không có tham số
    public bt5() {
    }

    //------------------begin getter and setter----------------------
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

    //------------------end getter and setter---------------------------
    //tạo hàm tính diện tích
    double tinhDienTich() {
        return dai * rong;
    }

    //tạo hàm tính chu vi
    double tinhChuVi() {
        return (dai + rong) * 2;
    }
    public static void main(String[] args) {
        //khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
        bt5 hcn = new bt5();
        Scanner scanner = new Scanner(System.in);
        //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
    }
}
