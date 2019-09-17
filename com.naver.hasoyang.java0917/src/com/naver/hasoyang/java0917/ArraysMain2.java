package com.naver.hasoyang.java0917;

import java.util.Arrays;

public class ArraysMain2 {
	public static void main(String[] args)
	{
		FileName f1 = new FileName();
		f1.setName("자바");
		f1.setSize(89);
		f1.setType("파워포인드");

		FileName f2 = new FileName();
		f2.setName("스위프트");
		f2.setSize(100);
		f2.setType("키노트");

		FileName f3 = new FileName();
		f3.setName("코틀린");
		f3.setSize(60);
		f3.setType("파워포인드");
		
		//위에서 만든 FileName 객체 3개를 가지고 배열을 생성
		FileName[] arr = {f1, f2, f3};
		
		for(FileName temp: arr)
		{
			System.out.printf("%s\n", temp);
		}
		//배열의 데이터 정렬
		// 데이터를 정렬하려면 크기 비교하는 메소드가 구현되어 있어야 합니다.
		//Comparable 인터페이스의 compareTo 메소드 입니다.
		//아니면 Comparator 인터페이스를 구현한 객체를 대입을 해주어야 합니다.
		Arrays.sort(arr);
		System.out.println("===========================");
		
		for(FileName temp: arr)
		{
			System.out.printf("%s\n", temp);
		}
		
	}
}
