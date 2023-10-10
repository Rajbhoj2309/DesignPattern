package com.design.creational.factory;

@FunctionalInterface
public interface Vehicle {
	public static final int carWheel=4;
	public static final int bikeWheel=2;
	abstract int getWheel();
}
