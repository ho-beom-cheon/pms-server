package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE3000DTO {
    private String bkup_id;                    /*백업ID*/
    private String bkup_id_selected;           /*백업ID*/
    private String prjt_id;                    /*프로젝트ID*/
    private String prjt_id_selected;           /*프로젝트ID*/
    private String bzcd;                       /*업무구분*/
    private String bzcd_selected;              /*업무구분*/
    private String rgs_dscd;                   /*등록단계구분*/
    private String rgs_dscd_selected;          /*등록단계구분*/
    private String err_tycd;                   /*결함유형*/
    private String err_tycd_selected;          /*결함유형*/
    private String err_prc_step_cd;            /*처리단계*/
    private String err_prc_step_cd_selected;   /*처리단계*/
    private String rgpe_no;                    /*결함등록자번*/
    private String rgpe_nm;                    /*결함등록자명*/
    private String dvlpe_no;                   /*조치자번호*/
    private String dvlpe_nm;                   /*조치자명*/
    private String pl_no;                      /*담당PL번호*/
    private String pl_nm;                      /*담당PL명*/
    private String cctn_id;                    /*프로그램ID*/
    private String cctn_nm;                    /*프로그램명*/
    private String err_txt;                    /*결함내용*/
    private String rgs_sta_dt;                 /*결함등록일자STA*/
    private String rgs_end_dt;                 /*결함등록일자END*/
    private String ttmn_sta_dt;                /*결함조치일자STA*/
    private String ttmn_end_dt;                /*결함조치일자END*/
    private String cmpl_yn;                    /*완료건 포함 여부*/
    private String rgs_dt;                     /*결함등록일자*/
    private String rgpe_nn;                    /*등록자명*/
    private String ttmn_txt;                   /*조치내용*/
    private String ttmn_scd_dt;                /*조치예정일자*/
    private String ttmn_dt;                    /*조치일자*/
    private String bfjr_bzcd;                  /*이관전업무*/
    private String mng_id;                     /*관리ID*/
    private String login_emp_no;               /*직원번호*/
    private String login_emp_nm;               /*직원명*/
    private String login_proj_id;              /*프로젝트ID*/
    private String login_bzcd;                 /*업무구분*/
    private String login_catn_dcd;             /*구성원 구분코드*/
    private String login_aut_cd;               /*권한ID*/

}
