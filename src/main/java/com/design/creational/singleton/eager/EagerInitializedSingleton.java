package com.design.creational.singleton.eager;

class EagerInitialized{
	private static final EagerInitialized initialized=new EagerInitialized();
	
	private EagerInitialized() {
	}
	
	public static EagerInitialized getInitialized() {
		return initialized;
	}
}
public class EagerInitializedSingleton {
	public static void main(String[] args) {
		EagerInitialized initialized = EagerInitialized.getInitialized();
		EagerInitialized initialized1 = EagerInitialized.getInitialized();
		
		if(initialized==initialized1) {
			
			System.out.println("both are same generating hashcode");
		System.out.println(initialized.hashCode());
		System.out.println(initialized1.hashCode());}
		else
			System.out.println("different");
		
	}
}
