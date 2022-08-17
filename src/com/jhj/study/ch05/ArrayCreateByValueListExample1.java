package com.jhj.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scoreEnglish; // 배열 선언하는법 2가지
		int scoreMath[];
		
		int[] scoreChemistry = {88, 99, 45, 86, 34}; // 값넣기 혹은 초기화
		
		

		System.out.println(scoreChemistry.length); // 배열의 길이
		double sum = 0; // 소수점이 나올 가능성도 있기 때문에 유의 해야한다.
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		} 
		
		double avg = sum/scoreChemistry.length;
		
		System.out.println("화학 실험의 평균 값은 " + avg + "점 이다.");
		
		String[] name = {"장원영", "장동건", "고소영"}; // 배열 선언과 함께 값넣기

		System.out.println("동건님의 화학 성적: " + scoreChemistry[1]);
		System.out.println("누굴까요 : " + name[2]);
	}

}
