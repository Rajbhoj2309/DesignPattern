package com.design.creational.singleton.staticInitialization;
class StaticBlock{
	private static StaticBlock instance;
	
	private StaticBlock() {
		
	}
	static {
		try {
			instance=new StaticBlock();
		}catch (Exception e) {
			throw new RuntimeException("Exception occured in creating single instance");
		}
	}
	public static StaticBlock getInstance() {
		return instance;
	}
}
public class StaticBlockSingleton {
	public static void main(String[] args) {
		StaticBlock obj = StaticBlock.getInstance();
		StaticBlock obj1 = StaticBlock.getInstance();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
