package com.iteyes.mapper.pms;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.PJTE5000DTO;

@Mapper
public interface PJTE5000Mapper {
	List<PJTE5000DTO> select_5000_01(PJTE5000DTO PJTE5000) throws Exception;
	boolean insert_5000_01(PJTE5000DTO pjte5000) throws Exception;
	boolean delete_5000_01(PJTE5000DTO pjte5000) throws Exception;
}
