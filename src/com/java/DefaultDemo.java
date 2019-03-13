package com.java;

public class DefaultDemo {
	
	public static void main(String[] args) {
		XYZ obj= new XYZ();
		//obj.w= 32;
		System.out.println(obj.y);
		System.out.println(obj.x);
		System.out.println(obj.z);
		//System.out.println(obj.w);
	}
	
}
//A class can only have public/ default access.
 class XYZ{
	int x; //accessible only in same package
	public int y; //to all
	protected int z; //in the same package and child classes in a diff package
	private int w; //only within this class
}