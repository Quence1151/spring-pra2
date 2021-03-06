package com.example.spring_pra2;

import com.example.spring_pra2.discount.DiscountPolicy;
import com.example.spring_pra2.discount.RateDiscountPolicy;
import com.example.spring_pra2.member.MemberRepository;
import com.example.spring_pra2.member.MemberService;
import com.example.spring_pra2.member.MemberServiceImpl;
import com.example.spring_pra2.member.MemoryMemberRepository;
import com.example.spring_pra2.order.OrderService;
import com.example.spring_pra2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
        //return null;
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
