package BUOIHOC9.QuanLySoThu;

public class Tiger extends Animal{
    public Tiger() {
    }

    public Tiger(String ten) {
        super(ten);
    }

    public Tiger(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Tiger(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    @Override
    public String tiengkeu() {
        return "nhà phải có nóc anh thích bật không....";
    }

    @Override
    public void input() {
        super.input();
    }
}
