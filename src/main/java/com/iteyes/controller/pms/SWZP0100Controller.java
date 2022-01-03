package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0100DTO;
import com.iteyes.service.SWZP0100Service;
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
@RequestMapping(value = "/SWZP0100", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0100Controller {
	@Autowired
	private SWZP0100Service swzp0100Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		SWZP0100DTO SWZP0100 = new SWZP0100DTO();

		SWZP0100.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0100.setFile_cd(request.getParameter("file_cd_selected"));
		SWZP0100.setCheck_cd(request.getParameter("check_cd_selected"));
		SWZP0100.setSearch_cd(request.getParameter("search_cd_selected"));
		SWZP0100.setSearchbox_cd(request.getParameter("searchbox_cd"));

		List<SWZP0100DTO> list = swzp0100Service.select_0100(SWZP0100);

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
