package com.design.creational.singleton;
class Singleton{

private static Singleton instance;
	
	Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null) {
			return instance=new Singleton();
		}
		return instance;
	}
}
public class SingletonPattern {

	public static void main(String[] args) {
		Singleton obj=new Singleton().getInstance();
		Singleton obj1=new Singleton().getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
