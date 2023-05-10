package BUOIHOC9.QuanLySoThu;

import java.util.Scanner;

public class QuanLySoThu {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời bạn đưa ra lựa chọn : ");
            System.out.println("-----------------------------------");
            System.out.println("1: Thêm chuồng ");
            System.out.println("2: Xóa chuồng ");
            System.out.println("3: Thêm con vật ");
            System.out.println("4: Xóa con vật ");
            System.out.println("5: Xem tất cả con vật ");
            System.out.println("6: Thoát chương trình ");
            System.out.println("-------------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm vào một chuồng mới : ");
                    zoo.addchuong();
                    break;
                case 2:
                    System.out.println("Nhập mã chuồng bạn muốn xóa : ");
                    zoo.delete();
                    break;
                case 3:
                    System.out.println(" Thêm con vật mới : ");
                    zoo.addAnimal();
                    break;
                case 4:
                    System.out.println("Xóa con vật trong một chuồng : ");
                    break;
                case 5:
                    System.out.println("Danh sách sở thú : ");
                    zoo.diemdanhsothu();
                    break;
                case 6:
                    System.out.println("Tạm biệt! ");
                    break;
                default:
                    break;
            }

        } while (choice != 6);
    }

}
