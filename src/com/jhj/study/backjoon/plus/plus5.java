package com.jhj.study.backjoon.plus;

import java.util.Scanner;

public class plus5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(a > 0 && b < 10) {
				
				System.out.println(a+b);
				
			} else if(a == 0 && b == 0) {
				sc.close();
				break;
			} else {
				System.out.println("테스트 케이스를 벗어납니다.");
			}
			
		}	
	}

}
