package BUOIHOC7;

import java.util.Scanner;

public class TamGiacManager {
    public static void main(String[] args) {
//        - Xây dựng 1 lớp TamGiacManager xử lý yêu cầu:
//        + Tạo mảng n Tam giác
//        + Yêu cầu người dùng nhập thông tin n Tam Giác
//                + Hiển thị danh sách tam giác
//                + Hiển thị danh sách các tam giác đều
//                + Hiển thị sắp xếp các tam giác Giảm dần theo chu vi

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng mảng: ");
        n = sc.nextInt();
//         mảng tam giác có n tam giác
        TINHTAMGIAC listtamgiac[] = new TINHTAMGIAC[n];

//         yêu cầu nhập thông tin n tam giác
        System.out.println(" Nhập thông tin " + n + " tam giác ");
        for (int i = 0; i < n; i++) {
            System.out.println(" Nhập tam giác thứ " + (i + 1) + ":");
//            listtamgiac[i] = new TINHTAMGIAC();
//           //list tam giác [i] là 1 tam giác
//            listtamgiac[i].inputtamgiac();
            TINHTAMGIAC tg = new TINHTAMGIAC();
            tg.inputtamgiac();
            listtamgiac[i] = tg;
        }
        System.out.println("Hiển thị danh sách tam giác:");
        int i = 0;
        for (TINHTAMGIAC tmp :listtamgiac){
            System.out.println("Tam giác thứ" + (i++) + ".");
            tmp.outputtamgiac();
        }
    }
}
