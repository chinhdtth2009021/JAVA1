package BUOIHOC9.QuanLySoThu;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String ten) {
        super(ten);
    }

    public Cat(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Cat(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    @Override
    public String tiengkeu() {
        return "Nghèo, nghèo, nghèo .......";
    }

    @Override
    public void input() {
        super.input();
    }
}
