package com.llab.cronus.service;

import java.util.List;

import com.llab.cronus.entity.Greeting;

public interface GreetingServiceImpl {
    List<Greeting> getAll();
    Greeting findOne(String id);
    Greeting create(Greeting greeting);
    Greeting update(Greeting greeting);
    List<Greeting> getGreetingByUsername(String username);
    void delete(String id);
}