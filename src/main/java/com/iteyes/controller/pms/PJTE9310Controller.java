package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9310DTO;
import com.iteyes.service.PJTE9310Service;
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
@RequestMapping(value = "/PJTE9310")
public class PJTE9310Controller {

    @Autowired
    private PJTE9310Service PJTE9310Service;

    /**
     * 헤더 조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
    @GetMapping(value = "/combo")
    public @ResponseBody String combo(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        /* 빈 dto 생성 */
        PJTE9310DTO PJTE9310 = new PJTE9310DTO();

        /* dto 값 셋팅*/
        PJTE9310.setPrjt_id(request.getParameter("prjt_id"));

        /* 서비스 요청 - 공통콤보박스 select */
        List<PJTE9310DTO> list = PJTE9310Service.select_0000_01(PJTE9310);

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

    /**
     * 투입인력조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
    @GetMapping(value = "/select_9310_01")
    public @ResponseBody String select_9310_01(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9310DTO PJTE9310 = new PJTE9310DTO();

        /* dto 값 셋팅*/
        PJTE9310.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9310.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9310.setDept_cd(request.getParameter("dept_cd"));

        /* 서비스 요청**/
        List<PJTE9310DTO> list = PJTE9310Service.select_9310_01(PJTE9310);

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

     /**
     * 투입현황 등록
     * @author hib
     * @param PJTE9310
     * @return result (true)
     * @throws Exception
     */
    @PostMapping("/insert_9310_01")
    public @ResponseBody boolean insert_9310_01(@RequestBody PJTE9310DTO PJTE9310) throws Exception{
        boolean result = false;

        PJTE9310DTO PJTE9310C = new PJTE9310DTO();

        PJTE9310C.setPrjt_id(PJTE9310.getPrjt_id());
        PJTE9310C.setDept_nm(PJTE9310.getDept_nm());
        PJTE9310C.setHdq_nm(PJTE9310.getHdq_nm());
        PJTE9310C.setTm_nm(PJTE9310.getTm_nm());
        PJTE9310C.setRank_nm(PJTE9310.getRank_nm());
        PJTE9310C.setEmpno(PJTE9310.getEmpno());
        PJTE9310C.setEmpnm(PJTE9310.getEmpnm());
        PJTE9310C.setEnt_dt(PJTE9310.getEnt_dt());
        PJTE9310C.setInp_prj_nm(PJTE9310.getInp_prj_nm());
        PJTE9310C.setInp_dt(PJTE9310.getInp_dt());
        PJTE9310C.setWth_dt(PJTE9310.getWth_dt());
        PJTE9310C.setPrj_typ_nm(PJTE9310.getPrj_typ_nm());
        PJTE9310C.setPrf_ar(PJTE9310.getPrf_ar());
        PJTE9310C.setRmrk(PJTE9310.getRmrk());
        PJTE9310C.setInp_cls_cd(PJTE9310.getInp_cls_cd());
        PJTE9310C.setWth_sch_yn(PJTE9310.getWth_sch_yn());
        PJTE9310C.setDept_cd(PJTE9310.getDept_cd());

        PJTE9310C.setLogin_emp_no(PJTE9310.getLogin_emp_no());

        result = PJTE9310Service.insert_9310_01(PJTE9310C);

        return result;
    }

    /**
     * 투입현황 삭제
     * @author hib
     * @param request
     * @param PJTE9310
     * @return result
     * @throws Exception
     */
    @PutMapping(value = "/delete_9310_01")
    public @ResponseBody
    boolean delete_9310_01(HttpServletRequest request, @RequestBody PJTE9310DTO PJTE9310) throws Exception {
        boolean result = false;

        PJTE9310DTO PJTE9310D = new PJTE9310DTO();
        /* dto 값 셋팅 */
        PJTE9310D.setPrjt_id(PJTE9310.getPrjt_id());
        PJTE9310D.setDept_cd(PJTE9310.getDept_cd());


        result = PJTE9310Service.delete_9310_01(PJTE9310D);

        return result;
    }
}
