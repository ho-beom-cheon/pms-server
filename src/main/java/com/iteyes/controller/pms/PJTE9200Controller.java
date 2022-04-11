package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE5000DTO;
import com.iteyes.dto.pms.PJTE9200DTO;
import com.iteyes.service.PJTE9200Service;
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
@RequestMapping(value = "/PJTE9200")
public class PJTE9200Controller {
    @Autowired
    private PJTE9200Service pjte9200Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE9200DTO PJTE9200 = new PJTE9200DTO();

        PJTE9200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9200.setMtng_room_id(request.getParameter("mtng_room_id_selected"));
        PJTE9200.setRsr_strt(request.getParameter("rsr_strt"));
        PJTE9200.setRsr_endt(request.getParameter("rsr_endt"));
        PJTE9200.setRsr_no(request.getParameter("rsr_no"));

        List<PJTE9200DTO> list = pjte9200Service.select_9200_01(PJTE9200);

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

    @GetMapping(value = "/saveCheck")
    public @ResponseBody
    String saveCheck(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE9200DTO PJTE9200 = new PJTE9200DTO();

        PJTE9200.setPrjt_id(request.getParameter("prjt_id"));
        PJTE9200.setMtng_room_id(request.getParameter("mtng_room_id"));
        PJTE9200.setRsr_dt(request.getParameter("rsr_dt"));
        PJTE9200.setRsrv_strt(request.getParameter("rsrv_strt"));
        PJTE9200.setRsrv_endt(request.getParameter("rsrv_endt"));
        if(request.getParameter("sqno") != "" && request.getParameter("sqno") != null) {
            PJTE9200.setSqno(Integer.parseInt(request.getParameter("sqno")));
        }


        List<PJTE9200DTO> list = pjte9200Service.select_9200_02(PJTE9200);

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
    boolean update(@RequestBody PJTE9200DTO PJTE9200) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE9200DTO PJTE9200U = new PJTE9200DTO();
        /* dto 값 셋팅*/
        PJTE9200U.setPrjt_id(PJTE9200.getPrjt_id());
        PJTE9200U.setMtng_room_id(PJTE9200.getMtng_room_id());
        PJTE9200U.setSqno(PJTE9200.getSqno());
        PJTE9200U.setRsr_no(PJTE9200.getRsr_no());
        PJTE9200U.setRsr_dt(PJTE9200.getRsr_dt());
        PJTE9200U.setRsrv_strt(PJTE9200.getRsrv_strt());
        PJTE9200U.setRsrv_endt(PJTE9200.getRsrv_endt());
        PJTE9200U.setMtng_ttl(PJTE9200.getMtng_ttl());
        PJTE9200U.setAtfl_mng_id(PJTE9200.getAtfl_mng_id());
        PJTE9200U.setLogin_emp_no(PJTE9200.getLogin_emp_no());

        result = pjte9200Service.update_9200_01(PJTE9200U);

        return result;

    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody PJTE9200DTO PJTE9200C) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte9200Service.insert_9200_01(PJTE9200C);

        return result;

    }

    @PutMapping(value = "/delete")
    public @ResponseBody
    boolean delete(@RequestBody PJTE9200DTO PJTE9200) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE9200DTO PJTE9200D = new PJTE9200DTO();
        /* dto 값 셋팅*/
        PJTE9200D.setPrjt_id(PJTE9200.getPrjt_id());
        PJTE9200D.setMtng_room_id(PJTE9200.getMtng_room_id());
        PJTE9200D.setSqno(PJTE9200.getSqno());

        result = pjte9200Service.delete_9200_01(PJTE9200D);

        return result;

    }

}
