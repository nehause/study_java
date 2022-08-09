package com.jhj.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// int 타입의 변수 3개 선언하고
		// 세 정수열에서 최대값 최소값을 구하는 프로그램을 작성하시오
		
		int a = 7;
		int b = 7;
		int c = 7;
		
		if(a == b && b == c) {
			System.out.println("세 정수열은 같은 값을 가지고있습니다.");
		} else {
			if(a >= b && a >= c) {
				if(b >= c) {
					System.out.println(" 세 정수열의 최대값은 " +a+ "이고 최소값은 "+c+"이다.");
				} else {
					System.out.println(" 세 정수열의 최대값은 " +a+ "이고 최소값은 "+b+"이다.");
				}
			} else if(b >= a && b >= c) {
				if (a >= c) {
					System.out.println(" 세 정수열의 최대값은 " +b+ "이고 최소값은 "+c+"이다.");
				}else {
					System.out.println(" 세 정수열의 최대값은 " +b+ "이고 최소값은 "+a+"이다.");
				}
			} else if(c >= a && c >= b){
				if(a >= b) {
					System.out.println(" 세 정수열의 최대값은 " +c+ "이고 최소값은 "+a+"이다.");
				} else {
					System.out.println(" 세 정수열의 최대값은 " +c+ "이고 최소값은 "+b+"이다.");
				}
			}
		}
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 a: " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 b: " + b);
			} else {
				System.out.println("최대값은 c: " + c);
			}
		
			if(a < b && a < c) {
				System.out.println("최대값은 a: " + a);
			} else if( b < a && b < c) {
				System.out.println("최대값은 b: " + b);
			} else {
				System.out.println("최대값은 c: " + c);
			}
		} else {
			System.out.println("2개 이상의 동일한 정수가 존재합니다. 수정해주세요");
		}
		
	}
}

