package com.naver.hasoyang.java0917;

public class Board {
	static{
		num = 0;
	}
	private static int num;
	
	private String title;
	private String name;
	private String date;
	
	public Board()
	{
		num++;
	}
	public Board(String title, String name, String date)
	{
		this.title = title;
		this.name = name;
		this.date = date;
		num++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString()
	{
		return "[num] " + num + " [title] " + title + " [name] " + name + " [date] " + date;
	}
}
