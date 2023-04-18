package com.adwait.project.employeeservice.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.context.config.annotation.*;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
public class MessageController {

    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("message")
    public String message() {
        return message;
    }
}
