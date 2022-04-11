package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE9200DTO {
	private String login_emp_no;       /*직원번호*/
	private String login_emp_nm;       /*직원명*/
	private String login_proj_id;      /*프로젝트ID*/
	private String login_bzcd;         /*업무구분*/
	private String login_catn_dcd;     /*구성원 구분코드*/
	private String login_aut_cd;       /*권한ID*/
	private String login_dept_cd;      /*부서코드*/
	private String prjt_id;            /*프로젝트ID*/
	private String mtng_room_id;       /*회의실ID*/
	private String rsr_strt;           /*예약시작일자*/
	private String rsr_endt;           /*예약종료일자*/
	private String rsr_no;             /*예약자번호*/
	private String rsr_dt;             /*예약일자*/
	private String rsrv_strt_nm;       /*예약시작시간명*/
	private String rsrv_endt_nm;       /*예약종료시간명*/
	private String mtng_room_nm;       /*회의실명*/
	private String mtng_ttl;           /*회의제목*/
	private String rsr_nm;             /*예약자명*/
	private String org_file_nm;        /*원파일명*/
	private String bkup_id;            /*백업ID*/
	private int sqno;                  /*순번*/
	private String atfl_mng_id;        /*첨부파일ID*/
	private String rsrv_strt;          /*예약시작시간*/
	private String rsrv_endt;          /*예약종료시간*/
	private String save_yn;            /*등록가능여부*/

}

