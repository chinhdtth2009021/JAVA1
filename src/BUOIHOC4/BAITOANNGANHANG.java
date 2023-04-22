package BUOIHOC4;

import java.util.Scanner;

public class BAITOANNGANHANG {
    public static void main(String[] args) {
        String makhachhang = "A123123", mapin = "123456";
        int sodu = 1000000, sn = 0;
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <=2; i++) {
//            System.out.println("nhập mã khách hàng ");
//            String matk = sc.nextLine();
//            System.out.println("nhập mã pin");
//            String mp = sc.nextLine();
//            if (makhachhang.equals(matk) && mapin.equals(mp)){
//                System.out.println("mời bạn lựa chọn ");
//                break;
//            }else {
//                sn++;
//            }
//        }
//        if (sn == 3){
//            System.out.println("bạn đã nhập quá 3 lần tài khoản đã bị khóa");
//            return;
//        }
//        else {
        System.out.println("thanh cong");
        String yesorno;
        int chon = 0;
        do {
            System.out.println("1 : nap tien tien");
            System.out.println("2 : rut tien");
            System.out.println("3 : xem so du tai khoan");
            System.out.println("4 : doi ma pin");
            System.out.println("5 : thoat");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhập số tiền bạn muốn nạp ");
                    int sotiennapvao = sc.nextInt();
                    if (sotiennapvao <= 0) {
                        System.out.println("số tiền không hợp lệ ");
                    } else {
                        sodu = sodu + sotiennapvao;
                        System.out.println("nạp thành công ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số tiền muốn rút ");
                    int sotienmuonrut = sc.nextInt();
                    if (sotienmuonrut > 0 && sodu - sotienmuonrut >= 50000) {
                        sodu = sodu - sotienmuonrut;
                        System.out.println("rút tiền thành công ");
                    } else {
                        System.out.println("số dư không đủ, số dư còn lại phải trên 50000 ");
                    }
                    break;
                case 3:
                    System.out.println("số dư tài khoản của bạn là :" + sodu);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("thao tác đổi mã pin");
                    String mapinhientai = "";
                    do {
                        System.out.println("nhập mã pin hiện tại ");
                        mapinhientai = sc.nextLine();
                        if (!mapinhientai.equals(mapin)) {
                            System.out.println("sai mã pin, mời bạn nhập lại ");
                        }
                    } while (!mapinhientai.equals(mapin));

                    String nhapmapinmoi = "";
                    String nhaplaimapin = "";
                    do {
                        System.out.println("nhập mã pin mới ");
                        nhapmapinmoi = sc.nextLine();
                        System.out.println("nhập lại mã pin ");
                        nhaplaimapin = sc.nextLine();
                        if (nhapmapinmoi.equals(mapin)) {
                            System.out.println("mã pin mới và mã pin cũ trùng nhau");
                        } else if (nhapmapinmoi.equals(nhaplaimapin)) {
                            System.out.println("mã mới và mã pin nhập lại không trùng nhau ");
                        }
                    } while (nhapmapinmoi.equals(mapin)|| !nhapmapinmoi.equals(nhaplaimapin));
                    mapin=nhapmapinmoi;
                    System.out.println("mã pin thay đổi thành công : "+ mapin);
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