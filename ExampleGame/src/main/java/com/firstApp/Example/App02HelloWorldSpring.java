package com.firstApp.Example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        // Configure the thing that we want spring to manage @Configuration

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person3Parameters"));

    }
}
