package com.jhj.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		int grade = 3;
		int cost = 10000;
		double price = 0.0; 
		
		switch (grade) {
		case 1:
			price = cost*(1-0.05);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는 " +(int) price +"원 입니다." );
		break;
		case 2:
			price = cost*(1-0.1);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는 " +(int) price +"원 입니다." );
		break;
		case 3:
			price = cost*(1-0.15);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는 " +(int) price +"원 입니다." );
		break;
		case 4:
			price = cost*(1-0.2);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는 " +(int) price +"원 입니다." );
		break;
		case 5:
			price = cost*(1-0.027);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는 " +(int) price +"원 입니다." );
		break;
		default:
			System.out.println("없는 등급입니다. grade에 1~5 사이의 값을 넣어주세요" );
		break;
		}

	}

}
