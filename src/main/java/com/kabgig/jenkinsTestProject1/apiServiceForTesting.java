package com.kabgig.jenkinsTestProject1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiServiceForTesting {

    @GetMapping("/madafakas!")
    public String helloworld(){
        return "Hello madafakas!!!";
    }
}
