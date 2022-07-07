package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE5000DTO {
	private String login_emp_no;			// 직원번호
	private String login_proj_id;           // 프로젝트 ID
	private String login_bzcd;              // 업무구분
	private String login_aut_cd;            // 권한 ID

	private String bkup_id;                 // 백업id
	private String prjt_id;                 // 프로젝트id
	private String mng_cd;                  //관리구분코드
	private String bzcd;                    //업무구분코드
	private String step_cd;                 //단계구분코드
	private String mng_id;                  //관리ID
	private String hgrn_mng_id;             //상위관리ID
	private String acvt_nm;                 //ACTIVITY명
	private String task_nm;                 //태스크명
	private String crpe_nm;                 //담당자명
	private String wbs_prc_sts_cd;          //WBS진행상태코드
	private String pln_sta_dt;              //계획시작일자
	private String pln_sta_tim;             //계획시작시간
	private String pln_end_dt;              //계획종료일자
	private String pln_end_tim;             //계획종료시간
	private String acl_sta_dt;              //실제시작일자
	private String acl_sta_tim;             //실제시작시간
	private String acl_end_dt;              //실제종료일자
	private String acl_end_tim;             //실제종료시간
	private String wgt_rt;                  //가중치
	private String prg_rt;                  //진행율
	private String plan_prg_rt;             //계획진행율
	private String rmrk;                    //비고
	private String sort;                    //정렬
	private String atfl_mng_id;             //첨부파일관리ID
	private String atfl_mng_id_yn;          //첨부파일관리ID
	private String wbs_cnt;                 //하위건수

	private String frcs_sta_dt;             // 예상시작일자
	private String frcs_end_dt;             // 예상종료일자
	private String sta_dt;                  // 실제시작일자
	private String end_dt;                  // 실제종료일자

	private List<PJTE5000DTO> updatedRows;
	private List<PJTE5000DTO> createdRows;
	private List<PJTE5000DTO> deletedRows;
	private List<PJTE5000DTO> rowData;

	private List<PJTE5000DTO> gridData;
	private String excelUplod;

}
