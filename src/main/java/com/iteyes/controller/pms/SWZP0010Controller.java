package com.iteyes.controller.pms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.User;
import com.iteyes.dto.pms.SWZP0010DTO;
import com.iteyes.service.SWZP0010Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/SWZP0010")
public class SWZP0010Controller {
    @Autowired
    private SWZP0010Service swzp0010Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 데이터 로그 확인 */
        log.debug("# pgm_id :: " + request.getParameter("pgm_id"));
        log.debug("# pgm_nm :: " + request.getParameter("pgm_nm"));
        log.debug("# pl_no :: " + request.getParameter("pl_no"));
        log.debug("# dvlpe_no :: " + request.getParameter("dvlpe_no"));
        log.debug("# pgm_dis_cd :: " + request.getParameter("pgm_dis_cd_selected"));
        log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
        log.debug("# dvlp_dis_cd :: " + request.getParameter("dvlp_dis_cd_selected"));
        log.debug("# prc_step_cd :: " + request.getParameter("prc_step_cd_selected"));

        /* 빈 dto 생성 */
        SWZP0010DTO SWZP0010 = new SWZP0010DTO();

        /* dto 값 셋팅*/
        SWZP0010.setPgm_id(request.getParameter("pgm_id"));
        SWZP0010.setPgm_nm(request.getParameter("pgm_nm"));
        SWZP0010.setPl_no(request.getParameter("pl_no"));
        SWZP0010.setDvlpe_no(request.getParameter("dvlpe_no"));
        SWZP0010.setPgm_dis_cd(request.getParameter("pgm_dis_cd_selected"));
        SWZP0010.setBzcd(request.getParameter("bzcd_selected"));
        SWZP0010.setDvlp_dis_cd(request.getParameter("dvlp_dis_cd_selected"));
        SWZP0010.setPrc_step_cd(request.getParameter("prc_step_cd_selected"));

        /* 서비스 요청 */
        List<SWZP0010DTO> list = swzp0010Service.select_0010(SWZP0010);

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

    @PostMapping("/modify")
    public @ResponseBody boolean create(@RequestBody SWZP0010DTO swzp0010) throws Exception{
        boolean result = false;

        SWZP0010DTO SWZP0010C = new SWZP0010DTO();

        for(int i=0; i<swzp0010.getCreatedRows().size(); i++) {
            SWZP0010C.setBz_dtls_txt(swzp0010.getCreatedRows().get(i).getBz_dtls_txt());
            SWZP0010C.setPgm_nm(swzp0010.getCreatedRows().get(i).getPgm_nm());
            SWZP0010C.setDvlp_dis_cd(swzp0010.getCreatedRows().get(i).getDvlp_dis_cd());
            SWZP0010C.setPgm_dis_cd(swzp0010.getCreatedRows().get(i).getPgm_dis_cd());
            SWZP0010C.setEnlpe_nm(swzp0010.getCreatedRows().get(i).getEnlpe_nm());
            SWZP0010C.setAut_id(swzp0010.getCreatedRows().get(i).getAut_id());
            SWZP0010C.setFrcs_sta_dt(swzp0010.getCreatedRows().get(i).getFrcs_sta_dt());
            SWZP0010C.setFrcs_end_dt(swzp0010.getCreatedRows().get(i).getFrcs_end_dt());
            SWZP0010C.setPrc_step_cd(swzp0010.getCreatedRows().get(i).getPrc_step_cd());
            SWZP0010C.setPrg_txt(swzp0010.getCreatedRows().get(i).getPrg_txt());
            SWZP0010C.setDvlpe_no(swzp0010.getCreatedRows().get(i).getDvlpe_no());
            SWZP0010C.setPl_no(swzp0010.getCreatedRows().get(i).getPl_no());
            SWZP0010C.setCrpe_no(swzp0010.getCreatedRows().get(i).getCrpe_no());
            SWZP0010C.setRmrk(swzp0010.getCreatedRows().get(i).getRmrk());
            SWZP0010C.setAtfl_mng_id(swzp0010.getCreatedRows().get(i).getAtfl_mng_id());
            SWZP0010C.setEmpno(swzp0010.getCreatedRows().get(i).getEmpno());
            SWZP0010C.setPgm_id("세션에서추가");
//            SWZP0010C.setPgm_id(swzp0010.getCreatedRows().get(i).getPgm_id());
            SWZP0010C.setBzcd("세션에서추가");
//            SWZP0010C.setBzcd(swzp0010.getCreatedRows().get(i).getBzcd());
            SWZP0010C.setPrjt_id("세션에서추가");
//            SWZP0010C.setPrjt_id(swzp0010.getCreatedRows().get(i).getPrjt_id());
            SWZP0010C.setBkup_id("세션에서추가");
//            SWZP0010C.setBkup_id(swzp0010.getCreatedRows().get(i).getBkup_id());

            result = swzp0010Service.insert_0010(SWZP0010C);
        }

        return result;
    }

