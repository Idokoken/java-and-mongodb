package com.ndgroups.springmongodb.repository;

import com.ndgroups.springmongodb.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    public List<Order> findByUserId(String userId);
}
