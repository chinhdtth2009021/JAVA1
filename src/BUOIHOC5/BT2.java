package BUOIHOC5;

import java.util.Scanner;

public class BT2 {
    String hoten, maSV, email;
    int namsinh;
    float diemtoan, diemvan, diemanh;

    public BT2(String hoten, String maSV, String email, int namsinh, float diemtoan, float diemvan, float diemanh) {
        this.hoten = hoten;
        this.maSV = maSV;
        this.email = email;
        this.namsinh = namsinh;
        this.diemtoan = diemtoan;
        this.diemvan = diemvan;
        this.diemanh = diemanh;
    }

    // hàm nhập thông tin sinh viên
    public void nhapthongtinSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập Họ Và tên sinh viên:");
        this.hoten = sc.nextLine();
        do {
            System.out.println("Nhập năm sinh :");
            this.namsinh = sc.nextInt();
            sc.nextLine();
        } while (this.namsinh <= 0);

        System.out.println(" nhập mã sinh viên :");
        this.maSV = sc.nextLine();
        do {
            System.out.println("Nhập điểm toán , điểm toán phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            this.diemtoan = sc.nextFloat();
            if (this.diemtoan < 0 || this.diemtoan > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (this.diemtoan < 0 || this.diemtoan > 10);
        do {
            System.out.println("Nhập điểm văn  , điểm văn phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            this.diemvan = sc.nextFloat();
            if (this.diemvan < 0 || this.diemvan > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (this.diemvan < 0 || this.diemvan > 10);
        do {
            System.out.println("Nhập điểm anh , điểm anh phải lớn hơn hoặc bẳng 0 và nhỏ hơn hoặc bằng 10");
            this.diemanh = sc.nextFloat();
            if (this.diemanh < 0 || this.diemanh > 10) {
                System.out.println("điểm không hợp lệ, vui lòng nhập lại ");
            }
        } while (this.diemanh < 0 || this.diemanh > 10);

//        System.out.println(" Nhập Họ Và tên sinh viên:");
//        this.hoten = sc.nextLine();
//        System.out.println(" Nhập Họ Và tên sinh viên:");
//        this.hoten = sc.nextLine();
//        System.out.println(" Nhập Họ Và tên sinh viên:");
//        this.hoten = sc.nextLine();


    }

    public static void main(String[] args) {

    }
}
//    public class SinhVien {
//        private String hoTen;
//        private int namSinh;
//        private String maSV;
//        private float diemToan;
//        private float diemVan;
//        private float diemAnh;
//        private String email;
//
//        public SinhVien() {}
//
//        public SinhVien(String hoTen, int namSinh, String maSV, float diemToan, float diemVan, float diemAnh, String email) {
//            this.hoTen = hoTen;
//            this.namSinh = namSinh;
//            this.maSV = maSV;
//            this.diemToan = diemToan;
//            this.diemVan = diemVan;
//            this.diemAnh = diemAnh;
//            this.email = email;
//        }
//
//        public void nhapThongTin() {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Nhap ho ten sinh vien: ");
//            this.hoTen = scanner.nextLine();
//
//            do {
//                System.out.print("Nhap nam sinh: ");
//                this.namSinh = scanner.nextInt();
//                scanner.nextLine();
//            } while (this.namSinh <= 0);
//
//            System.out.print("Nhap ma sinh vien: ");
//            this.maSV = scanner.nextLine();
//
//            do {
//                System.out.print("Nhap diem toan (0-10): ");
//                this.diemToan = scanner.nextFloat();
//            } while (this.diemToan < 0 || this.diemToan > 10);
//
//            do {
//                System.out.print("Nhap diem van (0-10): ");
//                this.diemVan = scanner.nextFloat();
//            } while (this.diemVan < 0 || this.diemVan > 10);
//
//            do {
//                System.out.print("Nhap diem anh (0-10): ");
//                this.diemAnh = scanner.nextFloat();
//            } while (this.diemAnh < 0 || this.diemAnh > 10);
//
//            System.out.print("Nhap email: ");
//            this.email = scanner.nextLine();
//        }
//
//        public void hienThiThongTin() {
//            System.out.println("Thong tin sinh vien:");
//            System.out.println("Ho ten: " + this.hoTen);
//            System.out.println("Nam sinh: " + this.namSinh);
//            System.out.println("Ma sinh vien: " + this.maSV);
//            System.out.println("Diem toan: " + this.diemToan);
//            System.out.println("Diem van: " + this.diemVan);
//            System.out.println("Diem anh: " + this.diemAnh);
//            System.out.println("Email: " + this.email);
//        }
//
//        public float tinhDiemTrungBinh() {
//            return (this.diemToan + this.diemVan + this.diemAnh) / 3;
//        }
//
//        public String xepLoai() {
//            float diemTrungBinh = tinhDiemTrungBinh();
//            if (diemTrungBinh < 5) {
//                return "Yeu";
//            } else if (diemTrungBinh >= 5 && diemTrungBinh < 7) {
//                return "Trung binh";
//            } else if (diemTrungBinh >= 7 && diemTrungBinh < 9) {
//                return "Kha";
//            } else {