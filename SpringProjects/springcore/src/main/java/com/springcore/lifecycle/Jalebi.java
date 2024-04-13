
package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Init method called for Jalebi");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method called for jalebi");
	}
}
