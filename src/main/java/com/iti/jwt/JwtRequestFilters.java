package com.iti.jwt;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.iti.service.UserService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtRequestFilters extends OncePerRequestFilter {
	
	@Autowired private UserService userDetailsService;
	@Autowired private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authorizationHeader = request.getHeader("Authorization");
		System.out.println("Authorization=>"+authorizationHeader);
		String requestUri=request.getServletContext().getContextPath()+request.getServletPath();
		if(requestUri.equalsIgnoreCase("/api/authneticate")) {}
		else {
		System.out.println("requestUri"+requestUri);
		System.out.println("sjfljasf=> "+SecurityContextHolder.getContext().getAuthentication());
		String username = null;
		String jwt = null;
		
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			jwt = authorizationHeader.substring(7);
			username = jwtUtil.extractUsername(jwt);
			System.out.println("username=> "+username);
		}
		
		
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			System.out.println("username != null");
			
			UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			
			if (jwtUtil.validToken(jwt, userDetails)) {
				System.out.println("valid Token=> authority=> "+userDetails.getAuthorities());
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
			
		}
		}
		filterChain.doFilter(request, response);
	}

}

