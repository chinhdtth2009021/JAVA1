package Buoi10.QuanLyDanhBa;

import java.util.Scanner;

public class Phone implements IInOut, IContent, IAction {
    private String name;
    private String PhoneNumber;

    public Phone() {
        super();
    }

    public Phone(String name, String phoneNumber) {
        super();
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin Phone : ");
        System.out.println("Nhập tên :");
        this.name = sc.nextLine();
//        khác null
//        là 10 ký tự số bắt đầu bằng 0
        do {
            System.out.println("Số điện thoại là: ");
            this.PhoneNumber = sc.nextLine();
        } while (this.checkPhone());
//        System.out.println("Nhập số điện thoại :");
//        this.PhoneNumber = sc.nextLine();
    }

    public boolean checkPhone() {
        boolean result = false;
        if (this.PhoneNumber == null || "".equals(this.PhoneNumber)) {
            System.out.println("Số điện thoại không được để trống :");
            return false;
        }
        if (this.PhoneNumber.length() != 10 && !this.PhoneNumber.startsWith("0")) {
            System.out.println("Số điện thoại 10 ký tự, phải bắt đầu bằng 0");
            return false;
        }
        try {
            int num = Integer.parseInt(this.PhoneNumber);
            result = true;

        } catch (Exception e) {
            System.out.println("Số điện thoại phải là số : " + this.PhoneNumber + " vui lòng nhập lại số ");
            return false;
        }
        return result;
    }

    @Override
    public void output() {
        System.out.printf("Phone [name : %s, Number : %s]\n", this.name, this.PhoneNumber);
    }

    @Override
    public boolean send(String phoneNumber) {
        return false;
    }

    @Override
    public boolean sendMagessge(String phoneNumber, String magessge) {
        return false;
    }

    @Override
    public String showContent() {
        return "MyNumber" + this.PhoneNumber;
    }
}
