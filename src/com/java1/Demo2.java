package com.java1;

public class Demo2 {}
 interface I1{
	default void drive() {System.out.println(1);};
 }
 
 interface I3{
	default void drive() {System.out.println(2);};
 }
 
 class A1 implements I1, I3{
	 public void drive() {
		 
		 I1.super.drive();
	 };
 }
 
 
 interface I2 extends I1, I3{
	// void drive();
	 void play();
	 
	 default void drive() {
		 I1.super.drive();
	 }
 }
 
 class Car implements I2{

	@Override
	public void drive() {
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	 
 }