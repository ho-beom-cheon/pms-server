package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.pms.PJTE2200DTO;

public interface PJTE2200Service {
	List<PJTE2200DTO> select_0030_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*등록*/
	boolean insert_0030_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*수정*/
	boolean update_0030_01(PJTE2200DTO PJTE2200) throws Exception ;
	/*삭제*/
	boolean update_0030_02(PJTE2200DTO PJTE2200) throws Exception ;
}
