package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE2110DTO {
    private String bkup_id;                 // 백업id
    private String prjt_id;                 // 프로젝트id
    private String prjt_nm;                 // 프로젝트명
    private String bzcd;                    // 업무구분코드
    private String pgm_id;                  // 프로그램id
    private String mng_id;                  // 관리ID
    private String bz_dtls_txt;             // 업무세부내용
    private String pgm_nm;                  // 프로그램명
    private String dvlp_dis_cd;             // 개발구분코드
    private String bz_dtls_cd;			    // 업무세부코드
    private String pgm_dis_cd;              // 프로그램구분코드
    private String enlpe_nm;                // 프로그램세부구분코드
    private String frcs_sta_dt;             // 예상시작일자
    private String frcs_end_dt;             // 예상종료일자
    private String sta_dt;                  // 실제시작일자
    private String end_dt;                  // 실제종료일자
    private String prc_step_cd;             // 처리단계코드
    private String prg_txt;                 // 진행현황
    private String dvlpe_no;                // 개발자번호
    private String dvlpe_cnf_dt;            // 개발자확인일자
    private String pl_no;                   // pl번호
    private String pl_cnf_dt;               // pl확인일자
    private String crpe_no;                 // 담당자번호
    private String mgpe_cnf_dis;			// 관리자확인구분
    private String sorc_path;				// 소스경로
    private String exc_dt;					// 이행일자
    private String exc_tim;					// 이행시간
    private String exc_crpe_nm;				// 이행담당자
    private String chck_dt;					// 점검일자
    private String chck_tim;		   	 	// 점검시간
    private String exc_cnf_crpe_nm;			// 이행확인담당자
    private String exc_prg_dis;				// 이행진행구분
    private String rmrk;                    // 비고
    private String atfl_mng_id;             // 첨부파일관리id
    private String opr_no;                  // 조작자번호
    private String db_chg_ts;               // db변경일시
}

