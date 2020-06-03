package io.anthonykim.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableWebSecurity
@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2AuthorizationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2AuthorizationServerApplication.class, args);
    }
}

