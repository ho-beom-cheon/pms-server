package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0050DTO;
import com.iteyes.service.SWZP0050Service;
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
@RequestMapping(value = "/SWZP0050", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0050Controller {
	@Autowired
	private SWZP0050Service swzp0050Service;

	@PostMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		SWZP0050DTO SWZP0050 = new SWZP0050DTO();

		SWZP0050.setReqpe_no(request.getParameter("reqe_no"));
		SWZP0050.setPrcpe_no(request.getParameter("prcpe_no"));
		SWZP0050.setReq_txt(request.getParameter("req_txt"));

		SWZP0050.setPrjt_id(request.getParameter("prjt_id_selected"));
		SWZP0050.setBzcd(request.getParameter("bzcd_selected"));
		SWZP0050.setReq_dscd(request.getParameter("req_dscd_selected"));
		SWZP0050.setReq_prc_step_cd(request.getParameter("req_prc_step_cd_selected"));


		List<SWZP0050DTO> list = swzp0050Service.select_0050(SWZP0050);

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
