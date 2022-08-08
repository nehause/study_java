package com.jhj.study.ch04;

public class IfExample {

	public static void main(String[] args) {
		int score = 92;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			}
			else if(score >= 93 & score <= 96) {
				System.out.println("A");
			}
			else {
				System.out.println("A-");
			}
		}
		else if(score >= 80 & score <= 89) {
			System.out.println("B");
		}
		else if(score >= 70 & score <= 79) {
			System.out.println("C");
		}
		else if(score >= 60 & score <= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
