package it.uiip.digitalgarage.roboadvice.config;

import it.uiip.digitalgarage.roboadvice.service.util.JWTFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configurable
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/",
                                         "/index.html",
										 "/assets/**",
										 "/node_modules/**",
										 "/inline.bundle.js",
										 "/main.bundle.js",
										 "/polyfills.bundle.js",
										 "/scripts.bundle.js",
										 "/styles.bundle.js",
										 "/vendor.bundle.js",
										 "/0.chunk.js",
										 "/1.chunk.js",
										 "/2.chunk.js",
										 "/3.chunk.js",
										 "/4.chunk.js",
										 "/5.chunk.js",
										 "/6.chunk.js",
                                         "/html/**",
                                         "/js/**",
                                         "/css/**",
                                         "/img/**",
                                         "/fonts/**",
                                         "/registerUser", 
                                         "/loginUser");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().fullyAuthenticated().and()
                .addFilterBefore(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
                .httpBasic().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .csrf().disable().cors().configure(http);
    }



}
