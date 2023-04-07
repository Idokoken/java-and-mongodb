package com.ndgroups.springmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "users")
public class User {
//    it will link automatically with _id field in the database and generated automatically
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String name;
    private String country;
    private LocalDateTime createTime;
    private Address address;

//    public User(String username, String name, String country, LocalDateTime createTime, Address address) {
//        this.username = username;
//        this.name = name;
//        this.country = country;
//        this.createTime = createTime;
//        this.address = address;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public LocalDateTime getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(LocalDateTime createTime) {
//        this.createTime = createTime;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
