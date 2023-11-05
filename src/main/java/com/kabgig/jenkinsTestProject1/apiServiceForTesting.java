package com.kabgig.jenkinsTestProject1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiServiceForTesting {

    @GetMapping("/helloworld")
    public String helloworld(){
        return "Hello world!!!";
    }
}
