package com.iteyes.service;

import com.iteyes.dto.pms.PJTE6001DTO;

import java.util.List;

public interface PJTE6001Service {
	List<PJTE6001DTO> select_6001_01(PJTE6001DTO PJTE6001) throws Exception ;

	boolean insert_6001_01(PJTE6001DTO PJTE6001) throws Exception;
	boolean update_6001_01(PJTE6001DTO PJTE6001) throws Exception;
}
