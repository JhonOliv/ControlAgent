package com.agentControl.controlAgent.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class JiraConnectionConfiguration {

	@Bean
	public BasicAuthRequestInterceptor BasicAuthRequestInterceptor(
	@Value("${jira.email}") String email, @Value("${jira.token}") String token) 
	{
		return BasicAuthRequestInterceptor(email, token);
	}
}
