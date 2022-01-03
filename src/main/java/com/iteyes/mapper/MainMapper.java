package com.iteyes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.MainDTO;
import com.iteyes.dto.pms.SWZP9000DTO;

@Mapper
public interface MainMapper {
	List<String> select_0000_01() throws Exception;
	List<MainDTO> select_0120_01(MainDTO mainDto) throws Exception;
	List<SWZP9000DTO> select_9000_01(SWZP9000DTO swzp9000Dto) throws Exception;
}
