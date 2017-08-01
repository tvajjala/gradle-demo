package com.cisco.main;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rx.Observable;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
@SpringBootApplication
public class MainClass {
    
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class);
        
       // Observable  .just('R', 'x', 'J', 'a', 'v', 'a')  .subscribe(    System.out::print,    System.out::println,    System.out::println  );
        
        //Observable.just("Hello").subscribe(System.out::println);
    }
}
