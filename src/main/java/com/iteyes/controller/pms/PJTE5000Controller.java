package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE5000DTO;
import com.iteyes.service.PJTE5000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/PJTE5000")
public class PJTE5000Controller {

    @Autowired
    private PJTE5000Service pjte5000Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {
        log.debug("PJTE5000_Controller :: select 시작");
        ObjectMapper mapper = new ObjectMapper();
        /* 빈 dto 생성 */
        PJTE5000DTO PJTE5000 = new PJTE5000DTO();
        /* dto 값 셋팅*/
        PJTE5000.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE5000.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE5000.setBzcd(request.getParameter("bzcd_selected"));
        PJTE5000.setMng_cd(request.getParameter("wbs_mng_cd_selected"));
        PJTE5000.setWbs_prc_sts_cd(request.getParameter("wbs_prc_sts_cd_selected"));

        PJTE5000.setAcvt_nm(request.getParameter("acvt_nm"));
        PJTE5000.setCrpe_nm(request.getParameter("crpe_nm"));
        PJTE5000.setAcl_sta_dt(request.getParameter("acl_sta_dt"));
        PJTE5000.setAcl_end_dt(request.getParameter("acl_end_dt"));
        PJTE5000.setPln_sta_dt(request.getParameter("pln_sta_dt"));
        PJTE5000.setPln_end_dt(request.getParameter("pln_end_dt"));

        List<PJTE5000DTO> list = pjte5000Service.select_5000_01(PJTE5000);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAtfl_mng_id() != null && !list.get(i).getAtfl_mng_id().isEmpty() && !list.get(i).getAtfl_mng_id().equals("undefined")) {
                list.get(i).setAtfl_mng_id_yn("첨부");
            } else {
                list.get(i).setAtfl_mng_id_yn("미첨부");
            }
        }

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
    @PutMapping(value = "/update")
    public @ResponseBody
    boolean update(HttpServletRequest request, @RequestBody PJTE5000DTO PJTE5000dto) throws Exception {
        log.debug("PJTE5000_Controller :: update 시작");
        PJTE5000DTO PJTE5000 = new PJTE5000DTO();
        boolean result = true;
        if (PJTE5000dto.getUpdatedRows().size() != 0) {
            for (int i = 0; i < PJTE5000dto.getUpdatedRows().size(); i++) {
                PJTE5000.setPrjt_id(PJTE5000dto.getUpdatedRows().get(i).getPrjt_id());
                PJTE5000.setBkup_id(PJTE5000dto.getBkup_id());
                PJTE5000.setMng_cd(PJTE5000dto.getUpdatedRows().get(i).getMng_cd());
                PJTE5000.setBzcd(PJTE5000dto.getUpdatedRows().get(i).getBzcd());
                PJTE5000.setStep_cd(PJTE5000dto.getUpdatedRows().get(i).getStep_cd());
                PJTE5000.setMng_id(PJTE5000dto.getUpdatedRows().get(i).getMng_id());
                PJTE5000.setHgrn_mng_id(PJTE5000dto.getUpdatedRows().get(i).getHgrn_mng_id());
                PJTE5000.setAcvt_nm(PJTE5000dto.getUpdatedRows().get(i).getAcvt_nm());
                PJTE5000.setTask_nm(PJTE5000dto.getUpdatedRows().get(i).getTask_nm());
                PJTE5000.setCrpe_nm(PJTE5000dto.getUpdatedRows().get(i).getCrpe_nm());
                PJTE5000.setWbs_prc_sts_cd(PJTE5000dto.getUpdatedRows().get(i).getWbs_prc_sts_cd());
                PJTE5000.setPln_sta_dt(PJTE5000dto.getUpdatedRows().get(i).getPln_sta_dt());
                PJTE5000.setPln_sta_tim(PJTE5000dto.getUpdatedRows().get(i).getPln_sta_tim());
                PJTE5000.setPln_end_dt(PJTE5000dto.getUpdatedRows().get(i).getPln_end_dt());
                PJTE5000.setPln_end_tim(PJTE5000dto.getUpdatedRows().get(i).getPln_end_tim());
                PJTE5000.setWgt_rt(PJTE5000dto.getUpdatedRows().get(i).getWgt_rt());
                PJTE5000.setPrg_rt(PJTE5000dto.getUpdatedRows().get(i).getPrg_rt());
                PJTE5000.setRmrk(PJTE5000dto.getUpdatedRows().get(i).getRmrk());
                PJTE5000.setSort(PJTE5000dto.getUpdatedRows().get(i).getSort());
                PJTE5000.setAtfl_mng_id(PJTE5000dto.getUpdatedRows().get(i).getAtfl_mng_id());
                PJTE5000.setLogin_emp_no(PJTE5000dto.getLogin_emp_no());

                result = pjte5000Service.update_5000_01(PJTE5000);
            }
        }
        return result;
    }
    @PutMapping(value = "/delete")
    public @ResponseBody
    boolean delete(HttpServletRequest request, @RequestBody PJTE5000DTO PJTE5000dto) throws Exception {
        boolean result = true;
        log.debug("PJTE5000_Controller :: delete 시작");
        if (PJTE5000dto.getGridData().size() != 0) {
            PJTE5000DTO PJTE5000D = new PJTE5000DTO();
            for (int i = 0; i < PJTE5000dto.getGridData().size(); i++) {
                /* dto 값 셋팅*/
                PJTE5000D.setBkup_id(PJTE5000dto.getBkup_id());
                PJTE5000D.setPrjt_id(PJTE5000dto.getGridData().get(i).getPrjt_id());
                PJTE5000D.setBzcd(PJTE5000dto.getGridData().get(i).getBzcd());
                PJTE5000D.setMng_cd(PJTE5000dto.getGridData().get(i).getMng_cd());
                PJTE5000D.setMng_id(PJTE5000dto.getGridData().get(i).getMng_id());
                pjte5000Service.delete_5000_01(PJTE5000D);
            }
        }
        return result;
    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody PJTE5000DTO PJTE5000dto) throws Exception {

        boolean result = true;
        PJTE5000DTO PJTE5000 = new PJTE5000DTO();
        log.debug("PJTE5000_Controller :: insert 시작");
        log.debug("getExcelUplod :: "+PJTE5000dto.getExcelUplod());
        log.debug("getMng_cd :: "+PJTE5000dto.getMng_cd());
        if(PJTE5000dto.getExcelUplod().equals("Y")) {
            PJTE5000DTO PJTE5000D = new PJTE5000DTO();
            PJTE5000D.setBkup_id(PJTE5000dto.getBkup_id());
            PJTE5000D.setPrjt_id(PJTE5000dto.getPrjt_id());
            if(PJTE5000dto.getMng_cd().equals("100")) {
                PJTE5000D.setBzcd("");
            } else {
                PJTE5000D.setBzcd(PJTE5000dto.getBzcd());
            }
            PJTE5000D.setMng_cd(PJTE5000dto.getMng_cd());
            PJTE5000D.setMng_id("");
            pjte5000Service.delete_5000_01(PJTE5000D);
        }

        if (PJTE5000dto.getGridData().size() != 0) {
            for (int i = 0; i < PJTE5000dto.getGridData().size(); i++) {
                PJTE5000.setPrjt_id(PJTE5000dto.getPrjt_id());
                PJTE5000.setMng_cd(PJTE5000dto.getGridData().get(i).getMng_cd());
                PJTE5000.setBzcd(PJTE5000dto.getGridData().get(i).getBzcd());
                PJTE5000.setStep_cd(PJTE5000dto.getGridData().get(i).getStep_cd());
                PJTE5000.setMng_id(PJTE5000dto.getGridData().get(i).getMng_id());
                PJTE5000.setHgrn_mng_id(PJTE5000dto.getGridData().get(i).getHgrn_mng_id());
                PJTE5000.setAcvt_nm(PJTE5000dto.getGridData().get(i).getAcvt_nm());
                PJTE5000.setTask_nm(PJTE5000dto.getGridData().get(i).getTask_nm());
                PJTE5000.setCrpe_nm(PJTE5000dto.getGridData().get(i).getCrpe_nm());
                PJTE5000.setPln_sta_dt(PJTE5000dto.getGridData().get(i).getPln_sta_dt());
                PJTE5000.setPln_sta_tim(PJTE5000dto.getGridData().get(i).getPln_sta_tim());
                PJTE5000.setPln_end_dt(PJTE5000dto.getGridData().get(i).getPln_end_dt());
                PJTE5000.setPln_end_tim(PJTE5000dto.getGridData().get(i).getPln_end_tim());
                PJTE5000.setWgt_rt(PJTE5000dto.getGridData().get(i).getWgt_rt());
                PJTE5000.setPrg_rt(PJTE5000dto.getGridData().get(i).getPrg_rt());
                PJTE5000.setRmrk(PJTE5000dto.getGridData().get(i).getRmrk());
                PJTE5000.setSort(PJTE5000dto.getGridData().get(i).getSort());
                PJTE5000.setAtfl_mng_id(PJTE5000dto.getGridData().get(i).getAtfl_mng_id());
                PJTE5000.setLogin_emp_no(PJTE5000dto.getGridData().get(i).getLogin_emp_no());

                result = pjte5000Service.insert_5000_01(PJTE5000);
            }
        }
        return result;
    }
}
