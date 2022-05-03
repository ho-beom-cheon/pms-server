package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9310DTO {
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

    // 그리드1_1 (게시내역)
    private String dept_nm;   // 화면용게시글제목(게시내역_게시제목)
    private String hdq_nm;         // 게시일자
    private String tm_nm;         // 게시자
    private String rank_nm;        // 조회횟수
    private String empno;       // 게시글 제목(게시정보_게시제목)
    private String empnm;        // 게시글 설명
    private String ent_dt;         // 글비밀번호
    private String inp_prj_nm;     // 첨부파일관리 ID
    private String inp_dt;         // 게시글 ID
    private String wth_dt;     // 원파일명
    private String prj_typ_nm;        // 답글제목
    private String prf_ar;       // 등록일시
    private String rmrk;         // 좋아요구분코드(insert)
    private String inp_cls_cd;         // 좋아요구분명(select)
    private String wth_sch_yn;           // 등록자

    private List<PJTE9310DTO> updatedRows;
    private List<PJTE9310DTO> createdRows;
    private List<PJTE9310DTO> deletedRows;
    private List<PJTE9310DTO> gridData;

}
