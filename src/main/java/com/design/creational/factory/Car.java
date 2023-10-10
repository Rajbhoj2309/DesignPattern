package com.design.creational.factory;

public class Car implements Vehicle {
	
	int wheel;
	public Car(int wheel) {
		System.out.println("Car ");
	}
	@Override
	public int getWheel() {
		return carWheel;
	}

}
