package com.jhj.study.ch02;

public class CharExample {

	public static void main(String[] args) {
		
//		자바는 모든 문자를 유니코드로 처리받는다.
		
		//char type을 쓸때는 ' string을 쓸때는 "을 쓴다.
		char c1 = 'A'; //문자열 저장
		char c2 = 65;  //10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		char c4 = '가'; //문자열 저장
		char c5 = 44032; //10진수로 저장
		char c6 = '\uac00'; //16진수로 저장
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1;
		System.out.println(uniCode);
		
		int uniCode2 = c4;
		System.out.println(uniCode2);
	}

}
