package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.dto.pms.PJTE9900DTO;

import java.util.List;

public interface PJTE9900Service {
	/*콤보박스*/
	List<PJTE9900DTO> select_0000_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*조회*/
	List<PJTE9900DTO> select_9900(PJTE9900DTO PJTE9900) throws Exception ;
	/*등록*/
	boolean insert_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*수정*/
	boolean update_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*삭제*/
	boolean delete_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*테이블백업*/
	List<PJTE9900DTO> select_9900_10(PJTE9900DTO PJTE9900) throws Exception ;
	// 이전생성된 백업ID 삭제, 백업ID 채번
	boolean delete_9900_10(PJTE9900DTO PJTE9900) throws Exception;
	boolean insert_9900_10(PJTE9900DTO PJTE9900) throws Exception;
	// 이미 생성된 백업데이터 삭제
	boolean delete_9900_20(PJTE9900DTO PJTE9900) throws Exception;
	// 데이터 백업
	boolean insert_9900_20(PJTE9900DTO PJTE9900) throws Exception;
}
