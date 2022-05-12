package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9300DTO;
import com.iteyes.service.PJTE9300Service;
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
@RequestMapping(value = "/PJTE9300")
public class PJTE9300Controller {

    @Autowired
    private PJTE9300Service PJTE9300Service;

    @GetMapping(value = "/select_9300_01")
    public @ResponseBody String select_9310_01(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9300DTO PJTE9300 = new PJTE9300DTO();

        /* dto 값 셋팅*/
        PJTE9300.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9300.setBkup_id(request.getParameter("bkup_id_selected"));

        /* 서비스 요청**/
        List<PJTE9300DTO> list = PJTE9300Service.select_9300_01(PJTE9300);

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
    @GetMapping(value = "/select_9300_02")
    public @ResponseBody String select_9300_02(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9300DTO PJTE9300 = new PJTE9300DTO();

        /* dto 값 셋팅*/
        PJTE9300.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9300.setBkup_id(request.getParameter("bkup_id_selected"));

        /* 서비스 요청**/
        List<PJTE9300DTO> list = PJTE9300Service.select_9300_02(PJTE9300);

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
    @PostMapping("/insert_9300_01")
    public @ResponseBody boolean insert_9300_01(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        if(PJTE9300.getGridData().size() != 0) {

            PJTE9300DTO PJTE9300C = new PJTE9300DTO();

            /* dto 값 셋팅*/
            PJTE9300C.setPrjt_id(PJTE9300.getPrjt_id());
            PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());

            for (int i = 0; i < PJTE9300.getGridData().size(); i++) {

                PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());
                PJTE9300C.setReal_prjt_id(PJTE9300.getGridData().get(i).getReal_prjt_id());
                PJTE9300C.setSkill_grd(PJTE9300.getGridData().get(i).getSkill_grd());
                PJTE9300C.setMain_skill(PJTE9300.getGridData().get(i).getMain_skill());
                PJTE9300C.setDuty_txt(PJTE9300.getGridData().get(i).getDuty_txt());
                PJTE9300C.setOth_cnt(PJTE9300.getGridData().get(i).getOth_cnt());
                PJTE9300C.setNmbr_rcrt(PJTE9300.getGridData().get(i).getNmbr_rcrt());
                PJTE9300C.setSch_ent_dt(PJTE9300.getGridData().get(i).getSch_ent_dt());
                PJTE9300C.setSqno(PJTE9300.getGridData().get(i).getSqno());
                System.out.println("sqno: " + PJTE9300.getGridData().get(i).getSqno());

                result = PJTE9300Service.insert_9300_01(PJTE9300C);
            }
        }
        System.out.println(result);
        return result;
    }
    // 저장 버튼(수정)
    @PutMapping("/update_9300_01")
    public @ResponseBody boolean update_9300_01(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        PJTE9300DTO PJTE9300U = new PJTE9300DTO();

        PJTE9300U.setPrjt_id(PJTE9300.getPrjt_id());
        PJTE9300U.setLogin_emp_no(PJTE9300.getLogin_emp_no());

        System.out.println("그리드 : " + PJTE9300.getGridData().size());
        for (int i = 0; i < PJTE9300.getGridData().size(); i++) {
            System.out.println("i : " + i);
            PJTE9300U.setLogin_emp_no(PJTE9300.getLogin_emp_no());
            PJTE9300U.setReal_prjt_id(PJTE9300.getGridData().get(i).getReal_prjt_id());
            PJTE9300U.setSkill_grd(PJTE9300.getGridData().get(i).getSkill_grd());
            PJTE9300U.setMain_skill(PJTE9300.getGridData().get(i).getMain_skill());
            PJTE9300U.setDuty_txt(PJTE9300.getGridData().get(i).getDuty_txt());
            PJTE9300U.setOth_cnt(PJTE9300.getGridData().get(i).getOth_cnt());
            PJTE9300U.setNmbr_rcrt(PJTE9300.getGridData().get(i).getNmbr_rcrt());
            PJTE9300U.setSch_ent_dt(PJTE9300.getGridData().get(i).getSch_ent_dt());
            PJTE9300U.setSqno(PJTE9300.getGridData().get(i).getSqno());

            result = PJTE9300Service.update_9300_01(PJTE9300U);
        }

        return result;
    }
    // 지원 버튼
    @PutMapping("/update_9300_02")
    public @ResponseBody boolean update_9300_02(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        PJTE9300DTO PJTE9300U = new PJTE9300DTO();

        PJTE9300U.setPrjt_id(PJTE9300.getPrjt_id());
        PJTE9300U.setLogin_emp_no(PJTE9300.getLogin_emp_no());
        PJTE9300U.setLogin_emp_nm(PJTE9300.getLogin_emp_nm());
        PJTE9300U.setReal_prjt_id(PJTE9300.getReal_prjt_id());
        PJTE9300U.setSqno(PJTE9300.getSqno());

        result = PJTE9300Service.update_9300_02(PJTE9300U);

        return result;
    }
    // 삭제 버튼
    @PutMapping("/update_9300_03")
    public @ResponseBody boolean update_9300_03(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        PJTE9300DTO PJTE9300U = new PJTE9300DTO();

        PJTE9300U.setPrjt_id(PJTE9300.getPrjt_id());
        PJTE9300U.setLogin_emp_no(PJTE9300.getLogin_emp_no());
        PJTE9300U.setReal_prjt_id(PJTE9300.getReal_prjt_id());
        PJTE9300U.setSqno(PJTE9300.getSqno());

        result = PJTE9300Service.update_9300_03(PJTE9300U);

        return result;
    }
}
