package OOP.Exception; // Sửa lỗi chính tả 'Exeption' thành 'Exception'

// Exception tùy chỉnh kế thừa từ Exception
class CheckAge extends Exception {
    public CheckAge(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void validateAge(int age) throws CheckAge {
        if (age < 18) {
            throw new CheckAge("Tuổi phải >= 18 để đăng ký!");
        }
        System.out.println("Đủ tuổi để đăng ký!");
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // Gây lỗi
        } catch (CheckAge e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
