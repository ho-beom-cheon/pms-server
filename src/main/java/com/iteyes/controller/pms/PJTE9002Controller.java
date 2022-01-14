package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.PJTE0000DTO;
import com.iteyes.dto.User;
import com.iteyes.dto.pms.PJTE9002DTO;
import com.iteyes.service.PJTE9002Service;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE9002", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE9002Controller {
	@Autowired
	private PJTE9002Service pjte9002Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9002DTO PJTE9002 = new PJTE9002DTO();

		PJTE9002.setBkup_id(request.getParameter("bkup_id"));
		PJTE9002.setPrjt_id(request.getParameter("prjt_id_selected"));
		PJTE9002.setAtfl_mng_id(request.getParameter("atfl_mng_id"));
		PJTE9002.setFile_rgs_dscd(request.getParameter("file_rgs_dscd"));

		List<PJTE9002DTO> list = pjte9002Service.select_9002_01(PJTE9002);

		HashMap<String, Object> hm = new HashMap();
		HashMap<String, Object> hm1 = new HashMap();
		hm.put("result", true);
		hm1.put("fileList", list);
		hm.put("data", hm1);

		String jsonStr = mapper.writeValueAsString(hm);

		return jsonStr;

	}

	@PostMapping("/insert")
	public @ResponseBody String insert(HttpServletRequest request, @RequestParam("file") MultipartFile files) throws Exception{
		String result = "success";


		ObjectMapper mapper = new ObjectMapper();

		PJTE9002DTO PJTE9002 = new PJTE9002DTO();


		String sqno = request.getParameter("sqno");
		String file_nm = request.getParameter("file_nm");
		String org_file_nm = request.getParameter("org_file_nm");
		String rmrmk = request.getParameter("rmrmk");
		String path = "C:\\file_ex\\";
		String filename = files.getOriginalFilename();
		File multiFile = new File(path + filename);

		log.debug("sqno :: "+ sqno);
		log.debug("file_nm :: "+ file_nm);
		log.debug("org_file_nm :: "+ org_file_nm);
		log.debug("rmrmk :: "+ rmrmk);

		InputStream input = files.getInputStream();
		FileUtils.copyInputStreamToFile(input, multiFile);

		PJTE9002.setPrjt_id(request.getParameter("prjt_id"));
		PJTE9002.setAtfl_mng_id(request.getParameter("atfl_mng_id"));
		PJTE9002.setFile_rgs_dscd(request.getParameter("file_rgs_dscd"));

		PJTE9002.setSqno(request.getParameter("sqno"));
		PJTE9002.setFile_nm(request.getParameter("file_nm"));
		PJTE9002.setOrg_file_nm(request.getParameter("org_file_nm"));
		PJTE9002.setRmrmk(request.getParameter("rmrmk"));

		result = pjte9002Service.insert_9002_01(PJTE9002);

		return "success";

	}
}
