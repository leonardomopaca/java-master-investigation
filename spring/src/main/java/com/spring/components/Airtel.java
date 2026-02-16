package com.spring.components;

import com.spring.interfaces.Sim;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel data");
    }
}
