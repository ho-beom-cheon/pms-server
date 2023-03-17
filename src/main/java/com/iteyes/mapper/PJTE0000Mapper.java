package com.iteyes.mapper;

import java.util.List;

import com.iteyes.dto.pms.PJTE2100DTO;
import com.iteyes.dto.pms.PJTE9000DTO;
import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.PJTE0000DTO;

@Mapper
public interface PJTE0000Mapper {
	List<String> select_0000_01() throws Exception;
	List<PJTE0000DTO> select_0120_01(PJTE0000DTO PJTE0000Dto) throws Exception;
	List<PJTE0000DTO> select_0120_02(PJTE0000DTO PJTE0000Dto) throws Exception;
	List<PJTE9000DTO> select_9000_01(PJTE9000DTO swzp9000Dto) throws Exception;
	boolean pw_change_0000(PJTE0000DTO user) throws Exception;

	boolean update_0000_01(PJTE0000DTO PJTE0000) throws Exception ;
}
