package com.example.spring_pra2.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
