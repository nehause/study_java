package com.jhj.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "진휘재";
		String str2 = "진휘재";
		String str3 = new String("진휘재");
		
		//String의 문자열이 아닌 주소값을 비교하는 방법이다
		boolean result1 = (str1 == str2);
		System.out.println("result = " + result1);

		boolean result2 = (str1 == str3);
		System.out.println("result = " + result2);
		
		// 문자열 자체를 비교하려면 객체명.equals를 쓴다.
		System.out.println("str1.equals(str2) = " + str1.equals(str2)); //== (x) true
		System.out.println("str1.equals(str3) = " + str1.equals(str3)); //== (x) true 
	}

}
