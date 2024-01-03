package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class MemberServiceTest {

    private MemberService memberService = new MemberServiceImpl();

    @Test
    void 회원가입() {
        //given
        Member member = new Member(1L, "yong", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
