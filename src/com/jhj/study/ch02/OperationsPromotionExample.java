package com.jhj.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// byte 변수 byteValue 선언하고 12로 초기화
		byte byteValue = 12;
		
		// byte 변수 byteValue2 선언하고 12로 초기화
		byte byteValue2 = 12;
		
		// byte 변수 byteValue3 선언하고 위 두 변수를 합 연산 수행
		// byte와 short끼리의 연산은 int 변수로 선언된다.
		// 그렇기에 아래 줄은 올지않고 
		//byte byteValue3 = byteValue + byteValue2;
		
		//이것이 되야한다.
		//int intValue = byteValue + byteValue2;
		
		// byteValue3 결과 출력
		//System.out.println(byteValue3);
		
		//System.out.println(intValue); 가 되야한다
		
		
		//위와 같이 byte, short의 연산값은 int로 변환되므로 이렇게 해야한다. 
		short shortValue = 12;
		short shortValue2 = 12;
		//short shortValue3 = shortValue + shortValue2;
		int intValue4 = shortValue + shortValue2;
		System.out.println(intValue4);
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue + intValue2;
		System.out.println(intValue3);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		//byte byteValue4 = byteValue + intValue;
		int intValue5 = byteValue + intValue;
		System.out.println(intValue5);
		
		//int intValue6 = intValue + doubleValue;
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
	}

}
