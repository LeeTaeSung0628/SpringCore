package hello.core.member;

public interface MemberService {
    
    //기능 요구사항
    void join(Member member);

    Member findMember(Long memberId);
}
