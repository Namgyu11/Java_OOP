package JAPA_PROG_01.pro05_01;

import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member();

        member.setUserId("abc");
        System.out.println("ID: " + member.getUserId());

        MemberService memberService = new MemberService();


        // 회원 가입
        boolean result = memberService.register(member);

        // 회원 탈퇴
        boolean result2 = memberService.withdraw(member);

        // 회원 목록
        List<Member> memberList = memberService.geList();
    }
}
