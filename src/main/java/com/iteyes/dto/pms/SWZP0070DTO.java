package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class SWZP0070DTO {
    private String bkup_id;             //백업ID
    private String prjt_id;             //프로젝트ID
    private String prjt_nm;             //프로젝트명
    private String bzcd;                //업무구분코드
    private String sqn_cd;              //차수구분코드
    private String tst_case_id;         //테스트케이스ID
    private String tst_case_nm;         //테스트케이스명
    private String scnr_id;             //시나리오ID
    private String scnr_nm;             //시나리오명
    private String frcs_sta_dt;         //예상시작일자
    private String frcs_end_dt;         //예상종료일자
    private String sta_dt;              //실제시작일자
    private String end_dt;              //실제종료일자
    private String dvlpe_eno;           //개발자사번
    private String pl_eno;              //담당자PL사번
    private String crpe_eno;            //담당자사번
    private String dvlpe_cnf_dt;        //개발자확인일자
    private String pl_cnf_dt;           //PL확인일자
    private String itg_tst_prc_cd;      //통합테스트처리코드
    private String prr_cnd;             //사전조건
    private String inp_val;             //입력값
    private String tst_des;             //테스트설명/절차
    private String oup_val;             //출력값
    private String tp;                  //유형
    private String oup_mens;            //출력수단
    private String pgm_id;              //프로그램ID
    private String scrn_id;             //화면ID
    private String trn_cd;              //거래코드
    private String rqu_sbh_id;          //요구사항ID
    private String tst_rst;             //테스트결과
    private String tst_achi_rst;        //테스트수행결과
    private String rmrk;                //비고
    private String atfl_mng_id;         //첨부파일관리ID
    private String opr_no;              //조작자번호
    private String db_chg_ts;           //DB변경일시
}

