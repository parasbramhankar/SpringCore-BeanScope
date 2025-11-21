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
        ViewStudent student1=context.getBean(ViewStudent.class);

        student.displayStudent();

        System.out.println(student);
        System.out.println(student1);

        System.out.println(student1==student);

        ViewResult result=context.getBean(ViewResult.class);
        result.displayResult();

    }
}
