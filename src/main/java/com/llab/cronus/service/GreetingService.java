package com.llab.cronus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.llab.cronus.entity.Greeting;
import com.llab.cronus.repository.GreetingRepository;

@Service
public class GreetingService implements GreetingServiceImpl {

	@Autowired
	private GreetingRepository repository;

	@Override
	public List<Greeting> getAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Greeting findOne(String id) {
		return repository.findOne(id);
	}

	@Override
	public Greeting create(Greeting greeting) {
		return repository.save(greeting);
	}

	@Override
	public Greeting update(Greeting greeting) {
		Greeting persitedGreeting = repository.findOne(greeting.getId());
		if (persitedGreeting == null) {
			return null;
		}
		return repository.save(greeting);
	}

	@Override
	public List<Greeting> getGreetingByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}
}
