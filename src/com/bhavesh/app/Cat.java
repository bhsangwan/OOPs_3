package com.bhavesh.app;

public class Cat extends Animal{
	
	private String color;

	
	//User Defined Constructor but it is similar to JVM provided default constructor
	public Cat() {
		super("SomeName");	//super();
	}
	
	public Cat(String color) {
		super("SomeName");
		this.color = color;
	}
	
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Miyaaun Miyaaun..!");
	}
	
	//Method Overriding
	public void makeNoise() {
		System.out.println("Miyaaaun Miyaaaun..!");
	}
	
	// And I can introduce additional properties in Cat
	public void jump() {
		System.out.println(getName() + " is jumping");
	}
}
