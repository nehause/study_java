package com.jhj.study.ch02;

public class Hello {

	public static void main(String[] args) {
		// 데이터타입 변수명 = 값;
		
		boolean abc = true;
		System.out.println(abc);
		boolean xyz;
		xyz = false;
		int with = 100;
		String name = "진휘재";
		
		String cover = "책 표지";
		String title = "책 이름";
		String subtitle = "책 부제";
		String writer = "작가";
		String publisher = "춮판사";
		int cost = 10000;
		int sale = 10; //or double sale = 0.1;
		int price = 9000;
		int count = 1;
		int isbn = 0000000000000;
		int page = 350;
		String size = "000*000*000mm";
		String introduce = "책소개";
		String image = "책 상세 이미지";
		String list ="책 목차";
		String content = "책 내용";
		String review = "서평";
		String card = "북카드";
		
		System.out.println("name 변수의 들어가 있는 값은: " + name);
		System.out.println("title의 값: " + title);
		System.out.println(publisher);
		System.out.println(price+page);
	}

}
