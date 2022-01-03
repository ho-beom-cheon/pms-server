package com.iteyes.controller.pms;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0070DTO;
import com.iteyes.service.SWZP0070Service;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0070", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0070Controller {
	@Autowired
	private SWZP0070Service swzp0070Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		log.debug("# prjt_nm :: " + request.getParameter("prjt_nm_selected"));
		log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
		log.debug("# sqn_cd :: " + request.getParameter("sqn_cd_selected"));
		log.debug("# sta_dt :: "   + request.getParameter("sta_dt"));
		log.debug("# crpe_eno :: "   + request.getParameter("crpe_eno"));

		SWZP0070DTO SWZP0070 = new SWZP0070DTO();

		SWZP0070.setPrjt_nm(request.getParameter("prjt_nm_selected"));
		SWZP0070.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0070.setSqn_cd(request.getParameter("sqn_cd_selected"));
		SWZP0070.setSta_dt(request.getParameter("sta_dt"));
		SWZP0070.setCrpe_eno(request.getParameter("crpe_eno"));

		List<SWZP0070DTO> list = swzp0070Service.select_0070(SWZP0070);

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
