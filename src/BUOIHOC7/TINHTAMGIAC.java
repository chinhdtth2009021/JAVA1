package BUOIHOC7;

import java.util.Scanner;

public class TINHTAMGIAC {
    //    - Xây dựng 1 lớp TamGiac có các thuộc tính: canha, canhb, canhc
//    Và các method:
//            + Nhập các cạnh
//+ Hiển thị thông tin tam giác:
//            3 cạnh, chuvi, dien tich
//+ Xac dịnh loại kieu cua tam giacs
    //    tạo biến instance
    private float canha, canhb, canhc;
//    hàm khởi tạo

    public TINHTAMGIAC() {
        super();
    }

    public TINHTAMGIAC(float canha, float canhb, float canhc) {
        this.canha = canha;
        this.canhb = canhb;
        this.canhc = canhc;
    }

    //    hàm set/get

    public float getCanha() {
        return canha;
    }

    public void setCanha(float canha) {
        this.canha = canha;
    }

    public float getCanhb() {
        return canhb;
    }

    public void setCanhb(float canhb) {
        this.canhb = canhb;
    }

    public float getCanhc() {
        return canhc;
    }

    public void setCanhc(float canhc) {
        this.canhc = canhc;
    }

    //hàm nghiệp cụ
//hàm nhập thông tin tam giác
    public void inputtamgiac() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập 3 cạnh của tam giác: ");
            System.out.println(" Nhập cạnh a: ");
            this.canha = sc.nextFloat();
            System.out.println(" Nhập cạnh b: ");
            this.canhb = sc.nextFloat();
            System.out.println(" Nhập cạnh c: ");
            this.canhc = sc.nextFloat();
        } while (!this.checkValid());

    }

    //    hàm check 3 cạnh có tạo nên tam giác không?
//    hàm trả về true -> đúng là tam giác , hàm trả về false-> 3 cạnh sai
    private boolean checkValid() {
        boolean result = false;
//        check
        if (this.canha + this.canhb > this.canhc ||
                this.canha + this.canhc > this.canhb ||
                this.canhb + this.canhc > this.canha)
        {
            result = true;
        }
        return result;
    }


    //Hiển thị tam giác
    public void outputtamgiac() {
        System.out.printf("Tam giác có 3 cạnh là: %f,%f, %f\n", this.canha, this.canhb, this.canhc);
        System.out.println("Chu vi: " + this.tinhChuvi());
        System.out.println("Diện tích : " + this.tinhDientich());
    }

    //    hàm tính chu vi
    public float tinhChuvi() {
        return this.canha + this.canhb + this.canhc;
    }

    //    Hàm tính diện tích
    public double tinhDientich() {
        double dientich = 0;
//        check tính toan
        float p = this.tinhChuvi() / 2;
        dientich = Math.sqrt(p * (p - this.canha) * (p - this.canhb) * (p - this.canhc));
        return dientich;
    }

    //xác định kiểu tam giác
}
