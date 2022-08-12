package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7100DTO;
import com.iteyes.service.PJTE7100Service;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@RequestMapping(value = "/PJTE7100")
public class PJTE7100Controller {

    @Autowired
    private PJTE7100Service pjte7100Service;

    @GetMapping(value = "/select_7100_01")
    public @ResponseBody
    String select01(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7100DTO PJTE7100 = new PJTE7100DTO();


        PJTE7100.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7100.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7100.setAs_pgm_id(request.getParameter("as_pgm_id"));
        PJTE7100.setTo_pgm_id(request.getParameter("to_pgm_id"));
        PJTE7100.setUse_pgm_txt(request.getParameter("use_pgm_txt"));
        PJTE7100.setDvlpe_no(request.getParameter("dvlpe_no"));

        List<PJTE7100DTO> list = pjte7100Service.select_7100_01(PJTE7100);

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

    @GetMapping(value = "/select_7100_02")
    public @ResponseBody
    String select02(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7100DTO PJTE7100 = new PJTE7100DTO();


        PJTE7100.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7100.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7100.setAs_pgm_id(request.getParameter("as_pgm_id"));
        PJTE7100.setAs_pgm_dis_cd(request.getParameter("as_pgm_dis_cd"));

        List<PJTE7100DTO> list = pjte7100Service.select_7100_02(PJTE7100);

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

    @PostMapping(value = "/insert_7100_01")
    public @ResponseBody
    boolean insert(@RequestBody PJTE7100DTO PJTE7100) throws Exception {

        Logger logger = LogManager.getLogger(this.getClass());

        boolean result = false;

        result = pjte7100Service.insert_7100_01(PJTE7100);

        return result;
    }

    @PutMapping(value = "/update_7100_01")
    public @ResponseBody
    boolean update(@RequestBody PJTE7100DTO PJTE7100) throws Exception {

        Logger logger = LogManager.getLogger(this.getClass());

        boolean result = false;

        result = pjte7100Service.update_7100_01(PJTE7100);


        return result;

    }

    @PostMapping("/create")
    public @ResponseBody boolean create(@RequestBody @NotNull PJTE7100DTO PJTE7100) throws Exception{
        boolean result = false;

        PJTE7100DTO PJTE7100C = new PJTE7100DTO();
        PJTE7100DTO PJTE7100D = new PJTE7100DTO();

        for (int i = 0; i < PJTE7100.getRowDatas().size(); i++) {
            PJTE7100D.setPrjt_id(PJTE7100.getLogin_proj_id());
            PJTE7100D.setBkup_id("0000000000");
            PJTE7100D.setAs_pgm_id(PJTE7100.getRowDatas().get(i).getAs_pgm_id());
            PJTE7100D.setAs_pgm_dis_cd(PJTE7100.getRowDatas().get(i).getAs_pgm_dis_cd());

            List<PJTE7100DTO> list1 = pjte7100Service.select_7100_03(PJTE7100D);

            PJTE7100C.setAs_pgm_id(PJTE7100.getRowDatas().get(i).getAs_pgm_id());
            PJTE7100C.setDvlpe_no(PJTE7100.getRowDatas().get(i).getDvlpe_no());

            PJTE7100C.setAs_pgm_dis_cd(PJTE7100.getRowDatas().get(i).getAs_pgm_dis_cd());
            PJTE7100C.setAs_pgm_nm(PJTE7100.getRowDatas().get(i).getAs_pgm_nm());
            PJTE7100C.setTo_pgm_id(PJTE7100.getRowDatas().get(i).getTo_pgm_id());
            PJTE7100C.setTo_pgm_nm(PJTE7100.getRowDatas().get(i).getTo_pgm_nm());
            PJTE7100C.setRmrk(PJTE7100.getRowDatas().get(i).getRmrk());
            PJTE7100C.setUse_pgm_txt(PJTE7100.getRowDatas().get(i).getUse_pgm_txt());
            PJTE7100C.setTrn_stt_cd(PJTE7100.getRowDatas().get(i).getTrn_stt_cd());
            PJTE7100C.setFrcs_sta_dt(PJTE7100.getRowDatas().get(i).getFrcs_sta_dt());
            PJTE7100C.setFrcs_end_dt(PJTE7100.getRowDatas().get(i).getFrcs_end_dt());
            PJTE7100C.setSta_dt(PJTE7100.getRowDatas().get(i).getSta_dt());
            PJTE7100C.setEnd_dt(PJTE7100.getRowDatas().get(i).getEnd_dt());

            PJTE7100C.setPrjt_id(PJTE7100.getLogin_proj_id());
            PJTE7100C.setBkup_id("0000000000");

            PJTE7100C.setLogin_aut_cd(PJTE7100.getLogin_aut_cd());
            PJTE7100C.setLogin_emp_no(PJTE7100.getLogin_emp_no());
            PJTE7100C.setLogin_proj_id(PJTE7100.getLogin_proj_id());

            if(list1.size() == 0){
                result = pjte7100Service.insert_7100_01(PJTE7100C);
            }else{
                result = pjte7100Service.update_7100_02(PJTE7100C);
            }

        }

        return result;
    }

}
