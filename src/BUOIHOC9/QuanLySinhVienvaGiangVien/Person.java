package BUOIHOC9.QuanLySinhVienvaGiangVien;

import java.util.Scanner;

public class Person {
    private String name, gender, dateOfBirth, address;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui lòng nhập tên : ");
        name = sc.nextLine();
        System.out.println(" Vui lòng Giới tính  : ");
        gender = sc.nextLine();
        System.out.println(" Vui lòng ngày sinh : ");
        dateOfBirth = sc.nextLine();
        System.out.println(" Vui lòng địa chỉ : ");
        address = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Tên " + name);
        System.out.println("Giới tinh  " + gender);
        System.out.println("Ngày sinh " + dateOfBirth);
        System.out.println("Địa chỉ  " + address);
    }
}
