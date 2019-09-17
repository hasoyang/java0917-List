package com.naver.hasoyang.java0917;

//Sports라는 열거형 상수를 생성
enum Sports{
	Baseball, Soccer, Volleyball, Basketball
}
public class EnumMain {

	public static void main(String[] args) {
		//열거형 상수 변수에는 열거형 상수 중의 하나만 대입이 가능합니다.
		Sports v = Sports.Baseball;
		
		System.out.println(v); //열거형 상수 이름이 나옴
		System.out.println(v.ordinal()); //인덱스 출력
		
		//final static을 이용해성 옵션을 만드는 것 보다는
		//enum을 사용하는 것을 고급 프로그래밍 기법으로 취급

	}

}
