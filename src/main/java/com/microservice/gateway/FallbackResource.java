package com.microservice.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackResource {

    @GetMapping("/employeeFallback")
    public String employeeFallback() {
        return "The employee service is down right now";
    }

    @GetMapping("/departmentFallback")
    public String departmentFallback() {
        return "The department service is down right now";
    }
}
