package com.beandemo.beandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    private String phone;

    @Autowired
    private Processor proc;

    

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

    public Processor getProc() {
        return proc;
    }



    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public void phoneConfig()
    {
        System.out.println(toString());
        proc.processor();
    }
    
    
}
