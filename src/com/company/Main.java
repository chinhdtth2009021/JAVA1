package com.company; // lệnh khái báo package

// comments
// lệnh khai báo thư viện
// lệnh khai báo class, interface, enum....
public class Main {
    //Khai báo  biến
    //    biến instance => biến object
    int tuoi = 21;
    String name;
    //    biến lớp => biwwns tĩnh => biến static
    String SCHOOL_NAME = "FPT APTECH";
// hàm
    //     hàm instance
    //     hàm lớp => hàm static

    // khối code =>
//    static {
//        System.out.println("abc");
//    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("");
      Main hw = new Main();
      hw.name = "chinh";
      hw.createClass();
//      Main hw2 = new Main();

    }

    public void createClass() {
        // tập lệnh
        //tạo biến local
        //khối lệnh / lệnh
        class Subbuoi1 {
        }
    }
}

//class Buoi1 {
//
//}
//
//interface buoi2 {
//
//}