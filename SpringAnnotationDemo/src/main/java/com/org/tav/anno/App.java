package com.org.tav.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Manager emp = con.getBean(Manager.class);
        
        emp.doWork();
        emp.getSalary();
    }
}
