package com.beandemo.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        // Vehicle obj=(Vehicle)context.getBean("bike");
        // obj.drive();
        // Tyre obj=new Tyre();
        // obj.setBrand("CEAT");
        //Tyre obj=(Tyre)context.getBean("tyre");
        //Car car=new Car();
        //car.drive();
        // Samsung s7=new Samsung();
        // s7.setPhone("S7");
        // System.out.println(s7);
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung obj=(Samsung)context.getBean("samsung");
        obj.phoneConfig();
    }
}
