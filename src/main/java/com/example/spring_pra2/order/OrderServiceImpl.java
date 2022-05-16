package com.example.spring_pra2.order;

import com.example.spring_pra2.discount.DiscountPolicy;
import com.example.spring_pra2.discount.FixDiscountPolicy;
import com.example.spring_pra2.discount.RateDiscountPolicy;
import com.example.spring_pra2.member.Member;
import com.example.spring_pra2.member.MemberRepository;
import com.example.spring_pra2.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
