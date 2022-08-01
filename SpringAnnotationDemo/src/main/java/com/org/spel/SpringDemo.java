package com.org.spel;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String confFile ="Bean.xml";
	        ConfigurableApplicationContext context 
	                                    = new ClassPathXmlApplicationContext(confFile);
	        PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway");
	        gateway.processOrder();
	}

}
