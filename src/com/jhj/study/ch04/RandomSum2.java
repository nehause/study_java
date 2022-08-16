package com.jhj.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 100;
		int max = 0;
		int min = 0;
		
		int random1 = (int) (Math.random()*(b-a)+a);
		int random2 = (int) (Math.random()*(b-a)+a);
		
		System.out.println("1번째 랜덤한 정수 값은" + random1);
		System.out.println("2번째 랜덤한 정수 값은" + random2);
		
		if(random1 == random2) {
			System.out.println("두 정수가 같으므로 두 정수 사이의 값의 합은 0이다.");
		} else {
			if(random1 > random2) {
				max = random1;
				min = random2;
			} else {
				max = random2;
				min = random1;
			}
		}
		
		System.out.println("랜덤한 두 정수 사이의 최댓값: " + max + " 최솟값: " + min);
		
		int RandomSum = 0;
		
		for(int i = min; i < max; i++) {
			RandomSum += i;
			System.out.println(i + " : " + RandomSum);
		}
		System.out.println("두 수 사이의 합은 " + RandomSum + "이다.");
	}

}
