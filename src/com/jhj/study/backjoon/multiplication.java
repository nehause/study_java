package com.jhj.study.backjoon;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; 
		
		a = sc.nextInt();
        

		if(a<1 || a>9) {
			System.out.println("a가 지정된 범위를 넘어갑니다.");
		} else {
			for(int i=1; i<=9; i++){
	          int b = a*i;
	        System.out.println(a + " * " + i + " = " + b);
	        }
		}

	}

}
