package BUOIHOC7.BT1;

import java.util.ArrayList;
import java.util.Scanner;

public class QUANLYLOPHOC {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<LOPHOC> dslophoc = new ArrayList<>();

    public static void themLophocmoi() {
        sc.nextLine();
        System.out.println("Nhật thông tin lớp học mới:");
    }


    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(" Menu quản lý lớp học: ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" 1: Thêm lớp học mới vào danh sách: ");
            System.out.println(" 2: Hiển thị danh scahs lớp học : ");
            System.out.println(" 3: Tìm lớp học theo mã: ");
            System.out.println(" 4: Sắp xếp lớp học giảm dần theo tên : ");
            System.out.println(" 5: tìm tổng số lớp học và học sinh : ");
            System.out.println(" 6: tìm lớp học có số lượng học sinh nhỏ nhất và lớn nhất : ");
            System.out.println(" 7: Sắp xếp danh sách lớp học tăng dần theo số lượng học sinh : ");
            System.out.println(" 8: Thoát: ");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Nhập lựa chọn của bạn ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

            }
            System.out.println();
        } while (choice != 8);

    }
}
