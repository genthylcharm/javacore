package Java8;

import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Lam", 22),
                new Person("Quan", 20),
                new Person("Kem", 21)
        };

        Arrays.parallelSort(persons);

        System.out.println(Arrays.toString(persons));

    }
    }



