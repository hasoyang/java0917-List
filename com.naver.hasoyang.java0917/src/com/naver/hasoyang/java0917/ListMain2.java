package com.naver.hasoyang.java0917;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();

		Person person = new Person();
		person.setName("JiHyunSub");
		person.setAge(28);
		person.setAddress("Seoul");
		person.setPhoneNumber("01000000000");

		// 테이블에 데이터를 삽입하기
		list.add(person);

		person = new Person();
		person.setName("YangWonMo");
		person.setAge(27);
		person.setAddress("Seoul");
		person.setPhoneNumber("01000000001");

		// 테이블에 데이터를 삽입하기
		list.add(person);
		
		// 데이터 정렬(sort)
		list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}

		});
		//타이틀 출력
		System.out.printf("%-10s%-15s%-20s%-5s\n", "name", "phoneNumber", "address", "age");
		// Fast Enumeration을 이용한 List 접근
		for (Person p : list) {
			System.out.printf("%-10s%-15s%-20s%-5d\n"
					, p.getName(), p.getPhoneNumber(), p.getAddress(), p.getAge());
		}
	}

}
