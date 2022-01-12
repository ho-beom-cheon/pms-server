package com.iteyes.controller.pms;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.iteyes.dto.pms.PJTE5000DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.service.PJTE5000Service;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE5000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE5000Controller {

	@Autowired
	private PJTE5000Service pjte5000Service;

	@PostMapping(value = "/select")
    public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();
    	List<PJTE5000DTO> list = pjte5000Service.select_5000_01();

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
