package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring-context.xml"});
        TestCon testCon =(TestCon)context.getBean("testCon");
        Integer id=testCon.getId();
        System.out.println(id);
        new Test().test();*/

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TestCon.class);
        TestCon testCon =(TestCon)context.getBean("testCon");
        testCon.teacher();
        System.out.println("1");
    }
}
