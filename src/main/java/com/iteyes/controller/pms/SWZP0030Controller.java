package com.iteyes.controller.pms;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0030DTO;
import com.iteyes.service.SWZP0030Service;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0030", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0030Controller {
	@Autowired
	private SWZP0030Service swzp0030Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		log.debug("# pgm_id :: "   + request.getParameter("scnr_id"));
		log.debug("# tst_case_id :: "   + request.getParameter("tst_case_id"));
		log.debug("# dvlpe_eno :: "    + request.getParameter("dvlpe_eno"));
		log.debug("# pl_eno :: " + request.getParameter("pl_eno"));
		log.debug("# crpe_eno :: " + request.getParameter("crpe_eno"));
		log.debug("# rqu_sbh_id :: " + request.getParameter("rqu_sbh_id"));
		log.debug("# prjt_nm :: " + request.getParameter("prjt_nm_selected"));
		log.debug("# bzcd_ :: " + request.getParameter("bzcd_selected"));
		log.debug("# sqn_cd :: " + request.getParameter("sqn_cd_selected"));
		log.debug("# itg_tst_prc_cd :: " + request.getParameter("itg_tst_prc_cd_selected"));
		log.debug("# tp :: " + request.getParameter("tp_selected"));

		SWZP0030DTO SWZP0030 = new SWZP0030DTO();

		SWZP0030.setScnr_id(request.getParameter("scnr_id"));
		SWZP0030.setTst_case_id(request.getParameter("tst_case_id"));
		SWZP0030.setDvlpe_eno(request.getParameter("dvlpe_eno"));
		SWZP0030.setPl_eno(request.getParameter("pl_eno"));
		SWZP0030.setCrpe_eno(request.getParameter("crpe_eno"));
		SWZP0030.setRqu_sbh_id(request.getParameter("rqu_sbh_id"));
		SWZP0030.setPrjt_nm(request.getParameter("prjt_nm_selected"));
		SWZP0030.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0030.setSqn_cd(request.getParameter("sqn_cd_selected"));
		SWZP0030.setItg_tst_prc_cd(request.getParameter("itg_tst_prc_cd_selected"));
		SWZP0030.setTp(request.getParameter("tp_selected"));

		List<SWZP0030DTO> list = swzp0030Service.select_0030(SWZP0030);

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
