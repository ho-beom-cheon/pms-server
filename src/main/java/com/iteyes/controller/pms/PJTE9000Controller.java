package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.service.PJTE9000Service;
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
@RequestMapping(value = "/PJTE9000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE9000Controller {
	@Autowired
	private PJTE9000Service pjte9000Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9000DTO PJTE9000 = new PJTE9000DTO();

		PJTE9000.setPrjt_id(request.getParameter("prjt_id_selected"));
		PJTE9000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE9000.setAut_cd(request.getParameter("aut_cd_selected"));

		List<PJTE9000DTO> list = pjte9000Service.select_9000_01(PJTE9000);

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
