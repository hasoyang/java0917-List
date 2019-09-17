package com.naver.hasoyang.java0917;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysMain3 {

	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정렬 기준을 선택하세요 (1.이름 2.크기) : ");
		int menu = sc.nextInt();
		
		switch(menu)
		{
		case 1:
			//Comparator는 제너릭이 적용된 인테피이스라서 객체를 생성할 때
			//자료형을 결정을 해주어야 합니다.
			Arrays.sort(arr, new Comparator<FileName>() {

				@Override
				public int compare(FileName o1, FileName o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			});
			break;
		case 2:
			Arrays.sort(arr, new Comparator<FileName>() {

				@Override
				public int compare(FileName o1, FileName o2) {
					return o1.getSize() - o2.getSize();
				}
				
			});
			break;
		default:
			System.out.println("메뉴는 1번과 2번만 선택하세요!");
			System.exit(0);
		}
		for(FileName temp: arr)
		{
			System.out.printf("%s\n", temp);
		}
		sc.close();
	}

}
