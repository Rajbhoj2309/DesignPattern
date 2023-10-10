package com.design.creational.factory;

public class VehicleFactory {
	
	public static Vehicle getInstance(String type) {
		int wheel = 0;
		String carvehicle = ConstantUtils.CARVEHICLE;
		String bikevehicle = ConstantUtils.BIKEVEHICLE;
		if(type==carvehicle) {
			return new Car(wheel);
		}
		if(type==bikevehicle) {
			return new Bike(wheel);
		}else
		{
			return null;	
		}
		
	}

}
