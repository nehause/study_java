package com.jhj.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		// 1~100 사이의 무작위한 정수 2개를 발생시켜
		// 두 수의 합을 구하라
		
		double num1 = 1.0;
		double num2 = 100.0;
		
		int twoRandomSum= 0;
		for(int i=1; i<=2; i++) {
			int forRandom = (int) (Math.random() * (num2-num1)+num1);
			System.out.println(i + "번째 무작위한 정수의 값: " + forRandom);
			twoRandomSum += forRandom;
		}
		System.out.println("두 무작위한 정수의 합은 " + twoRandomSum + "이다.");
		
		int forRandom1 = (int) (Math.random() * (num2-num1)+num1);
		int forRandom2 = (int) (Math.random() * (num2-num1)+num1);
		int forRandomSum = 0;
		
		
		
		System.out.println("-----------------------------------------------");
		// 1~100 사이의 무작위한 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라
		//내가 만든 코드
		
		System.out.println("1번째 무작위한 정수의 값" + forRandom1);
		System.out.println("2번째 무작위한 정수의 값" + forRandom2);
		if(forRandom1 == forRandom2) {
			System.out.println("두 무작위한 정수가 같기 때문에 두수 사이의 합은 0이다.");
		} else {
			if(forRandom1 > forRandom2) {
				for(int i = forRandom2; i < forRandom1; i++) {
					forRandomSum += i;
				}
				System.out.println("두 정수 사이의 합은 " + forRandomSum);
			} else {
				for(int j = forRandom1; j < forRandom2; j++) {
					forRandomSum += j;
				}
				System.out.println("두 정수 사이의 합은 " + forRandomSum);
			}
		
		}
		System.out.println("-----------------------------------------------");
		//최솟값과 최댓값을 미리 지정하여 for문의 양을 줄일수있다.
		
		int min = 0;
		int max = 0;
		int randomSum = 0;
		
		if(forRandom1 > forRandom2) {
			min = forRandom2;
			max = forRandom1;
		} else if(forRandom1 == forRandom2) {
			System.out.println("두 무작위한 정수가 같기 때문에 두수 사이의 합은 0이다.");
		} else {
			min = forRandom1;
			max = forRandom2;
		}
		
		System.out.println("min: " +min+ ", max: " +max);
		
		for(int i = min; i < max; i++) {
			randomSum += i;
			System.out.println(i + " : " + randomSum); //검산
		}
		System.out.println(min + " 와 " + max + " 두 정수 사이의 값은 " + randomSum + " 이다.");
		
	}

}

