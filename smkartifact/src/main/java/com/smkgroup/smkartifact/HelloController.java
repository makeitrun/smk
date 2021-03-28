package com.smkgroup.smkartifact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public Object hello() {
        return "helloshiyu";
    }
}
