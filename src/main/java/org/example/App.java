package org.example;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        ViewStudent student = context.getBean(ViewStudent.class);
        student.displayStudent();

        ViewResult result=context.getBean(ViewResult.class);
        result.displayResult();

    }
}
