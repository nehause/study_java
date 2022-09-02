package com.jhj.study.test.first;

//Calculator 라는 설계 클래스를 만듭니다.
public class Calculator {
	
	Constants constants = new Constants();
	
	//함수는 PAI_1 을 이용하여 param 으로 원의 반지름을 받으며
	public double circleArea(int r) {
		System.out.println("Calculator 객체의 원면적을 구하는 프로그램 실행");
		
		//리턴은 원의 면적을 계산하여 리턴 합니다.
		return constants.PAI_1 * r * r;
	}
}
