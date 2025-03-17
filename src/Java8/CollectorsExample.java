package Java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Chuyển Stream thành List
public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lam", "Quan", "Kem", "Duong");
        List<String> result = names.stream().filter(name -> name.startsWith("L")).collect(Collectors.toList());
        System.out.println(result); // Lam
    }
}
//Phân loại thành 2 nhóm theo điều kiện
class PartitioningByExample{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Tổng: " + stats.getSum());       // 100
        System.out.println("Trung bình: " + stats.getAverage()); // 25.0
        System.out.println("Số phần tử: " + stats.getCount());   // 4
        System.out.println("Số nhỏ nhất: " + stats.getMin());    // 10
        System.out.println("Số lớn nhất: " + stats.getMax());    // 40
    }
}
//Nối chuỗi các phần tử
class JoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lam", "Quan", "Kem");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);// Lam, Quan,Kem
    }
    }

    //Đếm số phần tử trong Stream
    class CountingExample{
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Lam", "Quan", "Kem");

            long count = names.stream()
                    .collect(Collectors.counting());

            System.out.println("Số phần tử: " + count); //3
        }
        }
    //Nhóm dữ liệu theo một thuộc tính
class GroupingBy {
        public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student("Alice", "A"),
                    new Student("Bob", "B"),
                    new Student("Charlie", "A"),
                    new Student("David", "B")
            );

            Map<String, List<Student>> groupedByGrade = students.stream()
                    .collect(Collectors.groupingBy(Student::getGrade));

            System.out.println(groupedByGrade);
            // {A=[Alice, Charlie], B=[Bob, David]}
        }
    }
