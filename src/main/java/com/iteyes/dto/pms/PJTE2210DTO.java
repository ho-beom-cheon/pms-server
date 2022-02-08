package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE2210DTO {

    private String bkup_id;            // 백업 ID!
    private String prjt_id;            // 프로젝트 ID
    private String inp_date;           //
    private String proc_days;           //

    /* grid1 */
    private String bzcd;               //업무코드
    private String bznm;               //업무명
    private String tot_cnt;            //전체
    private String af_tot_cnt;         //전체계획_전체
    private String cmpl_cnt;           //전체계획_계획완료
    private String af_cmpl_cnt;        //전체계획_선완료
    private String ncmpl_cnt;          //전체계획_미완료
    private String prnr_rt;            //전체계획_진척율
    private String tot_cnt1;           //금주담당자_전체
    private String cmpl_cnt1;          //금주담당자_완료
    private String ncmpl_cnt1;         //금주담당자_미완료
    private String prnr_rt1;           //금주담당자_진척율
    private String pl_tot_cnt;
    private String pl_cmpl_cnt;
    private String pl_ncmpl_cnt;
    private String pl_prnr_rt;
    private String tot_cnt2;
    private String cmpl_cnt2;

    /* grid2 */
    private String emp_nm;             //담당자명

    /* grid3 */
    private String tot_err_cnt;         //전체
    private String err_cnt;             //결함건수
    private String impt_cnt;            //개선건수
    private String etc_err_cnt;         //기타건수
    private String nerr_cnt;            //결함아님건수
    private String spnd_cnt;            //보류건수

    /* grid4 */
    private String nprrn_kbn;            // 미진구분
    private String tst_case_id;          // 테스트케이스ID
    private String tst_case_nm;          // 테스트케이스명
    private String frcs_end_dt;          // 예상종료일자
    private String dvlpe_cnf_dt;         // 개발완료일자/조치일자
    private String dvlpe_nm;             // 담당자명
    private String pl_yn;                //
    private String crpe_yn;              // 담당자완료여부
    private String nprrn;                // 미진사유
    private String sqn_cd;              //차수구분코드
    private String scnr_id;             //시나리오ID
    private String scnr_nm;             //시나리오명
    private String frcs_sta_dt;         //예상시작일자
    private String sta_dt;              //실제시작일자
    private String end_dt;              //실제종료일자
    private String dvlpe_eno;           //개발자사번
    private String pl_eno;              //담당자PL사번
    private String crpe_eno;            //담당자사번
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

