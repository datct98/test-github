package B14.demo.service;

import B14.demo.entities.Student;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    public Student createStudent(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        return new Student(name, age);
    }

    // 1 3 2 6 7
    public Student findById(Scanner scanner, Map<Integer, Student> students) {
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = students.get(id);
        if(student!= null) return student;
        return null;
    }
}
