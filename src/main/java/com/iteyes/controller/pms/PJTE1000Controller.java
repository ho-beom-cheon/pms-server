package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE1000DTO;
import com.iteyes.service.PJTE1000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE1000")
public class PJTE1000Controller {
	@Autowired
	private PJTE1000Service PJTE1000Service;

	@GetMapping(value = "/select")
	public @ResponseBody
	String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE1000DTO PJTE1000 = new PJTE1000DTO();

		PJTE1000.setPrjt_id(request.getParameter("prjt_id_selected"));
		PJTE1000.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE1000.setLogin_emp_no(request.getParameter("login_emp_no"));
		PJTE1000.setLogin_bzcd(request.getParameter("login_bzcd"));
		PJTE1000.setLogin_aut_cd(request.getParameter("login_aut_cd"));

		List<PJTE1000DTO> list = PJTE1000Service.select_1000_01(PJTE1000);

		Map<String, Object> hm = new HashMap();
		Map<String, Object> hm1 = new HashMap();
		Map<String, Object> hm1_pagination = new HashMap();
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
