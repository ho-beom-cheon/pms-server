package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE3001DTO;
import com.iteyes.dto.pms.PJTE3001DTO;
import com.iteyes.service.PJTE3001Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@Controller
@Log4j2
@RequestMapping(value = "/PJTE3001")
public class PJTE3001Controller {
    @Autowired
    private PJTE3001Service pjte3001Service;

    @GetMapping(value = "/combo")
    public @ResponseBody
    String combo(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE3001DTO PJTE3001 = new PJTE3001DTO();

        PJTE3001.setPrjt_id(request.getParameter("prjt_id"));

        List<PJTE3001DTO> list = pjte3001Service.select_0000_01(PJTE3001);
        List<PJTE3001DTO> list1 = pjte3001Service.select_0000_02(PJTE3001);
        List<PJTE3001DTO> list2 = pjte3001Service.select_0000_03(PJTE3001);
        List<PJTE3001DTO> list3 = pjte3001Service.select_0000_04(PJTE3001);

        HashMap<String, Object> hm = new HashMap();
        HashMap<String, Object> hm1 = new HashMap();
        HashMap<String, Object> hm1_pagination = new HashMap();
        hm.put("result", true);
        hm1.put("contents", list);
        hm1.put("contents1", list1);
        hm1.put("contents2", list2);
        hm1.put("contents3", list3);
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

        PJTE3001DTO PJTE3001 = new PJTE3001DTO();

        PJTE3001.setPrjt_id(request.getParameter("prjt_id"));
        PJTE3001.setBkup_id(request.getParameter("bkup_id"));
        PJTE3001.setMng_id(request.getParameter("mng_id"));

        List<PJTE3001DTO> list = pjte3001Service.select_3001_01(PJTE3001);

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

    @GetMapping(value = "/setdata")
    public @ResponseBody
    String setdata(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE3001DTO PJTE3001 = new PJTE3001DTO();

        PJTE3001.setPrjt_id(request.getParameter("prjt_id"));
        PJTE3001.setBkup_id(request.getParameter("bkup_id"));
        PJTE3001.setCctn_bzcd(request.getParameter("cctn_bzcd"));
        PJTE3001.setCctn_id(request.getParameter("cctn_id"));
        PJTE3001.setCctn_sqn_cd(request.getParameter("cctn_sqn_cd"));
        PJTE3001.setRgs_dscd(request.getParameter("rgs_dscd"));

        List<PJTE3001DTO> list = pjte3001Service.select_3001_02(PJTE3001);

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
    boolean update(@RequestBody PJTE3001DTO PJTE3001) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte3001Service.update_3001_01(PJTE3001);

        return result;

    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    String insert(@RequestBody PJTE3001DTO PJTE3001C) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE3001C.setPrjt_id(PJTE3001C.getPrjt_id());
        PJTE3001C.setOpr_no(PJTE3001C.getLogin_emp_no());


        result = pjte3001Service.insert_3001_01(PJTE3001C);

        String mng_id = null;
        if(result == true){
            List<PJTE3001DTO> list = pjte3001Service.select_3001_03(PJTE3001C);
            mng_id = list.get(0).getMng_id();
        }

        HashMap<String, Object> hm = new HashMap();
        hm.put("result", result);
        hm.put("mng_id", mng_id);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;

    }
}
