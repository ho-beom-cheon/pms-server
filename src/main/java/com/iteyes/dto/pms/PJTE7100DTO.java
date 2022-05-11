package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE7100DTO {

    private String login_emp_no;			// 직원번호
    private String login_proj_id;           // 프로젝트 ID
    private String login_bzcd;              // 업무구분
    private String login_aut_cd;            // 권한 ID

    private String bkup_id;      // 백업ID
    private String prjt_id;         // 프로젝트ID
    private String as_pgm_id;      // ASIS프로그램ID
    private String as_pgm_dis_cd;       // ASIS프로그램구분코드
    private String as_pgm_dis_nm;       // ASIS프로그램구분명
    private String as_pgm_nm;       // ASIS프로그램명
    private String to_pgm_id;       // TOBE프로그램ID
    private String to_pgm_nm;         // TOBE프로그램명
    private String use_pgm_txt;       // 사용프로그램
    private String dvlpe_no;       // 개발자번호
    private String dvlpe_nm;       // 개발자명
    private String trn_stt_cd;       // 전환상태코드
    private String trn_stt_nm;       // 전환상태명
    private String sta_dt;       // 실제시작일자
    private String end_dt;       // 실제종료일자
    private String rmrk;       // 비고
    private String opr_no;       // 조작자번호
    private String db_chg_ts;       // DB변경일시

    private List<PJTE7100DTO> rowDatas;


}

