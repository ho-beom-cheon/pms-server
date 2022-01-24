package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE6001DTO;
import com.iteyes.mapper.pms.PJTE6001Mapper;
import com.iteyes.service.PJTE6001Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE6001", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE6001Controller {
	@Autowired
	private PJTE6001Service PJTE6001Service;

	@PostMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE6001DTO PJTE6001 = new PJTE6001DTO();

		PJTE6001.setMng_id(request.getParameter("mng_id"));
		PJTE6001.setPrjt_id(request.getParameter("prjt_id"));
		PJTE6001.setBkup_id(request.getParameter("bkup_id"));


		List<PJTE6001DTO> list = PJTE6001Service.select_6001_01(PJTE6001);

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

	@PostMapping(value = "/insert")
	public @ResponseBody
	boolean insert(@RequestBody PJTE6001DTO PJTE6001C) throws Exception {

		boolean result = false;

		ObjectMapper mapper = new ObjectMapper();

		PJTE6001C.setPrjt_id(PJTE6001C.getPrjt_id());
		PJTE6001C.setBkup_id(PJTE6001C.getBkup_id());
		PJTE6001C.setBzcd(PJTE6001C.getBzcd());
		PJTE6001C.setReq_dscd(PJTE6001C.getReq_dscd());
		PJTE6001C.setReqpe_no(PJTE6001C.getReqpe_no());
		PJTE6001C.setReq_txt(PJTE6001C.getReq_txt());
		PJTE6001C.setOpr_no(PJTE6001C.getLogin_emp_no());


		result = PJTE6001Service.insert_6001_01(PJTE6001C);

		return result;

	}

	@PostMapping(value = "/update")
	public @ResponseBody
	boolean update(@RequestBody PJTE6001DTO PJTE6001C) throws Exception {

		boolean result = false;

		ObjectMapper mapper = new ObjectMapper();

		PJTE6001C.setPrjt_id(PJTE6001C.getPrjt_id());
		PJTE6001C.setBkup_id(PJTE6001C.getBkup_id());
		PJTE6001C.setMng_id(PJTE6001C.getMng_id());

		PJTE6001C.setBzcd(PJTE6001C.getBzcd());
		PJTE6001C.setReq_dscd(PJTE6001C.getReq_dscd());
		PJTE6001C.setReqpe_no(PJTE6001C.getReqpe_no());
		PJTE6001C.setPrcpe_no(PJTE6001C.getPrcpe_no());
		PJTE6001C.setReq_dt(PJTE6001C.getReq_dt());
		PJTE6001C.setReq_txt(PJTE6001C.getReq_txt());
		PJTE6001C.setPrc_txt(PJTE6001C.getPrc_txt());
		PJTE6001C.setReq_prc_step_cd(PJTE6001C.getReq_prc_step_cd());
		PJTE6001C.setOpr_no(PJTE6001C.getLogin_emp_no());


		result = PJTE6001Service.update_6001_01(PJTE6001C);

		return result;

	}

}
