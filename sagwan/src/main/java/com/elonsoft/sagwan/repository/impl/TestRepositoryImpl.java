package com.elonsoft.sagwan.repository.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.elonsoft.sagwan.dtos.DeptDto;
import com.elonsoft.sagwan.repository.TestRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class TestRepositoryImpl implements TestRepository {
	
	private final SqlSession sqlSession;

	@Override
	public int insert(DeptDto deptDto) {
		log.info("repository : "+deptDto.toString());
		int result = sqlSession.insert("testInsert", deptDto);
		
		return result;
	}
}
