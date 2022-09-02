package com.jhj.study.test.first;

//Computer 라는 설계 클래스를 만듭니다.
//Calculator를 상속 받습니다.
public class Computer extends Calculator{
	
	//(단 Calculator에서 생성한 함수를 override 하여 구현)
	@Override
	//함수는 PAI_2 을 이용하여 param 으로 원의 반지름을 받으며
	public double circleArea(int r) {
		System.out.println("Computer 객체의 원면적을 구하는 프로그램 실행");
		
		//리턴은 원의 면적을 계산하여 리터 합니다. 
		return constants.PAI_2 * r * r;
	}
}
