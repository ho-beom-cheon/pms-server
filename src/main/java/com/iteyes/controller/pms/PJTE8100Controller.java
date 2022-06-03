package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE8100DTO;
import com.iteyes.service.PJTE8100Service;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@Controller
@Log4j2
@RequestMapping(value = "/PJTE8100")
public class PJTE8100Controller {

    @Autowired
    private PJTE8100Service pjte8100Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE8100DTO PJTE8100 = new PJTE8100DTO();

        PJTE8100.setLogin_emp_no(request.getParameter("login_emp_no"));
        PJTE8100.setLogin_bzcd(request.getParameter("login_bzcd"));
        PJTE8100.setLogin_aut_cd(request.getParameter("login_aut_cd"));
        PJTE8100.setLogin_proj_id(request.getParameter("login_proj_id"));

        PJTE8100.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE8100.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE8100.setAthr_no(request.getParameter("athr_no"));
        PJTE8100.setMtn_sdt(request.getParameter("mtn_sdt"));
        PJTE8100.setMtn_edt(request.getParameter("mtn_edt"));
        PJTE8100.setDel_yn(request.getParameter("del_yn"));
        PJTE8100.setCnf_wek(request.getParameter("cnf_wek"));
        PJTE8100.setMtn_dtl(request.getParameter("mtn_dtl"));

        List<PJTE8100DTO> list = pjte8100Service.select_8100_01(PJTE8100);

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

    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody PJTE8100DTO PJTE8100) throws Exception {

        Logger logger = LogManager.getLogger(this.getClass());

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte8100Service.insert_8100_01(PJTE8100);

        return result;

    }

    @PutMapping(value = "/update")
    public @ResponseBody
    boolean update(@RequestBody PJTE8100DTO PJTE8100) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE8100DTO PJTE8100U = new PJTE8100DTO();
        /* dto 값 셋팅*/
        PJTE8100U.setPrjt_id(PJTE8100.getPrjt_id());
        PJTE8100U.setMng_id(PJTE8100.getMng_id());
        PJTE8100U.setCnf_wek(PJTE8100.getCnf_wek());
        PJTE8100U.setMtn_dt(PJTE8100.getMtn_dt());
        PJTE8100U.setMtn_tm(PJTE8100.getMtn_tm());
        PJTE8100U.setMtn_plc(PJTE8100.getMtn_plc());
        PJTE8100U.setAthr_no(PJTE8100.getAthr_no());
        PJTE8100U.setMtn_dtl(PJTE8100.getMtn_dtl());
        PJTE8100U.setMtn_dtl(PJTE8100.getMtn_dtl());

        PJTE8100U.setMtn_rsl(PJTE8100.getMtn_rsl());
        PJTE8100U.setRqs_dtl(PJTE8100.getRqs_dtl());
        PJTE8100U.setAtnd_dtl(PJTE8100.getAtnd_dtl());

        PJTE8100U.setLogin_emp_no(PJTE8100.getLogin_emp_no());

        result = pjte8100Service.update_8100_01(PJTE8100U);

        return result;

    }

    @PutMapping(value = "/delete")
    public @ResponseBody
    boolean update01(@RequestBody PJTE8100DTO PJTE8100) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE8100DTO PJTE8100D = new PJTE8100DTO();
        /* dto 값 셋팅*/
        PJTE8100D.setPrjt_id(PJTE8100.getPrjt_id());
        PJTE8100D.setMng_id(PJTE8100.getMng_id());
        PJTE8100D.setLogin_emp_no(PJTE8100.getLogin_emp_no());

        result = pjte8100Service.update_8100_02(PJTE8100D);

        return result;

    }
}
