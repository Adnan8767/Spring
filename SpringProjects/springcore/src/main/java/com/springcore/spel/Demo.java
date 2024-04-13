package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int a;
	@Value("#{22*8}")
	private int b;
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	@Value("#{ new java.lang.String('Anuj singh') }")
	private String name;
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", z=" + z + ", pi=" + pi + ", name=" + name + "]";
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
