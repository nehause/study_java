package com.jhj.study.ch06;

public class Korean {
	String name = "이름";
	String ssn = "생년월일";
	int age = 20;
		
	Korean(){
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age){
		this.name = name;
		this.age = age;
	}

	static String nationality = "대한민국";
	
	static int staticTest(int a) {
		return a+10;
	}
	
	int ttest() {
		Aruthmetic aruthmetic = new Aruthmetic();
		
		aruthmetic.aaa(12);
		
		return 1;
	}
	
	public void ttest2() {
		Aruthmetic.StaticTest();
	}
	
}