    @PutMapping("/update")
    public @ResponseBody boolean update(@RequestBody SWZP0010DTO swzp0010) throws Exception{
        boolean result = false;

        SWZP0010DTO SWZP0010U = new SWZP0010DTO();

        for(int i=0; i<swzp0010.getUpdatedRows().size(); i++) {
            SWZP0010U.setBz_dtls_txt(swzp0010.getUpdatedRows().get(i).getBz_dtls_txt());
            SWZP0010U.setPgm_nm(swzp0010.getUpdatedRows().get(i).getPgm_nm());
            SWZP0010U.setDvlp_dis_cd(swzp0010.getUpdatedRows().get(i).getDvlp_dis_cd());
            SWZP0010U.setPgm_dis_cd(swzp0010.getUpdatedRows().get(i).getPgm_dis_cd());
            SWZP0010U.setEnlpe_nm(swzp0010.getUpdatedRows().get(i).getEnlpe_nm());
            SWZP0010U.setAut_id(swzp0010.getUpdatedRows().get(i).getAut_id());
            SWZP0010U.setFrcs_sta_dt(swzp0010.getUpdatedRows().get(i).getFrcs_sta_dt());
            SWZP0010U.setFrcs_end_dt(swzp0010.getUpdatedRows().get(i).getFrcs_end_dt());
            SWZP0010U.setPrc_step_cd(swzp0010.getUpdatedRows().get(i).getPrc_step_cd());
            SWZP0010U.setPrg_txt(swzp0010.getUpdatedRows().get(i).getPrg_txt());
            SWZP0010U.setDvlpe_no(swzp0010.getUpdatedRows().get(i).getDvlpe_no());
            SWZP0010U.setPl_no(swzp0010.getUpdatedRows().get(i).getPl_no());
            SWZP0010U.setCrpe_no(swzp0010.getUpdatedRows().get(i).getCrpe_no());
            SWZP0010U.setRmrk(swzp0010.getUpdatedRows().get(i).getRmrk());
            SWZP0010U.setAtfl_mng_id(swzp0010.getUpdatedRows().get(i).getAtfl_mng_id());
            SWZP0010U.setEmpno(swzp0010.getUpdatedRows().get(i).getEmpno());
            SWZP0010U.setPgm_id(swzp0010.getUpdatedRows().get(i).getPgm_id());
            SWZP0010U.setBzcd(swzp0010.getUpdatedRows().get(i).getBzcd());
            SWZP0010U.setPrjt_id(swzp0010.getUpdatedRows().get(i).getPrjt_id());
            SWZP0010U.setBkup_id(swzp0010.getUpdatedRows().get(i).getBkup_id());

            result = swzp0010Service.update_0010(SWZP0010U);
        }

        return result;
    }
    @DeleteMapping("/delete")
    public @ResponseBody boolean delete(HttpServletRequest request) throws Exception{

        boolean result = false;

        SWZP0010DTO SWZP0010D = new SWZP0010DTO();
//            SWZP0010D.setAtfl_mng_id(request.getParameter("deletedRows["+-i+"][atfl_mng_id]"));
//            SWZP0010D.setEmpno(request.getParameter(i+"[empno]"));
//            SWZP0010D.setPgm_id(request.getParameter(i+"[pgm_id]"));
//            SWZP0010D.setBzcd(request.getParameter(i+"[bzcd]"));
//            SWZP0010D.setPrjt_id(request.getParameter(i+"[prjt_id]"));
//            SWZP0010D.setBkup_id(request.getParameter(i+"[bkup_id]"));
//        for(int i=0; i<request.getParameter("getDeletedRows").size(); i++) {
//            SWZP0010D.setAtfl_mng_id(request.getParameter(i+"[atfl_mng_id]"));
//            SWZP0010D.setEmpno(request.getParameter(i+"[empno]"));
//            SWZP0010D.setPgm_id(request.getParameter(i+"[pgm_id]"));
//            SWZP0010D.setBzcd(request.getParameter(i+"[bzcd]"));
//            SWZP0010D.setPrjt_id(request.getParameter(i+"[prjt_id]"));
//            SWZP0010D.setBkup_id(request.getParameter(i+"[bkup_id]"));
//
//            result = swzp0010Service.delete_0010(SWZP0010D);
//        }

        return result;
    }
}
