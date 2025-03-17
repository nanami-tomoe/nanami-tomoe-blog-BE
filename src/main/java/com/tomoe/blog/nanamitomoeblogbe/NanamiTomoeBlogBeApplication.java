package com.tomoe.blog.nanamitomoeblogbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class NanamiTomoeBlogBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NanamiTomoeBlogBeApplication.class, args);
    }

}
