package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE3001DTO {
	private String login_emp_no;      /*직원번호*/
	private String login_emp_nm;      /*직원명*/
	private String login_proj_id;     /*프로젝트ID*/
	private String login_bzcd;        /*업무구분*/
	private String login_catn_dcd;    /*구성원 구분코드*/
	private String login_aut_cd;      /*권한ID*/
	private String prjt_id;           /*프로젝트명*/
	private String bkup_id;           /*백업ID*/
	private String mng_id;            /*결함ID*/
	private String cctn_id;           /*프로그램ID/테스트케이스ID*/
	private String cctn_nm;           /*프로그램명/테스트케이스명*/
	private String rgpe_nm;           /*등록자명*/
	private String rgpe_no;           /*등록자번호*/
	private String rgs_dt;            /*결함등록일자*/
	private String err_tycd;          /*결함유형코드*/
	private String rgs_dscd;          /*결함등록단계구분코드*/
	private String err_txt;           /*결함내용*/
	private String rgs_atfl_nm;       /*첨부파일명*/
	private String rgs_atfl_mng_id;   /*요청첨부파일관리ID*/
	private String bzcd;              /*업무구분코드*/
	private String err_prc_step_cd;   /*결함처리단계구분코드*/
	private String ttmn_scd_dt;       /*조치예정일자*/
	private String dvlpe_nm;          /*조치자명*/
	private String dvlpe_no;          /*조치자번호*/
	private String pl_nm;             /*PL명*/
	private String pl_no;             /*PL번호*/
	private String ttmn_dt;           /*조치일자*/
	private String ttmn_txt;          /*조치내용*/
	private String ttmn_atfl_nm;      /*조치파일명*/
	private String ttmn_atfl_mng_id;  /*조치첨부파일관리ID*/
	private String bfjr_bzcd;         /*이관전업무*/
	private String cctn_bzcd;         /*연결업무구분코드*/
	private String cctn_sqn_cd;       /*연결차수구분코드*/
}

