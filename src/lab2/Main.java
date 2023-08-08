package lab2;

import lab2.entities.Student;
import lab2.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng hs muốn thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        StudentService service = new StudentService();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = service.creatStudent(scanner);
            students.add(student);
        }
        System.out.println(students);

        service.percentScore(students);
    }
}
