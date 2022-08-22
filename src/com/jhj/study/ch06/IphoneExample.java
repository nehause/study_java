package com.jhj.study.ch06;

public class IphoneExample {
	// 아이폰 실행 클래스 생성
	public static void main(String[] args) {
		
		Iphone apple = new Iphone();
		
		// 아이폰 클래스의 이름 출력
		System.out.println("Iphone name: " + apple.name); // String name
		System.out.println("Iphone a: " + apple.a);	 // int a
		System.out.println("Iphone version[0]: " + apple.version[0]); // array version[0]
		System.out.println("Iphone version[1]: " + apple.version[1]); // array version[1]
		System.out.println("Iphone version[2]: " + apple.version[2]); // array version[2]
		System.out.println("Iphone b: " + apple.b); //double b
		
		apple.pr();
		
		Car car = new Car();
		
		System.out.println("Car: " + car.name);
		System.out.println("Car: " + car.name2[0]);
		System.out.println("Car: " + car.name2[1]);

	}

}
