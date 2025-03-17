package Collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        map.put("Lam",1992);
        map.put("Hoa",1993);
        map.put("Vu",1991);

        System.out.println(" sau khi duyet :" + map);

        System.out.println("nam sinh cua Lam :"+map.get("Lam"));
    }
}
