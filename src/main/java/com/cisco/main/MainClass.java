package com.cisco.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {

    public static void main(final String[] args) {
        SpringApplication.run(MainClass.class);

        // Observable  .just('R', 'x', 'J', 'a', 'v', 'a')  .subscribe(    System.out::print,    System.out::println,    System.out::println  );

        //Observable.just("Hello").subscribe(System.out::println);
    }
    
}
