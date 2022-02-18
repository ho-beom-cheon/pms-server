package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.mapper.pms.PJTE9000Mapper;
import com.iteyes.service.PJTE9000Service;
import lombok.extern.log4j.Log4j2;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE9000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE9000Controller {
	@Autowired
	private PJTE9000Service pjte9000Service;

	@GetMapping(value = "/select")
	public @ResponseBody String select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9000DTO PJTE9000 = new PJTE9000DTO();

		PJTE9000.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE9000.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE9000.setGrp_tycd(request.getParameter("grp_tycd"));
		String grid_num = request.getParameter("grid_num");
		log.debug("grid number :: "+grid_num);

		List<PJTE9000DTO> list = null;
		if(grid_num.equals("1")){
			list = pjte9000Service.select_9000_01(PJTE9000);
		}else if(grid_num.equals("2")){
			list = pjte9000Service.select_9000_02(PJTE9000);

		}else if(grid_num.equals("3")){
			list = pjte9000Service.select_9000_03(PJTE9000);

		}

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

	@PostMapping("/create1")
	public @ResponseBody boolean create(@RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000C = new PJTE9000DTO();

		for(int i=0; i<PJTE9000.getCreatedRows().size(); i++) {
			PJTE9000C.setPrjt_id(PJTE9000.getCreatedRows().get(i).getPrjt_id());
			PJTE9000C.setEmpno(PJTE9000.getCreatedRows().get(i).getEmpno());
			PJTE9000C.setEmpnm(PJTE9000.getCreatedRows().get(i).getEmpnm());
			PJTE9000C.setEmail_addr(PJTE9000.getCreatedRows().get(i).getEmail_addr());
			PJTE9000C.setRank_nm(PJTE9000.getCreatedRows().get(i).getRank_nm());
			PJTE9000C.setCpno(PJTE9000.getCreatedRows().get(i).getCpno());
			PJTE9000C.setLgn_pwd(PJTE9000.getCreatedRows().get(i).getLgn_pwd());
			PJTE9000C.setBzcd(PJTE9000.getCreatedRows().get(i).getBzcd());
			PJTE9000C.setCatn_dcd(PJTE9000.getCreatedRows().get(i).getCatn_dcd());
			PJTE9000C.setAut_cd(PJTE9000.getCreatedRows().get(i).getAut_cd());
			PJTE9000C.setIp_addr(PJTE9000.getCreatedRows().get(i).getIp_addr());
			PJTE9000C.setPlan_thw_stdt(PJTE9000.getCreatedRows().get(i).getPlan_thw_stdt());
			PJTE9000C.setPlan_thw_endt(PJTE9000.getCreatedRows().get(i).getPlan_thw_endt());
			PJTE9000C.setReal_thw_stdt(PJTE9000.getCreatedRows().get(i).getReal_thw_stdt());
			PJTE9000C.setReal_thw_endt(PJTE9000.getCreatedRows().get(i).getReal_thw_endt());
			PJTE9000C.setLogin_emp_no(PJTE9000.getCreatedRows().get(i).getLogin_emp_no());
			PJTE9000C.setReal_prjt_id(PJTE9000.getCreatedRows().get(i).getReal_prjt_id());


			result = pjte9000Service.insert_9000_01(PJTE9000C);
		}
		return result;
	}

	@PutMapping("/update1")
	public @ResponseBody boolean update(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000U = new PJTE9000DTO();

		for(int i=0; i<PJTE9000.getUpdatedRows().size(); i++) {
			PJTE9000U.setBkup_id(PJTE9000.getUpdatedRows().get(i).getBkup_id());
			PJTE9000U.setPrjt_id(PJTE9000.getUpdatedRows().get(i).getPrjt_id());
			PJTE9000U.setEmpno(PJTE9000.getUpdatedRows().get(i).getEmpno());
			PJTE9000U.setEmpnm(PJTE9000.getUpdatedRows().get(i).getEmpnm());
			PJTE9000U.setEmail_addr(PJTE9000.getUpdatedRows().get(i).getEmail_addr());
			PJTE9000U.setRank_nm(PJTE9000.getUpdatedRows().get(i).getRank_nm());
			PJTE9000U.setCpno(PJTE9000.getUpdatedRows().get(i).getCpno());
			PJTE9000U.setLgn_pwd(PJTE9000.getUpdatedRows().get(i).getLgn_pwd());
			PJTE9000U.setBzcd(PJTE9000.getUpdatedRows().get(i).getBzcd());
			PJTE9000U.setCatn_dcd(PJTE9000.getUpdatedRows().get(i).getCatn_dcd());
			PJTE9000U.setAut_cd(PJTE9000.getUpdatedRows().get(i).getAut_cd());
			PJTE9000U.setIp_addr(PJTE9000.getUpdatedRows().get(i).getIp_addr());
			PJTE9000U.setPlan_thw_stdt(PJTE9000.getUpdatedRows().get(i).getPlan_thw_stdt());
			PJTE9000U.setPlan_thw_endt(PJTE9000.getUpdatedRows().get(i).getPlan_thw_endt());
			PJTE9000U.setReal_thw_stdt(PJTE9000.getUpdatedRows().get(i).getReal_thw_stdt());
			PJTE9000U.setReal_thw_endt(PJTE9000.getUpdatedRows().get(i).getReal_thw_endt());
			PJTE9000U.setLogin_emp_no(PJTE9000.getUpdatedRows().get(i).getLogin_emp_no());
			PJTE9000U.setReal_prjt_id(PJTE9000.getUpdatedRows().get(i).getReal_prjt_id());

			result = pjte9000Service.update_9000_01(PJTE9000U);
		}

		return result;
	}

	@PostMapping("/create2")
	public @ResponseBody boolean create2(@RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000C = new PJTE9000DTO();

		for(int i=0; i<PJTE9000.getCreatedRows().size(); i++) {
			PJTE9000C.setPrjt_id(PJTE9000.getCreatedRows().get(i).getPrjt_id());
			PJTE9000C.setGrp_tycd(PJTE9000.getCreatedRows().get(i).getGrp_tycd());
			PJTE9000C.setGrp_tymm(PJTE9000.getCreatedRows().get(i).getGrp_tymm());
			PJTE9000C.setGrid_colm_nm1(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm1());
			PJTE9000C.setGrid_colm_nm2(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm2());
			PJTE9000C.setGrid_colm_nm3(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm3());
			PJTE9000C.setGrid_colm_nm4(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm4());
			PJTE9000C.setGrid_colm_nm5(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm5());
			PJTE9000C.setGrid_colm_nm6(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm6());
			PJTE9000C.setGrid_colm_nm7(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm7());
			PJTE9000C.setGrid_colm_nm8(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm8());
			PJTE9000C.setGrid_colm_nm9(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm9());
			PJTE9000C.setGrid_colm_nm10(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm10());
			PJTE9000C.setGrid_colm_nm11(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm11());
			PJTE9000C.setGrid_colm_nm12(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm12());
			PJTE9000C.setGrid_colm_nm13(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm13());
			PJTE9000C.setGrid_colm_nm14(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm14());
			PJTE9000C.setGrid_colm_nm15(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm15());
			PJTE9000C.setGrid_colm_nm16(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm16());
			PJTE9000C.setGrid_colm_nm17(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm17());
			PJTE9000C.setGrid_colm_nm18(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm18());
			PJTE9000C.setGrid_colm_nm19(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm19());
			PJTE9000C.setGrid_colm_nm20(PJTE9000.getCreatedRows().get(i).getGrid_colm_nm20());
			PJTE9000C.setSort_seq(PJTE9000.getCreatedRows().get(i).getSort_seq());
			PJTE9000C.setUsg_yn(PJTE9000.getCreatedRows().get(i).getUsg_yn());
			PJTE9000C.setLogin_emp_no(PJTE9000.getCreatedRows().get(i).getLogin_emp_no());




			result = pjte9000Service.insert_9000_03(PJTE9000C);
		}
		return result;
	}

	@PutMapping("/update2")
	public @ResponseBody boolean update2(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000U = new PJTE9000DTO();

		for(int i=0; i<PJTE9000.getUpdatedRows().size(); i++) {
			PJTE9000U.setBkup_id(PJTE9000.getUpdatedRows().get(i).getBkup_id());
			PJTE9000U.setPrjt_id(PJTE9000.getUpdatedRows().get(i).getPrjt_id());
			PJTE9000U.setGrp_tycd(PJTE9000.getUpdatedRows().get(i).getGrp_tycd());
			PJTE9000U.setGrp_tymm(PJTE9000.getUpdatedRows().get(i).getGrp_tymm());
			PJTE9000U.setGrid_colm_nm1(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm1());
			PJTE9000U.setGrid_colm_nm2(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm2());
			PJTE9000U.setGrid_colm_nm3(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm3());
			PJTE9000U.setGrid_colm_nm4(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm4());
			PJTE9000U.setGrid_colm_nm5(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm5());
			PJTE9000U.setGrid_colm_nm6(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm6());
			PJTE9000U.setGrid_colm_nm7(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm7());
			PJTE9000U.setGrid_colm_nm8(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm8());
			PJTE9000U.setGrid_colm_nm9(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm9());
			PJTE9000U.setGrid_colm_nm10(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm10());
			PJTE9000U.setGrid_colm_nm11(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm11());
			PJTE9000U.setGrid_colm_nm12(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm12());
			PJTE9000U.setGrid_colm_nm13(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm13());
			PJTE9000U.setGrid_colm_nm14(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm14());
			PJTE9000U.setGrid_colm_nm15(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm15());
			PJTE9000U.setGrid_colm_nm16(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm16());
			PJTE9000U.setGrid_colm_nm17(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm17());
			PJTE9000U.setGrid_colm_nm18(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm18());
			PJTE9000U.setGrid_colm_nm19(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm19());
			PJTE9000U.setGrid_colm_nm20(PJTE9000.getUpdatedRows().get(i).getGrid_colm_nm20());
			PJTE9000U.setSort_seq(PJTE9000.getUpdatedRows().get(i).getSort_seq());
			PJTE9000U.setUsg_yn(PJTE9000.getUpdatedRows().get(i).getUsg_yn());
			PJTE9000U.setLogin_emp_no(PJTE9000.getUpdatedRows().get(i).getLogin_emp_no());

			result = pjte9000Service.update_9000_02(PJTE9000U);
		}

		return result;
	}



	@PostMapping("create3")
	public @ResponseBody boolean create3(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;
		PJTE9000DTO PJTE9000C = new PJTE9000DTO();
		PJTE9000DTO PJTE9000D = new PJTE9000DTO();

		String bkup_id = PJTE9000.getRowDatas().get(0).getBkup_id();
		String prjt_id = PJTE9000.getRowDatas().get(0).getPrjt_id();
		String grp_tycd = PJTE9000.getRowDatas().get(0).getGrp_tycd();

		log.debug("bkup_id :: "+bkup_id);
		log.debug("prjt_id :: "+prjt_id);
		log.debug("grp_tycd :: "+grp_tycd);

		PJTE9000D.setBkup_id(PJTE9000.getRowDatas().get(0).getBkup_id());
		PJTE9000D.setPrjt_id(PJTE9000.getRowDatas().get(0).getPrjt_id());
		PJTE9000D.setGrp_tycd(PJTE9000.getRowDatas().get(0).getGrp_tycd());

		result = pjte9000Service.delete_9000_01(PJTE9000D);


		for(int i=0; i<PJTE9000.getRowDatas().size(); i++) {
			PJTE9000C.setPrjt_id(PJTE9000.getRowDatas().get(i).getPrjt_id());
			PJTE9000C.setGrp_tycd(PJTE9000.getRowDatas().get(i).getGrp_tycd());
			PJTE9000C.setDtls_tycd(PJTE9000.getRowDatas().get(i).getDtls_tycd());
			PJTE9000C.setDtls_tynm(PJTE9000.getRowDatas().get(i).getDtls_tynm());
			PJTE9000C.setEtc_txt1(PJTE9000.getRowDatas().get(i).getEtc_txt1());
			PJTE9000C.setEtc_txt2(PJTE9000.getRowDatas().get(i).getEtc_txt2());
			PJTE9000C.setEtc_txt3(PJTE9000.getRowDatas().get(i).getEtc_txt3());
			PJTE9000C.setEtc_txt4(PJTE9000.getRowDatas().get(i).getEtc_txt4());
			PJTE9000C.setEtc_txt5(PJTE9000.getRowDatas().get(i).getEtc_txt5());
			PJTE9000C.setEtc_txt6(PJTE9000.getRowDatas().get(i).getEtc_txt6());
			PJTE9000C.setEtc_txt7(PJTE9000.getRowDatas().get(i).getEtc_txt7());
			PJTE9000C.setEtc_txt8(PJTE9000.getRowDatas().get(i).getEtc_txt8());
			PJTE9000C.setEtc_txt9(PJTE9000.getRowDatas().get(i).getEtc_txt9());
			PJTE9000C.setEtc_txt10(PJTE9000.getRowDatas().get(i).getEtc_txt10());
			PJTE9000C.setDtl_txt1(PJTE9000.getRowDatas().get(i).getDtl_txt1());
			PJTE9000C.setDtl_txt2(PJTE9000.getRowDatas().get(i).getDtl_txt2());
			PJTE9000C.setDtl_txt3(PJTE9000.getRowDatas().get(i).getDtl_txt3());
			PJTE9000C.setDtl_txt4(PJTE9000.getRowDatas().get(i).getDtl_txt4());
			PJTE9000C.setDtl_txt5(PJTE9000.getRowDatas().get(i).getDtl_txt5());
			PJTE9000C.setDtl_txt6(PJTE9000.getRowDatas().get(i).getDtl_txt6());
			PJTE9000C.setDtl_txt7(PJTE9000.getRowDatas().get(i).getDtl_txt7());
			PJTE9000C.setDtl_txt8(PJTE9000.getRowDatas().get(i).getDtl_txt8());
			PJTE9000C.setDtl_txt9(PJTE9000.getRowDatas().get(i).getDtl_txt9());
			PJTE9000C.setDtl_txt10(PJTE9000.getRowDatas().get(i).getDtl_txt10());
			PJTE9000C.setDtl_txt10(PJTE9000.getRowDatas().get(i).getDtl_txt10());
			PJTE9000C.setDtl_txt10(PJTE9000.getRowDatas().get(i).getDtl_txt10());
			PJTE9000C.setSort_seq(PJTE9000.getRowDatas().get(i).getSort_seq());
			PJTE9000C.setUse_yn(PJTE9000.getRowDatas().get(i).getUse_yn());




			result = pjte9000Service.insert_9000_02(PJTE9000C);
		}

		return result;
	}

	@GetMapping(value = "/select4")
	public @ResponseBody String select4(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9000DTO PJTE9000 = new PJTE9000DTO();

		PJTE9000.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE9000.setSel_yyyymmdd(request.getParameter("sel_yyyymmdd"));

		List<PJTE9000DTO> list = pjte9000Service.select_9000_50(PJTE9000);


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

	@PostMapping("create4")
	public @ResponseBody boolean create4(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;



		result = pjte9000Service.delete_9000_50(PJTE9000);

		for(int i=0; i<PJTE9000.getRowDatas().size(); i++){
			PJTE9000.setPrjt_id(PJTE9000.getRowDatas().get(i).getPrjt_id());
			PJTE9000.setDate(PJTE9000.getRowDatas().get(i).getDate());
			PJTE9000.setDate_cd(PJTE9000.getRowDatas().get(i).getDate_cd());
			PJTE9000.setHoliday_cd(PJTE9000.getRowDatas().get(i).getHoliday_cd());

			result = pjte9000Service.insert_9000_50(PJTE9000);

		}

		return result;
	}

	@PostMapping("update4")
	public @ResponseBody boolean update4(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;
		PJTE9000DTO PJTE9000U = new PJTE9000DTO();



		for(int i=0; i<PJTE9000.getUpdatedRows().size(); i++) {
			PJTE9000U.setPrjt_id(PJTE9000.getUpdatedRows().get(i).getPrjt_id());
			PJTE9000U.setDate(PJTE9000.getUpdatedRows().get(i).getDate());
			PJTE9000U.setDate_cd(PJTE9000.getUpdatedRows().get(i).getDate_cd());
			PJTE9000U.setHoliday_cd(PJTE9000.getUpdatedRows().get(i).getHoliday_cd());


			result = pjte9000Service.update_9000_50(PJTE9000U);
		}

		return result;
	}

	@GetMapping(value = "/backup_select")
	public @ResponseBody String backup_select(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE9000DTO PJTE9000 = new PJTE9000DTO();


		List list =  pjte9000Service.select_9000_10(PJTE9000);

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

	@PostMapping("/backup_update")
	public @ResponseBody boolean backup_update(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000C = new PJTE9000DTO();
		PJTE9000DTO PJTE9000D = new PJTE9000DTO();


		PJTE9000D.setNew_bkup_id(PJTE9000.getNew_bkup_id());
		PJTE9000D.setPrjt_id(PJTE9000.getPrjt_id());

		result = pjte9000Service.delete_9000_10(PJTE9000D);

		PJTE9000C.setNew_bkup_id(PJTE9000.getNew_bkup_id());
		PJTE9000C.setNew_bkup_nm(PJTE9000.getNew_bkup_nm());
		PJTE9000C.setPrjt_id(PJTE9000.getPrjt_id());
		PJTE9000C.setLogin_emp_no(PJTE9000.getLogin_emp_no());

		result = pjte9000Service.insert_9000_10(PJTE9000C);

		result = pjte9000Service.delete_9000_20(PJTE9000D);
		result = pjte9000Service.delete_9000_21(PJTE9000D);
		result = pjte9000Service.delete_9000_22(PJTE9000D);
		result = pjte9000Service.delete_9000_23(PJTE9000D);
		result = pjte9000Service.delete_9000_24(PJTE9000D);
		result = pjte9000Service.delete_9000_25(PJTE9000D);
		result = pjte9000Service.delete_9000_26(PJTE9000D);
		result = pjte9000Service.delete_9000_27(PJTE9000D);
		result = pjte9000Service.delete_9000_28(PJTE9000D);
		result = pjte9000Service.delete_9000_29(PJTE9000D);
		result = pjte9000Service.delete_9000_30(PJTE9000D);
		result = pjte9000Service.delete_9000_31(PJTE9000D);
		result = pjte9000Service.delete_9000_32(PJTE9000D);
		result = pjte9000Service.delete_9000_33(PJTE9000D);
		result = pjte9000Service.delete_9000_34(PJTE9000D);
		result = pjte9000Service.delete_9000_35(PJTE9000D);
		result = pjte9000Service.delete_9000_36(PJTE9000D);

		result = pjte9000Service.insert_9000_20(PJTE9000C);
		result = pjte9000Service.insert_9000_21(PJTE9000C);
		result = pjte9000Service.insert_9000_22(PJTE9000C);
		result = pjte9000Service.insert_9000_23(PJTE9000C);
		result = pjte9000Service.insert_9000_24(PJTE9000C);
		result = pjte9000Service.insert_9000_25(PJTE9000C);
		result = pjte9000Service.insert_9000_26(PJTE9000C);
		result = pjte9000Service.insert_9000_27(PJTE9000C);
		result = pjte9000Service.insert_9000_28(PJTE9000C);
		result = pjte9000Service.insert_9000_29(PJTE9000C);
		result = pjte9000Service.insert_9000_30(PJTE9000C);
		result = pjte9000Service.insert_9000_31(PJTE9000C);
		result = pjte9000Service.insert_9000_32(PJTE9000C);
		result = pjte9000Service.insert_9000_33(PJTE9000C);
		result = pjte9000Service.insert_9000_34(PJTE9000C);
		result = pjte9000Service.insert_9000_35(PJTE9000C);
		result = pjte9000Service.insert_9000_36(PJTE9000C);
		return result;
	}

	@PostMapping("/create_new_project_data")
	public @ResponseBody boolean create_new_project_data(HttpServletRequest request, @RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000C = new PJTE9000DTO();


		PJTE9000C.setNew_prjt_id(PJTE9000.getNew_prjt_id());
		PJTE9000C.setLogin_emp_no(PJTE9000.getLogin_emp_no());
		PJTE9000C.setPrjt_id(PJTE9000.getPrjt_id());

		result = pjte9000Service.delete_9000_90(PJTE9000C);
		result = pjte9000Service.delete_9000_91(PJTE9000C);
		result = pjte9000Service.delete_9000_92(PJTE9000C);
		result = pjte9000Service.delete_9000_93(PJTE9000C);

		result = pjte9000Service.insert_9000_90(PJTE9000C);
		result = pjte9000Service.insert_9000_91(PJTE9000C);
		result = pjte9000Service.insert_9000_92(PJTE9000C);
		result = pjte9000Service.insert_9000_93(PJTE9000C);
		return result;
	}

	@PostMapping("/excel_upload")
	public @ResponseBody boolean excel_upload(@RequestBody PJTE9000DTO PJTE9000) throws Exception{
		boolean result = false;

		PJTE9000DTO PJTE9000C = new PJTE9000DTO();

		// 기존 delete 쿼리문 쓰기 위해 new_prjt_id 변수에 prjt_id 값 지정
		PJTE9000C.setNew_prjt_id(PJTE9000.getPrjt_id());
		result = pjte9000Service.delete_9000_92(PJTE9000C);


		// 기존 insert 쿼리 사용
		for(int i=0; i<PJTE9000.getRowDatas().size(); i++) {
			PJTE9000C.setPrjt_id(PJTE9000.getRowDatas().get(i).getPrjt_id());
			PJTE9000C.setEmpno(PJTE9000.getRowDatas().get(i).getEmpno());
			PJTE9000C.setEmpnm(PJTE9000.getRowDatas().get(i).getEmpnm());
			PJTE9000C.setEmail_addr(PJTE9000.getRowDatas().get(i).getEmail_addr());
			PJTE9000C.setRank_nm(PJTE9000.getRowDatas().get(i).getRank_nm());
			PJTE9000C.setCpno(PJTE9000.getRowDatas().get(i).getCpno());
			PJTE9000C.setLgn_pwd(PJTE9000.getRowDatas().get(i).getLgn_pwd());
			PJTE9000C.setBzcd(PJTE9000.getRowDatas().get(i).getBzcd());
			PJTE9000C.setCatn_dcd(PJTE9000.getRowDatas().get(i).getCatn_dcd());
			PJTE9000C.setAut_cd(PJTE9000.getRowDatas().get(i).getAut_cd());
			PJTE9000C.setIp_addr(PJTE9000.getRowDatas().get(i).getIp_addr());
			PJTE9000C.setPlan_thw_stdt(PJTE9000.getRowDatas().get(i).getPlan_thw_stdt());
			PJTE9000C.setPlan_thw_endt(PJTE9000.getRowDatas().get(i).getPlan_thw_endt());
			PJTE9000C.setReal_thw_stdt(PJTE9000.getRowDatas().get(i).getReal_thw_stdt());
			PJTE9000C.setReal_thw_endt(PJTE9000.getRowDatas().get(i).getReal_thw_endt());
			PJTE9000C.setLogin_emp_no(PJTE9000.getRowDatas().get(i).getLogin_emp_no());
			PJTE9000C.setReal_prjt_id(PJTE9000.getRowDatas().get(i).getReal_prjt_id());


			result = pjte9000Service.insert_9000_01(PJTE9000C);
		}
		return result;
	}
}
