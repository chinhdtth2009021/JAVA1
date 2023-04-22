package BUOIHOC3;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int timso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số ");
        timso = sc.nextInt();
        if (timso % 2 == 0) {
            System.out.println(timso + " là số chẵn ");
        }else if (timso % 2 !=  0){
            System.out.println(timso + " là số lẻ ");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhật một số ");
//        int num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println(num + " là số chẵn ");
//        } else {
//            System.out.println(num + " là số lẻ");
//        }
    }
}
