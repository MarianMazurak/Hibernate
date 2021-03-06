package com.softserve.edu.ita.entity;

import java.util.Set;

public class Product {
	private int id;
	private String name;
	private String maker;
	private String country;
	private float price;
	private Set<Order> productOrderSet;
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Set<Order> getProductOrderSet() {
		return productOrderSet;
	}
	public void setProductOrderSet(Set<Order> productOrderSet) {
		this.productOrderSet = productOrderSet;
	}

}
