package com.iteyes.controller.pms;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.iteyes.dto.pms.PJTE2210DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.service.PJTE2210Service;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE2210", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE2210Controller {
	//
	@Autowired
	private PJTE2210Service pjte2210Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		log.debug("# prjt_nm :: " + request.getParameter("prjt_nm_selected"));
		log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
		log.debug("# sqn_cd :: " + request.getParameter("sqn_cd_selected"));
		log.debug("# sta_dt :: "   + request.getParameter("sta_dt"));
		log.debug("# crpe_eno :: "   + request.getParameter("crpe_eno"));

		PJTE2210DTO PJTE2210 = new PJTE2210DTO();

		PJTE2210.setPrjt_nm(request.getParameter("prjt_nm_selected"));
		PJTE2210.setBzcd(request.getParameter("bzcd_selected"));
		PJTE2210.setSqn_cd(request.getParameter("sqn_cd_selected"));
		PJTE2210.setSta_dt(request.getParameter("sta_dt"));
		PJTE2210.setCrpe_eno(request.getParameter("crpe_eno"));

		List<PJTE2210DTO> list = pjte2210Service.select_2210_01(PJTE2210);

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
