package com.ndgroups.springmongodb.service;

import com.ndgroups.springmongodb.model.Order;

import java.util.List;

public interface IOrderService {
    void saveOrder(Order order);

    List<Order> orderOfUser(String userId);
}
