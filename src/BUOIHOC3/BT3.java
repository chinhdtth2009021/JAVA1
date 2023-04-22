package BUOIHOC3;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tháng");
        int thang = sc.nextInt();
        if (thang < 1 || thang > 12) {
            System.out.println("tháng" + thang + "không hợp lệ ");
            return;
        }
        System.out.println("Nhập Năm ");
        int nam = sc.nextInt();
        if (nam < 0) {
            System.out.printf("năm %d không họp lệ ", nam);
            return;
        }
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" có 30 ngày");
                break;
            default:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.println(" có 29 ngày");
                } else {
                    System.out.println(" có 28 ngày");
                }
        }
    }
}