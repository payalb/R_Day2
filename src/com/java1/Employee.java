package com.java1;

public class Employee {

	String name;
	int age;
	static int noOfEmployees;
	static {
		//At time when the class is loaded into the JVM. So this can be used to 
		//initialize your static variables.
	}
	//Is called just before the constructor is called.
	{
		noOfEmployees++;
	}
	Employee(String name){
	//	noOfEmployees++;
		this.name= name;
		this.age= 24;
	}
	//
	Employee(String name, int age){
		//noOfEmployees++;
		this.name= name;
		this.age= age;
	}
	//If it is a static method, u cannot access non-static members inside it
	static void printCount() {
		System.out.println(noOfEmployees);
	}
}
