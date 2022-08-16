package com.iteyes.service;

import com.iteyes.dto.pms.PJTE7100DTO;

import java.util.List;

public interface PJTE7100Service {
	List<PJTE7100DTO> select_7100_01(PJTE7100DTO PJTE7100) throws Exception ;
	List<PJTE7100DTO> select_7100_02(PJTE7100DTO PJTE7100) throws Exception ;
	List<PJTE7100DTO> select_7100_03(PJTE7100DTO PJTE7100) throws Exception ;

	boolean update_7100_01(PJTE7100DTO PJTE7100) throws Exception;
	boolean update_7100_02(PJTE7100DTO PJTE7100) throws Exception;
	boolean insert_7100_01(PJTE7100DTO PJTE7100) throws Exception;


	/*삭제*/
	boolean delete_7100_01(PJTE7100DTO PJTE7100) throws Exception ;
}
