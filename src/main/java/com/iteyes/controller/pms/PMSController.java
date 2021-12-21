package com.iteyes.controller.pms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/pms", method = {RequestMethod.GET, RequestMethod.POST})
public class PMSController {
	@RequestMapping(value = "/{urlid}")
    public String movePage(@PathVariable("urlid") String urlid) throws Exception{
		log.debug("urlid :: [" + urlid + "]");
		return "contents/pms/" + urlid;
    }
}
