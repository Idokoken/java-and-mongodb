package com.ndgroups.springmongodb.repository;

import com.ndgroups.springmongodb.model.User;
import com.ndgroups.springmongodb.projection.CountryAggregation;
import com.ndgroups.springmongodb.projection.UserAggregation;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional <User> findUserByUsername(String username);
    //value: where condition
    //fields: select items: 1 => include, 0 => exclude
    //sort: 1 => ASC, -1 => DESC
    @Query(value = "{ country: ?0 }", fields = "{ name: 1, _id: 0 }", sort = "{ name: -1 }")
    List<User> findUsersByCountry(String country);

     //select country, sum(1) = count(*) from users group by country
    @Aggregation("{$group: {_id: $country, total: {$sum: 1}}}")
    List<CountryAggregation> groupByCountry();

    //country country, [names] from user group by country
    @Aggregation("{$group: {_id: $country, names: {$addToSet: $name}}}")
    List<UserAggregation> groupByCountryAndName();
}
