package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        int a, b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -a / b;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
