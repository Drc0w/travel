package org.acme.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class TravelApplication {


    public static void main(String[] args){
        SpringApplication.run(TravelApplication.class,args);
    }
}
