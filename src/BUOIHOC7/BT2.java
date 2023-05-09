package BUOIHOC7;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Nhập kích thước mảng
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

//        tạo mảng với kích thước n
        int[] arr = new int[n];

//         Nhập các phần tử cho mảng
        System.out.println(" Nhập các phần tử cho mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

//        Tìm giá trị lớn nhất và nhỏ nhất của mảng
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
        System.out.println("Phần tử nhỏ nhất là: " + min);

// Nhập số cần tìm và tìm số lần xuất hiện của số đó trong mảng
        System.out.println("Nhập số cần tìm: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(" Số lần xuất hiện của" + x + " trong mảng " + count);
//        Sắp xếp mảng giảm giảm dần và in ra mảng
        Arrays.sort(arr);
        System.out.println("mảng sau khi sắp xếp giảm dần: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
    }

}
