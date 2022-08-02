package com.jhj.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		//int 인수 나누기를 한다면 소숫점은 생략된다.
		double result6 = v1 / v2;
		System.out.println("result6 : " + result6);
		//캐스팅을 계산에 한다면 소수점도 넘어온다.
		double result7 = (double) v1 / v2;
		System.out.println("result7 : " + result7);
		//평점 시스템에 쓸수있는 연산이다.
		
	}

}
