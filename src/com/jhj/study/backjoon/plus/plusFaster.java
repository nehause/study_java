package com.jhj.study.backjoon.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class plusFaster {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
		if(N > 0 && N < 1000000) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000) {
					bw.write((a+b) + "\n");
				} else {
					System.out.println("숫자 a,b 범위에서 벗어납니다.");
				}
			}
		} else {
			System.out.println("테스트 케이스 범위에서 벗어납니다.");
		}
		br.close();
		bw.flush();
		bw.close();
 
	}
}
