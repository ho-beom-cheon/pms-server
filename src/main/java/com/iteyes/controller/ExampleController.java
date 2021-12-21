package com.iteyes.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.iteyes.controller.utils.FileUtil;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/example", method = {RequestMethod.GET, RequestMethod.POST})
public class ExampleController {
	@RequestMapping(value = "/{urlid}")
    public String movePage(@PathVariable("urlid") String urlid) throws Exception{
		log.debug("urlid :: [" + urlid + "]");
		return "contents/example/" + urlid;
    }

	@PostMapping(value = "/upload")
	public @ResponseBody String upload(@RequestParam String msg, @RequestParam MultipartFile[] files) throws IOException {

		FileUtil fileUtil = new FileUtil();

		fileUtil.uploadFileList(files) ;

		return "SUCCESS";
	}
}
