package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9120DTO {
    //조회조건
    private String gubun;           //그리드 구분자
    private String bkup_id;         // 백업 ID
    private String prjt_id;         // 프로젝트 ID
    private String gesipan_id;      // 게시판 ID
    private String annym_yn;        // 익명여부

    // 공통
    private String login_emp_no;     // 직원번호
    private String login_emp_nm;     // 직원명
    private String login_proj_id;    // 프로젝트 ID
    private String login_bzcd;       // 업무구분
    private String login_catn_dcd;   // 구성원 구분코드
    private String login_aut_cd;     // 권한 ID

    // 그리드1_1 (게시내역)
    private String dis_post_titl;   // 화면용게시글제목(게시내역_게시제목)
    private String post_dt;         // 게시일자
    private String post_nm;         // 게시자
    private String view_cnt;        // 조회횟수
    private String rpl_cnt;         // 답글갯수
    private String cmnt_cnt;        // 댓글갯수

    // 그리드1_2 (게시정보)
    private String post_titl;       // 게시글 제목(게시정보_게시제목)
    private String post_dsc;        // 게시글 설명
    private String txt_psw;         // 글비밀번호
    private String atfl_mng_id;     // 첨부파일관리 ID
    private String post_id;         // 게시글 ID
    private String org_file_nm;     // 원파일명

    // 그리드2 (답글내역)
    private String rpl_titl;        // 답글제목
    private String db_chg_ts;       // 등록일시
    private String good_cd;         // 좋아요구분코드(insert)
    private String good_nm;         // 좋아요구분명(select)
    private String empnm;           // 등록자
    private String rpl_no;          // 답글번호

    // 그리드3 (댓글내역)
    private String cmnt_titl;       // 댓글제목
    private String cmnt_titl1;       // 댓글제목
    private int cmnt_no;            // 댓글번호
    private String prn_cmnt_cd;     // 상위댓글코드

    private String empno;           // 직원번호


    private List<PJTE9120DTO> updatedRows;
    private List<PJTE9120DTO> createdRows;
    private List<PJTE9120DTO> deletedRows;
    private List<PJTE9120DTO> gridData;

}
