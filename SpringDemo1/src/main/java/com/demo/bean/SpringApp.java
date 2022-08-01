package com.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext con = new ClassPathXmlApplicationContext("Bean.xml");
     Employee e = (Employee) con.getBean("emp");
     
     System.out.println(" Employee ID : "+e.getId());
     
     System.out.println("----------------------------");
     
     System.out.println(" Employee Name : "+e.getName());
     
     System.out.println("--------------------------------");
     
     
     System.out.println(" Employee salary : "+e.getSalary());
     
     System.out.println("-----------------------------------");
     
     
	}

}
