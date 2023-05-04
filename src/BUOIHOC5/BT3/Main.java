package BUOIHOC5.BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yesorno;
        int chon = 0;
        do {
            System.out.println("Nhập lựa chọn của bạn ");
            System.out.println("1 : Tam Giác");
            System.out.println("2 : Hình Vuông ");
            System.out.println("3 : Hình Tròn");
            System.out.println("4 : Hình Chữ Nhật ");
            System.out.println("5 : thoat");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    TamGiac tamgiac = new TamGiac();
                    tamgiac.inputTamgiac();
                    System.out.println(" Chu vi tam giác là: " + tamgiac.chuviTamGiac() );
                    System.out.println(" Diện tích tam giác là : " + tamgiac.dientichTamGiac() );
                    break;
                case 2:
                    HinhVuong hinhvuong = new HinhVuong();
                    hinhvuong.inputHinhVuong();
                    System.out.println(" Chu vi hình vuông là: " + hinhvuong.chuvihinhvuong() );
                    System.out.println(" Diện tích Hình Vuông là : " + hinhvuong.dientichhinhvuong() );
                    break;
                case 3:
                    HinhTron hinhTron = new HinhTron();
                    hinhTron.inputHinhTron();
                    System.out.println(" Chu vi hình tròn  là: " + hinhTron.chuViHinhTron() );
                    System.out.println(" Diện tích hình tròn là : " + hinhTron.dienTichHinhTron() );
                    break;
                case 4:
                    HinhChuNhat chuNhat = new HinhChuNhat();
                    chuNhat.inputHinhChuNhat();
                    System.out.println(" Chu vi chữ nhật  là: " + chuNhat.chuViHinhChuNhat() );
                    System.out.println(" Diện tích chữ nhật là : " + chuNhat.dienTichChuNhat() );
                    break;
                case 5:
                    return;
            }
            sc.nextLine();
            System.out.println("bạn có muốn tiếp tục không? ấn y để đồng ý và các ký tự còn lại để dừng lại ");
            yesorno = sc.nextLine().toLowerCase();
        } while (yesorno.equals("y"));

    }
}
