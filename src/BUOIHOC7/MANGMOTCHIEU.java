package BUOIHOC7;

public class MANGMOTCHIEU {

    public static void main(String[] args) {
// biền mảng là biến chứa nhiều phần tử có cùng kiểu dữ liệu => có kích thwuosc ngang nhau
//        khai báo khởi tạo biến mảng
        int nums[];
//        khởi tạo biến mảng
        nums = new int[5]; //nums là chứa 5 phần tử kiển int, giá trị mặc định của pt = 0
        float points[] = new float[10];//tạo mảng float gồm 10 phần tử , giá trị mặc định của phần tử là 0
        String names[] = {"Nguyễn Thị Linh", "Lê Quângnh", "Hoàng Văn Nam"};//tạo mảng chuỗi gồm 3 phần tử, và gán các giá trị tên cho từng phần tử

//Truy xuất xuất get / set từng phần tử của mảng - > chỉ mục index của mỗi phần tử
        System.out.println("tên phần  tử thứ nhất là : " + names[0]);
        nums[1] = 3;
        System.out.println("kích thước của mảng " + names.length);
//        duyệt mảng, do while, while, for, foreach
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t", names[i]);
        }
        System.out.println();
        System.out.println("Hiển thị các phần tử mảng nums: ");
        for (int tmp : nums) {
            System.out.printf("%d\t", tmp);
        }
    }
}
