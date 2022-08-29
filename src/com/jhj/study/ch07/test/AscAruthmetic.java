package com.jhj.study.ch07.test;

import java.util.Arrays;

public class AscAruthmetic {
//	int a;
//	int b;
//	int c;
//	int[] asc = new int[3];
//	
//	AscAruthmetic(){
//		
//	}
//	
//	public void Asc(int a, int b, int c) {
//		asc[0] = a;
//		asc[1] = b;
//		asc[2] = c;
//		
//		Arrays.sort(asc);
//		
//		a = asc[0];
//		b = asc[1];
//		c = asc[2];
//		
//		System.out.println("(" + a +", " + b + ", " + c + ")");
//	}
//	
//	public int ascAruthmetic(int a, int b, int c) {
//		asc[0] = a;
//		asc[1] = b;
//		asc[2] = c;
//		
//		Arrays.sort(asc);
//		
//		a = asc[0];
//		b = asc[1];
//		c = asc[2];
//		
//		return a*b+c;
//	}
	
	int sum = 0;
	int[] arr = new int[3];
	
	public void asc(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int tmp=arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public int getSum(int arr[]) {
		sum = arr[0] * arr[1] + arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
