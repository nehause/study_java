package com.jhj.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// && = & : and : 논리곱 : 연산 참 참 참, 나머지 거짓
		// || = | : or : 연산 참 거짓 참, 거짓 참 참, 참 참 참, 거짓거짓거짓
		// ^ : 배타적 논리합 : 연산 참 참 거짓, 거짓 거짓 거짓, 참 거짓 참, 거짓 참 참
		int a = 65;
		
		boolean result1 = (a >= 65);
			System.out.println(result1);
		
		boolean result2 = (a <= 90);
		System.out.println(result2);

		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 같거나 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 같거나 작습니다.");
		}
		
		System.out.println("--------------------------------------");
		
		if(a >= 65 | a <= 90) {
			System.out.println("둘다 참");
		}
		if(a >= 66 | a <= 90) {
			System.out.println("한개만 참");
		}
		if(a >= 66 || a <= 60) {
			System.out.println("둘다 거짓-- 안보임");
		}
		
		System.out.println("--------------------------------------");
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("둘다 거짓이지만 배타적 논리합이기때문에 참");
		}
		
		System.out.println("--------------------------------------");
		
		int int1 = 10;
		
		if(int1 >= 10 & int1 <= 10) {
			System.out.println("& : 둘다 참");
		}
		
		if(int1 >= 11 & int1 <= 10) {
			System.out.println("& : 한개만 참");
		}
		
		if(int1 >= 11 & int1 <= 9) {
			System.out.println("& : 둘다 거짓");
		}
		
		if(int1 >= 10 | int1 <= 10) {
			System.out.println("| : 둘다 참");
		}
		
		if(int1 >= 11 | int1 <= 10) {
			System.out.println("| : 한개만 참");
		}
		
		if(int1 >= 11 | int1 <= 9) {
			System.out.println("| : 둘다 거짓");
		}
		
		if(int1 >= 10 ^ int1 <= 10) {
			System.out.println("^ : 둘다 참");
		}
		
		if(int1 >= 11 ^ int1 <= 10) {
			System.out.println("^ : 한개만 참");
		}
		
		if(int1 >= 11 ^ int1 <= 9) {
			System.out.println("^ : 둘다 거짓");
		}
		
	}

}
