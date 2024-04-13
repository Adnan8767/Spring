package com.springcore.autowire;

public class Address {
	private String state;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
