package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE8000DTO {
    private String baup_id;             /*백업id*/
    private String prjt_id;             /*프로젝트id*/
    private String real_prjt_id;        /*실제프로젝트id*/
    private String week_yymm;           /*주간년월*/
    private String week_sqn_cd;         /*주간년월 차수*/
}
