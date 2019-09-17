package com.naver.hasoyang.java0917;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		List<String>al = new ArrayList<>();
		List<String>li = new LinkedList<>();
		
		al.add("강감찬");
		li.add("강감찬");
		
		al.add("조헌");
		li.add("조헌");
		//현재 시간을 기록
		long start = System.currentTimeMillis();
		//첫번째 자리에 1000000개를 삽입
		for(int i  = 0; i < 100000; i++) {
			li.add(1,"을지문덕");
		}
		//현재 시간을 기록
		long end = System.currentTimeMillis();
		
		System.out.println("LinkedList 걸린시간 : " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i  = 0; i < 100000; i++) {
			al.add(1,"을지문덕");
		}
		end = System.currentTimeMillis();
		
		System.out.println("ArrayList 걸린시간 : " + (end - start));
		
		
		start = System.currentTimeMillis();
		//첫번째 자리에 1000000개를 삽입
		int size = al.size();
		for(int i  = 0; i < size; i++) {
			String data = al.get(i);
			System.out.printf("%s", data);
		}
		//현재 시간을 기록
		end = System.currentTimeMillis();
		System.out.println("\nArrayList 걸린시간 : " + (end - start));
		
		start = System.currentTimeMillis();
		size = li.size();
		for(int i  = 0; i < size; i++) {
			String data = li.get(i);
			System.out.printf("%s", data);
		}
		//현재 시간을 기록
		end = System.currentTimeMillis();
		System.out.println("\nArrayList 걸린시간 : " + (end - start));
		
	}

}
