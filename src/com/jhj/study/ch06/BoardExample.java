package com.jhj.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		Board board = new Board();
		Board board2 = new Board("안녕하세요");
		Board board3 = new Board("반갑습니다", 20);
		Board board4 = new Board("어서오세요", false);
		Board board5 = new Board("환영합니다", 5, false);
		
		System.out.println(board.name + ", " + board.join + ", " + board.use);
		System.out.println(board2.name + ", " + board2.join + ", " + board2.use);
		System.out.println(board3.name + ", " + board3.join + ", " + board3.use);
		System.out.println(board4.name + ", " + board4.join + ", " + board4.use);
		System.out.println(board5.name + ", " + board5.join + ", " + board5.use);
		
		System.out.println("\n==========================\n");
		
		board.say();
		board2.say();
		board3.say();
		board4.say();
		board5.say();
		
		
	}

}
