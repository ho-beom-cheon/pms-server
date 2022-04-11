package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9110DTO;
import com.iteyes.service.PJTE9110Service;
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
@RequestMapping(value = "/PJTE9110")
public class PJTE9110Controller {
    @Autowired
    private PJTE9110Service pjte9110Service;

    @GetMapping(value = "/select1")
    public @ResponseBody String select1(HttpServletRequest request) throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9110DTO PJTE9110 = new PJTE9110DTO();

        /* dto 값 셋팅*/
        PJTE9110.setPrjt_id(request.getParameter("prjt_id_selected"));
        PJTE9110.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9110.setLogin_dept_cd(request.getParameter("login_dept_cd"));
        PJTE9110.setBubun_nm(request.getParameter("bubun_nm"));
        PJTE9110.setBsn_cls_nm(request.getParameter("bsn_cls_nm"));
        PJTE9110.setGesipan_dsc(request.getParameter("gesipan_dsc"));
        PJTE9110.setGesipan_titl(request.getParameter("gesipan_titl"));

        /* 서비스 요청 */
        List<PJTE9110DTO> list = pjte9110Service.select_9110_01(PJTE9110);

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
