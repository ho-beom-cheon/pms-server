package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9100DTO;
import com.iteyes.service.PJTE9100Service;
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
@RequestMapping(value = "/PJTE9100")
public class PJTE9100Controller {
    @Autowired
    private PJTE9100Service pjte9100Service;

    @GetMapping(value = "/select")
    public @ResponseBody
    String select(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9100DTO PJTE9100 = new PJTE9100DTO();

        /* dto 값 셋팅*/
        PJTE9100.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9100.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9100.setBubun_cd(request.getParameter("bubun_cd"));
        PJTE9100.setBsn_cls_cd(request.getParameter("bsn_cls_cd"));
        PJTE9100.setGesipan_titl(request.getParameter("gesipan_titl"));

        /* 서비스 요청**/
        List<PJTE9100DTO> list = pjte9100Service.select_9100_01(PJTE9100);

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
    boolean update(@RequestBody PJTE9100DTO PJTE9100) throws Exception {

        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        result = pjte9100Service.update_9100_01(PJTE9100);

        return result;

    }

    @PostMapping("/insert")
    public @ResponseBody
    boolean create(HttpServletRequest request, @RequestBody PJTE9100DTO PJTE9100) throws Exception {
        boolean result = false;

        PJTE9100DTO PJTE9100D = new PJTE9100DTO();

        PJTE9100D.setPrjt_id     (PJTE9100.getPrjt_id());
        PJTE9100D.setBkup_id(PJTE9100.getBkup_id());

        PJTE9100DTO PJTE9100C = new PJTE9100DTO();

        PJTE9100C.setPrjt_id      (PJTE9100.getPrjt_id      ());
        PJTE9100C.setLogin_emp_no (PJTE9100.getLogin_emp_no ());
        PJTE9100C.setBubun_cd     (PJTE9100.getBubun_cd     ());
        PJTE9100C.setBsn_cls_cd   (PJTE9100.getBsn_cls_cd   ());
        PJTE9100C.setGesipan_titl (PJTE9100.getGesipan_titl ());
        PJTE9100C.setNotice_sta_dt(PJTE9100.getNotice_sta_dt());
        PJTE9100C.setAnnmt_yn     (PJTE9100.getAnnmt_yn     ());
        PJTE9100C.setComment_yn   (PJTE9100.getComment_yn   ());
        PJTE9100C.setNotice_titl  (PJTE9100.getNotice_titl  ());
        PJTE9100C.setGesipan_id   (PJTE9100.getGesipan_id   ());
        PJTE9100C.setGesipan_dsc  (PJTE9100.getGesipan_dsc  ());
        PJTE9100C.setAfrm_yn      (PJTE9100.getAfrm_yn      ());
        PJTE9100C.setNmb_inq_yn   (PJTE9100.getNmb_inq_yn   ());
        PJTE9100C.setPgn_yn       (PJTE9100.getPgn_yn       ());
        PJTE9100C.setFile_upld_yn (PJTE9100.getFile_upld_yn ());

        result = pjte9100Service.insert_9100_01(PJTE9100C);

        return result;
    }
}
