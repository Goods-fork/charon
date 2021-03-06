package io.github.harvies.charon.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CharonSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(CharonSpringBootApplication.class, args);
    }

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }
}
