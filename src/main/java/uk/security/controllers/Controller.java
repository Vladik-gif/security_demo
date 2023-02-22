package uk.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String USER = "/user";
    private static final String ADMIN = "/admin";

    @GetMapping
    public String index(){
        return "Hello world";
    }

    @GetMapping(USER)
    public String user(){
        return "Hello, User!";
    }

    @GetMapping(ADMIN)
    public String admin(){
        return "Hello, Admin!";
    }



}
