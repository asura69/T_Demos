package com.demo.di_con;

public class HumanResourse implements Employee {

	public HumanResourse() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" HR Construtor");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println(" woking as a  Human Resources manager and convert human into resources .... ");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
System.out.println(" Office paid to HR 60000 rs per/month");
	}

}
