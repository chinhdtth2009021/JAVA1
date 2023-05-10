package Buoi10.QuanLyDanhBa;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Phone> danhba = new ArrayList<>();
        Phone p1 = new Phone();
        p1.input();
        p1.output();
        danhba.add(p1);
        System.out.println(p1 instanceof IInOut);
        System.out.println(p1 instanceof IAction);
//        lớ nặc danh được tạo ra bởi new interface / abtract class
        IContent ic = new IContent() {
            @Override
            public String showContent() {
                return "Hello";
            }
        };
        System.out.println(ic.showContent());
    }
}
