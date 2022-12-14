package com.jhj.study.backjoon.plus;

import java.util.Scanner;

public class plus4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//hasNext는 boolean 타입으로 가져오는 값이 있으면(a+b) true 없으면(ㄷ,1.1 같은 다른 데이터 타입) false로 반복문을 조절할수 있다. 
		while(sc.hasNextInt()){
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a > 0 && b < 10) {
				System.out.println(a+b);
			} else {
				System.out.println("테스트 케이스의 숫자 범위에서 벗어납니다.");
			}
			
		
		}	
		sc.close();
	}

}
