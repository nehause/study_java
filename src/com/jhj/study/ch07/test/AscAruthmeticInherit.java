package com.jhj.study.ch07.test;

import java.util.Arrays;

public class AscAruthmeticInherit extends AscAruthmetic{
	int a;
	int b;
	int c;
	int[] asc = new int[3];
	
	public int ascAruthmetic(int a, int b, int c) {
		asc[0] = a;
		asc[1] = b;
		asc[2] = c;
		
		Arrays.sort(asc);
		
		a = asc[0];
		b = asc[1];
		c = asc[2];
		
		return a*b+c+10;
	}
}
