package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0040DTO;
import com.iteyes.service.SWZP0040Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0040", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0040Controller {
	@Autowired
	private SWZP0040Service swzp0040Service;

	@PostMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		SWZP0040DTO SWZP0040 = new SWZP0040DTO();

		SWZP0040.setRgpe_no(request.getParameter("rgpe_no"));
		SWZP0040.setDvlpe_no(request.getParameter("dvlpe_no"));
		SWZP0040.setPl_no(request.getParameter("pl_no"));
		SWZP0040.setMng_id(request.getParameter("mng_id"));
		SWZP0040.setErr_txt(request.getParameter("err_txt"));
		SWZP0040.setPrjt_nm(request.getParameter("prjt_nm_selected"));
		SWZP0040.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0040.setRgs_dscd(request.getParameter("rgs_dscd_selected"));
		SWZP0040.setErr_tycd(request.getParameter("err_tycd_selected"));
		SWZP0040.setErr_prc_step_cd(request.getParameter("err_prc_step_cd_selected"));

		List<SWZP0040DTO> list = swzp0040Service.select_0040(SWZP0040);

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
