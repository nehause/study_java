package com.jhj.study.ch10.first;

public class TryCatchFinallyExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
			
	}

}
