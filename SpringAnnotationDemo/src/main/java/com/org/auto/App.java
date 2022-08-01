package com.org.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);

Writer writer = con.getBean("fictionWriter" , Writer.class);


writer.write();
writer.getAward();
con.close();

	}

}
