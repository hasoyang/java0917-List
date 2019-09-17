package com.naver.hasoyang.java0917;

public class Person {
	private String name;
	private String phoneNumber;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person [Name : " + name + " PhoneNumber : "+ phoneNumber +
				" Address : " + address + " Age : "  + age + "]";
	}
}
