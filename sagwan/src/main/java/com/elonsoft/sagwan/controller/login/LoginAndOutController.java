package com.elonsoft.sagwan.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elonsoft.sagwan.dtos.EmpDto;
import com.elonsoft.sagwan.service.LoginAndOutService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginAndOutController {
	private final LoginAndOutService loginAndOutService;
	
	@GetMapping(value = "/")
	public String main() {
		log.info("LoginAndOutController main() start");
		
		return "login/main";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		log.info("LoginAndOutController login() start");
		
		return "login/log-in";
	}
	
	@GetMapping(value = "/signup")
	public String signUp() {
		log.info("LoginAndOutController signUp() start");
		
		return "login/sign-up";
	}
	
	@ResponseBody
	@PostMapping(value = "/signup")
	public String empAddByEmpDto(EmpDto empDto) {
		log.info("LoginAndOutController empAddByEmpDto() start");
		log.info("EmpDto : " + empDto.toString());
		
		String returnMsg= loginAndOutService.addEmpByEmpDto(empDto);
			
		return returnMsg;
		
	}
}
