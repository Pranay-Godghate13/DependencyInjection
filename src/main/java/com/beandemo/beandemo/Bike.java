package com.beandemo.beandemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public void drive()
    {
        System.out.println("Lets ride the bike");
    }
}
