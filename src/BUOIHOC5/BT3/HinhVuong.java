package BUOIHOC5.BT3;

import java.util.Scanner;

//Viết chương trình theo menu để tính chu vi và diện tích của các hình thông tin cạnh nhập
//        từ bàn phím theo lựa chọn của người dùng.
//        - 1. Tam giác
//         Ng dùng nhập: thì yc người dùng nhập 3 cạnh a, b, c
//        - 2. Hình vuông
//
//         Ng dùng nhập 2: thì yêu cầu nhập cạnh hv
//        - 3. Hình tròn
//         Ng dùng nhập 3: thì yêu cầu nhập bán kính hình tròn
//        - 4. Hình chữ nhật
//         Ng dùng nhập 4: thì yêu cầu nhập chiều dài, chiều rộng
//        Hỏi người dùng có tiếp tục hay không?
public class HinhVuong {
    private float canh;

    public HinhVuong() {
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    public void inputHinhVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dành của cạnh: ");
        this.canh = sc.nextFloat();
    }

    public float chuvihinhvuong() {
        return this.canh * 4;
    }

    public float dientichhinhvuong() {
        return this.canh * this.canh;
    }
}
