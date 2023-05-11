package BUOIHOC9.QuanLyThuVien;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyThuVien {
    public static void main(String[] args) {
        ArrayList<TaiLieu> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Mời bạn nhập lựa chọn : ");
            System.out.println("---------------------------------");
            System.out.println("1: Thêm tài liệu mới: ");
            System.out.println("2: thêm sách mới : ");
            System.out.println("3: Thêm tạp chí mới : ");
            System.out.println("4: Thêm báo mới : ");
            System.out.println("5: Xem danh sách :");
            System.out.println("6: Xóa tài liệu : ");
            System.out.println("7: Tìm kiếm theo loại ");
            System.out.println("8: tìm kiếm theo tên  ");
            System.out.println("9: Thoát ");
            System.out.println("--------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm tài liệu mới : ");
                    TaiLieu taiLieu = new TaiLieu();
                    taiLieu.input();
                    list.add(taiLieu);
                    break;
                case 2:
                    System.out.println("thêm sách mới : ");
                    Sach sach = new Sach();
                    sach.input();
                    list.add(sach);
                    break;
                case 3:
                    System.out.println("Thêm tạp chí mới ");
                    TapChi tapChi = new TapChi();
                    tapChi.input();
                    list.add(tapChi);
                    break;
                case 4:
                    System.out.println("Thêm báo mới ");
                    Bao bao = new Bao();
                    bao.input();
                    list.add(bao);
                    break;
                case 5:
                    System.out.println("hiển thị danh sách : ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("------------------------");
                        list.get(i).hienthi();
                    }
                    System.out.println("------------------------");
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("xóa tài liệu theo mã : ");
                    String key = sc.nextLine();
                    int check=0;
                    Iterator<TaiLieu> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        TaiLieu taiLieu1 = iterator.next();
                        // Kiểm tra điều kiện để xóa đối tượng
                        if (taiLieu1.getMaTL().equals(key)) {
                            iterator.remove(); // Xóa đối tượng từ danh sách
                            check++;
                        }
                    }
                    if (check==0){
                        System.out.println("không thể tìm thấy tài liệu nào có mã : " + key);
                    }else {
                        System.out.println("đã xóa tất cả tài liệu có mã : "+ key + " khỏi danh sách");
                    }
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Nhập vào tên loại cần tìm : (bao, tailieu, sach, tapchi)");
                    String timLoai = sc.nextLine();
                  if (!timLoai.equals("tailieu") && !timLoai.equals("bao") &&!timLoai.equals("tapchi")&& !timLoai.equals("sach")){
                      System.out.println("nhập loại không đúng");
                  }else if (timLoai.equals("bao")){
                      for (int i = 0; i < list.size(); i++) {
                          System.out.println("------------------------");
                          if (list.get(i) instanceof Bao){
                              list.get(i).hienthi();
                          }

                      }
                      System.out.println("------------------------");
                  }else if (timLoai.equals("tailieu")){
                      for (int i = 0; i < list.size(); i++) {
                          System.out.println("------------------------");
                          if (!(list.get(i) instanceof Sach)&&!(list.get(i) instanceof TapChi)&&!(list.get(i) instanceof Bao)){
                              list.get(i).hienthi();
                          }

                      }
                      System.out.println("------------------------");
                  }else if (timLoai.equals("sach")){
                      for (int i = 0; i < list.size(); i++) {
                          System.out.println("------------------------");
                          if (list.get(i) instanceof Sach){
                              list.get(i).hienthi();
                          }
                      }
                      System.out.println("------------------------");
                  } else if (timLoai.equals("tapchi")){
                      for (int i = 0; i < list.size(); i++) {
                          System.out.println("------------------------");
                          if (list.get(i) instanceof TapChi){
                              list.get(i).hienthi();
                          }
                      }
                      System.out.println("------------------------");
                  }
                    break;
                case 8:
                    sc.nextLine();
                    int check2=0;
                    System.out.println("Tìm kiếm theo tên : ");
                    System.out.print("Mời nhập tên : ");
                    String keycode = sc.nextLine();
                    for (TaiLieu tai: list
                         ) {
                        if (tai.getTenTaiLieu().equals(keycode)){
                            System.out.println("------------------------");
                            tai.hienthi();
                            check2 ++;
                        }
                        System.out.println("------------------------");
                    }
                    if (check2 == 0){
                        System.out.println("không tìm thấy tài liệu có tên : " + keycode);
                    }
                    break;
                case 9:
                    System.out.println("Tạm biệt ! ");
                    break;
            }
        } while (choice != 9);
    }
}
