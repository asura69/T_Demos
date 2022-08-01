package com.org.auto;

import org.springframework.stereotype.Component;

@Component
public class BookerAward implements Award {

	@Override
	public void award() {
		// TODO Auto-generated method stub
    System.out.println("You Got booker prize...");
	}

}
