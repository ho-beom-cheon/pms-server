package com.iteyes.dto.pms;

import lombok.Data;

@Data
public class PJTE6001DTO {
	private String prjt_id;
	private String mng_id;
	private String bzcd;
	private String req_dscd;
	private String reqpe_no;
	private String reqpe_nm;
	private String req_dt;
	private String req_txt;
	private String prcpe_nm;
	private String prcpe_no;
	private String prc_dt;
	private String prc_txt;
	private String req_prc_step_cd;
	private String atfl_mng_id;
	private String opr_no;
	private String db_chg_ts;           /*db변경일시*/
	private String db_chg_yn;           /*db변경여부*/

	private String bkup_id;
	private String org_file_nm;
	private String login_emp_no;
	private String login_aut_cd;

	private String ttmn_scd_dt;
}
