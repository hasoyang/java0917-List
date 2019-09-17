package com.naver.hasoyang.java0917;

public class Gerneric<T> {
	private T[] data;
	//데이터를 대입받아서 인스턴스 속성에 대입하는 생성자
	//매개변수에 ...이 있으면 varages라고 하는데
	//매개변수를 개수에 상관없이 대입할 수 있음.
	//메소드 내에서는 배열이 간소화
	public Gerneric(T...n) {
		data = n;
	}
	
	//data의 내용을 출력하는 메소드
	
	public void display() {
		for (T temp : data) {
			System.out.println(temp);
		}
	}
}
