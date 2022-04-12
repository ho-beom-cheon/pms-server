package com.iteyes.dto.pms;

import lombok.Data;

import java.util.List;

@Data
public class PJTE9100DTO {
    private String login_emp_no;            // 직원번호
    private String login_emp_nm;            // 직원명
    private String login_proj_id;           // 프로젝트 ID
    private String login_bzcd;              // 업무구분
    private String login_catn_dcd;          // 구성원구분코드
    private String login_aut_cd;            // 권한 ID

    private String bkup_id;		            // 백업ID
    private String prjt_id;		            // 프로젝트ID
    private String gesipan_id;		        // 게시판ID
    private String bubun_cd;		        // 부문코드
    private String gesipan_titl;	        // 게시판제목
    private String gesipan_dsc;	            // 게시판설명
    private String bsn_cls_cd;		        // 업무구분코드
    private String annym_yn;		        // 익명여부
    private String afrm_yn;		            // 소속확인여부
    private String cmnt_yn;		            // 댓글여부
    private String rply_yn;		            // 답글여부
    private String good_yn;		            // 좋아요여부
    private String nmb_inq_yn;		        // 조회횟수여부
    private String pgn_yn;			        // 페이징여부
    private String file_upld_yn;	        // 파일업로드여부
    private String opr_no;			        // 조작자번호
    private String db_chg_ts;               // DB변경일시
}
