package BUOIHOC3;

import java.util.Scanner;

// xây dựng menu cho gnuowif dùng lựa chọn
// cộng 2 số
//trừ 2 số
//nhân 2 số
//chia 2 số
//thoát
// người dùng có thể lựa chọn
//=> xây dựng một menu lặp
public class BTBUOI3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chuong trình tính toàn ");
            System.out.println("1: Cộng 2 số");
            System.out.println("2: Trừ 2 số");
            System.out.println("3: Nhân 2 số");
            System.out.println("4: Chia 2 số");
            System.out.println("5: Thoát ");

            int num1, num2;
            System.out.println("Nhập 2 số nguyên");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(" nun1 = " + num1 + " num 2 = " + num2);

            System.out.println("Bạn có muốn tiếp tục hay không ? (n :không)");
            sc.nextLine();
            String confirm = sc.nextLine();
            if ("n".equals(confirm)) {
//                continue;
//            } else {
                System.exit(1);
            }

        }
    }
}
