package com.jhj.study.backjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, f, g;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		if(a >= 1 && a <= 6 && b >= 1 && b <= 6 && c >= 1 && c <= 6) {
			
			if(a == b && b == c) {
				System.out.println(10000 + a*1000);
			} else if(a==b) {
				System.out.println(1000 + a*100);
			} else if(a==c) {
				System.out.println(1000 + a*100);
			} else if(b==c) {
				System.out.println(1000 + b*100);
			} else {
				if(a > b && a > c) {
					System.out.println(a*100);
				} else if(b > a && b > c) {
					System.out.println(b*100);
				} else {
					System.out.println(c*100);
				}
			}
			
		} else {
			System.out.println("주사위의 눈이 맞지 않습니다.");
		}
		
	}
	
}