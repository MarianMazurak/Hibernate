package com.softserve.edu.ita.entity;

import java.util.Set;

public class Client {
	private int id;
	private String name;
	private String country;
	private Set<Order> clientOrderSet;
	public Client() {
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Set<Order> getClientOrderSet() {
		return clientOrderSet;
	}
	public void setClientOrderSet(Set<Order> clientOrderSet) {
		this.clientOrderSet = clientOrderSet;
	}
	

}
