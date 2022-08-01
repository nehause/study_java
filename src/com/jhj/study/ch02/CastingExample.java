package com.jhj.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891; //7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue2: " + doubleValue2);
		
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		//long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		//int <- long
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		//short <- int
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		//byte <- short
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		//int <- string
		String StringValue = "123";
		int ItoS = Integer.parseInt(StringValue);
		System.out.println(ItoS);
		
		String stringValue2 = String.valueOf(intValue);
		System.out.println("stringValue: " + stringValue2);
		
		//string <- int
		int intValue2 = 123;
		String StoI = Integer.toString(intValue2);
		System.out.println(StoI);
	}

}
