package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {

    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Test
    void saveTest() {
        //given
        Member member = new Member(1L, "kim", Grade.VIP);

        //when
        memberRepository.save(member);
        Member findMember = memberRepository.findById(member.getId());

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
