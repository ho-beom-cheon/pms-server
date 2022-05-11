package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7100DTO;
import com.iteyes.service.PJTE7100Service;
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

    @PostMapping(value = "/insert_7100_01")
    public @ResponseBody
    boolean insert(@RequestBody PJTE7100DTO PJTE7100) throws Exception {

        Logger logger = LogManager.getLogger(this.getClass());

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        List<PJTE7100DTO> list1 = pjte7100Service.select_7100_02(PJTE7100);

        logger.debug("list1.size() =" + list1.size());
        if(list1.size() == 0){
             result = pjte7100Service.insert_7100_01(PJTE7100);
        }else{
            result = pjte7100Service.update_7100_01(PJTE7100);
        }

        return result;

    }
}
