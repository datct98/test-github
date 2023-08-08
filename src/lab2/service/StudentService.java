package lab2.service;

import lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student creatStudent(Scanner scanner){
        System.out.println("Mời b nhập tên hs: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập điểm toán: ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm lý: ");
        double physic = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm hóa: ");
        double chemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name, math, physic, chemistry);
    }

    public void percentScore(ArrayList<Student> students){
        int countA=0, countB=0, countC=0;
        for (Student s: students){
            if(s.classify().equalsIgnoreCase("A")) countA++;
            else if(s.classify().equalsIgnoreCase("B")) countB++;
            else countC++;
        }
        System.out.println("A: "+(countA*100/students.size()));
        System.out.println("B: "+(countB*100/students.size()));
        System.out.println("C: "+(countC*100/students.size()));
    }
}
