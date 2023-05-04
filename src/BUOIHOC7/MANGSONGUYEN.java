package BUOIHOC7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MANGSONGUYEN {
    //Tạo mảng số nguyên n phần tử, n nhập từ bàn phím
//    yêu cầu người dùng nhập các giá trị của từng phần tử mảng
//    hiển thị các phần tử mảng
//    tìm phần tử lớn nhất nhỏ nhất
//    yêu cầu người dùng nhập một số, tìm xem số đó tồn tại trong mảng bao nhiêu lần
//    sắp xếp mảng tăng dần
    public static void main(String[] args) {
//        tạo mảng  có n phần tử
        int n;
        System.out.println("Nhập kích thước của mảng ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int songuyen[] = new int[n];
        //    yêu cầu người dùng nhập các giá trị của từng phần tử mảng
        System.out.println("Nhập các giá trị của các phần tử : ");
        for (int i = 0; i < songuyen.length; i++) {
            System.out.printf("songuyen[%d]=", i);
            songuyen[i] = sc.nextInt();
        }
        //    hiển thị các phần tử mảng
        System.out.println(" Hiển thị mảng: ");
        for (int tmp : songuyen) {
            System.out.printf("%d\n", tmp);

        }
        System.out.println();
        //    tìm phần tử lớn nhất nhỏ nhất
//    sắp xếp mảng tăng dần
//        for (int i = 0; i < songuyen.length - 1; i++) {
//            for (int j = i + 1; j < songuyen.length; j++) {
//                if (songuyen[i] > songuyen[j]) {
//                    int tmp = songuyen[i];
//                    songuyen[i] = songuyen[j];
//                    songuyen[j] = tmp;
//                }
//            }
//        }
//hàm arays thay cho hàm for
        Arrays.sort(songuyen);// lớp arrays là lớp hỗ trợ thao tác trên mảng cố định -> tìm kiếm , chuyển đổi, sắp xếp
        System.out.println("Mảng sắp xếp tăng dần : ");
        for (int tmp : songuyen){
            System.out.printf("%d\t", tmp);
        }
    }
}
