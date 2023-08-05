package LessonArraylist;

import LessonArraylist.entities.Family;
import LessonArraylist.entities.Member;
import LessonArraylist.service.FamilyService;
import LessonArraylist.service.MemberService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        ArrayList<Member> members = new ArrayList<>();

        FamilyService service = new FamilyService();
        // Nhập thông tin cho đối tượng famiky
        Family family = service.inputInfo(scanner, memberService, members);
        System.out.println(family);
    }
}
