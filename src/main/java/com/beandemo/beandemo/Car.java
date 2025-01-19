package com.beandemo.beandemo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive()
    {
        System.out.println("Let's drive the car");
    }
}
