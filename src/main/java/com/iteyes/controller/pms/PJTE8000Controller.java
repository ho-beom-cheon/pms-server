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

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE8000DTO PJTE8000 = new PJTE8000DTO();

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
