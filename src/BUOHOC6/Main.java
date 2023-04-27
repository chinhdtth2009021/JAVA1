package BUOHOC6;

public class Main {
    public static void main(String[] args) {
//        có 3 cách thêm thông tin người dùng vào
//        Author tgConan = new Author("Aoyama Gōshō", "", "M", 1963);//cách 1
//        System.out.println(tgConan.toString());

//        Author tgDoraemon = new Author();// cách 2
//        tgDoraemon.setName("Fujiko Fujio");
//        tgDoraemon.setEmail("");
//        tgDoraemon.setGender("M");
//        tgDoraemon.setYear(1933);
//        System.out.println(tgDoraemon);

//        Author tg7vienngocrong = new Author();// cách 3
//        tg7vienngocrong.inputAuthor();
//        System.out.println(tg7vienngocrong);

        // lấy tác giả có sẵn
//        Book conan1 = new Book();
//        conan1.setAuthor(tgConan);

        // nhập tác giả
        Book conan2 = new Book();
//        conan2.setAuthor(tgDoraemon);
        conan2.inputBook();
        System.out.println(conan2);//IN RA DỮ LIỆU
    }
}
