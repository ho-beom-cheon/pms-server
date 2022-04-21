package com.iteyes.dto;

import lombok.Data;

@Data
public class PJTE0000DTO {
	private String bkup_id;				// 백업ID
	private String prjt_id;				// 프로젝트ID
	private String empno;				// 직원번호
	private String empnm;				// 직원명
	private String lgn_pwd;				// 로그인비밀번호
	private String bzcd;				// 업무구분코드
	private String catn_dcd;			// 구성원구분코드
	private String aut_cd;				// 권한구분코드
	private String opr_no;				// 조작자번호
	private String db_chg_ts;			// DB변경일시
	private String login_yn;			// login 구분
	private String real_prjt_id;        // 투입프로젝트 id
	private String dept_cd;        		// 부문코드

	private String btn_gubun;           // 버튼 클릭 이벤트 구분
}
