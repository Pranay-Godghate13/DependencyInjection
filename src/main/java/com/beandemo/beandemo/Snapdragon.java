package com.beandemo.beandemo;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

    @Override
    public void processor() {
        // TODO Auto-generated method stub
        System.out.println("I am snapdragon processor");
    }
    
}
