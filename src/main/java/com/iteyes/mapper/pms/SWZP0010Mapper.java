package com.iteyes.mapper.pms;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.pms.SWZP0010DTO;

@Mapper
public interface SWZP0010Mapper {
	List<String> select_0000_01() throws Exception;
	List<SWZP0010DTO> select_0010_01(SWZP0010DTO SWZP0010) throws Exception;
	/*등록*/
	boolean insert_0010_01(SWZP0010DTO SWZP0010) throws Exception ;
	/*수정*/
	boolean update_0010_01(SWZP0010DTO SWZP0010) throws Exception ;
	/*삭제*/
	boolean update_0010_02(SWZP0010DTO SWZP0010) throws Exception ;
}
