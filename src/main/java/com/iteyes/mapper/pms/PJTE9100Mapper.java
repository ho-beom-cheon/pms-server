package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9100DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9100Mapper {
	/*그리드1 조회*/
	List<PJTE9100DTO> select_9100_01(PJTE9100DTO PJTE9100) throws Exception;

	/*등록*/
	boolean insert_9100_01(PJTE9100DTO PJTE9100) throws Exception ;

	/*수정*/
	boolean update_9100_01(PJTE9100DTO PJTE9100) throws Exception ;
}
