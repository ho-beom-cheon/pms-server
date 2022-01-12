package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE2200DTO;
import com.iteyes.service.PJTE2200Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.HashMap;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE2200")
public class PJTE2200Controller {
    @Autowired
    private PJTE2200Service pjte2200service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE2200DTO PJTE2200 = new PJTE2200DTO();
        
        /* 서비스 요청 */
        List<PJTE2200DTO> list = pjte2200service.select_0030_01(PJTE2200);

        /* map 형태로 저장 */
        HashMap<String, Object> hm = new HashMap();
        HashMap<String, Object> hm1 = new HashMap();
        HashMap<String, Object> hm1_pagination = new HashMap();
        hm.put("result", true);
        hm1.put("contents", list);
        hm1_pagination.put("page", 1);
        hm1_pagination.put("totalCount", 100);
        hm1.put("pagination", hm1_pagination);
        hm.put("data", hm1);

        /* json 형태로 반환 */
        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;

    }
}
