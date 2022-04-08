package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9120DTO;
import com.iteyes.service.PJTE9120Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE9120")
public class PJTE9120Controller {
    @Autowired
    private PJTE9120Service PJTE9120Service;

    @GetMapping(value = "/combo")
    public @ResponseBody String combo(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_id"));

        /* 서비스 요청 - 공통콤보박스 select */
        List<PJTE9120DTO> list = PJTE9120Service.select_0000_01(PJTE9120);

        /* map 형태로 저장 */
        Map<String, Object> hm = new HashMap();
        Map<String, Object> hm1 = new HashMap();
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

    /**
     * 게시내역목록조회
     * @author hib
     * @param request
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/select_9120_01")
    public @ResponseBody String select_9120_01(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9120.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9120.setGesipan_id(request.getParameter("gesipan_id"));

        /* 서비스 요청**/
        List<PJTE9120DTO> list = PJTE9120Service.select_9120_01(PJTE9120);

        /* map 형태로 저장 */
        Map<String, Object> hm = new HashMap();
        Map<String, Object> hm1 = new HashMap();
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

    /**
     * 답글내역목록조회
     * @author hib
     * @param request
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/select_9120_02")
    public @ResponseBody String select_9120_02(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9120.setPost_id(request.getParameter("post_id"));

        /* 서비스 요청**/
        List<PJTE9120DTO> list = PJTE9120Service.select_9120_02(PJTE9120);

        /* map 형태로 저장 */
        Map<String, Object> hm = new HashMap();
        Map<String, Object> hm1 = new HashMap();
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
