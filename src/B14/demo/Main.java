package B14.demo;

import B14.demo.entities.Student;
import B14.demo.service.StudentManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("dat", 12);
        Student student2 = new Student("dat", 12);
        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student2);
        System.out.println(students);
    }
}
