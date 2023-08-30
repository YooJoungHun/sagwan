package com.elonsoft.sagwan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.elonsoft.sagwan.dtos.DeptDto;
import com.elonsoft.sagwan.service.TestService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class Test {
	private final TestService testService;
	
	@GetMapping(value = "/")
	public String test() {
		
		return "employee/test";
	}
	
	@GetMapping(value = "/dept")
	public String test2(DeptDto deptDto) {
		log.info("deptDto : "+deptDto);
		int result = testService.insert(deptDto);
		log.info("result : "+result);
		return "employee/test";
	}
	
}
