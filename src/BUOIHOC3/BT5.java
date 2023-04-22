package BUOIHOC3;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starttime=0;
        int enddate=0;
        while (true) {
            try {
                System.out.println("Nhap vao gio bat dau:");
                starttime = scanner.nextInt();
                System.out.println("Nhap vao gio ra:");
                enddate = scanner.nextInt();

                if (starttime < enddate && starttime >=0 && enddate <= 24) {
                    break;
                } else {
                    System.out.println("Gio bat dau phai nho hon gio ra , gia bat dau phai lon hon hoac bang 0 , gio ra phai nho hon 24. Vui long nhap lai!");
                }
            } catch (Exception e) {
                System.out.println("Gio tri nhap vao khong hop le. Vui long nhap lai!");
                scanner.nextLine();
            }
        }
        if(enddate -  starttime >=18){
            int money = (enddate - starttime)*3000;
            System.out.println("so tien phai tra voi gia quy dinh 3000/1h : " + money);
        }else {
            int money = (enddate - starttime)*2500;
            System.out.println("so tien phai tra voi gia quy dinh 2500/1h : " + money);
        }

        // Thực hiện tính tiền dựa trên starttime và enddate ở đây

    }
}
