package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9400DTO {
    // 공통
    private String login_emp_no;     // 직원번호
    private String login_emp_nm;     // 직원명
    private String login_proj_id;    // 프로젝트 ID
    private String login_bzcd;       // 업무구분
    private String login_catn_dcd;   // 구성원 구분코드
    private String login_aut_cd;     // 권한 ID
    private String login_dept_nm;     // 소속명

    // 그리드1_1 (요청인력내역)
    private String bkup_id;         // 백업 ID
    private String prjt_id;         // 프로젝트 ID
    private int    fld_mng_id;      //폴더관리ID
    private String hgrn_mng_id;     //상위관리ID
    private String fld_nm;          //폴더명
    private String dis_fld_nm;      //표기폴더명
    private String rmrk;            //비고
    private String atfl_mng_id;     //첨부파일관리ID
    private String coh_hgrn_mng_id; //선택상위관리ID

    private List<PJTE9400DTO> updatedRows;
    private List<PJTE9400DTO> createdRows;
    private List<PJTE9400DTO> deletedRows;
    private List<PJTE9400DTO> gridData;

}
