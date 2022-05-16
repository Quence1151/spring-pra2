package com.example.spring_pra2.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
