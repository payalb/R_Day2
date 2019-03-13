package com.java;
//Ram is driving Mercedes Benz
public class Demo3 {
public static void main(String[] args) {
	Person p= new Person();
	p.name="Ram";
	p.age=32;
	Car car= new Car();
	car.model= "Mercedes Benz";
	car.driver= p;
	car.drive();
}
}
class Person{
	String name;
	int age;
	//Car car;
	@Override
	public String toString() {
		return name+ ", aged "+ age;
	}
}
class Car{
	String model;
	Person driver;
	//
	void drive() {
		System.out.println( this + " is being driven by "+ driver);//.name + ", aged "+ driver.age);
		// Mercedes Benz is being driven by Ram , aged 32
	}
	@Override
	public String toString() {
		return model;
	}
}