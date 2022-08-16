package com.jhj.study.ch04;

public class ForExmaple {

	public static void main(String[] args) {

//		**********
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시요
		
		//치트키 금지
		/*for(int i=1; i <=5; i++){
			System.out.println("**********");
		}*/
		
		
		//1번 수정본
		String c = "";
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=10; b++) {
				c += "*";
			}
			System.out.println(c);
			c = "";
		}
		
			
		
//		**********
//		*        *
//		*        *
//		*        *
//		**********
//		출력하는 프로그램을 만드시요
		
		System.out.println("\n-------------------------\n");
		//치트키 금지
		/*for(int j=1; j<=5; j++) {
			if(j == 1 || j == 5) {
				System.out.println("**********");
			} else {
				System.out.println("*        *");
			}
		}*/
		
		//2번 수정본
		String g = "";
		for(int d=1; d<=5; d++) {
			if(d == 1 || d == 5) {
				for(int e=1; e<=10; e++) {
					g += "*";
				}
				System.out.println(g);
				g = "";
			} else {
				for(int f=1; f<=10; f++){
					if(f == 1 || f == 10) {
						g += "*";
				} else {
					g += " ";
					}	
				}
				System.out.println(g);
				g = "";
			}
		}

		System.out.println("\n-------------------------\n");
		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시요
		
		String l = "";
		
		for(int k=1; k<10; k++) {
			l += Integer.toString(k);
			System.out.println(l);
		} 
		
		String m = "";
		for(int n=1; n<=10; n++) {
			if(n==10) {
				m += "0";
			}else {
				if(n%2==1) {
					m += Integer.toString(n);
				} else {
					m += " ";
				}
			}
		}
		System.out.println(m);
		

		System.out.println("\n-------------------------\n");
		
		// 3번을 1개의 코드로 묶은 버전		
		String r = "";
		for(int o=1; o<=10; o++) {
			if(o == 10) {
				r = "";
				for(int p=1; p<=10; p++) {
					if(p==10) {
						r += "0";
					}else {
						if(p%2==1) {
							r += Integer.toString(p);
						} else {
							r += " ";
						}
					}
				}
				System.out.println(r);
			} else {
				r += Integer.toString(o);
				System.out.println(r);
			}
		}

	}

}
