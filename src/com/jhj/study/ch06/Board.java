package com.jhj.study.ch06;

public class Board {
	String name = "게시글";
	int join = 10;	
	boolean use = true;
	
	Board(){
		
	}
	
	Board(String str){
		this.name = str;
		
	}
	
	Board(String str, int i){
		this.name = str;
		this.join = i;
	}
	
	Board(String str, boolean b){
		this.name = str;
		this.use = b;
	}
	
	Board(String str, int i, boolean b){
		this.name = str;
		this.join = i;
		this.use = b;
	}
	/*
	public void say(String str,int i, boolean b){
		System.out.println(str + ", " + i + ", " + b);
	}
	*/
	public void say() {
		System.out.println(name + ", " + join +", " + use);
	}
}
