package com.iteyes.service;

import com.iteyes.dto.pms.PJTE7000DTO;

import java.util.List;

public interface PJTE7000Service {
	List<PJTE7000DTO> select_7000_01(PJTE7000DTO PJTE7000) throws Exception ;
	List<PJTE7000DTO> select_7000_02(PJTE7000DTO PJTE7000) throws Exception ;
	List<PJTE7000DTO> select_7000_03(PJTE7000DTO PJTE7000) throws Exception ;

	boolean delete_7000_01(PJTE7000DTO PJTE7000) throws Exception;
	boolean insert_7000_01(PJTE7000DTO PJTE7000) throws Exception;

	List<PJTE7000DTO> select_7000_04(PJTE7000DTO PJTE7000) throws Exception;
	List<PJTE7000DTO> select_7000_05(PJTE7000DTO PJTE7000) throws Exception;
}
