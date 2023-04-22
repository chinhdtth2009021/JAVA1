package BUOIHOC3;

import java.util.Scanner;

public class BTSAPXEP {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = sc.nextInt();
        System.out.println("Nhập số a");
        b = sc.nextInt();
        System.out.println("Nhập số a");
        c = sc.nextInt();
        System.out.println("Bạn Nhập " + a + " " + b + " " + c);
        if (a > b && a > c) {
            System.out.println((b > c) ? a + " >> " + b + " >> " + c : a + " >> " + c + " >> " + b);
        } else if (b > a && b > c) {
            System.out.println((a > c) ? b + " >> " + a + " >> " + c : b + " >> " + a + " >> " + c);
        } else {
            System.out.println((a > b) ? c + " >> " + a + " >> " + b : c + " >> " + b + " >> " + a);
        }
    }
}
