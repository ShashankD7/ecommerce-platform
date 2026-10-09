package com.ecommerce.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration (this class can define beans) +
// @EnableAutoConfiguration (Boot configures things based on what's on the classpath, which is why starter-web gives you Tomcat and Jackson with no setup) +
// @ComponentScan (find @Component classes in this package and below).
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}