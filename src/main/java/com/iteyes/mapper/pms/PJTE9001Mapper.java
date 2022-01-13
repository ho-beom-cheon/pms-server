package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9001DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9001Mapper {
	List<PJTE9001DTO> select_9001_01(PJTE9001DTO PJTE9001) throws Exception;
}
