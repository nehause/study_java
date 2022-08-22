package com.jhj.study.ch06;

public class IphoneExample {
	// 아이폰 실행 클래스 생성
	public static void main(String[] args) {
		
		Iphone apple = new Iphone();
		
		// 아이폰 클래스의 이름 출력
		System.out.println("Iphone: " + apple.name); // String name
		System.out.println("Iphone: " + apple.a);	 // int a
		System.out.println("Iphone: " + apple.version[1]); // array version[1] 
		System.out.println("Iphone: " + apple.b); //double b

	}

}
