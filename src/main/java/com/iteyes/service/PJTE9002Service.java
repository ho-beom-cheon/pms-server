package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9002DTO;

import java.util.List;

public interface PJTE9002Service {
	List<PJTE9002DTO> select_9002_01(PJTE9002DTO PJTE9002) throws Exception ;
	boolean insert_9002_01(PJTE9002DTO PJTE9002) throws Exception ;

}
