package com.jhj.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 2단 출력 프로그램
		// 2 * 1 = 2

		for(int i=1; i<=9; i++) {
			System.out.println("2 * " + i + " = " +(2*i));
		}
		
		
		// 2단 부터 9단 까지 출력하는 프로그램 작성
		for(int j=2; j<=9; j++) {
			for(int k=1; k<=9; k++) {
				System.out.println( j + " * " + k + " = " + (j*k));
			}
		}
	}

}
