package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9310DTO;

import java.util.List;

public interface PJTE9310Service {
	/* 헤더콤보박스 */
	List<PJTE9310DTO> select_0000_01(PJTE9310DTO PJTE9310) throws Exception ;
	/* 투입현황조회 */
	List<PJTE9310DTO> select_9310_01(PJTE9310DTO PJTE9120) throws Exception ;

	/* 투입현황삭제 */
	boolean delete_9310_01(PJTE9310DTO PJTE9310D) throws Exception;
	/* 투입현황등록 */
	boolean insert_9310_01(PJTE9310DTO PJTE9310C) throws Exception;

}
