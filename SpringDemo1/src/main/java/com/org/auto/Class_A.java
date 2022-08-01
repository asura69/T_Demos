package com.org.auto;

public class Class_A {

	Class_B b;
	Class_B b1;

	public Class_A() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Class A construtor");
	}

public Class_B getB() {
		return b;
	}

	public void setB(Class_B b) {
		this.b = b;
	}

void print() {
	System.out.println(" Hello form Class A ");
}
	
public void display() {
	print();
	b.print();
}
}
