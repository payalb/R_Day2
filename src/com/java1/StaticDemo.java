package com.java1;

public class StaticDemo {
	//static variables are also initialized by default
	int x;
	static int y;//U should access it directly using the class reference
}

class Main{
	
	public static void main(String[] args) {
		StaticDemo obj= new StaticDemo();
		obj.x= 24;
		obj.y=5;
		String s= "abc";
		StaticDemo obj1= new StaticDemo();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		assert false: "This is an assertion";
		System.out.println(StaticDemo.y);
	}
}