package BUOIHOC9.QuanLySoThu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Chuong {
    private String maChuong;
    private List<Animal> animals = new ArrayList<>();

    public Chuong() {
    }

    public Chuong(String maChuong, List<Animal> animals) {
        this.maChuong = maChuong;
        this.animals = animals;
    }

    public String getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(String maChuong) {
        this.maChuong = maChuong;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addchuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã chuồng : ");
        this.maChuong = sc.nextLine();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void delete(String ten) {
        Iterator<Animal> iterator = animals.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getTen().equalsIgnoreCase(ten)) {
                iterator.remove(); // xóa phần tử hiện tại bởi iterator
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Xóa thành công " + ten);
        } else {
            System.out.println("không thể tìm thấy tên con vật : ");
        }
    }

    public void diendanhchuong() {
        for (Animal animal : animals) {
            System.out.println(" Tên : " + animal.getTen());
            System.out.println(" Mô tả : " + animal.getMota());
            System.out.println(" Tuổi : " + animal.getTuoi());
            System.out.println(" Tiếng kêu : " + animal.tiengkeu());
        }
    }
}