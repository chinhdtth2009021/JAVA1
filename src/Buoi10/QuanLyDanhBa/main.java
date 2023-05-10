package Buoi10.QuanLyDanhBa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//giải thích ngoại lệ
// đẩy ngoại lệ cho hàm ngoài giải quyết tho

// try {
//         Date dt = sdf.parse("15/01/2002");
//         } catch
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số : ");
        int num = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dt = sdf.parse("15/01/2002");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Num = " + num);
    }
}
