package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE1000DTO;
import com.iteyes.service.PJTE1000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE1000")
public class PJTE1000Controller {

    @Autowired
    private PJTE1000Service PJTE1000Service;

    @GetMapping(value = "/days")
    public @ResponseBody
    String days(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE1000DTO PJTE1000 = new PJTE1000DTO();

        PJTE1000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE1000.setBkup_id(request.getParameter("bkup_id_selected"));

        List<PJTE1000DTO> list01 = PJTE1000Service.select_1000_01(PJTE1000);

        Map<String, Object> hm = new HashMap();
        Map<String, Object> hm1 = new HashMap();
        Map<String, Object> hm1_pagination = new HashMap();
        hm.put("result", true);
        hm1.put("contents", list01);
        hm1_pagination.put("page", 1);
        hm1_pagination.put("totalCount", 100);
        hm1.put("pagination", hm1_pagination);
        hm.put("data", hm1);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;
    }
    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE1000DTO PJTE1000 = new PJTE1000DTO();

        PJTE1000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE1000.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE1000.setLogin_emp_no(request.getParameter("login_emp_no"));
        PJTE1000.setLogin_bzcd(request.getParameter("login_bzcd"));
        PJTE1000.setLogin_aut_cd(request.getParameter("login_aut_cd"));
        PJTE1000.setGubun(request.getParameter("gubun"));
        PJTE1000.setRowNum(request.getParameter("rowNum"));

        List<PJTE1000DTO> list01 = PJTE1000Service.select_1000_01(PJTE1000);

        PJTE1000.setS_day(list01.get(0).getS_day());
        PJTE1000.setProc_dt(list01.get(0).getProc_dt());
        PJTE1000.setErr_proc_dt(list01.get(0).getErr_proc_dt());
        PJTE1000.setProc_days(list01.get(0).getProc_days());
        PJTE1000.setErr_proc_days(list01.get(0).getErr_proc_days());


        List<PJTE1000DTO> list = PJTE1000Service.select_1000(PJTE1000);

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

    @PutMapping(value = "/update")
    public @ResponseBody
    boolean update(@RequestBody PJTE1000DTO PJTE1000) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = PJTE1000Service.update_1000_01(PJTE1000);

        return result;

    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody PJTE1000DTO PJTE1000C) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = PJTE1000Service.insert_1000_01(PJTE1000C);

        return result;

    }
}
