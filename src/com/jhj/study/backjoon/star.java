package com.jhj.study.backjoon;


import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		
		if(n >= 1 && n <= 100) {
			
			for(int i=1; i<=n; i++) {
				for(int k = n-i; k > 0; k--) {
					System.out.print(" ");
				}
				for(int l = 0; l < i; l++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
            
		} else {
			System.out.println("테스트 케이스 범위에 맞지 않습니다.");
		}
		
	}
	
}

