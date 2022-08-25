package com.jhj.study.ch07.second;

public class Student extends People{
	public int studentNo;
	
	public Student() {
	// super(); 없어도 자바에서 자동적으로 생성이 된다.	
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  // super는 무엇인가
		//== this.name = name;
		//this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
}
