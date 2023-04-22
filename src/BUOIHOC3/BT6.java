package BUOIHOC3;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các số abc của phương trình ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.printf("%dx2 + %dx + %d = 0\n", a, b, c);
        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Phương trình vô số nghiệm " : "phương trình vô nghiệm "); //toán tử 3 ngôi
            } else {
                System.out.println("Phương troinhf có 1 nghiệm x=" + (-c / (float) b));
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm ");
            } else if (delta == 0) {
                System.out.printf("Phương trình có nghiệm kép x1 = x1 = %f\n", -(float) b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("phương trình có 2 nghiệm là  x1 = %f, x2 = %f\n", x1, x2);
            }
        }
    }
}
