package com.org.tav.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("Bean.xml");
        
        HelloWorldService hello = con.getBean("hellobean" ,HelloWorldService.class);
       Vendor1 h1 = con.getBean("win" ,Vendor1.class);
       Vendor2 h2 = con.getBean("door" ,Vendor2.class);
        
        hello.hello();
        h1.build();
        h2.buildDoor();
       
    }
}
