package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = GetStudent();

        for (Student student : students) {
            if (student.name.endsWith("ova")) {
                int summ = 0;
                for (Integer scores : student.scores) {
                    summ += scores;
                }
                if (summ % 2 == 0) {
                    System.out.println(student.name);
                }
            }
        }
    }
        public static List<Student> GetStudent() {
            List<Student> studentsList = new ArrayList<Student>();
            studentsList.add(new Student("Vasiltev", 500, new ArrayList(Arrays.asList(1, 2, 3))));
            studentsList.add(new Student("Petrova", 400, new ArrayList(Arrays.asList(1, 2, 3))));
            studentsList.add(new Student("Ivanova", 600, new ArrayList(Arrays.asList(2, 2, 4))));
            studentsList.add(new Student("Sidorov", 1100, new ArrayList(Arrays.asList(1, 1, 3))));
            return studentsList;
        }
    }