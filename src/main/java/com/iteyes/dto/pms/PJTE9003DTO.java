package com.iteyes.dto.pms;

import lombok.Data;

@Data

public class PJTE9003DTO {
    private String login_emp_no;	   // 직원번호
   	private String login_proj_id;      // 프로젝트 ID
   	private String login_bzcd;         // 업무구분
   	private String login_aut_cd;       // 권한 ID

    private String bkup_id;            // 백업ID
    private String prjt_id;            // 프로젝트ID
    private String bzcd;               // 업무구분
    private String bznm;               // 업무구분
    private String file_rgs_dscd;      // 파일등록구분
    private String sah_file_nm;        // 산출물구분

    private String file_nm;            // 서버파일명
    private String org_file_nm;        // 원본파일명
    private String sam_file_nm;        // 산출물양식명
    private String file_path;          // 파일경로
    private String pgm_id;             // 프로그램 id
};

