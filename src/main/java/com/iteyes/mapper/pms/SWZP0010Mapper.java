package com.iteyes.mapper.pms;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.SWZP0010DTO;

@Mapper
public interface SWZP0010Mapper {
	List<String> select_0000_01() throws Exception;
	List<SWZP0010DTO> select_0010_01(SWZP0010DTO SWZP0010) throws Exception;
}
