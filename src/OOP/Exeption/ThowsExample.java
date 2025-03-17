package OOP.Exeption;

public class ThowsExample {
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        System.out.println("Kết quả: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
