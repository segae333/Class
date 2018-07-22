package com.segae.clazz;

public class Classmain {

	public static void main(String[] args) {

		// 클래스 사용하기
		// 1. 변수를 클래스의 이름을 타입으로 해서 선언
		Class name;
		
		//2. new 연산자로 초기화
		name = new Class();
		
		// Class name2 = new Class();
		
		// 3.1 변수 사용하기 - 도트 연산자로 멤버에 접근 
		name.color = "블랙";
		
		//3.2 함수 사용하기 - 도트 연산자로 멤버에 접근
		name.call();
		
		//4. 기본형과 동일하게 배열표현식을 사용할 수 있따.
		
		Class classes[] = new Class[5];
		
		int ints[] = new int[5];
		
		// 기본형 변수 선언 - 초기화
		int varName;
		varName = 35;
		

	}

}
