package com.jhj.study.backjoon;

import java.util.Scanner;

public class minus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		if(a>=1000 && a<=3000) {
			System.out.println(a - 543);
		} else {
			System.out.println("숫자가 지정된 범위를 넘었습니다.");
		}
	}
}
