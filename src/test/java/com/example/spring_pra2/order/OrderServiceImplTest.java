package com.example.spring_pra2.order;

import com.example.spring_pra2.discount.FixDiscountPolicy;
import com.example.spring_pra2.member.Grade;
import com.example.spring_pra2.member.Member;
import com.example.spring_pra2.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceImplTest {
    @Test
    void creatOrder(){
        MemoryMemberRepository memoryRepository = new MemoryMemberRepository();
        memoryRepository.save(new Member(1L,"name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
