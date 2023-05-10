package BUOIHOC9.QuanLyTruongHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyLopHoc {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<SinhVien> sinhViens =  new ArrayList<>();
        List<GiangVien> giangViens = new ArrayList<>();
        int chose = 0;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println(" Menu quản lý lớp học: ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" 1: Nhập giảng viên và thêm dnh sách : ");
            System.out.println(" 2: Nhập sinh viên và thêm dnh sách : ");
            System.out.println(" 3: Nhập người và thêm dnh sách: ");
            System.out.println(" 4: Hiển thị danh sách giảng viên và lương : ");
            System.out.println(" 5: Hiển thị danh sách sinh viên và xếp loại : ");
            System.out.println(" 6: Hiển thị người : ");
            System.out.println(" 7: Thoát: ");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Nhập lựa chọn của bạn ");
            chose = sc.nextInt();
            switch (chose){
                case 1 :
                    System.out.println("Nhập và thêm dnash cách giamgr viên : ");
                    GiangVien giangVien = new GiangVien();
                    giangVien.input();
                    giangViens.add(giangVien);
                    break;
                case 2:
                    System.out.println("Nhập và thêm danh scahs sinh viên : ");
                    SinhVien sinhVien = new SinhVien();
                    sinhVien.input();
                    sinhViens.add(sinhVien);
                    break;
                case 3:
                    System.out.println("Nhập và thêm danh sách người : ");
                    Person P = new Person();
                    P.input();
                    people.add(P);
                    break;
                case 4 :
                    System.out.println("Hiển thị danh sách giảng viên : ");
                    for (GiangVien giangVien1: giangViens){
                        giangVien1.hienthi();
                    }
                    break;
                case 5 :
                    System.out.println("Hiển thị danh scahs sinh viên : ");
                    for (SinhVien sinhVien1: sinhViens){
                        sinhVien1.hienthi();
                    }
                    break;
                case 6 :
                    System.out.println("Hiển thị danh sách ngươi : ");
                    for (Person person: people){
                        person.hienthi();
                    }
                    break;
                default:
                    break;
            }
        } while (chose != 7);

    }
}
