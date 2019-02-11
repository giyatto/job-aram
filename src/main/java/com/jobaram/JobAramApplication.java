package com.jobaram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.jobaram.config.SiteMeshFilter;


@SpringBootApplication
public class JobAramApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAramApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new SiteMeshFilter()); 
		return filter;
	}
	
}
