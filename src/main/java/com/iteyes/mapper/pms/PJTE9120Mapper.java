package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9120DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9120Mapper {
	/* 헤더콤보박스 */
	List<PJTE9120DTO> select_0000_01(PJTE9120DTO PJTE9120) throws Exception;
	/* 게시내역조회 */
	List<PJTE9120DTO> select_9120_01(PJTE9120DTO PJTE9120) throws Exception;
	/* 답글내역조회 */
	List<PJTE9120DTO> select_9120_02(PJTE9120DTO PJTE9120) throws Exception;
}
