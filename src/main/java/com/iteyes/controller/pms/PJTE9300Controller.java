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

    /**
     * 투입인력조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
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

//     /**
//     * 투입현황 등록
//     * @author hib
//     * @param PJTE9300
//     * @return result (true)
//     * @throws Exception
//     */
//    @PostMapping("/insert_9310_01")
//    public @ResponseBody boolean insert_9310_01(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
//        boolean result = false;
//
//        if(PJTE9300.getGridData().size() != 0) {
//
//            PJTE9300DTO PJTE9300D = new PJTE9300DTO();
//            PJTE9300DTO PJTE9300C = new PJTE9300DTO();
//
//
//            /* dto 값 셋팅*/
//            PJTE9300D.setPrjt_id(PJTE9300.getPrjt_id());
//            PJTE9300D.setDept_cd(PJTE9300.getDept_cd());
//            PJTE9300Service.delete_9310_01(PJTE9300D);
//
//
//            for (int i = 0; i < PJTE9300.getGridData().size(); i++) {
//                PJTE9300C.setPrjt_id(PJTE9300.getPrjt_id());
//                PJTE9300C.setDept_nm(PJTE9300.getGridData().get(i).getDept_nm());
//                PJTE9300C.setHdq_nm(PJTE9300.getGridData().get(i).getHdq_nm());
//                PJTE9300C.setTm_nm(PJTE9300.getGridData().get(i).getTm_nm());
//                PJTE9300C.setRank_nm(PJTE9300.getGridData().get(i).getRank_nm());
//                PJTE9300C.setEmpno(PJTE9300.getGridData().get(i).getEmpno());
//                PJTE9300C.setEmpnm(PJTE9300.getGridData().get(i).getEmpnm());
//                PJTE9300C.setEnt_dt(PJTE9300.getGridData().get(i).getEnt_dt());
//                PJTE9300C.setInp_prj_nm(PJTE9300.getGridData().get(i).getInp_prj_nm());
//                PJTE9300C.setInp_dt(PJTE9300.getGridData().get(i).getInp_dt());
//                PJTE9300C.setWth_dt(PJTE9300.getGridData().get(i).getWth_dt());
//                PJTE9300C.setPrj_typ_nm(PJTE9300.getGridData().get(i).getPrj_typ_nm());
//                PJTE9300C.setPrf_ar(PJTE9300.getGridData().get(i).getPrf_ar());
//                PJTE9300C.setRmrk(PJTE9300.getGridData().get(i).getRmrk());
//                PJTE9300C.setInp_cls_cd(PJTE9300.getGridData().get(i).getInp_cls_cd());
//                PJTE9300C.setWth_sch_yn(PJTE9300.getGridData().get(i).getWth_sch_yn());
//
//                PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());
//
//                result = PJTE9300Service.insert_9310_01(PJTE9300C);
//            }
//        }
//        return result;
//    }
//
//    /**
//     * 투입현황 삭제
//     * @author hib
//     * @param request
//     * @param PJTE9300
//     * @return result
//     * @throws Exception
//     */
//    @PutMapping(value = "/delete_9310_01")
//    public @ResponseBody
//    boolean delete_9310_01(HttpServletRequest request, @RequestBody PJTE9300DTO PJTE9300) throws Exception {
//        boolean result = false;
//
//        PJTE9300DTO PJTE9300D = new PJTE9300DTO();
//        /* dto 값 셋팅 */
//        PJTE9300D.setPrjt_id(PJTE9300.getPrjt_id());
//        PJTE9300D.setDept_cd(PJTE9300.getDept_cd());
//
//
//        result = PJTE9300Service.delete_9310_01(PJTE9300D);
//
//        return result;
//    }
}
