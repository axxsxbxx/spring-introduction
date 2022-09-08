package hello.hellospring.repository;

import hello.hellospring.domain.Member;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);
    ptional<Member> findById(Long id);
}
