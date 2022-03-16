package com.iteyes.service;

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
}
