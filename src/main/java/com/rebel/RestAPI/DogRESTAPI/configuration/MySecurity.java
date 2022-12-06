package com.rebel.RestAPI.DogRESTAPI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication()
               .withUser("admin")
               .password(getEncodedPass().encode("cordword"))
               .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.
              csrf().disable()
              .authorizeRequests()
              .anyRequest()
              .authenticated()
              .and()
              .httpBasic();
    }

    @Bean
    public PasswordEncoder getEncodedPass()
    {
        return new BCryptPasswordEncoder();

    }
}
