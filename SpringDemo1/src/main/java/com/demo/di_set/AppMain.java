package com.demo.di_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext a = new ClassPathXmlApplicationContext("Bean.xml");
     
     Employee empObj = (Employee) a.getBean("emp1");
     empObj.showResult();
	}

}
