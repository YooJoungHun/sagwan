package com.elonsoft.sagwan.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDto {
	private String id;
	private String password;
	private String name;
	private String gender;
	private String birth;
	private String tel;
	private String address;
	private String agreement;
	private String hireDate;
	private String salary;
	private String resignDate;
	private String continuousYn;
}
