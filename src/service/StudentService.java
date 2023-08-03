package service;

import entities.SinhVienBiz;
import entities.SinhVienIT;
import entities.StudentTechmaster;

import java.util.Scanner;

public class StudentService {
    public SinhVienBiz createStudentBiz(Scanner scanner, String name, String major){
        System.out.println("Mời b nhạp điểm marketing: ");
        double marketing = Double.parseDouble(scanner.nextLine());
        return new SinhVienBiz(marketing);
    }

    public SinhVienIT createStudentIT(Scanner scanner, String name, String major){
        System.out.println("Mời b nhạp điểm java: ");
        double java = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhạp điểm html: ");
        double html = Double.parseDouble(scanner.nextLine());
        return new SinhVienIT(java, html);
    }
}
