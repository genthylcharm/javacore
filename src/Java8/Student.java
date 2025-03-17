package Java8;

public class Student {

        private String name;
        private String grade;

        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name; // In ra chỉ tên sinh viên thay vì địa chỉ object
        }
    }

