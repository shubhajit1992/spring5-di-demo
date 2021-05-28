package com.shubhajit.spring5didemo;

import com.shubhajit.spring5didemo.controllers.ConstructorInjectedController;
import com.shubhajit.spring5didemo.controllers.MyController;
import com.shubhajit.spring5didemo.controllers.PropertyInjectedController;
import com.shubhajit.spring5didemo.controllers.SetterInjectedController;
import com.shubhajit.spring5didemo.examplebeans.FakeDataSource;
import com.shubhajit.spring5didemo.examplebeans.FakeJmsBroker;
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

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = applicationContext.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
        System.out.println(fakeJmsBroker.getPassword());
        System.out.println(fakeJmsBroker.getUrl());
    }

}
