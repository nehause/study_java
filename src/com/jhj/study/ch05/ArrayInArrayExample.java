package com.jhj.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//int[] name = new int[5]; - i= 0~4
		//name.length = 5
		
		int[][] scores = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99},{100, 50, 75},{80, 90, 10}};
		String[] name = {"장원영", "장동건", "고소영", "공유", "마동석"};
		String[] subject = {"국어", "영어", "수학"};
		
		// 1차원 개인
		// 2차원 {국어, 영어, 수학} 점수
		//System.out.println("scores[0][0]: "+ scores[0][0]);
		//System.out.println("scores[1][1]: "+ scores[1][1]);
		//System.out.println("scores[2][2]: "+ scores[2][2]);
		//System.out.println("scores[3][0]: "+ scores[3][0]);
		//1. 각 개인의 평균
		//배열의 값을 반대로 교체해보기
		for(int i=0; i<scores.length; i++) {
			double sum = 0;
			for(int j=0; j<scores[j].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는 " +((double)sum/scores[i].length));
		}
		
		/*
		 * double sum = 0; for(int i=0; i<scores.length; i++) { for(int j=0;
		 * j<scores[j].length; j++) { sum += scores[i][j]; }
		 * 
		 * if(i==0) { System.out.println("장원영의 평균 점수는 "+ (sum/3) + "점 이다."); } else
		 * if(i==1){ System.out.println("장동건의 평균 점수는 "+ (sum/3) + "점 이다."); } else
		 * if(i==2){ System.out.println("고소영의 평균 점수는 "+ (sum/3) + "점 이다."); } else
		 * if(i==3){ System.out.println("공유의 평균 점수는 "+ (sum/3) + "점 이다."); } else {
		 * System.out.println("마동석의 평균 점수는 "+ (sum/3) + "점 이다."); }
		 * 
		 * sum = 0; }
		 */
		
		System.out.println("\n--------------------------\n");
		
		//2. 과목별 평균
		
		for(int i=0; i<scores[i].length; i++) {
			double sum = 0;
			for(int j=0; j<scores.length; j++) {
				sum += scores[j][i];
			}
			System.out.println(subject[i]+"의 평균 점수는 " +((double)sum/scores.length));
		}

		
		
		/*
		 * for(int i=0; i<scores[i].length; i++) { for(int j=0; j<scores.length; j++) {
		 * sum += scores[j][i]; } if(i==0) { System.out.println("국어 과목의 평균 점수는 "+
		 * (sum/5) + "점 이다."); } else if(i==1){ System.out.println("영어 과목의 평균 점수는 "+
		 * (sum/5) + "점 이다."); } else { System.out.println("수학 과목의 평균 점수는 "+ (sum/5) +
		 * "점 이다."); } sum = 0; }
		 */
		
		// if문으로 하는게 아니라 배열을 추가한다.
	}

}
