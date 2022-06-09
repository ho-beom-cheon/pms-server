package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE8100DTO {
    //로그인세션
    private String login_aut_cd;        /*권한id*/
    private String login_bzcd;          /*업무구분*/
    private String login_emp_no;        /*직원번호*/
    private String login_proj_id;       /*프로젝트id*/

    private String mtn_sdt;              /*회의시작일자*/
    private String mtn_edt;              /*회의종료일자*/
    //그리드(금주)
    private String bkup_id;             /*백업id*/
    private String prjt_id;             /*프로젝트id*/
    private String prjt_nm_selected;
    private String mng_id;              /*관리ID*/
    private String cnf_wek;             /*회의주제*/
    private String mtn_dt;              /*회의일자*/
    private String mtn_tm;              /*회의시간*/
    private String mtn_plc;             /*회의장소*/
    private String athr_no;             /*작성자사번*/
    private String mtn_dtl;             /*회의내용*/
    private String mtn_rsl;             /*회의결과내용*/
    private String rqs_dtl;             /*요청사항*/
    private String atnd_dtl;            /*참석자*/
    private String atfl_mng_id;         /*첨부파일관리ID*/
    private String org_file_nm;         /*첨부파일명*/
    private String del_yn;              /*삭제여부*/
    private String athr_nm;             /*작성자사번*/

}
