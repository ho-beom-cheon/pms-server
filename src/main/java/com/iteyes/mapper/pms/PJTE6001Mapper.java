package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE6001DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE6001Mapper {
	List<PJTE6001DTO> select_6001_01(PJTE6001DTO PJTE6001) throws Exception;
	boolean insert_6001_01(PJTE6001DTO PJTE6001) throws Exception;
	boolean update_6001_01(PJTE6001DTO PJTE6001) throws Exception;
	List<PJTE6001DTO> select_6001_02(PJTE6001DTO PJTE6001) throws Exception;


}
