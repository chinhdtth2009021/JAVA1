package BUOHOC6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    //    1 tạo huộc tính  => biến instance -> private/ biến class ->public
    private String name, loaisach;//loại sách chỉ hợp lệ 1 trong các giá trị: VH, TT, DL, KH, NT
    private Author author;
    private double giasach;
    private Date ngaysanxuat;
    // Doi tuong chuyen doi kieu cho kieu thoi gian
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//    2 tạo contructer

    public Book() {
    }

    public Book(String name, String loaisach, Author author, double giasach, Date ngaysanxuat) {
        this.name = name;
        this.loaisach = loaisach;
        this.author = author;
        this.giasach = giasach;
        this.ngaysanxuat = ngaysanxuat;
    }
//    3 tạo các hàm set/get cho các thuộc tính

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getGiasach() {
        return giasach;
    }

    public void setGiasach(double giasach) {
        this.giasach = giasach;
    }

    public Date getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(Date ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    //    4 tạo các hàm nghiệp vụ
    public void inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập thông tin Sách: ");
//tên sách
        System.out.println(" Tên Sách ");
        this.name = sc.nextLine();
//tác giả
        if (this.author == null) {
            this.author = new Author();
            this.author.inputAuthor();
        } else {
            System.out.println("tác giả đã tồn tại");
        }
//loại sách
        do {
            System.out.println("Loại sách ( VH, TT, DL, KH, NT)");
            this.loaisach = sc.nextLine();
        } while (!"VH".equals(this.loaisach) && !"TT".equals(this.loaisach) && !"DL".equals(this.loaisach) && !"KH".equals(this.loaisach) && !"NT".equals(this.loaisach));
//giá sách
        System.out.println(" Giá sách ");
        this.giasach = sc.nextDouble();
        while (this.giasach < 0) {
            System.out.println("Giá tiền không hợp lệ, vui lòng nhập lại: ");
            this.giasach = sc.nextDouble();
        }

//chueeyrn đổi từ chuỗi => date
//        ngày sản xuất
        System.out.println(" Ngày sản xuất (dd/MM/yyyy): ");
        sc.nextLine();
        String sdate = sc.nextLine();
        try {
               ngaysanxuat = new SimpleDateFormat("yyyy-MM-dd").parse(sdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // hàm chuyển đổi chuỗi (String)

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", loaisach='" + loaisach + '\'' +
                ", author=" + author +
                ", giasach=" + giasach +
                ", ngaysanxuat=" + ngaysanxuat +
                '}';
    }
}
