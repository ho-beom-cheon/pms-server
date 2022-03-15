package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9900DTO;
import com.iteyes.service.PJTE9900Service;
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
@RequestMapping(value = "/PJTE9900")
public class PJTE9900Controller {
    @Autowired
    private PJTE9900Service pjte9900Service;

    @GetMapping(value = "/combo")
    public @ResponseBody String combo(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        /* 빈 dto 생성 */
        PJTE9900DTO PJTE9900 = new PJTE9900DTO();

        /* dto 값 셋팅*/
        PJTE9900.setPrjt_id(request.getParameter("prjt_id"));

        /* 서비스 요청 */
        List<PJTE9900DTO> list = pjte9900Service.select_0000_01(PJTE9900);

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

        /* 빈 dto 생성 */
        PJTE9900DTO PJTE9900 = new PJTE9900DTO();

        /* dto 값 셋팅*/
        PJTE9900.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9900.setDept_cd(request.getParameter("dept_cd_selected"));
        PJTE9900.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9900.setCon_work_id(request.getParameter("con_work_id"));
        PJTE9900.setWeek_yymm(request.getParameter("week_yymm"));
        PJTE9900.setGubun(request.getParameter("gubun"));

        /* 서비스 요청**/
        List<PJTE9900DTO> list = pjte9900Service.select_9900(PJTE9900);

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
    public @ResponseBody boolean create(@RequestBody PJTE9900DTO PJTE9900) throws Exception{
        boolean result = false;

        PJTE9900DTO PJTE9900C = new PJTE9900DTO();
        PJTE9900C.setLogin_emp_no(PJTE9900.getLogin_emp_no());
        PJTE9900C.setPrjt_id(PJTE9900.getPrjt_id());   //프로젝트 id
        PJTE9900C.setBkup_id(PJTE9900.getBkup_id());   //백업 id
        PJTE9900C.setDept_cd(PJTE9900.getDept_cd());   //부문코드
        if(PJTE9900C.getDept_cd().equals("TTT")){
            PJTE9900C.setDept_cd("100");   //부문코드
            PJTE9900C.setDept_etc("F");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("100")){
            PJTE9900C.setDept_etc("F");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("110")){
            PJTE9900C.setDept_etc("Y");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("120")){
            PJTE9900C.setDept_etc("B");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("200")){
            PJTE9900C.setDept_etc("D");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("210")){
            PJTE9900C.setDept_etc("P");   //부문코드
        }else if(PJTE9900C.getDept_cd().equals("300")){
            PJTE9900C.setDept_etc("T");   //부문코드
        }

        for (int i = 0; i < PJTE9900.getGridData().size(); i++) {

            PJTE9900C.setWork_task(PJTE9900.getGridData().get(i).getWork_task());
            PJTE9900C.setWork_step_cd(PJTE9900.getGridData().get(i).getWork_step_cd());
            PJTE9900C.setReg_dt(PJTE9900.getGridData().get(i).getReg_dt());
            PJTE9900C.setCom_rgs_dt(PJTE9900.getGridData().get(i).getCom_rgs_dt());
            PJTE9900C.setReg_nm(PJTE9900.getGridData().get(i).getReg_nm());
            PJTE9900C.setCrpe_nm(PJTE9900.getGridData().get(i).getCrpe_nm());
            PJTE9900C.setPtcp_nm(PJTE9900.getGridData().get(i).getPtcp_nm());
            PJTE9900C.setRmrk(PJTE9900.getGridData().get(i).getRmrk());
            PJTE9900C.setMark(PJTE9900.getGridData().get(i).getMark());

            result = pjte9900Service.insert_9900_01(PJTE9900C);

            if(result == false){
                break;
            }
        }

        return result;
    }

    @PutMapping("/update")
    public @ResponseBody boolean update(HttpServletRequest request, @RequestBody PJTE9900DTO PJTE9900) throws Exception{
        boolean result = false;

        PJTE9900DTO PJTE9900U = new PJTE9900DTO();

        for(int i=0; i<PJTE9900.getUpdatedRows().size(); i++) {
            PJTE9900U.setPrjt_id(PJTE9900.getUpdatedRows().get(i).getPrjt_id());
            PJTE9900U.setBkup_id(PJTE9900.getUpdatedRows().get(i).getBkup_id());

            PJTE9900U.setLogin_aut_cd(PJTE9900.getLogin_aut_cd());
            PJTE9900U.setLogin_emp_no(PJTE9900.getLogin_emp_no());
            PJTE9900U.setLogin_bzcd(PJTE9900.getLogin_bzcd());
            PJTE9900U.setLogin_proj_id(PJTE9900.getLogin_proj_id());

            result = pjte9900Service.update_9900_01(PJTE9900U);
        }
        return result;
    }
}
