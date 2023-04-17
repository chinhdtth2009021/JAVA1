package com.company;

import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        int a;
        Scanner scanner =  new Scanner(System.in) ;
        System.out.println("nhập vào một số ");
        a = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
