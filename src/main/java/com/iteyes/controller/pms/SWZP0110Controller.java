package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0110DTO;
import com.iteyes.service.SWZP0110Service;
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
@RequestMapping(value = "/SWZP0110", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0110Controller {
	@Autowired
	private SWZP0110Service swzp0110Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		SWZP0110DTO SWZP0110 = new SWZP0110DTO();

		SWZP0110.setPrjt_id(request.getParameter("prjt_id_selected"));
		SWZP0110.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0110.setAut_cd(request.getParameter("aut_cd_selected"));

		List<SWZP0110DTO> list = swzp0110Service.select_0110(SWZP0110);

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
