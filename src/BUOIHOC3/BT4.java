package BUOIHOC3;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        String ten = "", lop = "";
        float toan = 0, van = 0, anh = 0, dtb = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        ten = sc.nextLine();
        System.out.println("nhập lớp học sinh");
        lop = sc.nextLine();
        do {
            System.out.println("Nhập điểm toán , điểm toán phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            toan = sc.nextInt();
            if (toan < 0 || toan > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (toan < 0 || toan > 10);
        do {
            System.out.println("Nhập điểm văn  , điểm văn phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            van = sc.nextInt();
            if (van < 0 || van > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (van < 0 || van > 10);
        do {
            System.out.println("Nhập điểm anh , điểm anh phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            anh = sc.nextInt();
            if (anh < 0 || anh > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (anh < 0 || anh > 10);
        dtb = (toan + van + anh) / 3;
        if (dtb < 4) {
            System.out.println("học sinh :" + ten + " lớp :" + lop + " có điểm trung bình là " + dtb + " học lực yếu ");
        } else if (dtb >= 4 && dtb < 7) {
            System.out.println("học sinh :" + ten + " lớp :" + lop + " có điểm trung bình là " + dtb + " học lực trung bình ");
        } else if (dtb >= 7 && dtb < 8.5) {
            System.out.println("học sinh :" + ten + " lớp :" + lop + " có điểm trung bình là " + dtb + " học lực khá ");
        } else if (dtb >= 8.5) {
            System.out.println("học sinh :" + ten + " lớp :" + lop + " có điểm trung bình là " + dtb + " học lực giỏi ");
        }
    }
}
