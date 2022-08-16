package com.jhj.study.ch04;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		//구구단 2단부터 9단까지

		
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + (a*b) + "\n");
				
			}
			System.out.println("--------------------------------------");
		}
		
	}

}
