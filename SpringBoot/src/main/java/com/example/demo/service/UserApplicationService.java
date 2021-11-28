package com.example.demo.service;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {
	
	@Autowired
	private MessageSource messageSourge;

	public Map<String, Integer> genderMap(Locale locale) {
		Map<String, Integer> genderMap = new LinkedHashMap<>();
		
		String male = messageSourge.getMessage("male", null, locale);
		String female = messageSourge.getMessage("female", null, locale);
		
		genderMap.put(male, 1);
		genderMap.put(female, 2);
		
		return genderMap;
	}
	
}
