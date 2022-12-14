package com.jhj.study.backjoon.plus;

import java.util.Scanner;

public class plusCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count;
		count = 0;
		n = sc.nextInt();
		
		if(n >= 0 && n <= 99) {
			int e = n;
			while(true) {
				int a, b, c, d;
				
				if(e < 10) {
					count += 1;
					a = 0;
					b = e;
					c = a+b;
					d = Integer.parseInt(String.valueOf(b)+String.valueOf(c%10));
					
					if(n == d) {
						break;
					} else {
						e = d;
					}
				}  else {
					count += 1;
					a = e/10;
					b = e%10;
					c = a+b;
					d = Integer.parseInt(String.valueOf(b)+String.valueOf(c%10));
					
					if(n == d) {
						break;
					} else {
						e = d;
					}
					
				}
			} 
			System.out.println(count);
			
		} else {
			System.out.println("N의 범위를 넘어선 숫자 입니다.");
		}

	}

}
