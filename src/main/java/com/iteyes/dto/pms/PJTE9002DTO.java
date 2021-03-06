package com.iteyes.dto.pms;

import lombok.*;

@Data

public class PJTE9002DTO {

    private String bkup_id;            // 백업ID
    private String prjt_id;            // 프로젝트ID
    private String login_emp_no;       // 프로젝트ID

    /*PMS첨부파일관리*/
    private String atfl_mng_id;        // 첨부파일관리ID
    private String file_rgs_dscd;      // 파일등록구분코드
    private String sqno;               // 순번
    private String file_path;          // 파일경로
    private String file_nm;            // 파일명
    private String org_file_nm;        //
    private String rmrmk;              // 비고
    private String opr_no;             // 조작자번호
    private String db_chg_ts;          // DB변경일시

    /*PMS코드관리*/
    private String grp_tycd;           // 그룹유형코드
    private String grp_tymm;           // 그룹유형명
    private String grid_colm_nm1;      // 그리드컬럼명1
    private String grid_colm_nm2;      // 그리드컬럼명2
    private String grid_colm_nm3;      // 그리드컬럼명3
    private String grid_colm_nm4;      // 그리드컬럼명4
    private String grid_colm_nm5;      // 그리드컬럼명5
    private String grid_colm_nm6;      // 그리드컬럼명6
    private String grid_colm_nm7;      // 그리드컬럼명7
    private String grid_colm_nm8;      // 그리드컬럼명8
    private String grid_colm_nm9;      // 그리드컬럼명9
    private String grid_colm_nm10;     // 그리드컬럼명10
    private String grid_colm_nm11;     // 그리드컬럼명11
    private String grid_colm_nm12;     // 그리드컬럼명12
    private String grid_colm_nm13;     // 그리드컬럼명13
    private String grid_colm_nm14;     // 그리드컬럼명14
    private String grid_colm_nm15;     // 그리드컬럼명15
    private String grid_colm_nm16;     // 그리드컬럼명16
    private String grid_colm_nm17;     // 그리드컬럼명17
    private String grid_colm_nm18;     // 그리드컬럼명18
    private String grid_colm_nm19;     // 그리드컬럼명19
    private String grid_colm_nm20;     // 그리드컬럼명20
    private String sort_seq;           // 정렬순서
    private String usg_yn;             // 사용여부
    private String db_chg_no;          // DB변경일시

    /*PMS상세코드관리*/
    private String dtls_tycd;          // 세부유형코드
    private String dtls_tynm;          // 세부유형명
    private String etc_txt1;           // 기타내용1
    private String etc_txt2;           // 기타내용2
    private String etc_txt3;           // 기타내용3
    private String etc_txt4;           // 기타내용4
    private String etc_txt5;           // 기타내용5
    private String etc_txt6;           // 기타내용6
    private String etc_txt7;           // 기타내용7
    private String etc_txt8;           // 기타내용8
    private String dtl_txt1;           // 상세내용1
    private String dtl_txt2;           // 상세내용2
    private String dtl_txt3;           // 상세내용3
    private String dtl_txt4;           // 상세내용4
    private String dtl_txt5;           // 상세내용5
    private String dtl_txt6;           // 상세내용6
    private String dtl_txt7;           // 상세내용7
    private String dtl_txt8;           // 상세내용8
    private String dtl_txt9;           // 상세내용9
    private String dtl_txt10;          // 상세내용10
    private String use_yn;             // 사용여부

    /*PMS직원정보*/
    private String empno;              // 직원번호
    private String empnm;              // 직원명
    private String email_addr;         // 이메일주소
    private String cpno;               // 휴대전화번호
    private String lgn_pwd;            // 로그인비밀번호
    private String bzcd;               // 업무구분코드
    private String catn_dcd;           // 구성원구분코드
    private String aut_cd;             // 권한구분코드
    private String ip_addr;            // IP주소
    private String plan_thw_stdt;      // 계획투입시작일자
    private String plan_thw_endt;      // 계획투입종료일자
    private String real_thw_stdt;      // 실제투입시작일자
    private String real_thw_endt;      // 실제투입종료일자

    /*PMS 프로그램관리*/
    private String pgm_id;             // 프로그램 ID

    /*PMS 결함관리*/
    private String mng_id;             // 프로그램 ID

    /*PMS 통합테스트관리*/
    private String sqn_cd;             // 차수구분코드
    private String tst_case_id;        // 테스트 케이스 ID

    /*PMS 주간보고 관리*/
    private String week_sqn_cd;        // 주간년월차수구분코드
    private String week_yymm;          // 주간년월
    private String real_prjt_id;       // 투입프로젝트ID

    /*회의실예약*/
    private String room_sqno;          // 순번
};
;
