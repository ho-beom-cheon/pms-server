package com.iteyes.dto;

import lombok.Data;

@Data
public class PJTE0000DTO {
	private String bkup_id;				// 백업ID
	private String prjt_id;				// 프로젝트ID
	private String empno;				// 직원번호
	private String empnm;				// 직원명
	private String email_addr;			// 이메일주소
	private String cpno;				// 휴대전화번호
	private String lgn_pwd;				// 로그인비밀번호
	private String bzcd;				// 업무구분코드
	private String catn_dcd;			// 구성원구분코드
	private String aut_cd;				// 권한구분코드
	private String ip_addr;				// IP주소
	private String plan_thw_stdt;		// 계획투입시작일자
	private String plan_thw_endt;		// 계획투입종료일자
	private String real_thw_stdt;		// 실제투입시작일자
	private String real_thw_endt;		// 실제투입종료일자
	private String opr_no;				// 조작자번호
	private String db_chg_ts;			// DB변경일시
	private String login_yn;			// login 구분
	private String real_prjt_id;        // 투입프로젝트 id

	private String btn_gubun;           // 버튼 클릭 이벤트 구분
}
