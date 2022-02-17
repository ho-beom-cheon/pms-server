package com.iteyes.controller.pms;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.iteyes.dto.FileData;
import com.iteyes.dto.pms.PJTE9003DTO;
import com.iteyes.service.PJTE9003Service;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE9003", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE9003Controller {
	@Autowired
	private PJTE9003Service pjte9003Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9003DTO PJTE9003 = new PJTE9003DTO();

		PJTE9003.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE9003.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE9003.setBzcd(request.getParameter("bzcd_selected"));
		PJTE9003.setSah_file_nm(request.getParameter("sah_file_nm"));
		PJTE9003.setFile_rgs_dscd(request.getParameter("file_rgs_dscd_selected"));

		List<PJTE9003DTO> list = pjte9003Service.select_9003_01(PJTE9003);

		HashMap<String, Object> hm = new HashMap();
		HashMap<String, Object> hm1 = new HashMap();
		hm.put("result", true);
		hm1.put("contents", list);
		hm.put("data", hm1);

		String jsonStr = mapper.writeValueAsString(hm);

		return jsonStr;

	}

	@GetMapping(value = "/fileDownload", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public ResponseEntity<Resource> downloadFile(String fileName) throws Exception{
		String fileFoler = "C:\\file_ex\\";
		log.debug("fileNm : ", fileName);
		Resource resource = new FileSystemResource(fileFoler + fileName);
		log.debug(resource);

		String resourceName = resource.getFilename();

		HttpHeaders headers = new HttpHeaders();

		try {
			headers.add("Content-Disposition", "attachment; filename="+ new String(resourceName.getBytes("UTF-8"),
					"ISO-8859-1"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
	}
}
