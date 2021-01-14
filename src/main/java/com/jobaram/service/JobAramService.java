package com.jobaram.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobAramService {

	@Bean
	public Object getStudentInfo() {
		
		Map<String, Object> result = new HashMap<>();
        Map<Long, Object> parentCatInfoMap = new HashMap<>();
        Map<Long, List<Object>> catInfoMap = new HashMap<>();
        

		return result;
	}

}
