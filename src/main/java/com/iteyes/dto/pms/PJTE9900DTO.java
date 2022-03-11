package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9900DTO {
    private String login_emp_no;            // 직원번호
    private String login_proj_id;           // 프로젝트 ID
    private String login_bzcd;              // 업무구분
    private String login_aut_cd;            // 권한 ID
    private String login_dept_cd;            // 부문코드

    private String bkup_id;
    private String prjt_id;
    private String dept_cd;
    private String mng_id;
    private String work_task;
    private String work_step_cd;
    private String reg_nm;
    private String reg_no;
    private String reg_dt;
    private String com_rgs_dt;
    private String crpe_nm;
    private String ptcp_nm;
    private String com_due_dt;
    private String stop_dt;
    private String re_sta_dt;
    private String com_dt;
    private String bak_work_id;
    private String con_work_id;
    private String rmrk;
    private String mark;
    private String opr_no;
    private String db_chg_ts;


    private List<PJTE9900DTO> updatedRows;
    private List<PJTE9900DTO> createdRows;
    private List<PJTE9900DTO> deletedRows;
    private List<PJTE9900DTO> gridData;


    private String bz_dtls_cd;                // 업무세부코드

    private String aut_id;                  // 권한
    private String empno;
    private String array_length;

}
