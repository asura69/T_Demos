package com.org.tav.anno;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println(" Manage  The Barnch Office and others employees too !!!!");

	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
   System.out.println(" Office paid to manager 90000 rs per/month ");
	}

}
