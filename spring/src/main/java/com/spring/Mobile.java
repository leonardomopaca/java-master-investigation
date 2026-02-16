package com.spring;

import com.spring.interfaces.Sim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Autowired
    private Sim sim;

    public static void main(String[] args) {

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("beans.xml");
//        Sim sim = applicationContext.getBean("sim", Sim.class);
//        sim.calling();
//        sim.data();
    }
}
