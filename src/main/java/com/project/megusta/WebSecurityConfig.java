package com.project.megusta;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll();
    }

    /*
     * look into session token (links are 1 line)
     * https://www.javadevjournal.com/spring/securing-a-restful-web-service-with-
     * spring-security/
     *
     * https://medium.com/better-programming/secure-a-spring-boot-rest-api-with-json
     * -web-token-reference-to-angular-integration-e57a25806c50
     *
     * look into Cors https://spring.io/guides/gs/rest-service-cors/
     */
}
