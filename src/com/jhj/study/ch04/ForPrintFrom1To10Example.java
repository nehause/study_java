package com.jhj.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// 1 부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1+2+....+9+10 = " + sum);
	}
}
