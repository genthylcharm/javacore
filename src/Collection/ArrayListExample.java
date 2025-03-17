package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("Lam");
        list.add("Quan");
        list.add("Hoa");
        list.add("Kem");

        System.out.println("Danh sách được thêm" + list);

        list.remove("Hoa");
        System.out.println("Danh sách sau khi xóa :" + list);
    }
}
