package com.kabgig.jenkinsTestProject1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class helloworld {
    @Bean
    public void print(){
        System.out.println("Hello madafakas yeah!!!!!");
        System.out.println("AUTO POLLING TEST 4");
    }
}
