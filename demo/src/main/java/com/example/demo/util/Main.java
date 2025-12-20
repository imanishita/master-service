package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component
public class Main {
    private static final String HELLO_MESSAGE = "Hello, Java!";

    public String util() {
        return HELLO_MESSAGE;
    }

}
