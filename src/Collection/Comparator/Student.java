package Collection.Comparator;

import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

// Comparator sắp xếp tuổi tăng dần
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

 class InketQua {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Lam", 34));
        students.add(new Student("Quan", 33));
        students.add(new Student("Hoa", 35));
        students.add(new Student("Minh", 49));

        // Sắp xếp theo tuổi tăng dần
        Collections.sort(students, new AgeComparator());

        System.out.println("Sắp xếp theo tuổi: " + students);
    }
}
