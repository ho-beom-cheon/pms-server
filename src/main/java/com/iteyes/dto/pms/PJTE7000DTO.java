package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE7000DTO {
    private String bkup_id;      // 백업ID
    private String bzcd;         // 업무구분코드
    private String file_cd;      // 산출물구분코드
    private String chk_cd;       // 검증구분
    private String srh_cd;       // 검색항목구분
    private String srh_nm;       // 검색입력
    private String sqno;         // 순번
    private String colm01;       // 컬럼01
    private String colm02;       // 컬럼02
    private String colm03;       // 컬럼03
    private String colm04;       // 컬럼04
    private String colm05;       // 컬럼05
    private String colm06;       // 컬럼06
    private String colm07;       // 컬럼07
    private String colm08;       // 컬럼08
    private String colm09;       // 컬럼09
    private String colm10;       // 컬럼10
    private String colm11;       // 컬럼11
    private String colm12;       // 컬럼12
    private String colm13;       // 컬럼13
    private String colm14;       // 컬럼14
    private String colm15;       // 컬럼15
    private String colm16;       // 컬럼16
    private String colm17;       // 컬럼17

    private String save_yn;      // 등록여부
    private String colm_yn01;    // 업무기능분할도
    private String colm_yn02;    // 요구사항정의서
    private String colm_yn03;    // 화면
    private String colm_yn04;    // 보고서
    private String colm_yn05;    // 인터페이스
    private String colm_yn06;    // 프로그램
    private String colm_yn07;    // 테이블
    private String colm_yn08;    // 단위테스트
    private String colm_yn09;    // 통합테스트
    private String colm_yn10;    // 요구사항추적표
    private String colm_yn11;    // 메뉴구조도


    private String prjt_id;      // 프로젝트 ID
    private String file_cd1;     // 산출물구분1
    private String file_cd2;     // 산출물구분2
    private String item_cd;      // 항목ID
    private String item_nm;      // 항목명
    private String map_id;       // 매핑ID
    private String map_nm;       // 매핑명
    private String cate;         // 그리드2 구분

    private List<PJTE7000DTO> rowDatas;


}

