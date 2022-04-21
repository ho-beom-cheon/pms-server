package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9001DTO {
    private String bkup_id;        /*백업ID*/
    private String prjt_id;        /*프로젝트*/
    private String bzcd;           /*업무구분*/
    private String empno;          /*직원번호*/
    private String empnm;          /*직원명*/
    private String rank_nm;        /*직급명*/
    private String catn_dcd;       /*구성원구분*/
    private String dept_nm;           /*부서*/
    private String lgn_pwd;        /*로그인비밀번호*/
    private String aut_cd;         /*권한ID*/
    private String opr_no;         /*조작자번호*/
    private String db_chg_ts;      /*DB변경일시*/
    /*storage 공통 */
    private String login_emp_no;   /*직원번호*/
    private String login_emp_nm;   /*직원명*/
    private String login_proj_id;  /*프로젝트ID*/
    private String login_bzcd;     /*업무구분*/
    private String login_catn_dcd; /*구성원 구분코드*/
    private String login_aut_cd;   /*권한ID*/

    private String array_length;

    /*콤보박스 세팅*/
    private String grp_tycd;   /*그룹유형코드*/
    private String dtls_tycd;   /*세부유형코드*/
    private String dtls_tynm;   /*세부유형명*/
    private String sort_seq;   /*정렬순서*/
}
