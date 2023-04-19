package com.study.springsecurity.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageEndpoint {

    @GetMapping
    String notAuthenticated() {
        return "You are not authenticated";
    }

    @GetMapping("user")
    String user() {
        return "You are a user";
    }

    @GetMapping("admin")
    String admin() {
        return "You are an admin";
    }
}
