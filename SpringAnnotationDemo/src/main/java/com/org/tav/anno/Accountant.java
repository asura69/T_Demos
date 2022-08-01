package com.org.tav.anno;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
     System.out.println(" Accountant Is hired too manage the all expenses of the company ");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
System.out.println(" Office paid to accountant 50000 rs per/month");
	}

}
