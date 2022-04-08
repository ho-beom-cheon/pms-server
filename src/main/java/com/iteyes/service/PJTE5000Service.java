package com.iteyes.service;

import java.util.Arrays;
import java.util.List;

import com.iteyes.dto.pms.PJTE5000DTO;

public interface PJTE5000Service {
	List<PJTE5000DTO> select_5000_01(PJTE5000DTO PJTE5000) throws Exception ;

	boolean insert_5000_01(PJTE5000DTO pjte5000) throws Exception;
	boolean update_5000_01(PJTE5000DTO pjte5000) throws Exception;
	boolean delete_5000_01(PJTE5000DTO pjte5000) throws Exception;
}
