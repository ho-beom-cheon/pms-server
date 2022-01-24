package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE6000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE6000Mapper {
	List<PJTE6000DTO> select_6000_01(PJTE6000DTO PJTE6000) throws Exception;

}
