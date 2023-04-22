package BUOIHOC3;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tháng");
        thang = sc.nextInt();
        if (thang < 1 || thang > 12) {
            System.out.println("tháng" + thang + "không hợp lệ ");
            return;
        }
        System.out.println("Nhập Năm ");
        nam = sc.nextInt();
        if (nam < 0) {
            System.out.printf("năm %d không họp lệ ", nam);
            return;
        }
        System.out.printf("%d/%d", thang, nam);
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println(" Tháng " + thang + "/" + nam + " có 31 ngày ");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println(" Tháng " + thang + "/" + nam + " có 30 ngày ");
        } else {
            if (nam % 400 == 0 || (nam  % 4==0 && nam %100 !=0)) {
                System.out.println(" Tháng " + thang + "/" + nam + " có 29 ngày ");
            }else {
                System.out.println(" Tháng " + thang + "/" + nam + " có 28 ngày ");
            }
        }
    }
}
