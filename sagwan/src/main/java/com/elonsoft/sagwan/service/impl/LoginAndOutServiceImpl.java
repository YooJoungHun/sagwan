package com.elonsoft.sagwan.service.impl;

import org.springframework.stereotype.Service;

import com.elonsoft.sagwan.dtos.EmpDto;
import com.elonsoft.sagwan.repository.LoginAndOutRepository;
import com.elonsoft.sagwan.service.LoginAndOutService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginAndOutServiceImpl implements LoginAndOutService{
	
	private final LoginAndOutRepository loginAndOutRepository;

	@Override
	public String addEmpByEmpDto(EmpDto empDto) {
		log.info("LoginAndOutService addEmpByEmpDto() start");
		int result = loginAndOutRepository.insertEmpByEmpDto(empDto);
		String returnMsg = "";
		
		if(result <= 0) {
			returnMsg = "<script>alert('회원가입에 실패하였습니다'); location.href='/signup';</script>";
		} else {
			returnMsg = "<script>alert('회원가입이 성공적으로 완료되었습니다!'); location.href='/login';</script>";
		}
		
		return returnMsg;
	}
	
}
