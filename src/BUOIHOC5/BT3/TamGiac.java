package BUOIHOC5.BT3;

import java.util.Scanner;

public class TamGiac {
    private float canha, canhb, canhc;

    public TamGiac(float canha, float canhb, float canhc) {
        this.canha = canha;
        this.canhb = canhb;
        this.canhc = canhc;
    }

    public TamGiac() {
    }

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

    public void inputTamgiac() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập cạnh a : ");
            this.canha = sc.nextFloat();
            System.out.println("Nhập cạnh b : ");
            this.canhb = sc.nextFloat();
            System.out.println("Nhập cạnh c : ");
            this.canhc = sc.nextFloat();
        } while (!this.checkValid());
    }

    private boolean checkValid() {
        boolean result = false;
        // check
        if (this.canha + this.canhb > this.canhc &&
                this.canha + this.canhc > this.canhb
                && this.canhb + this.canhc > this.canha) {
            result = true;
        }
        return result;
    }

    public float chuviTamGiac() {
        return this.canha + this.canhb + this.canhc;
    }

    public double dientichTamGiac() {
        double dientich = 0;
        // check/ tinh toan
        float p = this.chuviTamGiac() / 2;
        dientich = Math.sqrt(p * (p - this.canha) * (p - this.canhb) * (p - this.canhc));
        return dientich;
    }
}
