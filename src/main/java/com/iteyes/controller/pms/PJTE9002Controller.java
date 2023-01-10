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
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import java.io.*;
import java.util.HashMap;
import java.util.List;

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

	@Value("${file-upload-dir}")
	private String file_upload_dir;

	@Value("${upload-form-dir}")
	private String upload_form_dir;

	@PostMapping("/insert")
//	public @ResponseBody String insert(HttpServletRequest request, @RequestParam("file") MultipartFile files) throws Exception{
//	public @ResponseBody String insert(MultipartHttpServletRequest request ) throws Exception{

	public ResponseEntity<String> insert(@RequestParam(value = "files", required = false) List<MultipartFile> files, @RequestParam("jsonList") String jsonList, HttpServletRequest request) throws Exception{

		boolean result = true;

		ObjectMapper objectMapper = new ObjectMapper()
				.registerModule(new SimpleModule());
		List<FileData> testHelloList = objectMapper.readValue(jsonList, new TypeReference<List<FileData>>() {});
		log.debug("testHello text = {}", testHelloList);

		if(files != null){
			// 파일업로드 디렉토리 만들기
			// 파일등록구분코드가 900,901 때는 uploadForm
			File folder = null;

			log.debug("upload_form_dir :: "+upload_form_dir);
			log.debug("file_upload_dir :: "+file_upload_dir);
			if(request.getParameter("file_rgs_dscd").equals("900") || request.getParameter("file_rgs_dscd").equals("901") || request.getParameter("file_rgs_dscd").equals("902")){
//				folder = new File("/home/admin/fileUpload/uploadForm/"+request.getParameter("file_rgs_dscd"));
				folder = new File(upload_form_dir+request.getParameter("file_rgs_dscd"));

			}else{
//				folder = new File("/home/admin/fileUpload/"+request.getParameter("prjt_id"));
				folder = new File(file_upload_dir+request.getParameter("prjt_id"));

			}
			if (!folder.exists()) {
				if (folder.mkdir()) {
					log.debug("Directory is created!");
				} else {
					log.debug("Failed to create directory!");
				}
			}

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
				File multiFile = new File(folder+ "/" + file_nm);

				InputStream input = mf.getInputStream();
				FileUtils.copyInputStreamToFile(input, multiFile);


			}
		}




		ObjectMapper mapper = new ObjectMapper();

		PJTE9002DTO PJTE9002 = new PJTE9002DTO();

		log.debug("pgm_id : "+request.getParameter("pgm_id"));
		log.debug("tst_case_id : "+request.getParameter("tst_case_id"));
		log.debug("sqn_cd : "+request.getParameter("sqn_cd"));


		String atfl_mng_id = request.getParameter("atfl_mng_id");
		PJTE9002.setBkup_id(request.getParameter("bkup_id"));
		PJTE9002.setPrjt_id(request.getParameter("prjt_id"));
		PJTE9002.setFile_rgs_dscd(request.getParameter("file_rgs_dscd"));
		PJTE9002.setLogin_emp_no(request.getParameter("login_emp_no"));

		PJTE9002.setMng_id(request.getParameter("mng_id"));
		PJTE9002.setSqn_cd(request.getParameter("sqn_cd"));
		PJTE9002.setTst_case_id(request.getParameter("tst_case_id"));
		PJTE9002.setPgm_id(request.getParameter("pgm_id"));
		PJTE9002.setBzcd(request.getParameter("bzcd"));
		PJTE9002.setRoom_sqno(request.getParameter("room_sqno"));

		PJTE9002.setWeek_sqn_cd(request.getParameter("week_sqn_cd"));
		PJTE9002.setWeek_yymm(request.getParameter("week_yymm"));
		PJTE9002.setReal_prjt_id(request.getParameter("real_prjt_id"));

		String file_rgs_dscd = request.getParameter("file_rgs_dscd");



		// 첨부파일관리ID 존재여부에 따라 다른 로직
		List<PJTE9002DTO> list = pjte9002Service.select_9002_10(PJTE9002);
		PJTE9002.setDtls_tynm(list.get(0).getDtls_tynm());
		if(request.getParameter("atfl_mng_id") == null || request.getParameter("atfl_mng_id").isEmpty()){

			log.debug("atfl_mng_id isn't exist :: "+list.get(0).getAtfl_mng_id());
			PJTE9002.setAtfl_mng_id(list.get(0).getAtfl_mng_id());
			atfl_mng_id = list.get(0).getAtfl_mng_id();

			// 상세코드 테이블에 채번ID update/insert
			if(list.get(0).getDtls_tynm().equals("0000001")){
				result = pjte9002Service.insert_9002_10(PJTE9002);
			}else{
				result = pjte9002Service.update_9002_10(PJTE9002);
			}

		}else{
			PJTE9002.setAtfl_mng_id(request.getParameter("atfl_mng_id"));
			log.debug("atfl_mng_id is exist"+request.getParameter("atfl_mng_id"));

		}

		// 첨부파일 데이터 전체삭제 후 insert 위한 delete 쿼리
		pjte9002Service.delete_9002_01(PJTE9002);

		String path = null;
		// 파일등록구분코드에 따른 path 설정
		if(request.getParameter("file_rgs_dscd").equals("900") || request.getParameter("file_rgs_dscd").equals("901") || request.getParameter("file_rgs_dscd").equals("902") ){
//			path = "/home/admin/fileUpload/uploadForm/" + request.getParameter("file_rgs_dscd");
			path = upload_form_dir + request.getParameter("file_rgs_dscd");
		}else{
//			path = "/home/admin/fileUpload/"+request.getParameter("prjt_id");
			path = file_upload_dir+request.getParameter("prjt_id");

		}

		for(int i=0; i<testHelloList.size(); i++){

			String file_path = testHelloList.get(i).getFile_path();
//			String path = "C:\\file_ex\\";


			if(file_path == null || file_path.isEmpty()){
				PJTE9002.setFile_path(path);
			}else{
				PJTE9002.setFile_path(testHelloList.get(i).getFile_path());
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
			}else if(file_rgs_dscd.equals("800")){
				result = pjte9002Service.update_9002_07(PJTE9002);
			}else if(file_rgs_dscd.equals("801")){
				result = pjte9002Service.update_9002_08(PJTE9002);
			}else if(file_rgs_dscd.equals("802")){
				result = pjte9002Service.update_9002_09(PJTE9002);
			}else if(file_rgs_dscd.equals("803")){
				result = pjte9002Service.update_9002_11(PJTE9002);
			}else if(file_rgs_dscd.equals("804")){
				result = pjte9002Service.update_9002_12(PJTE9002);
			}else if(file_rgs_dscd.equals("805")){
				result = pjte9002Service.update_9002_13(PJTE9002);
			}else if(file_rgs_dscd.equals("806")){
				result = pjte9002Service.update_9002_14(PJTE9002);
			}
		}


		return new ResponseEntity<>("success/"+atfl_mng_id,HttpStatus.OK);

	}

	@GetMapping(value = "/fileDownload", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public ResponseEntity<Resource> downloadFile(String fileName, String filePath) throws Exception{
//		String fileFoler = "C:\\file_ex\\";
		log.debug("fileNm : ", fileName);
		log.debug("filePath : ", filePath);

		Resource resource = new FileSystemResource(filePath + "/" + fileName);
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
