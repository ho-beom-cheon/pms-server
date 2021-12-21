package com.iteyes.controller.pms;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.board.BoardDTO;
import com.iteyes.dto.pms.SWZP0010DTO;
import com.iteyes.service.SWZP0010Service;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/SWZP0010", method = {RequestMethod.GET, RequestMethod.POST})
public class SWZP0010Controller {
	@Autowired
	private SWZP0010Service swzp0010Service;

	@RequestMapping(value = "/select")
    public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();
    	
    	log.debug("# pgm_id :: "   + request.getParameter("pgm_id"));
    	log.debug("# pgm_nm :: "   + request.getParameter("pgm_nm"));
    	log.debug("# pl_no :: "    + request.getParameter("pl_no"));
    	log.debug("# dvlpe_no :: " + request.getParameter("dvlpe_no"));
    	log.debug("# pgm_dis_cd :: " + request.getParameter("pgm_dis_cd_selected"));
    	log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
    	log.debug("# dvlp_dis_cd :: " + request.getParameter("dvlp_dis_cd_selected"));
    	
    	SWZP0010DTO SWZP0010 = new SWZP0010DTO();
    	
    	SWZP0010.setPgm_id(request.getParameter("pgm_id"));
    	SWZP0010.setPgm_nm(request.getParameter("pgm_nm"));
    	SWZP0010.setPl_no(request.getParameter("pl_no"));
    	SWZP0010.setDvlpe_no(request.getParameter("dvlpe_no"));
    	SWZP0010.setPgm_dis_cd(request.getParameter("pgm_dis_cd_selected"));
    	SWZP0010.setBzcd(request.getParameter("bzcd_selected"));
    	SWZP0010.setDvlp_dis_cd(request.getParameter("dvlp_dis_cd_selected"));
    	
    	List<SWZP0010DTO> list = swzp0010Service.select_0010(SWZP0010);
    	
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
