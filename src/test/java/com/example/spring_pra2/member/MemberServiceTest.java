package com.example.spring_pra2.member;

import com.example.spring_pra2.AppConfig;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given - 이런 상황에서
        Member member = new Member(1L, "memberA",Grade.VIP);

        //when - 이런 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then - 이렇게 된다.
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
