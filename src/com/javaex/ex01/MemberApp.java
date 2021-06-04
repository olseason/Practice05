package com.javaex.ex01;


public class MemberApp {

	public static void main(String[] args) {

		Member member = new Member();
		member.setName("정우성");
		member.setId("jws");
		member.setPoint(50000);
		member.showInfo();
		
		Member member01 = new Member();
		member.setName("유재석");
		member.setId("yjs");
		member.setPoint(30000);
		member.showInfo();
		
		Member member02 = new Member();
		member.setName("이효리");
		member.setId("lhr");
		member.setPoint(40000);
		member.showInfo();
		
		
		
	}

}
