package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9400DTO;

import java.util.List;

public interface PJTE9400Service {
	/*그리드1 조회*/
	List<PJTE9400DTO> select_9400_01(PJTE9400DTO PJTE9400) throws Exception ;

	/*등록*/
	boolean insert_9400_01(PJTE9400DTO PJTE9400) throws Exception ;

	/*수정*/
	boolean update_9400_01(PJTE9400DTO PJTE9400) throws Exception ;

	/*수정*/
	boolean update_9400_02(PJTE9400DTO PJTE9400) throws Exception ;
}
