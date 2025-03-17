package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    // 저장소
    // HashMap 은 멀티 스레드(분산환경)에서 동시성 이슈를 일으킬 수 있기 때문에, ConcurrentHashMap 으로 이후에 변경
    private static final Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
