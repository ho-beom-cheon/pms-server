package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9300DTO {
    //조회조건
    private String gubun;           //그리드 구분자
    private String bkup_id;         // 백업 ID
    private String prjt_id;         // 프로젝트 ID
    private String dept_cd;      // 부문코드

    // 공통
    private String login_emp_no;     // 직원번호
    private String login_emp_nm;     // 직원명
    private String login_proj_id;    // 프로젝트 ID
    private String login_bzcd;       // 업무구분
    private String login_catn_dcd;   // 구성원 구분코드
    private String login_aut_cd;     // 권한 ID

    // 그리드1_1 (요청인력내역)
    private String real_prjt_id;         //투입프로젝트명
    private String sch_ent_dt;           //투입예정일자
    private String skill_grd;            //등급
    private String main_skill;           //필요기술
    private String duty_txt;             //필요업무
    private String oth_cnt;              //기타내용
    private String nmbr_rcrt;            //모집인원
    private String opr_nm;               //등록자
    private String aplc_dtls;            //지원자내용
    private String sqno;                 //순번
    private String opr_no;               //등록직원번호

    //그리드2(대기인력내역)
    private String empnm;                // 직원명
    private String skill_grd_nm;         // 등급
    private String inp_prj_nm;           // 현/이전프로젝트
    private String nxt_prj_nm;           // 차기희망 프로젝트 및 업무
    private String wth_dt;               // 예정/철수일자


    private List<PJTE9300DTO> updatedRows;
    private List<PJTE9300DTO> createdRows;
    private List<PJTE9300DTO> deletedRows;
    private List<PJTE9300DTO> gridData;

}
