package com.jhj.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		// 작은 형태가 큰 형태로 변환되는것은 문제가 발생하지 않지만
		// 큰 형태가 작은 형태로 변환되는것은 문제가 생기거나 변환이 이루어져도 데이터의 손실이 발생한다.
		//byte < short < int < long < float < double
		//형변환은 크게 두개가 있는데 자동(promotion)/ 강제(casting)가 있다.
		// string <--> int
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		int intValue2 = 1234567890;
		System.out.println("intValue: " + intValue2);
		
		//intValue의 값이 byte의 범위를 넘어서 오류가 뜬다. 
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue: " + byteValue2);
		
		int intValue3 = 200;
		System.out.println("intValue: " + intValue3);
		
		double doubleValue = intValue3;
		System.out.println("intValue: " + doubleValue);
		
		byte byteValue2 = 10;
		
		short shortValue = byteValue2;
		System.out.println(shortValue);
		
		int intValue4 = shortValue;
		System.out.println(intValue4);
		
		long longValue = intValue4;
		System.out.println(longValue);
		
		float floatValue = longValue;
		System.out.println(floatValue);
		
		double doubleValue2 = floatValue;
		System.out.println(doubleValue2);		
		
		
		
	}

}
