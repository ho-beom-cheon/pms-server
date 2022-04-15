package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE9110DTO {
    
    private String prjt_id; //프로젝트ID
    private String bkup_id; //백업ID
    private String bubun_nm; //게시부서
    private String bsn_cls_nm; //게시구분
    private String gesipan_titl; //게시판제목
    private String gesipan_dsc; //게시판설명
    private String login_dept_cd; //로그인 세션 부문

    private String annym_yn; //익명
    private String nmb_inq_yn; //조회횟수여부
    private String cmnt_yn;	//댓글
    private String rply_yn;	//답글
    private String file_upld_yn; //파일 업로드 여부

}
