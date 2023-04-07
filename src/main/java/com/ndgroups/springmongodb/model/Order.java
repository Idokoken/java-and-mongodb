package com.ndgroups.springmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "orders")
public class Order {
     @Id
     private String id;
     private String userId;
     private String orderName;
     private LocalDateTime orderTime;

//    public Order(String userId, String orderName, LocalDateTime orderTime) {
//        this.userId = userId;
//        this.orderName = orderName;
//        this.orderTime = orderTime;
//    }
//
//
//    public String getId() {
//        return id;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getOrderName() {
//        return orderName;
//    }
//
//    public void setOrderName(String orderName) {
//        this.orderName = orderName;
//    }
//
//    public LocalDateTime getOrderTime() {
//        return orderTime;
//    }
//
//    public void setOrderTime(LocalDateTime orderTime) {
//        this.orderTime = orderTime;
//    }
}
