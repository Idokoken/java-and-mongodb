package com.ndgroups.springmongodb.dto;

import com.ndgroups.springmongodb.model.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class OrderDto {

    private String name;
    private String userId;

    public Order convertToOrder(){
        return Order.builder()
                .orderName(name)
                .userId(userId)
                .orderTime(LocalDateTime.now())
                .build();
    }
}
