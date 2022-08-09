package com.jhj.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		// int type의 변수를 1개 선언하고
		// 그 변수가 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int a = 0;
		
		if (a != 0) {
			if (a%2 == 1) {
				System.out.println("a는 홀수이다.");
			} else {
				System.out.println("a는 짝수이다.");
			} 
		}
		else {
			System.out.println("0은 짝수도 홀수도 아니다.");
		}
	}

}
