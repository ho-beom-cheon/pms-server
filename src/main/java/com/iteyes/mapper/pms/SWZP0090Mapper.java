package com.iteyes.mapper.pms;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.SWZP0090DTO;

@Mapper
public interface SWZP0090Mapper {
	List<SWZP0090DTO> select_0090_01() throws Exception;
}
