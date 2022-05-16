package com.example.spring_pra2.member;

import com.example.spring_pra2.member.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
