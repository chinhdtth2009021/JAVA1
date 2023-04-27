package BUOHOC6;
// Phạm vi try cập  => biến, lớp, instance/class, hàm instance/class
// => phạm vi truy cập của lớp -> kiểu lớp đc dùng ở đâu
// => phạm vi truy cập của biến instance/class , hàm instance/class => đối tượng truy xuất biến hàm ở đâu

import java.util.Scanner;

public class Author { // dùng ở mọi nơi
    //    1 tạo huộc tính  => biến instance -> private/ biến class ->public
    private String name, email, gender;
    private int year;

    //    2 tạo contructer
    public Author() {
    }

    public Author(String name, String email, String gender, int year) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.year = year;
    }

    //    3 tạo các hàm set/get cho các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //    4 tạo các hàm nghiệp vụ
    public void inputAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin tác gải ");

        System.out.println("Tên ");
        this.name = sc.nextLine();

        System.out.println("Email ");
        this.email = sc.nextLine();

        System.out.println("tuoi ");
        this.year = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("Giới tính (M, F, O): ");
            this.gender = sc.nextLine();
        } while (!"M".equals(this.gender) && !"F".equals(this.gender) && !"O".equals(this.gender));
        this.name = sc.nextLine();
    }

    // hàm chuyển đổi chuỗi
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                '}';
    }
}

//class newClass {  // defaulf cùng package
//    // các từ khóa phạm vi truy cập
////    public : dùng mọi nơi, trong lớp, ngaoif lớp, khác/ cùng package
////    private: chỉ dugf trong lướp định nghĩa
////    defaulf (mặc định) -> chỉ dùng tại accs đối tượng cùng package
////    protected => chỉ dùng với các đối tượng ở các lớp , cùng package và tại các lướp con của lớp đó
////    final: biến hằng hàm không override lớp không được kế thừa
////    static: biến lớp/tĩnh, hàm lớp/tĩnh, khối tĩnh
//    private String name;
//    String email;
//    protected int year;
//    public String gender;
//
//    public Author() {
//    }
//
//    //    public Author(String name, String email, int year, String gender) {
////        this.name = name;
////        this.email = email;
////        this.year = year;
////        this.gender = gender;
////    }
////    set <twn biến> gán giá trị cho ở ngoài  lớp
////    get <tên biến> lấy giá trị của thuộc tính ở ngaoif lớp
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(String gender) {
//        if (gender.toUpperCase().contains("Nam"))
//            this.gender = "M";
//        else
//            this.gender = gender;
//    }
//
//    public String getName() {
//        return this.name = name;
//    }
//
//    public String getRender() {
//        return this.gender = gender;
//    }

//}