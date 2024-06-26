package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	private String name;
	@Autowired
	@Qualifier("add")
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
