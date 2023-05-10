package Buoi10.QuanLyDanhBa;

//interface là các hợp đồng đưa ra các điêu khoản (hành vi, method) để 1 hoặc nhiều kiểu dữ liệu bị ràng buộc tuân thủ theo
//interface chứa:
// các biến hằng public static final
//ccas hàm abstract  / (hàm chỉ có khai báo không có đn)
//các hàm static
//đặc điển
//trừu tượng 100% -> không tạo đối tượng (new) không có contractor
// một interface kế thừ (extends) tới nhiều interface khác
//1 lớp kế thừa 1 lowpss và thực thi(implements) tới nhiều interface khác
public interface IInOut {
    int num = 10;
    public static final String CLASSNAME = "CHINH";

    public static void test() {
        System.out.println("tesst");
    }

    void input();
public  abstract void output();
}
