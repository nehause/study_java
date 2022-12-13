package com.jhj.study.backjoon;


import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		
		if(n >= 1 && n <= 100) {
			
			for(int i=1; i <= n; i++) {
				
				if(n == 1) {
					
					for(int j=1; j<=i; i++) {
						System.out.print("*");
					}
					
				} else {
					for(int k = n-1; k > 1; k--) {
						System.out.print(" ");
					}
					for(int l = 1; l < n; l++) {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
            
		} else {
			System.out.println("테스트 케이스 범위에 맞지 않습니다.");
		}
		
	}
	
}

