package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE4000DTO;
import com.iteyes.service.PJTE4000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
@CrossOrigin
@Controller
@Log4j2
@RequestMapping(value = "/PJTE4000")
public class PJTE4000Controller {
    @Autowired
    private PJTE4000Service pjte4000Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE4000DTO PJTE4000 = new PJTE4000DTO();

        PJTE4000.setLogin_emp_no(request.getParameter("login_emp_no"));
        PJTE4000.setLogin_bzcd(request.getParameter("login_bzcd"));
        PJTE4000.setLogin_aut_cd(request.getParameter("login_aut_cd"));
        PJTE4000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE4000.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE4000.setRgs_dis_cd(request.getParameter("rgs_dis_cd_selected"));
        PJTE4000.setReq_dis_cd(request.getParameter("req_dis_cd_selected"));
        PJTE4000.setPrc_step_cd(request.getParameter("prc_step_cd_selected"));
        PJTE4000.setTgt_biz_nm(request.getParameter("tgt_biz_nm"));
        PJTE4000.setAchi_nm(request.getParameter("achi_nm"));
        PJTE4000.setTtmn_crpe_nm(request.getParameter("ttmn_crpe_nm"));
        PJTE4000.setRgs_sta_dt(request.getParameter("rgs_sta_dt"));
        PJTE4000.setRgs_end_dt(request.getParameter("rgs_end_dt"));
        PJTE4000.setTtmn_sta_dt(request.getParameter("ttmn_sta_dt"));
        PJTE4000.setTtmn_end_dt(request.getParameter("ttmn_end_dt"));
        PJTE4000.setTitl_nm(request.getParameter("titl_nm"));
        PJTE4000.setReq_dis_txt(request.getParameter("req_dis_txt"));
        PJTE4000.setTtmn_txt(request.getParameter("ttmn_txt"));
        PJTE4000.setSlv_mpln_txt(request.getParameter("slv_mpln_txt"));
        PJTE4000.setCmpl_yn(request.getParameter("cmpl_yn"));

        List<PJTE4000DTO> list = pjte4000Service.select_4000_01(PJTE4000);

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

    @PutMapping(value = "/update")
    public @ResponseBody
    boolean update(@RequestBody PJTE4000DTO PJTE4000) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte4000Service.update_4000_01(PJTE4000);

        return result;

    }
//testtest
    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody PJTE4000DTO PJTE4000C) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte4000Service.insert_4000_01(PJTE4000C);

        return result;

    }
}
