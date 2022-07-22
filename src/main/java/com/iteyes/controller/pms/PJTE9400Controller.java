package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9400DTO;
import com.iteyes.service.PJTE9400Service;
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
@RequestMapping(value = "/PJTE9400")
public class PJTE9400Controller {
    @Autowired
    private PJTE9400Service pjte9400Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9400DTO PJTE9400 = new PJTE9400DTO();

        /* dto 값 셋팅*/
        PJTE9400.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9400.setBkup_id(request.getParameter("bkup_id_selected"));

        /* 서비스 요청**/
        List<PJTE9400DTO> list = pjte9400Service.select_9400_01(PJTE9400);

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

    @PutMapping(value = "/update")
    public @ResponseBody
    boolean update(@RequestBody PJTE9400DTO PJTE9400) throws Exception {

        boolean result = false;

        PJTE9400DTO PJTE9400U = new PJTE9400DTO();

        PJTE9400U.setBkup_id         (PJTE9400.getBkup_id         ());
        PJTE9400U.setPrjt_id         (PJTE9400.getPrjt_id         ());
        PJTE9400U.setFld_mng_id      (PJTE9400.getFld_mng_id      ());    //폴더관리ID
        PJTE9400U.setFld_nm          (PJTE9400.getFld_nm          ());    //폴더명
        PJTE9400U.setRmrk            (PJTE9400.getRmrk            ());    //비고
        PJTE9400U.setLogin_emp_no    (PJTE9400.getLogin_emp_no    ());    //직원번호

        result = pjte9400Service.update_9400_01(PJTE9400U);

        return result;

    }


    @PutMapping(value = "/update01")
    public @ResponseBody
    boolean update01(@RequestBody PJTE9400DTO PJTE9400) throws Exception {

        boolean result = false;

        PJTE9400DTO PJTE9400U = new PJTE9400DTO();

        PJTE9400U.setBkup_id         (PJTE9400.getBkup_id         ());
        PJTE9400U.setPrjt_id         (PJTE9400.getPrjt_id         ());
        PJTE9400U.setFld_mng_id      (PJTE9400.getFld_mng_id      ());    //폴더관리ID
        PJTE9400U.setHgrn_mng_id     (PJTE9400.getHgrn_mng_id     ());    //상위관리ID
        PJTE9400U.setLogin_emp_no    (PJTE9400.getLogin_emp_no    ());    //직원번호

        result = pjte9400Service.update_9400_02(PJTE9400U);

        return result;

    }

    @PostMapping("/insert")
    public @ResponseBody
    boolean create(HttpServletRequest request, @RequestBody PJTE9400DTO PJTE9400) throws Exception {
        boolean result = false;

        PJTE9400DTO PJTE9400C = new PJTE9400DTO();

        PJTE9400C.setBkup_id         (PJTE9400.getBkup_id         ());
        PJTE9400C.setPrjt_id         (PJTE9400.getPrjt_id         ());
        PJTE9400C.setFld_mng_id      (PJTE9400.getFld_mng_id      ());    //폴더관리ID
        PJTE9400C.setHgrn_mng_id     (PJTE9400.getHgrn_mng_id     ());    //상위관리ID
        PJTE9400C.setFld_nm          (PJTE9400.getFld_nm          ());    //폴더명
        PJTE9400C.setRmrk            (PJTE9400.getRmrk            ());    //비고
        PJTE9400C.setCoh_hgrn_mng_id (PJTE9400.getCoh_hgrn_mng_id ());    //선택상위관리ID
        PJTE9400C.setLogin_emp_no    (PJTE9400.getLogin_emp_no    ());    //직원번호

        result = pjte9400Service.insert_9400_01(PJTE9400C);

        return result;
    }
}
