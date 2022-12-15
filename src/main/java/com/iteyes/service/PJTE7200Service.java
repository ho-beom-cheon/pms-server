package com.iteyes.service;

import com.iteyes.dto.pms.PJTE7200DTO;

import java.util.List;

public interface PJTE7200Service {
	List<PJTE7200DTO> select_7200_01(PJTE7200DTO PJTE7200) throws Exception ;
	List<PJTE7200DTO> select_7200_02(PJTE7200DTO PJTE7200) throws Exception ;
	List<PJTE7200DTO> select_7200_03(PJTE7200DTO PJTE7200) throws Exception ;

	boolean insert_7200_01(PJTE7200DTO PJTE7200) throws Exception;

	boolean insert_7200_02(PJTE7200DTO PJTE7200) throws Exception;

	boolean update_7200_01(PJTE7200DTO PJTE7200) throws Exception;



	/*삭제*/
	boolean delete_7200_01(PJTE7200DTO PJTE7200) throws Exception ;
}
