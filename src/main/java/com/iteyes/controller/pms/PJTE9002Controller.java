package com.iteyes.controller.pms;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.iteyes.dto.FileData;
import com.iteyes.dto.pms.PJTE9002DTO;
import com.iteyes.service.PJTE9002Service;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
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
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
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
//	public @ResponseBody String insert(HttpServletRequest request, @RequestParam("file") MultipartFile files) throws Exception{
//	public @ResponseBody String insert(MultipartHttpServletRequest request ) throws Exception{

	public ResponseEntity<String> insert(@RequestParam(value = "files", required = false) List<MultipartFile> files, @RequestParam("jsonList") String jsonList, HttpServletRequest request) throws Exception{

		boolean result = true;

		ObjectMapper objectMapper = new ObjectMapper()
				.registerModule(new SimpleModule());
		List<FileData> testHelloList = objectMapper.readValue(jsonList, new TypeReference<>() {});
		log.debug("testHello text = {}", testHelloList);
		if(files != null){
			for(MultipartFile mf : files){
				log.debug(mf.getOriginalFilename());
				String path = "C:\\file_ex\\";
				String file_nm = null;
				for(int i=0; i<testHelloList.size(); i++){
					if(testHelloList.get(i).getOrg_file_nm().equals(mf.getOriginalFilename())){
						file_nm = testHelloList.get(i).getFile_nm();
						break;
					}
				}
				File multiFile = new File(path + file_nm);

				InputStream input = mf.getInputStream();
				FileUtils.copyInputStreamToFile(input, multiFile);


			}
		}




		ObjectMapper mapper = new ObjectMapper();

		PJTE9002DTO PJTE9002 = new PJTE9002DTO();

		PJTE9002.setBkup_id(request.getParameter("bkup_id"));
		PJTE9002.setPrjt_id(request.getParameter("prjt_id"));
		PJTE9002.setAtfl_mng_id(request.getParameter("atfl_mng_id"));
		PJTE9002.setFile_rgs_dscd(request.getParameter("file_rgs_dscd"));

		PJTE9002.setMng_id(request.getParameter("mng_id"));
		PJTE9002.setSqn_cd(request.getParameter("sqn_cd"));
		PJTE9002.setTst_case_id(request.getParameter("tst_case_id"));
		PJTE9002.setPgm_id(request.getParameter("pgm_id"));
		PJTE9002.setBzcd(request.getParameter("bzcd"));
		PJTE9002.setLogin_emp_no(request.getParameter("login_emp_no"));
		String file_rgs_dscd = request.getParameter("file_rgs_dscd");

		// 첨부파일 데이터 전체삭제 후 insert 위한 delete 쿼리
		pjte9002Service.delete_9002_01(PJTE9002);

		for(int i=0; i<testHelloList.size(); i++){
			String file_path = testHelloList.get(i).getFile_path();
			String path = "C:\\file_ex\\";

			if(file_path != null){
				PJTE9002.setFile_path(testHelloList.get(i).getFile_path());
			}else{
				PJTE9002.setFile_path(path);
			}
			PJTE9002.setSqno(testHelloList.get(i).getSqno());
			PJTE9002.setFile_nm(testHelloList.get(i).getFile_nm());
			PJTE9002.setOrg_file_nm(testHelloList.get(i).getOrg_file_nm());
			PJTE9002.setRmrmk(testHelloList.get(i).getRmrmk());

			// file 데이터 저장(insert)
			result = pjte9002Service.insert_9002_01(PJTE9002);

			// 파일등록구분에 따른 저장(update)
			if(file_rgs_dscd.equals("100") || file_rgs_dscd.equals("101")){
				result = pjte9002Service.update_9002_04(PJTE9002);
			}else if(file_rgs_dscd.equals("200")){
				result = pjte9002Service.update_9002_02(PJTE9002);
			}else if(file_rgs_dscd.equals("300") || file_rgs_dscd.equals("400")){
				result = pjte9002Service.update_9002_01(PJTE9002);
			}else if(file_rgs_dscd.equals("500")){
				result = pjte9002Service.update_9002_05(PJTE9002);
			}else if(file_rgs_dscd.equals("600")){
				result = pjte9002Service.update_9002_03(PJTE9002);
			}else if(file_rgs_dscd.equals("700")){
				result = pjte9002Service.update_9002_06(PJTE9002);
			}
		}



		return new ResponseEntity<>("success",HttpStatus.OK);

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