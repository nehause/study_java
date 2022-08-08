package com.jhj.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		int grade = 5;
		int cost = 10000;

		if(grade == 1) {
			double price = cost*(1-0.05);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int)price + "원 입니다.");
		}
		else if(grade == 2) {
			double price = cost*(1-0.1);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int)price + "원 입니다.");
		}
		else if(grade == 3) {
			double price = cost*(1-0.15);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int)price + "원 입니다.");
		}
		else if(grade == 4) {
			double price = cost*(1-0.2);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int)price + "원 입니다.");
		}
		else {
			double price = cost*(1-0.27);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int)price + "원 입니다.");
		}
	}

}
