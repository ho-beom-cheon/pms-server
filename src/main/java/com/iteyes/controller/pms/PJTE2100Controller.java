package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE2100DTO;
import com.iteyes.service.PJTE2100Service;
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
@RequestMapping(value = "/PJTE2100")
public class PJTE2100Controller {
    @Autowired
    private PJTE2100Service pjte2100Service;

    @GetMapping(value = "/combo")
    public @ResponseBody String combo(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        /* 빈 dto 생성 */
        PJTE2100DTO PJTE2100 = new PJTE2100DTO();

        /* dto 값 셋팅*/
        PJTE2100.setPrjt_id(request.getParameter("prjt_id"));

        /* 서비스 요청 */
        List<PJTE2100DTO> list = pjte2100Service.select_0000(PJTE2100);

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

    @GetMapping(value = "/select")
    public @ResponseBody String select(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        log.debug("# pgm_id :: "   + request.getParameter("pgm_id"));
        log.debug("# pgm_nm :: "   + request.getParameter("pgm_nm"));
        log.debug("# pl_no :: "    + request.getParameter("pl_no"));
        log.debug("# dvlpe_no :: " + request.getParameter("dvlpe_no"));
        log.debug("# pgm_dis_cd :: " + request.getParameter("pgm_dis_cd_selected"));
        log.debug("# bzcd :: " + request.getParameter("bzcd_selected"));
        log.debug("# dvlp_dis_cd :: " + request.getParameter("dvlp_dis_cd_selected"));

        /* 빈 dto 생성 */
        PJTE2100DTO PJTE2100 = new PJTE2100DTO();

        /* dto 값 셋팅*/
        PJTE2100.setPgm_id(request.getParameter("pgm_id"));
        PJTE2100.setPgm_nm(request.getParameter("pgm_nm"));
        PJTE2100.setPl_no(request.getParameter("pl_no"));
        PJTE2100.setDvlpe_no(request.getParameter("dvlpe_no"));
        PJTE2100.setPgm_dis_cd(request.getParameter("pgm_dis_cd_selected"));
        PJTE2100.setBzcd(request.getParameter("bzcd_selected"));
        PJTE2100.setDvlp_dis_cd(request.getParameter("dvlp_dis_cd_selected"));
        PJTE2100.setPrc_step_cd(request.getParameter("prc_step_cd_selected"));

        /* 서비스 요청 */
        List<PJTE2100DTO> list = pjte2100Service.select_2100_01(PJTE2100);

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
    public @ResponseBody boolean create(@RequestBody PJTE2100DTO PJTE2100) throws Exception{
        boolean result = false;

        PJTE2100DTO PJTE2100C = new PJTE2100DTO();

        for(int i=0; i<PJTE2100.getCreatedRows().size(); i++) {
            PJTE2100C.setBz_dtls_txt(PJTE2100.getCreatedRows().get(i).getBz_dtls_txt());
            PJTE2100C.setPgm_nm(PJTE2100.getCreatedRows().get(i).getPgm_nm());
            PJTE2100C.setDvlp_dis_cd(PJTE2100.getCreatedRows().get(i).getDvlp_dis_cd());
            PJTE2100C.setPgm_dis_cd(PJTE2100.getCreatedRows().get(i).getPgm_dis_cd());
            PJTE2100C.setEnlpe_nm(PJTE2100.getCreatedRows().get(i).getEnlpe_nm());
            PJTE2100C.setAut_id(PJTE2100.getCreatedRows().get(i).getAut_id());
            PJTE2100C.setFrcs_sta_dt(PJTE2100.getCreatedRows().get(i).getFrcs_sta_dt());
            PJTE2100C.setFrcs_end_dt(PJTE2100.getCreatedRows().get(i).getFrcs_end_dt());
            PJTE2100C.setPrc_step_cd(PJTE2100.getCreatedRows().get(i).getPrc_step_cd());
            PJTE2100C.setPrg_txt(PJTE2100.getCreatedRows().get(i).getPrg_txt());
            PJTE2100C.setDvlpe_no(PJTE2100.getCreatedRows().get(i).getDvlpe_no());
            PJTE2100C.setPl_no(PJTE2100.getCreatedRows().get(i).getPl_no());
            PJTE2100C.setCrpe_no(PJTE2100.getCreatedRows().get(i).getCrpe_no());
            PJTE2100C.setRmrk(PJTE2100.getCreatedRows().get(i).getRmrk());
            PJTE2100C.setAtfl_mng_id(PJTE2100.getCreatedRows().get(i).getAtfl_mng_id());
            PJTE2100C.setEmpno(PJTE2100.getCreatedRows().get(i).getEmpno());
            PJTE2100C.setPgm_id(PJTE2100.getCreatedRows().get(i).getPgm_id());
            PJTE2100C.setBzcd(PJTE2100.getCreatedRows().get(i).getBzcd());
            PJTE2100C.setPrjt_id(PJTE2100.getCreatedRows().get(i).getPrjt_id());
            PJTE2100C.setBkup_id(PJTE2100.getCreatedRows().get(i).getBkup_id());

            result = pjte2100Service.insert_2100_01(PJTE2100C);
        }

        return result;
    }

    @PutMapping("/update")
    public @ResponseBody boolean update(@RequestBody PJTE2100DTO PJTE2100) throws Exception{
        boolean result = false;

        PJTE2100DTO PJTE2100U = new PJTE2100DTO();

        for(int i=0; i<PJTE2100.getUpdatedRows().size(); i++) {
            PJTE2100U.setBz_dtls_txt(PJTE2100.getUpdatedRows().get(i).getBz_dtls_txt());
            PJTE2100U.setPgm_nm(PJTE2100.getUpdatedRows().get(i).getPgm_nm());
            PJTE2100U.setDvlp_dis_cd(PJTE2100.getUpdatedRows().get(i).getDvlp_dis_cd());
            PJTE2100U.setPgm_dis_cd(PJTE2100.getUpdatedRows().get(i).getPgm_dis_cd());
            PJTE2100U.setEnlpe_nm(PJTE2100.getUpdatedRows().get(i).getEnlpe_nm());
            PJTE2100U.setAut_id(PJTE2100.getUpdatedRows().get(i).getAut_id());
            PJTE2100U.setFrcs_sta_dt(PJTE2100.getUpdatedRows().get(i).getFrcs_sta_dt());
            PJTE2100U.setFrcs_end_dt(PJTE2100.getUpdatedRows().get(i).getFrcs_end_dt());
            PJTE2100U.setPrc_step_cd(PJTE2100.getUpdatedRows().get(i).getPrc_step_cd());
            PJTE2100U.setPrg_txt(PJTE2100.getUpdatedRows().get(i).getPrg_txt());
            PJTE2100U.setDvlpe_no(PJTE2100.getUpdatedRows().get(i).getDvlpe_no());
            PJTE2100U.setPl_no(PJTE2100.getUpdatedRows().get(i).getPl_no());
            PJTE2100U.setCrpe_no(PJTE2100.getUpdatedRows().get(i).getCrpe_no());
            PJTE2100U.setRmrk(PJTE2100.getUpdatedRows().get(i).getRmrk());
            PJTE2100U.setAtfl_mng_id(PJTE2100.getUpdatedRows().get(i).getAtfl_mng_id());
            PJTE2100U.setEmpno(PJTE2100.getUpdatedRows().get(i).getEmpno());
            PJTE2100U.setPgm_id(PJTE2100.getUpdatedRows().get(i).getPgm_id());
            PJTE2100U.setBzcd(PJTE2100.getUpdatedRows().get(i).getBzcd());
            PJTE2100U.setPrjt_id(PJTE2100.getUpdatedRows().get(i).getPrjt_id());
            PJTE2100U.setBkup_id(PJTE2100.getUpdatedRows().get(i).getBkup_id());

            result = pjte2100Service.update_2100_01(PJTE2100U);
        }

        return result;
    }

    @PutMapping("/delete")
    public @ResponseBody boolean delete(@RequestBody PJTE2100DTO PJTE2100) throws Exception{

        boolean result = false;

        PJTE2100DTO PJTE2100D = new PJTE2100DTO();
        for(int i=0; i<PJTE2100.getDeletedRows().size(); i++) {
            PJTE2100D.setAtfl_mng_id(PJTE2100.getDeletedRows().get(i).getAtfl_mng_id());
            PJTE2100D.setEmpno(PJTE2100.getDeletedRows().get(i).getEmpno());
            PJTE2100D.setPgm_id(PJTE2100.getDeletedRows().get(i).getPgm_id());
            PJTE2100D.setBzcd(PJTE2100.getDeletedRows().get(i).getBzcd());
            PJTE2100D.setPrjt_id(PJTE2100.getDeletedRows().get(i).getPrjt_id());
            PJTE2100D.setBkup_id(PJTE2100.getDeletedRows().get(i).getBkup_id());
        }

        result = pjte2100Service.update_2100_02(PJTE2100);

        return result;
    }
}