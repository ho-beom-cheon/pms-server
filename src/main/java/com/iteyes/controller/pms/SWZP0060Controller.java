package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.SWZP0060DTO;
import com.iteyes.service.SWZP0060Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
@CrossOrigin
@Controller
@Log4j2
@RequestMapping(value = "/SWZP0060")
public class SWZP0060Controller {
    @Autowired
    private SWZP0060Service swzp0060Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        SWZP0060DTO SWZP0060 = new SWZP0060DTO();

        SWZP0060.setRgs_dis_cd(request.getParameter("rgs_dis_cd_selected"));
        SWZP0060.setReq_dis_cd(request.getParameter("req_dis_cd_selected"));
        SWZP0060.setPrc_step_cd(request.getParameter("prc_step_cd_selected"));
        SWZP0060.setTgt_biz_nm(request.getParameter("tgt_biz_nm"));
        SWZP0060.setAchi_nm(request.getParameter("achi_nm"));
        SWZP0060.setTtmn_crpe_nm(request.getParameter("ttmn_crpe_nm"));
        SWZP0060.setRgs_sta_dt(request.getParameter("rgs_sta_dt"));
        SWZP0060.setRgs_end_dt(request.getParameter("rgs_end_dt"));
        SWZP0060.setTtmn_sta_dt(request.getParameter("ttmn_sta_dt"));
        SWZP0060.setTtmn_end_dt(request.getParameter("ttmn_end_dt"));
        SWZP0060.setTitl_nm(request.getParameter("titl_nm"));
        SWZP0060.setReq_dis_txt(request.getParameter("req_dis_txt"));
        SWZP0060.setTtmn_txt(request.getParameter("ttmn_txt"));
        SWZP0060.setSlv_mpln_txt(request.getParameter("slv_mpln_txt"));

        List<SWZP0060DTO> list = swzp0060Service.select_0060(SWZP0060);

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
    boolean update(@RequestBody SWZP0060DTO SWZP0060) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        SWZP0060.setRgs_dis_cd(SWZP0060.getD_rgs_dis_cd());
        SWZP0060.setPrc_step_cd(SWZP0060.getD_prc_step_cd());
        SWZP0060.setMng_id(SWZP0060.getMng_id());
        SWZP0060.setReq_dis_cd(SWZP0060.getD_req_dis_cd());
        SWZP0060.setRgs_dt(SWZP0060.getRgs_dt());
        SWZP0060.setAchi_nm(SWZP0060.getD_achi_nm());
        SWZP0060.setTtmn_crpe_nm(SWZP0060.getD_ttmn_crpe_nm());
        SWZP0060.setTgt_biz_nm(SWZP0060.getD_tgt_biz_nm());
        SWZP0060.setTtmn_scd_dt(SWZP0060.getTtmn_scd_dt());
        SWZP0060.setTtmn_dt(SWZP0060.getTtmn_dt());
        SWZP0060.setIfnc_cd(SWZP0060.getIfnc_cd());
        SWZP0060.setUrgn_cd(SWZP0060.getUrgn_cd());
        SWZP0060.setGd_txt(SWZP0060.getGd_txt());
        SWZP0060.setTitl_nm(SWZP0060.getD_titl_nm());
        SWZP0060.setReq_dis_txt(SWZP0060.getD_req_dis_txt());
        SWZP0060.setTtmn_txt(SWZP0060.getD_ttmn_txt());
        SWZP0060.setSlv_mpln_txt(SWZP0060.getD_slv_mpln_txt());
        SWZP0060.setRmrk(SWZP0060.getRmrk());

        result = swzp0060Service.update_0060(SWZP0060);

        return result;

    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    boolean insert(@RequestBody SWZP0060DTO SWZP0060C) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        SWZP0060C.setRgs_dis_cd(SWZP0060C.getD_rgs_dis_cd());
        SWZP0060C.setPrc_step_cd(SWZP0060C.getD_prc_step_cd());
        SWZP0060C.setReq_dis_cd(SWZP0060C.getD_req_dis_cd());
        SWZP0060C.setRgs_dt(SWZP0060C.getRgs_dt());
        SWZP0060C.setAchi_nm(SWZP0060C.getD_achi_nm());
        SWZP0060C.setTtmn_crpe_nm(SWZP0060C.getD_ttmn_crpe_nm());
        SWZP0060C.setTgt_biz_nm(SWZP0060C.getD_tgt_biz_nm());
        SWZP0060C.setTtmn_scd_dt(SWZP0060C.getTtmn_scd_dt());
        SWZP0060C.setTtmn_dt(SWZP0060C.getTtmn_dt());
        SWZP0060C.setIfnc_cd(SWZP0060C.getIfnc_cd());
        SWZP0060C.setUrgn_cd(SWZP0060C.getUrgn_cd());
        SWZP0060C.setGd_txt(SWZP0060C.getGd_txt());
        SWZP0060C.setTitl_nm(SWZP0060C.getD_titl_nm());
        SWZP0060C.setReq_dis_txt(SWZP0060C.getD_req_dis_txt());
        SWZP0060C.setTtmn_txt(SWZP0060C.getD_ttmn_txt());
        SWZP0060C.setSlv_mpln_txt(SWZP0060C.getD_slv_mpln_txt());
        SWZP0060C.setRmrk(SWZP0060C.getRmrk());

        result = swzp0060Service.insert_0060(SWZP0060C);

        return result;

    }
}
