

import entities.SinhVienBiz;
import entities.SinhVienIT;
import entities.StudentTechmaster;
import service.StudentService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số học sinh: ");
        int n = Integer.parseInt(scanner.nextLine());

        StudentTechmaster[] students = new StudentTechmaster[n];
        int count = 0;
        do {
            System.out.println("B muốn nhập sinh viên biz hay IT (B/T)");
            String choose = scanner.nextLine();
            StudentService service = new StudentService();
            System.out.println("Mời b nhập tên: ");
            String name = scanner. nextLine();
            System.out.println("Mời b nhập chuyên môn: ");
            String major = scanner. nextLine();
            switch (choose) {
                case "B" -> {
                    students[count] = service.createStudentBiz(scanner, name, major);
                }
                case "T" -> {
                    students[count] = service.createStudentIT(scanner, name, major);
                }
            }
            count++;
        } while (count<n);
        System.out.println("Danh sách SV là: "+ Arrays.toString(students));
    }

}
