package LessonArraylist.service;

import LessonArraylist.entities.Member;

import java.util.Scanner;

public class MemberService {
    public Member createMember(Scanner scanner){
        System.out.println("mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("mời b nhập dob: ");
        String dob = scanner.nextLine();
        System.out.println("Mời b nhập job");
        String job = scanner.nextLine();
        return new Member(name, dob, job);
    }
}
