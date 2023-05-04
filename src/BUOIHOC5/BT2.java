package BUOIHOC5;

import java.util.Scanner;

public class BT2 {
    String hoten, maSV, email;
    int namsinh;
    float diemtoan, diemvan, diemanh;

//    public BT2(String hoten, String maSV, String email, int namsinh, float diemtoan, float diemvan, float diemanh) {
//        this.hoten = hoten;
//        this.maSV = maSV;
//        this.email = email;
//        this.namsinh = namsinh;
//        this.diemtoan = diemtoan;
//        this.diemvan = diemvan;
//        this.diemanh = diemanh;
//    }

    public void nhapthongtinsinhvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên sinh viên: ");
        hoten = sc.nextLine();

        System.out.println("Nhập mã sinh viên : ");
        maSV = sc.nextLine();

        System.out.println("Nhập email sinh viên : ");
        email = sc.nextLine();

        System.out.println("Nhập năm sinh của sinh viên : ");
        do {
            namsinh = sc.nextInt();
            if (namsinh < 0) {
                System.out.println("năm không hợp lệ, vui lòng nhập lại ");
            }
        } while (namsinh < 0);

        do {
            System.out.println("Nhập điểm Toán  , điểm TOán phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            diemtoan = sc.nextInt();
            if (diemtoan < 0 || diemtoan > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (diemtoan < 0 || diemtoan > 10);

        do {
            System.out.println("Nhập điểm Văn  , điểm Văn phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            diemvan = sc.nextInt();
            if (diemvan < 0 || diemvan > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (diemvan < 0 || diemvan > 10);

        do {
            System.out.println("Nhập điểm Anh  , điểm Anh phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            diemanh = sc.nextInt();
            if (diemanh < 0 || diemanh > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (diemanh < 0 || diemanh > 10);

    }

    public void hienthithongtinsinhvien() {
        System.out.println("Họ và tên: " + hoten);
        System.out.println("Năm sinh: " + namsinh);
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm Toán : " + diemtoan);
        System.out.println("Điểm văn: " + diemvan);
        System.out.println("Điểm anh: " + diemanh);
        System.out.println("Email: " + email);
    }

    public void tinhdiemtrungbinhvaxephang() {
        float diemTB = (diemtoan + diemvan + diemanh) / 3;
        System.out.println("điểm trung bình là: " + diemTB);
        if (diemTB < 5) {
            System.out.println("Xếp loại yếu: ");
        } else if (diemTB >= 5 && diemTB < 7) {
            System.out.println("Xếp loại trung bình : ");
        } else if (diemTB >= 7 && diemTB < 9) {
            System.out.println("Xếp loại Khá: ");
        } else {
            System.out.println(" xếp loại giỏi: ");
        }
    }

    public static void main(String[] args) {
//        khởi tạo đối tượng BT2
        BT2 ketquahoctapp = new BT2();
        ketquahoctapp.nhapthongtinsinhvien();
        System.out.println("--------------------------------------------------");
        System.out.println(" Thông tin sinh viên : ");
        ketquahoctapp.hienthithongtinsinhvien();
        System.out.println("--------------------------------------------------");
        System.out.println("kết quả học tập là: ");
        ketquahoctapp.tinhdiemtrungbinhvaxephang();
    }
}