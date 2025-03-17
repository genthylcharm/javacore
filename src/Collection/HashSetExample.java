package Collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(9);
        set.add(20);
        System.out.println(" ket qua in ra :"+set);
    }
}
