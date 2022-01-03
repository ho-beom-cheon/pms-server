package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0080DTO;
import com.iteyes.service.SWZP0080Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0080", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0080Controller {
	@Autowired
	private SWZP0080Service swzp0080Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		log.debug("# prjt_nm :: " + request.getParameter("prjt_nm_selected"));
		log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
		log.debug("# sta_dt :: "   + request.getParameter("sta_dt"));
		log.debug("# crpe_no :: "   + request.getParameter("crpe_no"));

		SWZP0080DTO SWZP0080 = new SWZP0080DTO();

		SWZP0080.setPrjt_nm(request.getParameter("prjt_nm_selected"));
		SWZP0080.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0080.setSta_dt(request.getParameter("sta_dt"));
		SWZP0080.setCrpe_no(request.getParameter("crpe_no"));

		List<SWZP0080DTO> list = swzp0080Service.select_0080(SWZP0080);

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
