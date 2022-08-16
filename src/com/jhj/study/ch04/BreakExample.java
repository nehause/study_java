package com.jhj.study.ch04;

public class BreakExample {

	public static void main(String[] args) {
		double min = 1.0;
		double max = 10.0;
		
		while(true) {
			int random = (int) ((Math.random() * (max - min)) + min);
			
			System.out.println(random);
			
			if(random == 5) {
				break;
			}
		}
		
		System.out.println("--------------------------------------");
		
		for(int i = 1; i < 10; i++) {
			int random2 = (int) ((Math.random() * (max - min)) + min);
			
			System.out.println(i + " : " + random2);
			
			if(random2 == 5) {
				break;
			}
		}
		System.out.println("--------------------------------------");
		aa:
		for(int j = 1; j<=10; j ++) {
			for(int i = 1; i < 10; i++) {
				int random3 = (int) ((Math.random() * (max - min)) + min);
				
				System.out.println(j + " : " +i + " : " + random3);
				
				if(random3 == 5) {
					break aa;
					//break 차이를 이해해야함
					//break aa; 는 큰 틀의 for문을 정지시키는것
					//break; 는 큰 틀안에 있는 for 문을 정지시키는것으로
					//큰 틀로 지정되있는 for 문은 작동한다.
				}
			}
		}

	}

}
