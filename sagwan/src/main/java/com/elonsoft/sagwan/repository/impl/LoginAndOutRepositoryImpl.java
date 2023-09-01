package com.elonsoft.sagwan.repository.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.elonsoft.sagwan.dtos.EmpDto;
import com.elonsoft.sagwan.repository.LoginAndOutRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class LoginAndOutRepositoryImpl implements LoginAndOutRepository {
	
	private final SqlSession sqlSession;

	@Override
	public int insertEmpByEmpDto(EmpDto empDto) {
		log.info("LoginAndOutRepository insertEmpByEmpDto() start");
		int result = 0;
		
		try {
			result = sqlSession.insert("insertEmpByEmpDto", empDto);
		} catch (Exception e) {
			log.debug("LoginAndOutRepository insertEmpByEmpDto() Exception : " + e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}
}
