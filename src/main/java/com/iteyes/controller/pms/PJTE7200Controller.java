package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7200DTO;
import com.iteyes.service.PJTE7200Service;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@Controller
@Log4j2
@RequestMapping(value = "/PJTE7200")
public class PJTE7200Controller {

    @Autowired
    private PJTE7200Service pjte7200Service;

    @GetMapping(value = "/select_7200_01")
    public @ResponseBody
    String select01(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200 = new PJTE7200DTO();

        PJTE7200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7200.setRqs_dt(request.getParameter("rqs_dt"));
        PJTE7200.setRls_dt(request.getParameter("rls_dt"));
        PJTE7200.setPrcs_stts_cd(request.getParameter("prcs_stts_cd_selected"));
        PJTE7200.setRqs_no(request.getParameter("rqs_no"));
        PJTE7200.setRvw_no(request.getParameter("rvw_no"));
        PJTE7200.setAprv_no(request.getParameter("aprv_no"));
        PJTE7200.setCmpl_yn(request.getParameter("cmpl_yn"));

        List<PJTE7200DTO> list = pjte7200Service.select_7200_01(PJTE7200);
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

    @GetMapping(value = "/select_7200_02")
    public @ResponseBody
    String select02(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200 = new PJTE7200DTO();


        PJTE7200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7200.setRqs_id(request.getParameter("rqs_id"));

        List<PJTE7200DTO> list = pjte7200Service.select_7200_02(PJTE7200);

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

    @PostMapping("/insert_7200_01")
    public @ResponseBody boolean insert(@RequestBody @NotNull PJTE7200DTO PJTE7200) throws Exception{
        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200S = new PJTE7200DTO();
        PJTE7200DTO PJTE7200D = new PJTE7200DTO();
        PJTE7200DTO PJTE7200N = new PJTE7200DTO();
        PJTE7200DTO PJTE7200I = new PJTE7200DTO();
        PJTE7200DTO PJTE7200U = new PJTE7200DTO();

        if(PJTE7200.getRqs_id().equals("")) {
            PJTE7200S.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200S.setBkup_id("0000000000");

            List<PJTE7200DTO> list1 = pjte7200Service.select_7200_03(PJTE7200S);

            PJTE7200I.setRqs_id(list1.get(0).getMax_rqs_id());

            PJTE7200N.setBkup_id("0000000000");
            PJTE7200N.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200N.setRqs_id(list1.get(0).getMax_rqs_id());
            PJTE7200N.setRsn_rqs(PJTE7200.getRsn_rqs());
            PJTE7200N.setRls_dt(PJTE7200.getRls_dt());
            PJTE7200N.setDstr(PJTE7200.getDstr());
            PJTE7200N.setPrcs_stts_cd(PJTE7200.getPrcs_stts_cd());
            PJTE7200N.setRqs_no(PJTE7200.getRqs_no());
            PJTE7200N.setRvw_no(PJTE7200.getRvw_no());
            PJTE7200N.setAprv_no(PJTE7200.getAprv_no());
            PJTE7200N.setRmrmk(PJTE7200.getRmrmk());
            PJTE7200N.setLogin_emp_no(PJTE7200.getLogin_emp_no());

            result = pjte7200Service.insert_7200_01(PJTE7200N);

        } else {
            PJTE7200I.setRqs_id(PJTE7200.getRqs_id());


            PJTE7200U.setBkup_id("0000000000");
            PJTE7200U.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200U.setRqs_id(PJTE7200.getRqs_id());
            PJTE7200U.setRsn_rqs(PJTE7200.getRsn_rqs());
            PJTE7200U.setRls_dt(PJTE7200.getRls_dt());
            PJTE7200U.setDstr(PJTE7200.getDstr());
            PJTE7200U.setPrcs_stts_cd(PJTE7200.getPrcs_stts_cd());
            PJTE7200U.setRqs_no(PJTE7200.getRqs_no());
            PJTE7200U.setRvw_no(PJTE7200.getRvw_no());
            PJTE7200U.setAprv_no(PJTE7200.getAprv_no());
            PJTE7200U.setRmrmk(PJTE7200.getRmrmk());
            PJTE7200U.setLogin_emp_no(PJTE7200.getLogin_emp_no());

            result = pjte7200Service.update_7200_01(PJTE7200U);

            /* dto 값 셋팅*/
            PJTE7200D.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200D.setBkup_id("0000000000");

            result = pjte7200Service.delete_7200_01(PJTE7200D);
        }


        for (int i = 0; i < PJTE7200.getRowDatas().size(); i++) {
            PJTE7200I.setBkup_id("0000000000");
            PJTE7200I.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200I.setSqno(i+1);
            PJTE7200I.setTst_case_id(PJTE7200.getRowDatas().get(i).getTst_case_id());
            PJTE7200I.setMdfc(PJTE7200.getRowDatas().get(i).getMdfc());
            PJTE7200I.setPck_nm(PJTE7200.getRowDatas().get(i).getPck_nm());
            PJTE7200I.setLogin_emp_no(PJTE7200.getLogin_emp_no());
            result = pjte7200Service.insert_7200_02(PJTE7200I);
        }

        return result;
    }



}
