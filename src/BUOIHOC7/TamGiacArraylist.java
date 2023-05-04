package BUOIHOC7;

import java.util.ArrayList;
import java.util.Scanner;

public class TamGiacArraylist {
    public static void main(String[] args) {
// Kiểu dữ liệu tập hợp danh sách collection chauw nhiều phần tử cùng kích thước
//        và không cần quan tâm kích thước danh sách
        //và được hỗ trợ các phướng thức thao tác và quản lý
        ArrayList listObject = new ArrayList(); //danh sách chứa Object đối tượng
        // thêm phần tử mưới vào cuối danh sách
        listObject.add(1);
        listObject.add(3.24);
        listObject.add("2210e");
        listObject.add(new TINHTAMGIAC());
//        lấy kích thước của danh sách
        System.out.println("Kích thước: " + listObject.size());
//        check 1 phần tử có tồn tại trong danh scahs hay không?
        if (listObject.contains("2210e")) {
            System.out.println("Tồn tại: ");
        }
//        lấy giá trị phần tử từ danh sách
        System.out.println("Phần tử thứ nhất: " + listObject.get(0));
//        duyệt danh sách Arraylisst 
        for (int i = 0; i < listObject.size(); i++) {
            System.out.println(listObject.get(i));
        }
//        duyệt foreach
        for (Object tmp : listObject) {
            System.out.println(tmp);
        }
//        cập nhật giá trị của 1 phần tử khi đã biết index
        listObject.set(0, 100);
//        tạo danh sách chỉ chauw accs phaàn tử là kiểu ...<Kiểu dữ liệu >
//         chứa các tam giác
        ArrayList<TINHTAMGIAC> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println(" Nhập số lượng mảng : ");
//        list.add(new TINHTAMGIAC());
        n = sc.nextInt();
        System.out.println(" Nhập thông tin " + n + " tam giác ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tam giác thứ " + (i + 1) + ":");

            TINHTAMGIAC tg = new TINHTAMGIAC();
            tg.inputtamgiac();
            list.add(tg);
        }
        System.out.println("Hien thi danh sach tam giac: ");
        int i=0;
        for(TINHTAMGIAC tmp : list) {
            System.out.println("---------Tam giac thu "+ (i++) + ": ");
            tmp.outputtamgiac();
        }
    }
}
