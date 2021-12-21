//package com.iteyes.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//import com.iteyes.service.MainService;
//
//import lombok.extern.log4j.Log4j2;
//
//@Configuration
//@EnableWebSecurity
//@Log4j2
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private MainService mainService;
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//	    web
//	    	.ignoring()
//	    		.antMatchers("/img/**", "/css/**", "/webjars/**", "/lib/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//	    http
//			.authorizeRequests()
//			.antMatchers("/", "/login", "/index").permitAll()
//			.anyRequest().authenticated()
//			.and()
//	        .formLogin()
//	        	.loginPage("/login")
//	        	.loginProcessingUrl("/login")
//	        	.successForwardUrl("/index")
//	        	.failureForwardUrl("/loginError")
//	        .and()
//	        .logout()
//	        	.logoutSuccessUrl("/login")
//	    		.invalidateHttpSession(true)
//	    	.and()
//	        .csrf()
//            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//	}
//
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() throws UsernameNotFoundException{
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("1")
//				.password("1")
//				.roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
//}
