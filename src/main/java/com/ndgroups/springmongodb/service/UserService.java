package com.ndgroups.springmongodb.service;

import com.ndgroups.springmongodb.model.User;
import com.ndgroups.springmongodb.projection.CountryAggregation;
import com.ndgroups.springmongodb.projection.UserAggregation;
import com.ndgroups.springmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements  IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
         userRepository.save(user);
    }
    @Override
    public List<User> findUsersByCountry(String country) {
         return userRepository.findUsersByCountry(country);
    }
    @Override
    public List<UserAggregation> groupByCountryAndName(){
        return userRepository.groupByCountryAndName();
    }
    @Override
    public List<CountryAggregation> groupByCountry() {
        return userRepository.groupByCountry();
    }

}
