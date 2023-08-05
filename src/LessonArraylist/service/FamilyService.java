package LessonArraylist.service;

import LessonArraylist.entities.Family;
import LessonArraylist.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyService {

    public Family inputInfo(Scanner scanner, MemberService memberService, ArrayList<Member> members){
        System.out.println("Mời b nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập số lượng thành viên trong gđ: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Member member = memberService.createMember(scanner);
            members.add(member);
        }
        // Đây là hàm hởi tạo có tham số, sau khi truyền tham số vào nó sẽ gán giá trị cho các trường của đối tượng family
        Family family = new Family(address, members);
        return family;
    }
}
