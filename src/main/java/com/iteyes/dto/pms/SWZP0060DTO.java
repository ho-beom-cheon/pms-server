package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class SWZP0060DTO {
	private String  bkup_id;          //백업ID
	private String  prjt_id;          //프로젝트ID
	private String  mng_id;           //관리ID
	private String  rgs_dis_cd;       //관리구분코드
	private String  titl_nm;          //제목
	private String  req_dis_txt;      //요청내용
	private String  req_dis_cd;       //요청구분코드
	private String  rgs_dt;           //요청일자
	private String  rgs_sta_dt;       //요청시작일자
	private String  rgs_end_dt;       //요청종료일자
	private String 	achi_nm;          //요청자
	private String  prc_step_cd;      //이슈처리단계구분코드
	private String  tgt_biz_nm;       //대상업무명
	private String  ttmn_crpe_nm;     //조치담당자
	private String  ttmn_scd_dt;      //조치예정일자
	private String  ttmn_dt;          //조치일자
	private String  ttmn_sta_dt;      //조치시작일자
	private String  ttmn_end_dt;      //조치종료일자
	private String  ttmn_txt;         //조치내용
	private String  ifnc_cd;          //영향도코드
	private String  gd_txt;           //등급내용
	private String  urgn_cd;          //긴급코드
	private String  rmrk;             //비고
	private String  opr_no;           //조작자번호
	private String  db_chg_ts;        //DB변경일시
	private String  slv_mpln_txt;     //해결방안내용
	private String  check_Yn;         //완료/제외/미발생해소 포함 여부
}
