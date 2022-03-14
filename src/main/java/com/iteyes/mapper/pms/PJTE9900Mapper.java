package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9900DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9900Mapper {
	/*콤보박스*/
	List<PJTE9900DTO> select_0000_01(PJTE9900DTO PJTE9900) throws Exception;
	/*조회*/
	List<PJTE9900DTO> select_9900_01(PJTE9900DTO PJTE9900) throws Exception;
	/*연관작업조회*/
	List<PJTE9900DTO> select_9900_02(PJTE9900DTO PJTE9900) throws Exception;
	/*등록*/
	boolean insert_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*수정*/
	boolean update_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
	/*삭제*/
	boolean delete_9900_01(PJTE9900DTO PJTE9900) throws Exception ;
}
