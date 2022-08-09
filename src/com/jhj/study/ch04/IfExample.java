package com.jhj.study.ch04;

public class IfExample {

	public static void main(String[] args) {
		int score = 62;
		
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
			if(score >= 87) {
				System.out.println("B+");
			}
			else if(score >= 83 & score <= 86) {
				System.out.println("B");
			}
			else {
				System.out.println("B-");
			}
		}
		else if(score >= 70 & score <= 79) {
			if(score >= 77) {
				System.out.println("C+");
			}
			else if(score >= 73 & score <= 76) {
				System.out.println("C");
			}
			else {
				System.out.println("C-");
			}
		}
		else if(score >= 60 & score <= 69) {
			if(score >= 67) {
				System.out.println("D+");
			}
			else if(score >= 63 & score <= 66) {
				System.out.println("D");
			}
			else {
				System.out.println("D-");
			}
		}
		else {
			System.out.println("F");
		}
	}

}
