package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9000DTO;

import java.util.List;

public interface PJTE9000Service {
	//그리드 1,2,3 조회
	List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception ;
	List<PJTE9000DTO> select_9000_02(PJTE9000DTO PJTE9000) throws Exception ;
	List<PJTE9000DTO> select_9000_03(PJTE9000DTO PJTE9000) throws Exception ;

	// 그리드 1 insert, update
	boolean insert_9000_01(PJTE9000DTO PJTE9000) throws Exception;
	boolean update_9000_01(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 2 insert, update
	boolean insert_9000_03(PJTE9000DTO PJTE9000) throws Exception;
	boolean update_9000_02(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 3 delete, insert
	boolean delete_9000_01(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_02(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 4 select
	List<PJTE9000DTO> select_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	// 그리드 4 신규생선년도 delete, insert
	boolean delete_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	// 그리드 4 저장부분 delete, insert
	boolean delete_9000_51(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_51(PJTE9000DTO PJTE9000) throws Exception;
}
