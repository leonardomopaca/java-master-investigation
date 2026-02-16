package com.spring.components;

import com.spring.interfaces.Sim;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("Jio calling");
    }

    @Override
    public void data() {
        System.out.println("Jio data");
    }
}
