package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.pms.PJTE2100DTO;

public interface PJTE2100Service {
	/*콤보박스*/
	List<PJTE2100DTO> select_0000(PJTE2100DTO PJTE2100) throws Exception ;
	/*조회*/
	List<PJTE2100DTO> select_2100_01(PJTE2100DTO PJTE2100) throws Exception ;
	/*등록*/
	boolean insert_2100_01(PJTE2100DTO PJTE2100) throws Exception ;
	/*수정*/
	boolean update_2100_01(PJTE2100DTO PJTE2100) throws Exception ;
	/*삭제*/
	boolean update_2100_02(PJTE2100DTO PJTE2100) throws Exception ;
}
