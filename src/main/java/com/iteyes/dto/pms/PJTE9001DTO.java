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
    private String email_addr;     /*이메일주소*/
    private String cpno;           /*휴대폰번호*/
    private String lgn_pwd;        /*로그인비밀번호*/
    private String aut_cd;         /*권한ID*/
    private String ip_addr;        /*IP주소*/
    private String plan_thw_stdt;  /*예정투입시작일자*/
    private String plan_thw_endt;  /*예정투입종료일자*/
    private String real_thw_stdt;  /*실제투입시작일자*/
    private String real_thw_endt;  /*실제투입종료일자*/
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
}
