package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 레파지토리 구현체 생성
    private final MemberRepository memberRepository;

    //생성자로 의존성 주입
    // MemberRepository 객체를 인자로 받아, 삽입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        // memberRepository 를 호출 하여도, 다형성에 의해서 MemoryMemberRepository 의 save 호출
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
