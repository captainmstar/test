package com.rick.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn
	private OrderMain order;
	
	public OrderItem() {}
	
	public OrderItem(String name) {
		super();
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public OrderMain getOrder() {
		return order;
	}
	public void setOrder(OrderMain order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}
	
	
}
