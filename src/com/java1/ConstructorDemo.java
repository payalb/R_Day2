package com.java1;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		A obj= new B();
		obj.print();
	//	obj.print(4);
	}
	
}
//Overloading
class A{
public void print(){
System.out.println(1);
}
}
class B extends A{
public void print(int a){
System.out.println(a);
}
}
