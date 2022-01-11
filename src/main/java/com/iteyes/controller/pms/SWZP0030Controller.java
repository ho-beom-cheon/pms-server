package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0030DTO;
import com.iteyes.service.SWZP0030Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.HashMap;

import org.springframework.stereotype.Controller;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/SWZP0030")
public class SWZP0030Controller {
    @Autowired
    private SWZP0030Service swzp0030Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        SWZP0030DTO SWZP0030 = new SWZP0030DTO();
        
        /* 서비스 요청 */
        List<SWZP0030DTO> list = swzp0030Service.select_0030(SWZP0030);

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
