package com.elonsoft.sagwan.repository;

import com.elonsoft.sagwan.dtos.EmpDto;

public interface LoginAndOutRepository {
	int insertEmpByEmpDto(EmpDto empDto);

}
