package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE7200DTO {

    private String login_emp_no;			// 직원번호
    private String login_proj_id;           // 프로젝트 ID
    private String login_bzcd;              // 업무구분
    private String login_aut_cd;            // 권한 ID

    private String bkup_id;         // 백업ID
    private String prjt_id;         // 프로젝트ID
    private String rqs_id;          // 요청ID
    private String rsn_rqs;         // 요청사유
    private String rqs_dt;         // 요청일자
    private String rls_dt;         // 배포일자
    private String dstr;           // 배포구분
    private String prcs_stts_cd;   // 처리상태
    private String rqs_no;         // 요청자
    private String rqs_nm;         // 요청자
    private String rvw_no;         // 검토자
    private String rvw_nm;         // 검토자
    private String aprv_no;         // 승인자
    private String aprv_nm;         // 승인자
    private String rmrmk;           // 비고
    private String atfl_mng_id;     // 첨부파일관리ID
    private String org_file_nm;     // 첨부파일명

    private String opr_no;         // 조작자번호
    private int sqno;              // 순번
    private String tst_case_id;    // 테스트케이스ID
    private String mdfc;           // 수정사항
    private String rqs_pck_nm;         // 팩키지명

    private String cmpl_yn;        // 완료포함여부
    private String max_rqs_id;     // 채번요청ID

    private List<PJTE7200DTO> gridData;
    private List<PJTE7200DTO> rowDatas;


}

