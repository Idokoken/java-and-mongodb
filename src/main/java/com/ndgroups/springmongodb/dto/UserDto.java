package com.ndgroups.springmongodb.dto;

import com.ndgroups.springmongodb.model.Address;
import com.ndgroups.springmongodb.model.Order;
import com.ndgroups.springmongodb.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserDto {
    private String username;
    private String name;
    private String country;
    private LocalDateTime createTime;
    private Address address;

    public User convertToUser(){
        return User.builder()
                .username(username)
                .name(name)
                .country(country)
                .address(address)
                .build();
    }

}
