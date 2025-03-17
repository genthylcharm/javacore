package OOP.Exeption;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        } finally {
            System.out.println("Khối này luôn chạy!");
        }
    }
}
