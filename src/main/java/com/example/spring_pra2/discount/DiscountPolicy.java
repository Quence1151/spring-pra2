package com.example.spring_pra2.discount;

import com.example.spring_pra2.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
