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
		
		double a1 = 5;
		double a2 = 3;
		double a = a1/a2;
		
		double b1 = 5;
		double b2 = 8;
		double b = b1/b2;
		
		double c1 = 49;
		double c2 = 5;
		double c = c1/c2;
		
		System.out.println("(a-b)*c = " + ((a-b)*c));
		
		double d = 5;
		
		double e = 3.25;
		
		double f1 = 11;
		double f2 = 6;
		double f = f1/f2;
		
		double g1 = 12;
		double g2 = 17;
		double g = g1/g2;
		
		System.out.println("d-(e-f)*g = " + (d-(e-f)*g));
		
		
		/*
		 * double a = 5/3; double b = 5/8; double c = 49/5;
		 * 
		 * System.out.println("(a-b)*c = " + ((a-b)*c));
		 * 
		 * double d = 5; double e = 3.25; double f = 11/6; double g = 12/17;
		 * 
		 * System.out.println("d-(e-f)*g = " + (d-(e-f)*g));
		 */
		
		System.out.println("8+7+5 = " + (8+7+5));
		System.out.println("1+9+5 = " + (1+9+5));
		System.out.println("5+6+6 = " + (5+6+6));
		System.out.println("4+7+1 = " + (4+7+1));
		System.out.println("7+5+5 = " + (7+5+5));
		
		int sum1 = 8+7+5;
		System.out.println("8+7+5 = " + sum1);
		
		int sum2 = 1+9+5;
		System.out.println("1+9+5 = " + sum2);
		
		int sum3 = 5+6+6;
		System.out.println("5+6+6 = " + sum3);
		
		int sum4 = 4+7+1;
		System.out.println("4+7+1 = " + sum4);
		
		int sum5 = 7+5+5;
		System.out.println("7+5+5 = " + sum5);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		
		avr("홍길동", 60, 70, 85, 90, 45);
		avr("박말순", 50, 75, 70, 60, 70);
		avr("고장난", 55, 60, 64, 58, 90);
		avr("도룡뇽", 80, 70, 63, 88, 78);
	}
		public static void sum(int x, int y, int z) {
			System.out.println(x + " + "+ y + " + " + z + " = " + (x+y+z));
		}
		
		public static void avr(String name, int english, int math, int physis, int music, int athletic) {
			System.out.println(name + "의 평균 점수는 " + (double) (english+math+physis+music+athletic)/5 + "점 입니다.");
		}

}
