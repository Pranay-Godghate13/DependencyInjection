package com.beandemo.beandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    Tyre tyre;
    
    public void drive()
    {
        System.out.println("Let's drive the car with tyre "+tyre);
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    
    
}
