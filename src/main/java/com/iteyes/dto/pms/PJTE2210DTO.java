package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE2210DTO {

    private String bkup_id;            // 백업 ID!
    private String prjt_id;            // 프로젝트 ID

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
    private String pl_nm;               // PL명

    private String inp_date;
    private String proc_days;

    private String gubun;
//////////////////////////////////////////////////////////////////////////////


}

