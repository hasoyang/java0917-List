package com.naver.hasoyang.java0917;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		String[] names = {"지현섭" , "양원모", "공동욱", "홍성현"};
		// 배열의 데이터를 정렬해주는 메소드
		//Arrays.sort
		Arrays.sort(names);
		
		for(String name:names)
		{
			System.out.printf("%s\n", name);
		}
		//정수 배열도 정렬이 가능
		//정수는 int이지만 Arrays가 볼 때는 Integer입니다.
		
		int []arr = {100, 30, 290, 1000, 20, 88};
		//binary search는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못합니다.
		int result = Arrays.binarySearch(arr, 88);
		
		System.out.printf("result : %d\n", result);
		
		Arrays.sort(arr);
		result = Arrays.binarySearch(arr, 88);
		System.out.printf("result : %d\n", result);
	}

}
