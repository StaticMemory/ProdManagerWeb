package com.prod.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
@RestController
@EnableAutoConfiguration
public class EndpointController {
    @RequestMapping(value="/")
    public String defaultFunction(){
        return "Hi";
    }
}
