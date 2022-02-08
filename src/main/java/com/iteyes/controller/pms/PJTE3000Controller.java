package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE3000DTO;
import com.iteyes.service.PJTE3000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE3000")
public class PJTE3000Controller {
    @Autowired
    private PJTE3000Service PJTE3000Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE3000DTO PJTE3000 = new PJTE3000DTO();

        PJTE3000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE3000.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE3000.setBzcd(request.getParameter("bzcd_selected"));
        PJTE3000.setRgs_dscd(request.getParameter("err_rgs_dscd_selected"));
        PJTE3000.setErr_tycd(request.getParameter("err_tycd_selected"));
        PJTE3000.setErr_prc_step_cd(request.getParameter("err_prc_step_cd_selected"));
        PJTE3000.setRgpe_no(request.getParameter("rgpe_no"));
        PJTE3000.setRgpe_nm(request.getParameter("rgpe_nm"));
        PJTE3000.setDvlpe_no(request.getParameter("dvlpe_no"));
        PJTE3000.setDvlpe_nm(request.getParameter("dvlpe_nm"));
        PJTE3000.setPl_no(request.getParameter("pl_no"));
        PJTE3000.setPl_nm(request.getParameter("pl_nm"));
        PJTE3000.setCctn_id(request.getParameter("cctn_id"));
        PJTE3000.setCctn_nm(request.getParameter("cctn_nm"));
        PJTE3000.setErr_txt(request.getParameter("err_txt"));
        PJTE3000.setRgs_sta_dt(request.getParameter("rgs_sta_dt"));
        PJTE3000.setRgs_end_dt(request.getParameter("rgs_end_dt"));
        PJTE3000.setTtmn_sta_dt(request.getParameter("ttmn_sta_dt"));
        PJTE3000.setTtmn_end_dt(request.getParameter("ttmn_end_dt"));
        PJTE3000.setCmpl_yn(request.getParameter("cmpl_yn"));

        List<PJTE3000DTO> list = PJTE3000Service.select_3000_01(PJTE3000);

        Map<String, Object> hm = new HashMap();
        Map<String, Object> hm1 = new HashMap();
        Map<String, Object> hm1_pagination = new HashMap();
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
