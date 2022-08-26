package com.jhj.study.ch07.third;

public class Computer extends Calculator {

	
	//오버라이드용
	//@Override
	//public double areaCircle(double r) {
	//TODO Auto-generated method stub
	//	return super.areaCircle(r);
	//}
	
	
	@Override
	public double areaCircle(double r) {
	  
		System.out.println("Calculator 객체의 areaCircle 실행"); return Math.PI * r * r; 
	 
	}
	 
	
	

}
