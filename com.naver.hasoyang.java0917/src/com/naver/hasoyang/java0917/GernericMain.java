package com.naver.hasoyang.java0917;

public class GernericMain {

	public static void main(String[] args) {
		//미지정 자료형을 String으로 결정해서 객체 생성
		Gerneric<String> ob1 = new Gerneric<String>("java","Kotlin", "Swift");
		ob1.display();
		
		
		//미지정 자료형을 결정할 때 기본형은 안됨 
		//1.7버전 이상에서는 생성자 뒤의 자료형은 생략 가능
		Gerneric<Integer> ob2 = new Gerneric<>(100,200);
		ob2.display();
	}

}
