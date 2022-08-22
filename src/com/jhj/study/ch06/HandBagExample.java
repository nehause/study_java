package com.jhj.study.ch06;

public class HandBagExample {

	public static void main(String[] args) {

		HandBag handbag = new HandBag();
		
		System.out.println("handbag name: " + handbag.name);
		
		Car car = new Car();
		
		System.out.println("car.name: " + car.name);
		
		car.name = "소나타";
		
		System.out.println("car.name: " + car.name);
		
		Iphone apple = new Iphone();
		
		System.out.println("apple.version[2]: " + apple.version[2]);
		
		apple.version[2] = "10";
		
		System.out.println("apple.version[2]: " + apple.version[2]);

	}

}
