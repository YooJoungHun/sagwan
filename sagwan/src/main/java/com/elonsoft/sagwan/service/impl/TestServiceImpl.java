package com.elonsoft.sagwan.service.impl;

import org.springframework.stereotype.Service;

import com.elonsoft.sagwan.dtos.DeptDto;
import com.elonsoft.sagwan.repository.TestRepository;
import com.elonsoft.sagwan.service.TestService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestServiceImpl implements TestService{
	
	private final TestRepository testRepository;

	@Override
	public int insert(DeptDto deptDto) {
		log.info("service : "+deptDto.toString());
		int result = testRepository.insert(deptDto);
		
		return result;
	}
	
}
