package com.jhj.study.backjoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		
		if(n >= 1 && n <= 100) {
			
            for(int k = 1; k <= n; k++){
                for(int i = 0; i < n; i++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < k; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
			
		} else {
			System.out.println("테스트 케이스 범위에 맞지 않습니다.");
		}
		
	}
	
}