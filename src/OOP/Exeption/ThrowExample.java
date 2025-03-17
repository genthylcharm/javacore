package OOP.Exeption;

public class ThrowExample {
    public static void checkAge(int age ) throws IllegalAccessException {
        if (age < 18){
            throw new IllegalAccessException("Tuổi phải >= 18");
        }
        System.out.println("Bạn đã đủ tuổi đăng kí ");
    }

    public static void main(String[] args) throws IllegalAccessException {
        checkAge(17);

    }
}
