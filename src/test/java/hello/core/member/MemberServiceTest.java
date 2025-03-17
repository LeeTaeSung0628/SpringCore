package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    //테스트를 실행하기 전, 무조건 실행됨 (테스트 케이스마다 각각)
    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

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
