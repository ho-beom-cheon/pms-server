package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9001DTO;
import com.iteyes.service.PJTE9001Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE9001")
public class PJTE9001Controller {
    @Autowired
    private PJTE9001Service pjte9001service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE9001DTO PJTE9001 = new PJTE9001DTO();

        PJTE9001.setPrjt_id(request.getParameter("prjt_id_selected"));
        PJTE9001.setBzcd(request.getParameter("bzcd_selected"));
        PJTE9001.setEmpno(request.getParameter("empno"));
        PJTE9001.setEmpnm(request.getParameter("empnm"));

        /* 서비스 요청 */
        List<PJTE9001DTO> list = pjte9001service.select_9001_01(PJTE9001);

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
