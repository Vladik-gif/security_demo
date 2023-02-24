package uk.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    private static final String USER = "/user";
    private static final String ADMIN = "/admin";

    @GetMapping
    public String index(){
        log.info("log: index");
        return "Hello world";
    }

    @GetMapping(USER)
    public String user(){
        log.info("log: user");
        return "Hello, User!";
    }

    @GetMapping(ADMIN)
    public String admin(){
        log.info("log: admin");
        return "Hello, Admin!";
    }



}
