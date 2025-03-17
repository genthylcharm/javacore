package OOP.String;

public class TestString {
    public static void main(String[] args) {
        String s1 = " Hello,Java ";
        String s2 = " Hello Word ";

        // 1. xóa khoảng trắng
        System.out.println(s1.trim());
        // 2. chuyển thành chữ hoa
        System.out.println(s1.toUpperCase());

        // 3. lấy độ dài
        System.out.println(s1.length());
        //4. so sánh
        System.out.println(s1.equals(s2));
        //5. kiểm tra chuỗi con
        System.out.println(s1.contains("Java"));
        //6. cắt chuỗi
        System.out.println(s1.substring(1, 7));
        // 7. thay thế chuỗi
        System.out.println(s1.replace("Java","JavaSpring"));

    }
}
