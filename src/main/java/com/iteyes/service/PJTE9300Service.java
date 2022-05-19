package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9300DTO;

import java.util.List;

public interface PJTE9300Service {

	/* 요청인력내역 */
	List<PJTE9300DTO> select_9300_01(PJTE9300DTO PJTE9300) throws Exception;
	/* 대기인력내역 */
	List<PJTE9300DTO> select_9300_02(PJTE9300DTO PJTE9300) throws Exception;
	/* 투입현황등록 */
	boolean insert_9300_01(PJTE9300DTO PJTE9300) throws Exception;
	boolean update_9300_01(PJTE9300DTO PJTE9300) throws Exception;
	boolean update_9300_02(PJTE9300DTO PJTE9300) throws Exception;
	boolean update_9300_03(PJTE9300DTO PJTE9300) throws Exception;

}
