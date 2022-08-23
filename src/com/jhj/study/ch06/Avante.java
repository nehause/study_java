package com.jhj.study.ch06;

public class Avante {
	
	//변수 초기값
	String name = "아반떼";
	int cc = 3000;
	String color = "하얀색";
	
	//기본 생성자
	Avante(){
		
	}
	//자동차 이름을 받는 생성자
	Avante(String name){
		this.name = name;
	}
	Avante(String name, int cc){
		this.name = name;
		this.cc= cc;
	}
	//자동차 이름과 cc를 받는 생성자 
	//Avante(String str, int num){
	//	name = str;
	//	cc = num;
	//}
	//자동차 이름과 cc와 색깔을 받는 생성자
	Avante(String str, int num, String str2){
		name = str;
		cc = num;
		color = str2;
	}
}
