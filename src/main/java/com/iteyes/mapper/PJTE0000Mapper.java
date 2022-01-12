package com.iteyes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.PJTE0000DTO;
import com.iteyes.dto.pms.SWZP9000DTO;

@Mapper
public interface PJTE0000Mapper {
	List<String> select_0000_01() throws Exception;
	List<PJTE0000DTO> select_0120_01(PJTE0000DTO PJTE0000Dto) throws Exception;
	List<SWZP9000DTO> select_9000_01(SWZP9000DTO swzp9000Dto) throws Exception;
	boolean pw_change_0000(PJTE0000DTO user) throws Exception;
}
