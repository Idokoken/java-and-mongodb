package com.ndgroups.springmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String city;
    private String postCode;
}
