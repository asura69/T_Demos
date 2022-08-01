package com.org.tav.anno;

import org.springframework.stereotype.Component;

@Component
public class HumanResourse implements Employee {

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
