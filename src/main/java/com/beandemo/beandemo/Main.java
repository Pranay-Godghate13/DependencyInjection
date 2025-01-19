package com.beandemo.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        // Vehicle obj=(Vehicle)context.getBean("bike");
        // obj.drive();
        // Tyre obj=new Tyre();
        // obj.setBrand("CEAT");
        Tyre obj=(Tyre)context.getBean("tyre");
        System.out.println(obj);
    }
}
