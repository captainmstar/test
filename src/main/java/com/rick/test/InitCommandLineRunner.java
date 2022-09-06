package com.rick.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitCommandLineRunner implements CommandLineRunner {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		OrderMain order = new OrderMain("Test1");
		repository.save(order);
		order = new OrderMain("Test2");
		repository.save(order);

		OrderItem orderItem = new OrderItem("OrderItem1");
		orderItem.setOrder(order);
		orderItemRepository.save(orderItem);

	}

}
