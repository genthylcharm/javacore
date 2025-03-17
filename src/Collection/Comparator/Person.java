package Collection.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nam", 22));
        persons.add(new Person("Linh", 20));
        persons.add(new Person("An", 25));
        persons.add(new Person("An", 22));

        // Sắp xếp theo tuổi tăng dần, nếu bằng thì theo tên
        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));

        System.out.println("Sắp xếp theo tuổi, nếu bằng thì theo tên: " + persons);
    }
}
