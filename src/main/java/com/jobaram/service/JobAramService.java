package com.jobaram.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jobaram.dao.EsDao;
import com.jobaram.model.StudentInfo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobAramService {



	@Bean
	public Object getStudentInfo() {

		EsDao esDao = new EsDao();

        Map<Long, Object> parentCatInfoMap = new HashMap<>();
        Map<Long, List<Object>> catInfoMap = new HashMap<>();


		List<StudentInfo> result = esDao.getStudentInfoListByMultiGetQuery();

		return result;
	}

}
