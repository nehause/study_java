package com.jhj.study.ch06;

public class Board {
	String name = "게시글";
	int join = 10;	
	boolean use = true;
	
	Board(){
		
	}
	
	Board(String str){
		name = str;
		
	}
	
	Board(String str, int i){
		name = str;
		join = i;
	}
	
	Board(String str, boolean b){
		name = str;
		use = b;
	}
	
	Board(String str, int i, boolean b){
		name = str;
		join = i;
		use = b;
	}
	
}
