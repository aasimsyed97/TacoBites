package com.TacoBites.repository;


import com.TacoBites.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
