package com.jhj.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {
		// int 타입의 변수를 2개 선언하고
		// 두 정수가 주어졌을때 정수를 비교하여
		//크기 비교 결과를 나타내는 프로그램을 작성하세요
		
		int a = 10;
		int b = 8;
		
		if(a>b) {
			System.out.println("a: " + a +"은(는) b: " + b + "보다 크다.");
		} else if(a == b) {
			System.out.println("a: " + a +"은(는) b: " + b + "와(과) 같다.");
		} else {
			System.out.println("a: " + a +"은(는) b: " + b + "보다 작다.");
		}

	}

}
