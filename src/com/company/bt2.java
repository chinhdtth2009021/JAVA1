package com.company;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số đầu tiên ");
        a = scanner.nextInt();
        System.out.println("nhập vào số thứ hai ");
        b = scanner.nextInt();
        System.out.println("a + b ="+ (a + b) +"\na - b = " + (a - b));
        System.out.println("a * b =" + (a*b));
        System.out.println("a / b =" + (a/b));
        System.out.println("a % b =" + (a%b));
    }
}
