package com.trabalho.conf;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(WebSecurityConfig.class);

    private static SessionRegistry SR;

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/css/**",
                                               "/images/**",
                                               "/js/**");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(WebURIs.PUBLIC_URI).permitAll();
    }
}
