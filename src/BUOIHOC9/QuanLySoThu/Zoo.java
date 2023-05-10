package BUOIHOC9.QuanLySoThu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private List<Chuong> chuongs = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(List<Chuong> chuongs) {
        this.chuongs = chuongs;
    }

    public void addchuong() {
        Chuong chuong = new Chuong();
        chuong.addchuong();
        chuongs.add(chuong);
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        String maChuong = sc.nextLine();
        Iterator<Chuong> iter = chuongs.iterator();
        int in = 0;
        while (iter.hasNext()) {
            Chuong chuong = iter.next();
            if (chuong.getMaChuong().contains(maChuong)) {
                iter.remove();
                System.out.println("xóa chuồng có mã : " + maChuong);
                in++;
            }
        }
        if (in == 0) {
            System.out.println("Không thể tìm thấy chuồng ");
        }
    }

    public void addAnimal() {
        int timChuong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập mã chuồng :");
        String maChuong = sc.nextLine();
        for (Chuong chuong : chuongs) {
            if (chuong.getMaChuong().contains(maChuong)) {
                int choice = 0;
                timChuong++;
                System.out.println("Mời nhập loại con vật muốn thêm ");
                System.out.println("1: Hổ ");
                System.out.println("2: Mèo  ");
                System.out.println("3: Chó ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        Tiger tiger = new Tiger();
                        tiger.input();
                        chuong.addAnimal(tiger);
                        break;
                    case 2:
                        Cat cat = new Cat();
                        cat.input();
                        chuong.addAnimal(cat);
                        break;
                    case 3:
                        Dog dog = new Dog();
                        dog.input();
                        chuong.addAnimal(dog);
                        break;
                }
                break;
            }
        }
        if (timChuong == 0) {
            System.out.println("Không thể tìm thấy chuồng : ");
        }
    }

    public void diemdanhsothu() {
        for (Chuong chuong : chuongs) {
            System.out.println("Mã chuồng số : " + chuong.getMaChuong());
            chuong.diendanhchuong();
        }
    }
}
