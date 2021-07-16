package com.bhavesh.app;

public abstract class Animal {

	String name;

	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Sleeping..!");
	}
}
