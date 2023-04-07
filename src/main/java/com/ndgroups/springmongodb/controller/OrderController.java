package com.ndgroups.springmongodb.controller;

import com.ndgroups.springmongodb.dto.OrderDto;
import com.ndgroups.springmongodb.model.Order;
import com.ndgroups.springmongodb.service.IOrderService;
import com.ndgroups.springmongodb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderDto orderDto){
        orderService.saveOrder(orderDto.convertToOrder());
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<?> getOrdersOfUser(@PathVariable String  userId){
        orderService.orderOfUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
     }
}
