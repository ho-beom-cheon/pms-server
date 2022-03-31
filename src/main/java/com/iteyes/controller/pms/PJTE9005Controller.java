package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9005DTO;
import com.iteyes.service.PJTE9005Service;
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
@RequestMapping(value = "/PJTE9005")
public class PJTE9005Controller {
    @Autowired
    private PJTE9005Service pjte9005Service;

    @GetMapping(value = "/select1")
    public @ResponseBody String select1(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setSkill_grd(request.getParameter("skill_grd_selected"));
        PJTE9005.setMain_skill(request.getParameter("main_skill"));
        PJTE9005.setDuty_txt(request.getParameter("duty_txt"));
        PJTE9005.setMan_no(request.getParameter("man_no"));
        PJTE9005.setMan_nm(request.getParameter("man_nm"));
        PJTE9005.setCompany_nm(request.getParameter("company_nm"));
        PJTE9005.setExe_cpy_nm(request.getParameter("exe_cpy_nm"));
        PJTE9005.setProj_nm(request.getParameter("proj_nm"));

        /* 서비스 요청**/
        List<PJTE9005DTO> list = pjte9005Service.select_9005_01(PJTE9005);

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

    @GetMapping(value = "/select2")
    public @ResponseBody String select2(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));

        /* 서비스 요청**/
        List<PJTE9005DTO> list = pjte9005Service.select_9005_02(PJTE9005);

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

    @GetMapping(value = "/select3")
    public @ResponseBody String select3(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));
        /* 서비스 요청**/
        List<PJTE9005DTO> list = pjte9005Service.select_9005_03(PJTE9005);

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

    @GetMapping(value = "/select4")
    public @ResponseBody String select4(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));

        /* 서비스 요청**/
        List<PJTE9005DTO> list = pjte9005Service.select_9005_04(PJTE9005);

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

    @PostMapping("/create")
    public @ResponseBody boolean create(@RequestBody PJTE9005DTO PJTE9005) throws Exception{
        boolean result = false;

        PJTE9005DTO PJTE9005C = new PJTE9005DTO();

        if(PJTE9005.getExcelUplod() == "Y") {

            PJTE9005DTO PJTE9005D = new PJTE9005DTO();

            for(int i=0; i<PJTE9005.getGridData().size(); i++) {
                PJTE9005D.setPrjt_id(PJTE9005.getPrjt_id());
                PJTE9005D.setBkup_id("0000000000");

                pjte9005Service.delete_9005_01(PJTE9005D);
            }

            for (int i = 0; i < PJTE9005.getGridData().size(); i++) {
                PJTE9005C.setPrjt_id(PJTE9005.getPrjt_id());

                PJTE9005C.setLogin_aut_cd(PJTE9005.getLogin_aut_cd());
                PJTE9005C.setLogin_emp_no(PJTE9005.getLogin_emp_no());
                PJTE9005C.setLogin_bzcd(PJTE9005.getLogin_bzcd());
                PJTE9005C.setLogin_proj_id(PJTE9005.getLogin_proj_id());

                result = pjte9005Service.insert_9005_01(PJTE9005C);
            }
        } else {
            for (int i = 0; i < PJTE9005.getGridData().size(); i++) {
                 PJTE9005C.setPrjt_id(PJTE9005.getPrjt_id());

                 PJTE9005C.setLogin_aut_cd(PJTE9005.getLogin_aut_cd());
                 PJTE9005C.setLogin_emp_no(PJTE9005.getLogin_emp_no());
                 PJTE9005C.setLogin_bzcd(PJTE9005.getLogin_bzcd());
                 PJTE9005C.setLogin_proj_id(PJTE9005.getLogin_proj_id());

                 result = pjte9005Service.insert_9005_01(PJTE9005C);

                 if(result == false){
                     break;
                 }
            }
        }
        return result;
    }

    @PutMapping("/update")
    public @ResponseBody boolean update(HttpServletRequest request, @RequestBody PJTE9005DTO PJTE9005) throws Exception{
        boolean result = false;

        PJTE9005DTO PJTE9005U = new PJTE9005DTO();

        for(int i=0; i<PJTE9005.getUpdatedRows().size(); i++) {
            PJTE9005U.setPrjt_id(PJTE9005.getUpdatedRows().get(i).getPrjt_id());
            PJTE9005U.setBkup_id(PJTE9005.getUpdatedRows().get(i).getBkup_id());

            PJTE9005U.setLogin_aut_cd(PJTE9005.getLogin_aut_cd());
            PJTE9005U.setLogin_emp_no(PJTE9005.getLogin_emp_no());
            PJTE9005U.setLogin_bzcd(PJTE9005.getLogin_bzcd());
            PJTE9005U.setLogin_proj_id(PJTE9005.getLogin_proj_id());

            result = pjte9005Service.update_9005_01(PJTE9005U);
        }
        return result;
    }
}
