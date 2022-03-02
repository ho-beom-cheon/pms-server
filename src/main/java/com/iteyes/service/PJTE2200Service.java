package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.pms.PJTE2200DTO;

public interface PJTE2200Service {
	List<PJTE2200DTO> select_2200_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*등록*/
	boolean insert_2200_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*수정*/
	boolean update_2200_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*삭제*/
	boolean delete_2200_01(PJTE2200DTO PJTE2200) throws Exception ;
}
