package com.company;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        double celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ Celcius cần đổi: ");
        celsius = scanner.nextDouble();

        double fahrenheit = (double) 9 / 5 * celsius + 32;
        System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
    }
}
