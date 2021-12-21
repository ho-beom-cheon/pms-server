package com.iteyes.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class MainController {

	@RequestMapping(value = {"/", } )
    public String login(HttpServletRequest request) throws Exception{
		return "index.html";
    }

	@RequestMapping(value = "/index")
	public RedirectView index(HttpServletRequest request) throws Exception{
		return new RedirectView("pms/SWZP0010") ;
	}

	@RequestMapping(value = "/login")
    public @ResponseBody String loginResult(HttpServletRequest request) throws Exception{

		log.debug("## loginResult ") ;
		log.debug("## request :: " + request.getParameterValues("userId")) ;
		log.debug("## request :: " + request.getParameter("userId")) ;

		ObjectMapper mapper = new ObjectMapper();

    	HashMap<String, String> hm = new HashMap<>() ;
    	hm.put("token", "abbc");
    	hm.put("userId", request.getParameter("userId"));

    	String jsonStr = mapper.writeValueAsString(hm);

    	return jsonStr;

    }
}
