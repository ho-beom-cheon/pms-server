package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9005DTO {
    private String login_emp_no;            // 직원번호
    private String login_emp_nm;            // 직원명
    private String login_proj_id;           // 프로젝트 ID
    private String login_bzcd;              // 업무구분
    private String login_catn_dcd;          // 구성원구분코드
    private String login_aut_cd;            // 권한 ID

    private String bkup_id;     // 백업ID
    private String proj_id;     // 프로젝트ID
    private String skill_grd;   // 등급
    private String main_skill;  // 주요기술
    private String duty_txt;    // 주요업무
    private String man_no;      // 인력번호
    private String man_nm;      // 이름
    private String company_nm;  // 재직처
    private String exe_cpy_nm;  // 발주처
    private String proj_nm;     // 프로젝트명
    private String rank_nm;     // 직급명
    private String man_cd;      // 인력구분
    private String career;      // 경력
    private String now_career;  // 현재경력
    private String qlfks_nm1;   // 자격증1
    private String grd_cd;      // 평판구분
    private String last_chg_dt; // 최종변경일자
    private String birthday;    // 생년월
    private String age;         // 만나이
    private String address;     // 주소
    private String enter_ymd;   // 입사년월일
    private String sex_nm;      // 성별
    private String cpno;        // 휴대전화번호
    private String scholl_nm1;  // 학교명1
    private String gdt_ym1;     // 졸업년월1
    private String study1;      // 전공1
    private String scholl_nm2;  // 학교명2
    private String gdt_ym2;     // 졸업년월2
    private String study2;      // 전공2
    private String scholl_nm3;  // 학교명3
    private String gdt_ym3;     // 졸업년월3
    private String study3;      // 전공3
    private String aqu_ymm1;    // 자격증취득일1
    private String qlfks_nm2;   // 자격증2
    private String aqu_ymm2;    // 자격증취득일2
    private String qlfks_nm3;   // 자격증3
    private String aqu_ymm3;    // 자격증취득일3
    private String qlfks_nm4;   // 자격증4
    private String aqu_ymm4;    // 자격증취득일4
    private String qlfks_nm5;   // 자격증5
    private String aqu_ymm5;    // 자격증취득일5
    private String atfl_mng_id; // 첨부파일관리ID
    private String prjt_id;     // 프로젝트ID
    private String enter_dt;    // 입사일자
    private String rsnt_dt;     // 퇴직일자
    private String rssb_bns;    // 담당업무
    private String rmrk;        // 비고
    private String sqno;        // 순번
    private String sta_dt;      // 투입시작일자
    private String end_dt;      // 투입종료일자
    private String use_os;      // 사용OS
    private String rlt_skill;   // 관련기술

    private String atfl_mng_id_yn;          // 첨부파일 관리 ID
    private String excelUplod;              // 그리드 엑셀업로드 여부


    private List<PJTE9005DTO> updatedRows;
    private List<PJTE9005DTO> createdRows;
    private List<PJTE9005DTO> deletedRows;
    private List<PJTE9005DTO> gridData2;
    private List<PJTE9005DTO> gridData3;

    private String mng_id;                  // 관리ID

    private String db_chg_ts;               // db변경일시
    private String aut_id;                  // 권한
    private String empno;
    private String array_length;

}
