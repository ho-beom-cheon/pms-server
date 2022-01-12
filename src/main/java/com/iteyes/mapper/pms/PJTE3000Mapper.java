package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE3000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE3000Mapper {
	List<PJTE3000DTO> select_0040_01(PJTE3000DTO PJTE3000) throws Exception;
}
