package com.design.creational.factory;

public class TestFactory {
	public static void main(String[] args) {
		Vehicle carInstance = VehicleFactory.getInstance("car");
		int carwheel = carInstance.getWheel();
		System.out.println("numbers of wheels is "+carwheel);
		Vehicle bikeInstance = VehicleFactory.getInstance("bike");
		int bikewheel = bikeInstance.getWheel();
		System.out.println("numbers of wheels is "+bikewheel);
	}
}
