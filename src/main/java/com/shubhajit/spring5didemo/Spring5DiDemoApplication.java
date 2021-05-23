package com.shubhajit.spring5didemo;

import com.shubhajit.spring5didemo.controllers.MyController;
import com.shubhajit.spring5didemo.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring5DiDemoApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println(myController.hello());

        System.out.println(applicationContext.getBean(GreetingServiceImpl.class).sayGreeting());
    }

}
