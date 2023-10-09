package com.iti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.iti.jwt.JwtRequestFilters;
import com.iti.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserService userDetailsService;
	
	@Autowired
	private JwtRequestFilters jwtRequestFilters;
	
	@Bean
	public CustomPasswordEncoder bcrypPasswordEncoder() {
		return new CustomPasswordEncoder();
	}
	@Bean
	DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(bcrypPasswordEncoder());
		daoAuthenticationProvider.setUserDetailsService(userDetailsService);
		return daoAuthenticationProvider;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
		.csrf()
		.disable()
		.authorizeHttpRequests()
		.requestMatchers("/api/**")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authenticationProvider(daoAuthenticationProvider())
		.addFilterAfter(jwtRequestFilters, UsernamePasswordAuthenticationFilter.class);
		
		
		
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) 
	         throws Exception {
	    return authenticationConfiguration.getAuthenticationManager();
	}
	
}
