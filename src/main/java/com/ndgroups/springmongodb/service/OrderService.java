package com.ndgroups.springmongodb.service;

import com.ndgroups.springmongodb.model.Order;
import com.ndgroups.springmongodb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void saveOrder(Order order){
        orderRepository.save(order);
    }
    @Override
    public List<Order> orderOfUser(String userId) {
        return orderRepository.findByUserId(userId);
    }
}
