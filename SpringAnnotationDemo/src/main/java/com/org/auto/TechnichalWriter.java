package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnichalWriter implements Writer {

	@Autowired
	@Qualifier("pul")
	private Award award;
	
	

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write technichal stuffs....");

	}

	@Override
	public void getAward() {
		// TODO Auto-generated method stub
award.award();
	}

}
