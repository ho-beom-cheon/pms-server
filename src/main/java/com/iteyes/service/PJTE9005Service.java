package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9005DTO;

import java.util.List;

public interface PJTE9005Service {
	/*그리드1 조회*/
	List<PJTE9005DTO> select_9005_01(PJTE9005DTO PJTE9005) throws Exception ;
	/*인적사항 조회*/
	List<PJTE9005DTO> select_9005_02(PJTE9005DTO PJTE9005) throws Exception ;
	/*그리드2 조회*/
	List<PJTE9005DTO> select_9005_03(PJTE9005DTO PJTE9005) throws Exception ;
	/*그리드3 조회*/
	List<PJTE9005DTO> select_9005_04(PJTE9005DTO PJTE9005) throws Exception ;
	/*등록*/
	boolean insert_9005_01(PJTE9005DTO PJTE9005) throws Exception ;
	boolean insert_9005_02(PJTE9005DTO PJTE9005) throws Exception ;
	boolean insert_9005_03(PJTE9005DTO PJTE9005) throws Exception ;
	/*삭제*/
	boolean delete_9005_01(PJTE9005DTO PJTE9005) throws Exception ;
	boolean delete_9005_02(PJTE9005DTO PJTE9005) throws Exception ;
	boolean delete_9005_03(PJTE9005DTO PJTE9005) throws Exception ;
}
