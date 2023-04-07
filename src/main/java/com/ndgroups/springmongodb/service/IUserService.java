package com.ndgroups.springmongodb.service;

import com.ndgroups.springmongodb.model.User;
import com.ndgroups.springmongodb.projection.CountryAggregation;
import com.ndgroups.springmongodb.projection.UserAggregation;

import java.util.List;

public interface IUserService {
    void saveUser(User user);

    List<User> findUsersByCountry(String country);

    List<UserAggregation> groupByCountryAndName();

    List<CountryAggregation> groupByCountry();
}
