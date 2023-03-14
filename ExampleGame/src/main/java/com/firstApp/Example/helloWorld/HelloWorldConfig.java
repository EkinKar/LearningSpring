package com.firstApp.Example.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name() {
        return "Ekin";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 23, new Address("Main", "Sevilla"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker st.", "London");
    }
}
