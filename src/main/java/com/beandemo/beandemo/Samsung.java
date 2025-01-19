package com.beandemo.beandemo;

import org.springframework.stereotype.Component;

@Component
public class Samsung {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Samsung [phone=" + phone + "]";
    }
    
    
}
