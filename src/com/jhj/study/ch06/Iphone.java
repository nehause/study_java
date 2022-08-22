package com.jhj.study.ch06;

	// 아이폰 클래스 생성
public class Iphone {
	//field는 이름
	String name = "아이폰";
	int a = 1;
	String[] version = {"2", "7", "X"};
	double b = 1.2345;
	
	public void pr() {
		System.out.println("String[] version : " + (version[0]+version[1]+version[2]));
	}
	
}
