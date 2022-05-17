package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE4000DTO;
import com.iteyes.dto.pms.PJTE9005DTO;
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
    public @ResponseBody
    String select1(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setSkill_grd(request.getParameter("skill_grd_selected"));
        PJTE9005.setMain_skill(request.getParameter("main_skill"));
        PJTE9005.setDuty_txt(request.getParameter("duty_txt"));
        PJTE9005.setCar_main_skill(request.getParameter("car_main_skill"));
        PJTE9005.setCar_duty_txt(request.getParameter("car_duty_txt"));
        PJTE9005.setMan_no(request.getParameter("man_no"));
        PJTE9005.setMan_nm(request.getParameter("man_nm"));
        PJTE9005.setCompany_nm(request.getParameter("company_nm"));
        PJTE9005.setExe_cpy_nm(request.getParameter("exe_cpy_nm"));
        PJTE9005.setProj_nm(request.getParameter("proj_nm"));
        PJTE9005.setLogin_emp_no(request.getParameter("login_emp_no"));

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
    public @ResponseBody
    String select2(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));
        PJTE9005.setLogin_emp_no(request.getParameter("login_emp_no"));

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
    public @ResponseBody
    String select3(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));
        PJTE9005.setLogin_emp_no(request.getParameter("login_emp_no"));
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
    public @ResponseBody
    String select4(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9005DTO PJTE9005 = new PJTE9005DTO();

        /* dto 값 셋팅*/
        PJTE9005.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9005.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9005.setMan_no(request.getParameter("current_man_no"));
        PJTE9005.setLogin_emp_no(request.getParameter("login_emp_no"));

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
    public @ResponseBody
    boolean create(HttpServletRequest request, @RequestBody PJTE9005DTO PJTE9005) throws Exception {
        boolean result = false;

        PJTE9005DTO PJTE9005D = new PJTE9005DTO();

        PJTE9005D.setPrjt_id(PJTE9005.getPrjt_id());
        PJTE9005D.setMan_no(PJTE9005.getMan_no());

        if(PJTE9005.getMan_no() != null || PJTE9005.getMan_no() != "") {
            result = pjte9005Service.delete_9005_01(PJTE9005D);
            result = pjte9005Service.delete_9005_02(PJTE9005D);
            result = pjte9005Service.delete_9005_03(PJTE9005D);
        }

        PJTE9005DTO PJTE9005C = new PJTE9005DTO();

        PJTE9005C.setPrjt_id     (PJTE9005.getPrjt_id     ());
        PJTE9005C.setLogin_emp_no(PJTE9005.getLogin_emp_no());
        PJTE9005C.setLast_chg_dt (PJTE9005.getLast_chg_dt ());
        PJTE9005C.setMan_no      (PJTE9005.getMan_no      ());
        PJTE9005C.setMan_nm      (PJTE9005.getMan_nm      ());
        PJTE9005C.setRank_nm     (PJTE9005.getRank_nm     ());
        PJTE9005C.setMan_cd      (PJTE9005.getMan_cd      ());
        PJTE9005C.setBirthday    (PJTE9005.getBirthday    ());
        PJTE9005C.setAge         (PJTE9005.getAge         ());
        PJTE9005C.setAddress     (PJTE9005.getAddress     ());
        PJTE9005C.setSkill_grd   (PJTE9005.getSkill_grd   ());
        PJTE9005C.setCareer      (PJTE9005.getCareer      ());
        PJTE9005C.setNow_career  (PJTE9005.getNow_career  ());
        PJTE9005C.setEnter_ymd   (PJTE9005.getEnter_ymd   ());
        PJTE9005C.setSex_nm      (PJTE9005.getSex_nm      ());
        PJTE9005C.setInp_prj_nm  (PJTE9005.getInp_prj_nm  ());
        PJTE9005C.setWth_dt      (PJTE9005.getWth_dt      ());
        PJTE9005C.setInp_cls_cd  (PJTE9005.getInp_cls_cd  ());
        PJTE9005C.setNxt_prj_nm  (PJTE9005.getNxt_prj_nm  ());
        PJTE9005C.setMain_skill  (PJTE9005.getMain_skill  ());
        PJTE9005C.setDuty_txt    (PJTE9005.getDuty_txt    ());
        PJTE9005C.setCpno        (PJTE9005.getCpno        ());
        PJTE9005C.setCompany_nm  (PJTE9005.getCompany_nm  ());
        PJTE9005C.setGrd_cd      (PJTE9005.getGrd_cd      ());
        PJTE9005C.setScholl_nm1  (PJTE9005.getScholl_nm1  ());
        PJTE9005C.setGdt_ym1     (PJTE9005.getGdt_ym1     ());
        PJTE9005C.setStudy1      (PJTE9005.getStudy1      ());
        PJTE9005C.setScholl_nm2  (PJTE9005.getScholl_nm2  ());
        PJTE9005C.setGdt_ym2     (PJTE9005.getGdt_ym2     ());
        PJTE9005C.setStudy2      (PJTE9005.getStudy2      ());
        PJTE9005C.setScholl_nm3  (PJTE9005.getScholl_nm3  ());
        PJTE9005C.setGdt_ym3     (PJTE9005.getGdt_ym3     ());
        PJTE9005C.setStudy3      (PJTE9005.getStudy3      ());
        PJTE9005C.setQlfks_nm1   (PJTE9005.getQlfks_nm1   ());
        PJTE9005C.setAqu_ymm1    (PJTE9005.getAqu_ymm1    ());
        PJTE9005C.setQlfks_nm2   (PJTE9005.getQlfks_nm2   ());
        PJTE9005C.setAqu_ymm2    (PJTE9005.getAqu_ymm2    ());
        PJTE9005C.setQlfks_nm3   (PJTE9005.getQlfks_nm3   ());
        PJTE9005C.setAqu_ymm3    (PJTE9005.getAqu_ymm3    ());
        PJTE9005C.setQlfks_nm4   (PJTE9005.getQlfks_nm4   ());
        PJTE9005C.setAqu_ymm4    (PJTE9005.getAqu_ymm4    ());
        PJTE9005C.setQlfks_nm5   (PJTE9005.getQlfks_nm5   ());
        PJTE9005C.setAqu_ymm5    (PJTE9005.getAqu_ymm5    ());
        PJTE9005C.setAtfl_mng_id (PJTE9005.getAtfl_mng_id ());

        result = pjte9005Service.insert_9005_01(PJTE9005C);

        for (int i = 0; i < PJTE9005.getGridData2().size(); i++) {
            PJTE9005C.setPrjt_id(PJTE9005.getPrjt_id());
            PJTE9005C.setMan_no(PJTE9005.getMan_no());
            PJTE9005C.setCompany_nm(PJTE9005.getGridData2().get(i).getCompany_nm());
            if(PJTE9005.getGridData2().get(i).getEnter_dt() == "" || PJTE9005.getGridData2().get(i).getEnter_dt() == null) {
                PJTE9005C.setEnter_dt("");
            } else {
                PJTE9005C.setEnter_dt(PJTE9005.getGridData2().get(i).getEnter_dt().replace("-",""));
            }
            if(PJTE9005.getGridData2().get(i).getRsnt_dt() == "" || PJTE9005.getGridData2().get(i).getRsnt_dt() == null || PJTE9005.getGridData2().get(i).getRsnt_dt() == "현재") {
                PJTE9005C.setRsnt_dt("현재");
            } else {
                PJTE9005C.setRsnt_dt(PJTE9005.getGridData2().get(i).getRsnt_dt().replace("-",""));
            }
            PJTE9005C.setRssb_bns(PJTE9005.getGridData2().get(i).getRssb_bns());
            PJTE9005C.setRmrk(PJTE9005.getGridData2().get(i).getRmrk());

            result = pjte9005Service.insert_9005_02(PJTE9005C);

            if(result == false){
                break;
            }
        }

        for (int i = 0; i < PJTE9005.getGridData3().size(); i++) {
            PJTE9005C.setPrjt_id(PJTE9005.getPrjt_id());
            PJTE9005C.setMan_no(PJTE9005.getMan_no());
            PJTE9005C.setExe_cpy_nm(PJTE9005.getGridData3().get(i).getExe_cpy_nm());
            if(PJTE9005.getGridData3().get(i).getSta_dt() == "" || PJTE9005.getGridData3().get(i).getSta_dt() == null ) {
                PJTE9005C.setSta_dt("");
            } else {
                PJTE9005C.setSta_dt(PJTE9005.getGridData3().get(i).getSta_dt().replace("-",""));
            }
            if(PJTE9005.getGridData3().get(i).getEnd_dt() == "" || PJTE9005.getGridData3().get(i).getEnd_dt() == null || PJTE9005.getGridData3().get(i).getEnd_dt() == "현재") {
                PJTE9005C.setEnd_dt("현재");
            } else {
                PJTE9005C.setEnd_dt(PJTE9005.getGridData3().get(i).getEnd_dt().replace("-",""));
            }
            PJTE9005C.setProj_nm(PJTE9005.getGridData3().get(i).getProj_nm());
            PJTE9005C.setRssb_bns(PJTE9005.getGridData3().get(i).getRssb_bns());
            PJTE9005C.setDuty_txt(PJTE9005.getGridData3().get(i).getDuty_txt());
            PJTE9005C.setUse_os(PJTE9005.getGridData3().get(i).getUse_os());
            PJTE9005C.setRlt_skill(PJTE9005.getGridData3().get(i).getRlt_skill());

            result = pjte9005Service.insert_9005_03(PJTE9005C);

            if(result == false){
                break;
            }
        }

        return result;
    }
}
