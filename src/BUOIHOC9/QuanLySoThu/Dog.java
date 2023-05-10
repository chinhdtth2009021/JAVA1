package BUOIHOC9.QuanLySoThu;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String ten) {
        super(ten);
    }

    public Dog(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Dog(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    @Override
    public String tiengkeu() {
        return "gâu gâu, gâu ......";
    }

    @Override
    public void input() {
        super.input();
    }
}
