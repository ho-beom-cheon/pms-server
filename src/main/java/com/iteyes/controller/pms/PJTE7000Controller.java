package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7000DTO;
import com.iteyes.service.PJTE7000Service;
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
@RequestMapping(value = "/PJTE7000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE7000Controller {
	@Autowired
	private PJTE7000Service pjte7000Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE7000DTO PJTE7000 = new PJTE7000DTO();

		PJTE7000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE7000.setFile_cd(request.getParameter("file_cd_selected"));
		PJTE7000.setCheck_cd(request.getParameter("check_cd_selected"));
		PJTE7000.setSearch_cd(request.getParameter("search_cd_selected"));
		PJTE7000.setSearchbox_cd(request.getParameter("searchbox_cd"));

		List<PJTE7000DTO> list = pjte7000Service.select_7000_01(PJTE7000);

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
