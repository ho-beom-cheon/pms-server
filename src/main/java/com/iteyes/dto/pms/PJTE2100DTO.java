package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE2100DTO {
	private String login_emp_no;			// 직원번호
	private String login_proj_id;           // 프로젝트 ID
	private String login_bzcd;              // 업무구분
	private String login_aut_cd;            // 권한 ID

	private String bzcd;                    // 업무구분코드
	private String bz_dtls_txt;             // 업무세부내용
	private String pgm_id;                  // 프로그램id
	private String pgm_nm;                  // 프로그램명
	private String dvlp_dis_cd;             // 개발구분코드
	private String pgm_dis_cd;              // 프로그램구분코드
	private String enlpe_nm;                // 프로그램세부구분코드
	private String frcs_sta_dt;             // 예상시작일자
	private String frcs_end_dt;             // 예상종료일자
	private String sta_dt;                  // 실제시작일자
	private String end_dt;                  // 실제종료일자
	private String dvlpe_cnf_dt;            // 개발자확인일자
	private String pl_cnf_dt;               // pl확인일자
	private String prc_step_cd;             // 처리단계코드
	private String prg_txt;                 // 진행현황
	private String dvlpe_nm;                // 개발자명
	private String pl_nm;                   // PL명
	private String crpe_nm;                 // 담당자명
	private int err_tot_cnt;                // 총 건수
	private int err_cmpl_cnt;               //결함완료 건수
	private int err_ncmpl_cnt;              //결함진행 건수
	private String atfl_mng_id;             // 단위테스트결과서 첨부파일관리ID
	private String pal_atfl_mng_id;         // 설계서 첨부파일관리ID
	private String rmrk;                    // 비고
	private String dvlpe_no;                // 개발자번호
	private String pl_no;                   // PL번호
	private String crpe_no;                 // 담당자번호
	private String save_yn;                 // 등록여부
	private String bkup_id;                 // 백업id
	private String prjt_id;                 // 프로젝트id
	private String grp_tycd;                //
    private String dtls_tycd;               //
    private String dtls_tynm;               //
    private String rqu_sbh_id;               //
    private String sort_seq;                //
	private String dvlpe_sta_dt;            // 개발시작일자
	private String dvlpe_end_dt;            // 개발종료일자
	private String unt_tst_yn;              // 단위테스트증빙여부
	private String cnv_bs_dt;              // 전환기준일자

	private String atfl_mng_id_yn;          //
	private String pal_atfl_mng_id_yn;      //
	private String excelUplod;              //


	private List<PJTE2100DTO> updatedRows;
	private List<PJTE2100DTO> createdRows;
	private List<PJTE2100DTO> deletedRows;
	private List<PJTE2100DTO> gridData;

	private String mng_id;                  // 관리ID

	private String bz_dtls_cd;			    // 업무세부코드

	private String db_chg_ts;               // db변경일시
	private String aut_id;                  // 권한
	private String empno;
	private String array_length;

}
