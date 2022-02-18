package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE8000DTO;
import com.iteyes.service.PJTE8000Service;
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
@RequestMapping(value = "/PJTE8000")
public class PJTE8000Controller {

    @Autowired
    private PJTE8000Service pjte8000Service;

    @GetMapping(value = "/select01")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE8000DTO PJTE8000 = new PJTE8000DTO();

        PJTE8000.setLogin_emp_no(request.getParameter("login_emp_no"));
        PJTE8000.setLogin_bzcd(request.getParameter("login_bzcd"));
        PJTE8000.setLogin_aut_cd(request.getParameter("login_aut_cd"));
        PJTE8000.setLogin_proj_id(request.getParameter("login_proj_id"));
        PJTE8000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE8000.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE8000.setWeek_yymm(request.getParameter("week_yymm"));
        PJTE8000.setPm_no(request.getParameter("pm_no"));
        PJTE8000.setReal_prjt_id(request.getParameter("real_prjt_id_selected"));
        PJTE8000.setWeek_sqn_cd(request.getParameter("week_sqn_cd_selected"));
        PJTE8000.setDept_cd(request.getParameter("dept_cd_selected"));

        List<PJTE8000DTO> list = pjte8000Service.select_8000_01(PJTE8000);

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
