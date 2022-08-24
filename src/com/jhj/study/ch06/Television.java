package com.jhj.study.ch06;

public class Television {
	public static String company = "삼성";
	public static String model = "아몰레드";
	public static String info;
	public String version = "1.0";
	
	//static block
	static {
		//static으로 정의된것들만이 조합이 가능하다.
		info = company + " " + model;
		// info = company+version 안됨
	}
}
