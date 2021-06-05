package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        for(int i = 0; i < friendArray.length; i++) {
        	
        	System.out.print("이름 : ");                        // 친구정보 3명 입력 로직 -> 반복문 사용 
        	String name = sc.next();
        	
        	System.out.print("핸드폰 : ");
        	String Pname = sc.next();
        	
        	System.out.print("학교 : ");
        	String school = sc.next();
        	
        	System.out.println("------------------------");
        	
        	
        	Friend Friend = new Friend();                          // Friend 인스턴스 생성하여 데이터 넣기 
        	Friend.setName(name);
        	Friend.setName(Pname);
        	Friend.setName(school);
        	
        	friendArray[i] = Friend;                               // 인스턴스 주소를 배열에 대입 
        }
         

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
