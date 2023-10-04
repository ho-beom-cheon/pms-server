package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE8000DTO {
    //추가
    private String week_seq_val;             /*주간녀월이 이번달인지 아닌지 확인*/
    private String bef_aut_cd;        /*권한id*/
    private String bef_emp_no;        /*직원번호*/

    //로그인세션
    private String login_aut_cd;        /*권한id*/
    private String login_bzcd;          /*업무구분*/
    private String login_emp_no;        /*직원번호*/
    private String login_proj_id;       /*프로젝트id*/
    //그리드(금주)
    private String bkup_id;            /*백업id*/
    private String prjt_id;             /*프로젝트id*/
    private String real_prjt_id;        /*실제프로젝트id*/
    private String real_prjt_nm;        /*실제프로젝트명*/
    private String dept_cd;             /*부문코드*/
    private String dept_nm;             /*부문명*/
    private String start_prjt_date;             /*부문명*/
    private String end_prjt_date;             /*부문명*/
    private String week_yymm;           /*주간년월*/
    private String week_sqn_cd;         /*주간년월 차수*/
    private String week_sqn_nm;         /*주간년월 차수*/
    private String pm_no;               /*pm사원번호*/
    private String pm_nm;               /*pm명*/
    private String all_real_prg;        /*전체실제진척율*/
    private String all_pred_prg;        /*전체예상진척율*/
    private String step_nm;             /*단계명*/
    private String step_real_prg;       /*단계실제진척율*/
    private String step_pred_prg;       /*단계예정진척율*/
    private String prg_txt;             /*프로젝트진행상황*/
    private String iss_txt;             /*이슈내용*/
    private String req_txt;             /*요청내용*/
    private String org_file_nm;         /*첨부파일명*/
    private String atfl_mng_id;         /*첨부파일 코드*/
    //그리드(지난주)
    private String bef_week_yymm;           /*주간년월*/
    private String bef_week_sqn_cd;         /*주간년월 차수*/
    private String bef_week_sqn_nm;         /*주간년월 차수*/
    private String bef_pm_no;               /*pm사원번호*/
    private String bef_pm_nm;               /*pm명*/
    private String bef_all_real_prg;        /*전체실제진척율*/
    private String bef_all_pred_prg;        /*전체예상진척율*/
    private String bef_step_nm;             /*단계명*/
    private String bef_step_real_prg;       /*단계실제진척율*/
    private String bef_step_pred_prg;       /*단계예정진척율*/
    private String bef_prg_txt;             /*프로젝트진행상황*/
    private String bef_iss_txt;             /*이슈내용*/
    private String bef_req_txt;             /*요청내용*/
    private String bef_org_file_nm;         /*첨부파일명*/
    private String bef_atfl_mng_id;         /*첨부파일 코드*/

    private String db_chg_ts;           /*db변경일시*/
    private String db_chg_yn;           /*db변경여부*/
    private String cmpl_yn;                    /*완료건 포함 여부*/
}
