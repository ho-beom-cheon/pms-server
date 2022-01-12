package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE6000DTO;
import com.iteyes.service.PJTE6000Service;
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
@RequestMapping(value = "/PJTE6000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE6000Controller {
	@Autowired
	private PJTE6000Service PJTE6000Service;

	@PostMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE6000DTO PJTE6000 = new PJTE6000DTO();

		PJTE6000.setReqpe_no(request.getParameter("reqe_no"));
		PJTE6000.setPrcpe_no(request.getParameter("prcpe_no"));
		PJTE6000.setReq_txt(request.getParameter("req_txt"));

		PJTE6000.setPrjt_id(request.getParameter("prjt_id_selected"));
		PJTE6000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE6000.setReq_dscd(request.getParameter("req_dscd_selected"));
		PJTE6000.setReq_prc_step_cd(request.getParameter("req_prc_step_cd_selected"));


		List<PJTE6000DTO> list = PJTE6000Service.select_0050_01(PJTE6000);

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
