package com.spring.rest.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Inject
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
        auth
        .inMemoryAuthentication()
	    	.withUser("user").password("password").roles("USER").and()
	    	.withUser("support").password("password").roles("USER", "SUPPORT").and()
	        .withUser("admin").password("password").roles("USER", "ADMIN");
    }

    @Configuration 
	@Order(1)
	static class SupportConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {		
			http
		        .antMatcher("/support/**")
		        .authorizeRequests()
		        .anyRequest().hasRole("SUPPORT")
		        .and()
		      .httpBasic()
		      	.and()
		      	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);	
		}
	}
	
	@Configuration 
	@Order(2)
	static class AuthenticatedConfig extends WebSecurityConfigurerAdapter {	
		@Override
		protected void configure(HttpSecurity http) throws Exception {		
			http
				.antMatcher("/api/**")
				.authorizeRequests()
				.anyRequest().hasRole("ADMIN")
		        .and()
		      .httpBasic()
		      	.and()
		      	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);	
		}
		
	}	

	@Configuration 
	@Order(3)
	static class NonAuthenticatedConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {		
            http
            	.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin();		
        }
	}


}
