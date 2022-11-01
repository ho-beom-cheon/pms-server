package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9400DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9400Mapper {
	/*그리드1 조회*/
	List<PJTE9400DTO> select_9400_01(PJTE9400DTO PJTE9400) throws Exception;

	/*등록*/
	boolean insert_9400_01(PJTE9400DTO PJTE9400) throws Exception ;

	/*수정*/
	boolean update_9400_01(PJTE9400DTO PJTE9400) throws Exception ;

	/*수정*/
	boolean update_9400_02(PJTE9400DTO PJTE9400) throws Exception ;
}
