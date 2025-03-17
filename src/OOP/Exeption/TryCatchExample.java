package OOP.Exeption;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            int result = a / b ;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi toán học: Không thể chia cho 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Truy cập ngoài phạm vi mảng!");
        } catch (Exception e) {
            System.out.println("Lỗi khác: " + e.getMessage());
        }
    }
}
