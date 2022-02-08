package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7000DTO;
import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.service.PJTE7000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE7000", method = {RequestMethod.GET, RequestMethod.POST})
public class PJTE7000Controller {
	@Autowired
	private PJTE7000Service pjte7000Service;

	@GetMapping(value = "/select_grid1")
	public @ResponseBody String select_grid1(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE7000DTO PJTE7000 = new PJTE7000DTO();

		PJTE7000.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE7000.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE7000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE7000.setFile_cd(request.getParameter("file_cd_selected"));
		PJTE7000.setChk_cd(request.getParameter("chk_cd_selected"));
		PJTE7000.setSrh_cd(request.getParameter("srh_cd_selected"));
		PJTE7000.setSrh_nm(request.getParameter("srh_nm"));

		List<PJTE7000DTO> list = pjte7000Service.select_7000_01(PJTE7000);

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

	@GetMapping(value = "/select_grid2")
	public @ResponseBody String select_grid2(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE7000DTO PJTE7000 = new PJTE7000DTO();

		PJTE7000.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE7000.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE7000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE7000.setFile_cd(request.getParameter("file_cd_selected"));
		PJTE7000.setChk_cd(request.getParameter("chk_cd_selected"));
		PJTE7000.setSrh_cd(request.getParameter("srh_cd_selected"));
		PJTE7000.setSrh_nm(request.getParameter("srh_nm"));

		List<PJTE7000DTO> list = null;
		if(request.getParameter("chk_cd_selected").equals("100")){
			list = pjte7000Service.select_7000_02(PJTE7000);

			for(int i=0; i<list.size(); i++){
				list.get(i).setCate("산출물목록");
			}

		}else if(request.getParameter("chk_cd_selected").equals("200")){
			list = pjte7000Service.select_7000_03(PJTE7000);

			for(int i=0; i<list.size(); i++){
				list.get(i).setCate("산출물매핑 ID");
			}

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

	@PostMapping("create_grid2")
	public @ResponseBody boolean create_grid2(HttpServletRequest request, @RequestBody PJTE7000DTO PJTE7000) throws Exception{
		boolean result = false;
		PJTE7000DTO PJTE7000C = new PJTE7000DTO();
		PJTE7000DTO PJTE7000D = new PJTE7000DTO();


		PJTE7000D.setBkup_id(PJTE7000.getBkup_id());
		PJTE7000D.setPrjt_id(PJTE7000.getPrjt_id());
		PJTE7000D.setFile_cd(PJTE7000.getFile_cd());
		PJTE7000D.setBzcd(PJTE7000.getBzcd());

		result = pjte7000Service.delete_7000_01(PJTE7000D);


		for(int i=0; i<PJTE7000.getRowDatas().size(); i++) {
			PJTE7000C.setBkup_id(PJTE7000.getBkup_id());
			PJTE7000C.setPrjt_id(PJTE7000.getPrjt_id());
			PJTE7000C.setFile_cd(PJTE7000.getFile_cd());
			PJTE7000C.setBzcd(PJTE7000.getBzcd());
			PJTE7000C.setSqno(PJTE7000.getRowDatas().get(i).getSqno());
			PJTE7000C.setColm01(PJTE7000.getRowDatas().get(i).getColm01());
			PJTE7000C.setColm02(PJTE7000.getRowDatas().get(i).getColm02());
			PJTE7000C.setColm03(PJTE7000.getRowDatas().get(i).getColm03());
			PJTE7000C.setColm04(PJTE7000.getRowDatas().get(i).getColm04());
			PJTE7000C.setColm05(PJTE7000.getRowDatas().get(i).getColm05());
			PJTE7000C.setColm06(PJTE7000.getRowDatas().get(i).getColm06());
			PJTE7000C.setColm07(PJTE7000.getRowDatas().get(i).getColm07());
			PJTE7000C.setColm08(PJTE7000.getRowDatas().get(i).getColm08());
			PJTE7000C.setColm09(PJTE7000.getRowDatas().get(i).getColm09());
			PJTE7000C.setColm10(PJTE7000.getRowDatas().get(i).getColm10());
			PJTE7000C.setColm11(PJTE7000.getRowDatas().get(i).getColm11());
			PJTE7000C.setColm12(PJTE7000.getRowDatas().get(i).getColm12());
			PJTE7000C.setColm13(PJTE7000.getRowDatas().get(i).getColm13());
			PJTE7000C.setColm14(PJTE7000.getRowDatas().get(i).getColm14());
			PJTE7000C.setColm15(PJTE7000.getRowDatas().get(i).getColm15());
			PJTE7000C.setColm16(PJTE7000.getRowDatas().get(i).getColm16());
			PJTE7000C.setColm17(PJTE7000.getRowDatas().get(i).getColm17());




			result = pjte7000Service.insert_7000_01(PJTE7000C);
		}

		return result;
	}

	@GetMapping(value = "/select_grid3")
	public @ResponseBody String select_grid3(HttpServletRequest request) throws Exception{

		ObjectMapper mapper = new ObjectMapper();

		PJTE7000DTO PJTE7000 = new PJTE7000DTO();

		PJTE7000.setBkup_id(request.getParameter("bkup_id_selected"));
		PJTE7000.setPrjt_id(request.getParameter("prjt_nm_selected"));
		PJTE7000.setBzcd(request.getParameter("bzcd_selected"));
		PJTE7000.setFile_cd(request.getParameter("file_cd_selected"));
		PJTE7000.setChk_cd(request.getParameter("chk_cd_selected"));
		PJTE7000.setSrh_cd(request.getParameter("srh_cd_selected"));
		PJTE7000.setSrh_nm(request.getParameter("srh_nm"));
		PJTE7000.setFile_cd1(request.getParameter("file_cd1"));
		PJTE7000.setFile_cd2(request.getParameter("file_cd2"));

		List<PJTE7000DTO> list = null;
		if(request.getParameter("chk_cd_selected").equals("100")){
			list = pjte7000Service.select_7000_04(PJTE7000);

		}else if(request.getParameter("chk_cd_selected").equals("200")){
			list = pjte7000Service.select_7000_05(PJTE7000);

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
}
