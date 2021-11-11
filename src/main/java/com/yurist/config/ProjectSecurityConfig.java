package com.yurist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/myAccount").authenticated()
                .antMatchers("/myCards").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/myLoans").authenticated()
                .antMatchers("/notices").permitAll()
                .antMatchers("/contact").permitAll()
                .and()
                .formLogin().and()
                .httpBasic();
    }

    /*@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("12345").authorities("admin").and()
                .withUser("user").password("12345").authorities("read").and()
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }*/

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/h2-console/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        UserDetails user = User.withUsername("admin").password("12345").authorities("admin").build();
        UserDetails user1 = User.withUsername("user").password("12345").authorities("read").build();
        userDetailsManager.createUser(user);
        userDetailsManager.createUser(user1);
        auth.userDetailsService(userDetailsManager);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
