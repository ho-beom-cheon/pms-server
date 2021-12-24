package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0060DTO;
import com.iteyes.service.SWZP0060Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0060", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0060Controller {
	@Autowired
	private SWZP0060Service swzp0060Service;

	@RequestMapping(value = "/select")
    public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();
    	
    	log.debug("# rgs_dis_cd :: "   + request.getParameter("rgs_dis_cd_selected"));
    	log.debug("# req_dis_cd :: "   + request.getParameter("req_dis_cd_selected"));
    	log.debug("# prc_step_cd :: "    + request.getParameter("prc_step_cd_selected"));
    	log.debug("# tgt_biz_nm :: " + request.getParameter("tgt_biz_nm"));
    	log.debug("# Achi_nm :: " + request.getParameter("Achi_nm"));
    	log.debug("# ttmn_crpe_nm :: " + request.getParameter("ttmn_crpe_nm"));
    	log.debug("# titl_nm :: " + request.getParameter("titl_nm"));
    	log.debug("# req_dis_txt :: " + request.getParameter("req_dis_txt"));
    	log.debug("# ttmn_txt :: " + request.getParameter("ttmn_txt"));
    	log.debug("# slv_mpln_txt :: " + request.getParameter("slv_mpln_txt"));

    	SWZP0060DTO SWZP0060 = new SWZP0060DTO();
    	
    	SWZP0060.setRgs_dis_cd(request.getParameter("rgs_dis_cd_selected"));
    	SWZP0060.setReq_dis_cd(request.getParameter("req_dis_cd_selected"));
    	SWZP0060.setPrc_step_cd(request.getParameter("prc_step_cd_selected"));
    	SWZP0060.setTgt_biz_nm(request.getParameter("tgt_biz_nm"));
    	SWZP0060.setAchi_nm(request.getParameter("Achi_nm"));
    	SWZP0060.setTtmn_crpe_nm(request.getParameter("ttmn_crpe_nm"));
    	SWZP0060.setTitl_nm(request.getParameter("titl_nm"));
		SWZP0060.setReq_dis_txt(request.getParameter("req_dis_txt"));
		SWZP0060.setTtmn_txt(request.getParameter("ttmn_txt"));
		SWZP0060.setSlv_mpln_txt(request.getParameter("slv_mpln_txt"));
    	
    	List<SWZP0060DTO> list = swzp0060Service.select_0060(SWZP0060);
    	
    	HashMap<String, Object> hm = new HashMap();
    	HashMap<String, Object> hm1 = new HashMap();
    	HashMap<String, Object> hm1_pagination = new HashMap();
    	hm.put("result", true);
    	hm1.put("contents", list);
    	hm1_pagination.put("page", 1);
    	hm1_pagination.put("totalCount", 100);
    	hm1.put("pagination", hm1_pagination);
    	hm.put("data", hm1);

    	String jsonStr = mapper.writeValueAsString(hm);

    	return jsonStr;

    }
	

}
