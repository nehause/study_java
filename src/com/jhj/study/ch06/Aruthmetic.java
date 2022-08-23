package com.jhj.study.ch06;

public class Aruthmetic {
	
	public int plus(int a, int b) {
		int sum = 0;
		sum = a+b;
		return sum;
	}
	
	public int minus(int a, int b) {
		int sub = 0;
		sub = a-b;
		return sub; 
	}
	
	public int multi(int a, int b) {
		int mul = 0;
		mul = a*b;
		return mul;
	}
	
	public int divide(int a, int b) {
		int div = 0;
		div = a/b;
		return div;
	}
	public int remainder(int a, int b) {
		int rem = 0;
		rem = a%b;
		return rem;
	}
	
	public void say(int a) {
		System.out.println("값은 " + a + " 입니다.");
	}
	
	public void StringSum(String a, String b) {
		System.out.println(a+b);
	}
}
