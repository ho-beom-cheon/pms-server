package com.iteyes.mapper.pms;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.SWZP0030DTO;

@Mapper
public interface SWZP0030Mapper {
	List<SWZP0030DTO> select_0030_01(SWZP0030DTO SWZP0030) throws Exception;
	/*등록*/
	boolean insert_0030_01(SWZP0030DTO SWZP0030) throws Exception ;
	/*수정*/
	boolean update_0030_01(SWZP0030DTO SWZP0030) throws Exception ;
	/*삭제*/
	boolean update_0030_02(SWZP0030DTO SWZP0030) throws Exception ;
}
