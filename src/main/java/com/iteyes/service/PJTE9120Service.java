package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9120DTO;

import java.util.List;

public interface PJTE9120Service {
	/* 헤더콤보박스 */
	List<PJTE9120DTO> select_0000_01(PJTE9120DTO PJTE9120) throws Exception ;
	/* 게시내역조회 */
	List<PJTE9120DTO> select_9120_01(PJTE9120DTO PJTE9120) throws Exception ;
	/* 답글내역조회 */
	List<PJTE9120DTO> select_9120_02(PJTE9120DTO PJTE9120) throws Exception;
	/* 조회수수정 */
	boolean update_9120_01(PJTE9120DTO PJTE9120) throws Exception;
	/* 댓글내역조회 */
	List<PJTE9120DTO> select_9120_03(PJTE9120DTO PJTE9120) throws Exception;
	/* 게시정보등록 */
	boolean insert_9120_01(PJTE9120DTO PJTE9120C) throws Exception;
	/* 게시정보삭제 */
	boolean delete_9120_01(PJTE9120DTO PJTE9120D) throws Exception;
	/* 답글정보등록 */
	boolean insert_9120_02(PJTE9120DTO PJTE9120C) throws Exception;
	/* 답글정보삭제 */
	boolean delete_9120_02(PJTE9120DTO PJTE9120D) throws Exception;
	/* 댓글정보등록 */
	boolean insert_9120_03(PJTE9120DTO PJTE9120C) throws Exception;
	/* 댓글정보삭제 */
	boolean delete_9120_03(PJTE9120DTO PJTE9120D) throws Exception;
}
