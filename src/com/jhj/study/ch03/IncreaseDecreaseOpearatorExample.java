package com.jhj.study.ch03;

public class IncreaseDecreaseOpearatorExample {

	public static void main(String[] args) {
		// ++/-- 피연산자 : 다른 연산 수행 전에 피연산자 1증감
		// 피연산자 ++/-- : 다른 연산 수행 후에 피연산자 1증감
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);

		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	
		int k = i++;
		
		System.out.println("k: " + k);
		
		int m = ++j;
		
		if(!(j==3))
		{
			System.out.println("3이 아님");
		}
		else {
			System.out.println("3임");
		}
		
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		
		int z = ++i + j++;

		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}

}
