package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9000DTO;

import java.util.List;

public interface PJTE9000Service {
	//그리드 1,2,3 조회
	List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception ;
	List<PJTE9000DTO> select_9000_02(PJTE9000DTO PJTE9000) throws Exception ;
	List<PJTE9000DTO> select_9000_03(PJTE9000DTO PJTE9000) throws Exception ;

	// 그리드 1 insert, update, delete
	boolean insert_9000_01(PJTE9000DTO PJTE9000) throws Exception;
	boolean update_9000_01(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_41(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 2 insert, update, delete
	boolean insert_9000_03(PJTE9000DTO PJTE9000) throws Exception;
	boolean update_9000_02(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_42(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 3 delete, insert
	boolean delete_9000_01(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_02(PJTE9000DTO PJTE9000) throws Exception;

	//신규 프로젝트 추가시 데이터 복사(delete 후 insert)
	boolean delete_9000_90(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_91(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_92(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_93(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_94(PJTE9000DTO PJTE9000) throws Exception;

	boolean insert_9000_90(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_91(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_92(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_93(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_94(PJTE9000DTO PJTE9000) throws Exception;

	// 그리드 4 select
	List<PJTE9000DTO> select_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	// 그리드 4 신규생선년도 delete, insert
	boolean delete_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_50(PJTE9000DTO PJTE9000) throws Exception;
	// 그리드 4 저장부분 update
	boolean update_9000_50(PJTE9000DTO PJTE9000) throws Exception;

	boolean delete_9000_51(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_51(PJTE9000DTO PJTE9000) throws Exception;

	// 테이블 백업 관련 쿼리
	// 백업 ID 조회
	List<PJTE9000DTO> select_9000_10(PJTE9000DTO PJTE9000) throws Exception ;
	// 이전생성된 백업ID 삭제, 백업ID 채번
	boolean delete_9000_10(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_10(PJTE9000DTO PJTE9000) throws Exception;
	// 이미 생성된 백업데이터 삭제
	boolean delete_9000_20(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_22(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_23(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_24(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_25(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_26(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_27(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_28(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_31(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_32(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_33(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_35(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_36(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_60(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_61(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_62(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_63(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_64(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_65(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_66(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_67(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_68(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_69(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_70(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_71(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_72(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_73(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_74(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_75(PJTE9000DTO PJTE9000) throws Exception;
	boolean delete_9000_76(PJTE9000DTO PJTE9000) throws Exception;

	// 데이터 백업
	boolean insert_9000_20(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_22(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_23(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_24(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_25(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_26(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_27(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_28(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_31(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_32(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_33(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_35(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_36(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_60(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_61(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_62(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_63(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_64(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_65(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_66(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_67(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_68(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_69(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_70(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_71(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_72(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_73(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_74(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_75(PJTE9000DTO PJTE9000) throws Exception;
	boolean insert_9000_76(PJTE9000DTO PJTE9000) throws Exception;
}
