package com.jhj.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		//공통코드 비스므리하게 운용
		Week abc;
		Week xyz;
		
		
//		abc = 1;
//		abc = "asdasdf";
//		abc = 1.1;
		abc = Week.MONDAY;
		
		System.out.println("Week.FRIDAY: " + Week.FRIDAY);
		System.out.println("abc : " + abc);
		
		// name << String 캐스팅 같은거
		String name = abc.name();
		System.out.println("name: " + name);
		
		//ordinal << 배열로서의 위치?
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		xyz = Week.THURSDAY;
		
		//compareTo << 거리?
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " +result2);
		
		Week[] days = Week.values();
		
		int index=0;
		
		//for(단수 : 복수){}
		for(Week day: days) {
			System.out.println((index+1) + " : day : " + day);
			index++;
		}
		
	}

}
