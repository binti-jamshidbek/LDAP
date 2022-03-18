package com.example.ldap_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@SpringBootApplication
@RestController
public class Ldap1Application {
    @RequestMapping("")
    public String home() {
        return "Home page";
    }
    public static void main(String[] args) {
        SpringApplication.run(Ldap1Application.class, args);


    }

}
