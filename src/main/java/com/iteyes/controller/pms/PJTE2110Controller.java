package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE2110DTO;
import com.iteyes.service.PJTE2110Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE2110")
public class PJTE2110Controller {
	@Autowired
	private PJTE2110Service pjte2110Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE2110DTO PJTE2110 = new PJTE2110DTO();

		PJTE2110.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE2110.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE2110.setBzcd(request.getParameter("bzcd_selected"));
		PJTE2110.setSqn_cd(request.getParameter("sqn_cd_selected"));
		PJTE2110.setInp_date(request.getParameter("inq_date"));
		PJTE2110.setEmp_nm(request.getParameter("emp_nm"));
		PJTE2110.setGubun(request.getParameter("gubun"));
		PJTE2110.setProc_days(request.getParameter("proc_days"));


		List<PJTE2110DTO> list = pjte2110Service.select_2110(PJTE2110);

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
