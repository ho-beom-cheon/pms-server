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

        /* dto 값 셋팅*/
        PJTE2200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE2200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE2200.setPl_eno(request.getParameter("pl_eno"));
        PJTE2200.setDvlpe_eno(request.getParameter("dvlpe_eno"));
        PJTE2200.setSqn_cd(request.getParameter("sqn_cd_selected"));
        PJTE2200.setItg_tst_prc_cd(request.getParameter("itg_tst_prc_cd_selected"));
        PJTE2200.setBzcd(request.getParameter("bzcd_selected"));
        PJTE2200.setScnr_id(request.getParameter("scnr_id"));
        PJTE2200.setCrpe_eno(request.getParameter("crpe_eno"));
        PJTE2200.setRqu_sbh_id(request.getParameter("rqu_sbh_id"));
        PJTE2200.setFrcs_sta_dt(request.getParameter("frcs_sta_dt"));
        PJTE2200.setFrcs_end_dt(request.getParameter("frcs_end_dt"));
        PJTE2200.setDvlpe_sta_dt(request.getParameter("dvlpe_sta_dt"));
        PJTE2200.setDvlpe_end_dt(request.getParameter("dvlpe_end_dt"));
        PJTE2200.setTst_case_id(request.getParameter("tst_case_id"));

        /* 서비스 요청 */
        List<PJTE2200DTO> list = pjte2200service.select_2200_01(PJTE2200);

        for(int i=0; i<list.size(); i++){
            if(list.get(i).getAtfl_mng_id() != null && !list.get(i).getAtfl_mng_id().isEmpty()) {
                list.get(i).setAtfl_mng_id_yn("첨부");
            } else {
                list.get(i).setAtfl_mng_id_yn("미첨부");
            }
        }

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
    @PostMapping("/create")
    public @ResponseBody boolean create(@RequestBody PJTE2200DTO PJTE2200) throws Exception{
        boolean result = false;

        PJTE2200DTO PJTE2200C = new PJTE2200DTO();
        PJTE2200DTO PJTE2200D = new PJTE2200DTO();

        if(PJTE2200.getExcelUplod().equals("Y")) {
            PJTE2200D.setBzcd(PJTE2200.getBzcd());
            PJTE2200D.setPrjt_id(PJTE2200.getPrjt_id());
            PJTE2200D.setSqn_cd(PJTE2200.getSqn_cd());
            PJTE2200D.setBkup_id("0000000000");
            pjte2200service.delete_2200_01(PJTE2200D);
        }

        for (int i = 0; i < PJTE2200.getGridData().size(); i++) {
            PJTE2200C.setBzcd(PJTE2200.getGridData().get(i).getBzcd());
            PJTE2200C.setSqn_cd(PJTE2200.getGridData().get(i).getSqn_cd());
            PJTE2200C.setScnr_id(PJTE2200.getGridData().get(i).getScnr_id());
            PJTE2200C.setScnr_nm(PJTE2200.getGridData().get(i).getScnr_nm());

            PJTE2200C.setTst_case_id(PJTE2200.getGridData().get(i).getTst_case_id());
            PJTE2200C.setTst_case_nm(PJTE2200.getGridData().get(i).getTst_case_nm());
            PJTE2200C.setItg_tst_prc_cd(PJTE2200.getGridData().get(i).getItg_tst_prc_cd());
            PJTE2200C.setFrcs_sta_dt(PJTE2200.getGridData().get(i).getFrcs_sta_dt());
            PJTE2200C.setFrcs_end_dt(PJTE2200.getGridData().get(i).getFrcs_end_dt());

            PJTE2200C.setSta_dt(PJTE2200.getGridData().get(i).getSta_dt());
            PJTE2200C.setEnd_dt(PJTE2200.getGridData().get(i).getEnd_dt());
            PJTE2200C.setDvlpe_cnf_dt(PJTE2200.getGridData().get(i).getDvlpe_cnf_dt());
            PJTE2200C.setPl_cnf_dt(PJTE2200.getGridData().get(i).getPl_cnf_dt());
            PJTE2200C.setDvlpe_enm(PJTE2200.getGridData().get(i).getDvlpe_enm());

            PJTE2200C.setDvlpe_eno(PJTE2200.getGridData().get(i).getDvlpe_eno());
            PJTE2200C.setPl_enm(PJTE2200.getGridData().get(i).getPl_enm());
            PJTE2200C.setPl_eno(PJTE2200.getGridData().get(i).getPl_eno());
            PJTE2200C.setCrpe_enm(PJTE2200.getGridData().get(i).getCrpe_enm());
            PJTE2200C.setCrpe_eno(PJTE2200.getGridData().get(i).getCrpe_eno());

            PJTE2200C.setErr_tot_cnt(PJTE2200.getGridData().get(i).getErr_tot_cnt());
            PJTE2200C.setErr_cmpl_cnt(PJTE2200.getGridData().get(i).getErr_cmpl_cnt());
            PJTE2200C.setErr_ncmpl_cnt(PJTE2200.getGridData().get(i).getErr_ncmpl_cnt());
            PJTE2200C.setRmrk(PJTE2200.getGridData().get(i).getRmrk());
            PJTE2200C.setPgm_id(PJTE2200.getGridData().get(i).getPgm_id());

            PJTE2200C.setScrn_id(PJTE2200.getGridData().get(i).getScrn_id());
            PJTE2200C.setTrn_cd(PJTE2200.getGridData().get(i).getTrn_cd());
            PJTE2200C.setRqu_sbh_id(PJTE2200.getGridData().get(i).getRqu_sbh_id());
            PJTE2200C.setPrr_cnd(PJTE2200.getGridData().get(i).getPrr_cnd());
            PJTE2200C.setInp_val(PJTE2200.getGridData().get(i).getInp_val());

            PJTE2200C.setTst_des(PJTE2200.getGridData().get(i).getTst_des());
            PJTE2200C.setOup_val(PJTE2200.getGridData().get(i).getPrr_cnd());
            PJTE2200C.setTp(PJTE2200.getGridData().get(i).getPrr_cnd());
            PJTE2200C.setOup_mens(PJTE2200.getGridData().get(i).getPrr_cnd());
            PJTE2200C.setTst_rst(PJTE2200.getGridData().get(i).getPrr_cnd());

            PJTE2200C.setTst_achi_rst(PJTE2200.getGridData().get(i).getPrr_cnd());
            PJTE2200C.setAtfl_mng_id(PJTE2200.getGridData().get(i).getAtfl_mng_id());
            PJTE2200C.setBkup_id(PJTE2200.getGridData().get(i).getBkup_id());
            PJTE2200C.setPrjt_id(PJTE2200.getPrjt_id());

            PJTE2200C.setLogin_aut_cd(PJTE2200.getLogin_aut_cd());
            PJTE2200C.setLogin_emp_no(PJTE2200.getLogin_emp_no());
            PJTE2200C.setLogin_bzcd(PJTE2200.getLogin_bzcd());
            PJTE2200C.setLogin_proj_id(PJTE2200.getLogin_proj_id());

            result = pjte2200service.insert_2200_01(PJTE2200C);
        }

        return result;
    }

    @PutMapping("/update")
    public @ResponseBody boolean update(HttpServletRequest request, @RequestBody PJTE2200DTO PJTE2200) throws Exception{
        boolean result = false;

        PJTE2200DTO PJTE2200U = new PJTE2200DTO();

        for(int i=0; i<PJTE2200.getUpdatedRows().size(); i++) {
            PJTE2200U.setBzcd(PJTE2200.getUpdatedRows().get(i).getBzcd());
            PJTE2200U.setSqn_cd(PJTE2200.getUpdatedRows().get(i).getSqn_cd());
            PJTE2200U.setScnr_id(PJTE2200.getUpdatedRows().get(i).getScnr_id());
            PJTE2200U.setScnr_nm(PJTE2200.getUpdatedRows().get(i).getScnr_nm());

            PJTE2200U.setTst_case_id(PJTE2200.getUpdatedRows().get(i).getTst_case_id());
            PJTE2200U.setTst_case_nm(PJTE2200.getUpdatedRows().get(i).getTst_case_nm());
            PJTE2200U.setItg_tst_prc_cd(PJTE2200.getUpdatedRows().get(i).getItg_tst_prc_cd());
            PJTE2200U.setFrcs_sta_dt(PJTE2200.getUpdatedRows().get(i).getFrcs_sta_dt());
            PJTE2200U.setFrcs_end_dt(PJTE2200.getUpdatedRows().get(i).getFrcs_end_dt());

            PJTE2200U.setSta_dt(PJTE2200.getUpdatedRows().get(i).getSta_dt());
            PJTE2200U.setEnd_dt(PJTE2200.getUpdatedRows().get(i).getEnd_dt());
            PJTE2200U.setDvlpe_cnf_dt(PJTE2200.getUpdatedRows().get(i).getDvlpe_cnf_dt());
            PJTE2200U.setPl_cnf_dt(PJTE2200.getUpdatedRows().get(i).getPl_cnf_dt());
            PJTE2200U.setDvlpe_enm(PJTE2200.getUpdatedRows().get(i).getDvlpe_enm());

            PJTE2200U.setDvlpe_eno(PJTE2200.getUpdatedRows().get(i).getDvlpe_eno());
            PJTE2200U.setPl_enm(PJTE2200.getUpdatedRows().get(i).getPl_enm());
            PJTE2200U.setPl_eno(PJTE2200.getUpdatedRows().get(i).getPl_eno());
            PJTE2200U.setCrpe_enm(PJTE2200.getUpdatedRows().get(i).getCrpe_enm());
            PJTE2200U.setCrpe_eno(PJTE2200.getUpdatedRows().get(i).getCrpe_eno());

            PJTE2200U.setErr_tot_cnt(PJTE2200.getUpdatedRows().get(i).getErr_tot_cnt());
            PJTE2200U.setErr_cmpl_cnt(PJTE2200.getUpdatedRows().get(i).getErr_cmpl_cnt());
            PJTE2200U.setErr_ncmpl_cnt(PJTE2200.getUpdatedRows().get(i).getErr_ncmpl_cnt());
            PJTE2200U.setRmrk(PJTE2200.getUpdatedRows().get(i).getRmrk());
            PJTE2200U.setPgm_id(PJTE2200.getUpdatedRows().get(i).getPgm_id());

            PJTE2200U.setScrn_id(PJTE2200.getUpdatedRows().get(i).getScrn_id());
            PJTE2200U.setTrn_cd(PJTE2200.getUpdatedRows().get(i).getTrn_cd());
            PJTE2200U.setRqu_sbh_id(PJTE2200.getUpdatedRows().get(i).getRqu_sbh_id());
            PJTE2200U.setPrr_cnd(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());
            PJTE2200U.setInp_val(PJTE2200.getUpdatedRows().get(i).getInp_val());

            PJTE2200U.setTst_des(PJTE2200.getUpdatedRows().get(i).getTst_des());
            PJTE2200U.setOup_val(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());
            PJTE2200U.setTp(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());
            PJTE2200U.setOup_mens(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());
            PJTE2200U.setTst_rst(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());

            PJTE2200U.setTst_achi_rst(PJTE2200.getUpdatedRows().get(i).getPrr_cnd());
            PJTE2200U.setAtfl_mng_id(PJTE2200.getUpdatedRows().get(i).getAtfl_mng_id());
            PJTE2200U.setBkup_id(PJTE2200.getUpdatedRows().get(i).getBkup_id());
            PJTE2200U.setPrjt_id(PJTE2200.getUpdatedRows().get(i).getPrjt_id());

            PJTE2200U.setLogin_aut_cd(PJTE2200.getLogin_aut_cd());
            PJTE2200U.setLogin_emp_no(PJTE2200.getLogin_emp_no());
            PJTE2200U.setLogin_bzcd(PJTE2200.getLogin_bzcd());
            PJTE2200U.setLogin_proj_id(PJTE2200.getLogin_proj_id());

            result = pjte2200service.update_2200_01(PJTE2200U);
        }

        return result;
    }
}
