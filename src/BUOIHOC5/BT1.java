package BUOIHOC5;

import java.util.Scanner;

public class BT1 {
    int num1, num2;

    public BT1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //hàm nhập vào
    public void input() {
        Scanner st = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        this.num1 = st.nextInt();
        System.out.println("Nhập số thứ hai: ");
        this.num2 = st.nextInt();
    }

    // hàm xuất ra
    public void output() {
        System.out.println("số thứ nhất : " + this.num1);
        System.out.println("số thứ hai : " + this.num2);
    }

    // hàm cộng
    public int phepcong() {
        return this.num1 + this.num2;
    }

    // hàm trừ
    public int pheptru() {
        return this.num1 - this.num2;
    }

    // hàm nhan
    public int phepnhan() {
        return this.num1 * this.num2;
    }

    // hàm chia
    public int phepchia() {
        if (this.num2 == 0) {
            System.out.println("không thể chia hết cho 0. ");
            return 0;
        }
        return this.num1 / this.num2;
    }

    // hàm  lũy thừa
    public double luythua() {
        return Math.pow(this.num1, this.num2);
    }

    //    hàm xác định ước
    public boolean xacdinhuoc() {
        return this.num1 % this.num2 == 0;
    }

    public static void main(String[] args) {
//        gọi đến hàm nhập
        BT1 calculator = new BT1(0, 0);
        calculator.input();

//        gọi hàm xuất
        System.out.println(" thông tin hai số là:");
        calculator.output();

//gọi đến hàm tính cộng , trừ , nhân , chia, lũy thừa
        System.out.println("kết quả phép tính là ");
        System.out.println(calculator.num1 + " + " + calculator.num2 + " = " + calculator.phepcong());
        System.out.println(calculator.num1 + " - " + calculator.num2 + " = " + calculator.pheptru());
        System.out.println(calculator.num1 + " * " + calculator.num2 + " = " + calculator.phepnhan());
        System.out.println(calculator.num1 + " / " + calculator.num2 + " = " + calculator.phepchia());
        System.out.println(calculator.num1 + " ^ " + calculator.num2 + " = " + calculator.luythua());
// gọi hàm xác định ước
        System.out.println("Liểm tra num2 có phải ước cả num1 không: ");
        System.out.println("num2" + (calculator.xacdinhuoc() ? " là" : "không phải là ") + " ước của num1 ");
    }

}
