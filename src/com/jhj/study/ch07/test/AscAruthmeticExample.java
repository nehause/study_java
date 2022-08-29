package com.jhj.study.ch07.test;

public class AscAruthmeticExample extends AscAruthmetic {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = 5;
		
		int result1;
		int result2;
		
		AscAruthmetic ascAruthmetic = new AscAruthmetic();
		
		ascAruthmetic.Asc(a, b, c);
		result1 = ascAruthmetic.ascAruthmetic(a,b,c);
		
		AscAruthmeticInherit ascAruthmeticInherit = new AscAruthmeticInherit();
		
		result2 = ascAruthmeticInherit.ascAruthmetic(a, b, c);
		
		System.out.println("부모 메서드의 값은 " + result1 + " 자식 메서드의 값은 " + result2 + " 둘의 차이는 " +Math.abs(result1-result2));
		

	}

}
