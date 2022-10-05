package com.MockServer;

import org.springframework.beans.factory.annotation.Value;
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
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${Admin_username}")
    String Admin_username;
    @Value("${Admin_password}")
    String Admin_password;

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser(Admin_username).password(passwordEncoder().encode(Admin_password)).roles("Admin");

    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login*").permitAll()
                .antMatchers("/ws**").permitAll()
                .antMatchers("/CSS/*").permitAll()
                .antMatchers("/images/*").permitAll()
                .antMatchers("/*.js").permitAll()
                .anyRequest().authenticated()
                .and().formLogin()
                .loginPage("/login.html").defaultSuccessUrl("/index.html")
                .failureUrl("/login.html?error=1").loginProcessingUrl("/login")
                .permitAll().and().logout();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}