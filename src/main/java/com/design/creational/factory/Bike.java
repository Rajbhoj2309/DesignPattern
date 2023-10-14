package com.design.creational.factory;

public class Bike implements Vehicle{
	
	int wheels;
	public Bike(int wheels) {
		System.out.println("Bike");
	}
	@Override
	public int getWheel() {
		return bikeWheel;  // its return bikeWheel from Vehicle
	}

}
