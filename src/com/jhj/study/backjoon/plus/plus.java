package com.jhj.study.backjoon.plus;

import java.util.Scanner;

public class plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, f;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		
		
		
		if(0<=a && a<=10 && 0<=b && b<=10 && 0<=c && c<=10 && 0<=d && d<=10 && 0<=e && e<=10 && 0<=f && f<=10) {
			System.out.println((1-a) + " " + (1-b) + " " + (2-c) + " " + (2-d) + " " + (2-e) + " " + (8-f));
			
		} else {
			System.out.println("지정된 범위를 넘어섰습니다.");
		}
	}

}
