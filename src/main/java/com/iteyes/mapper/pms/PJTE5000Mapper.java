package com.iteyes.mapper.pms;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.PJTE5000DTO;

@Mapper
public interface PJTE5000Mapper {
	List<PJTE5000DTO> select_5000_01() throws Exception;
}
