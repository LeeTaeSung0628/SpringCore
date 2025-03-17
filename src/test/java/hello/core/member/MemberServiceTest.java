package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //give (~한 환경에서)
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when (~ 했을 때)
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then (~ 결과가 나온다)
        Assertions.assertThat(member).isEqualTo(findMember); //객체 비교
    }
}
