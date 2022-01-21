package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE1000DTO {

    private String login_emp_no;        /*직원번호*/
    private String login_emp_nm;        /*직원명*/
    private String login_proj_id;       /*프로젝트ID*/
    private String login_bzcd;          /*업무구분*/
    private String login_catn_dcd;      /*구성원 구분코드*/
    private String login_aut_cd;        /*권한ID*/
    private String bkup_id;             /*백업ID*/
    private String prjt_id;             /*프로젝트명*/
    private String s_day;               /*현재일자*/
    private String proc_dt;             /*진행일자*/
    private String err_proc_dt;         /*에러처리일자*/
    private String proc_days;           /*진행일수*/
    private String err_proc_days;       /*에러처리일수*/
    private String todo_cd;             /*TO-DO코드*/
    private String sqno;                /*순번*/
    private String todo_nm;             /*TO-DO코드명*/
    private String proc_cnt;            /*처리건수*/
    private String todo_txt;            /*TO-DO내역*/
    private String stdt;                /*시작일자*/
    private String endt;                /*종료일자*/
    private String err_txt;             /*결함내용*/
    private String rgs_dt;              /*공지일자*/
    private String ntar_bzcd;           /*공지업무*/
    private String titl_txt;            /*제목*/
    private String mng_id;              /*관리ID*/
    private String rgs_no;              /*등록자번호*/
    private String rgs_nm;              /*등록자명*/
    private String del_yn;              /*삭제여부*/
    private String atfl_mng_id;         /*첨부파일관리ID*/
    private String org_file_nm;         /*원파일명*/
    private String ancpt;               /*공지내역*/
}
