package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE5000DTO;
import com.iteyes.dto.pms.PJTE9900DTO;
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
        PJTE9900.setMng_id(request.getParameter("mng_id"));
        PJTE9900.setWork_task(request.getParameter("work_task"));
        PJTE9900.setCurrent_mng_id(request.getParameter("current_mng_id"));
        PJTE9900.setGubun(request.getParameter("gubun"));
        PJTE9900.setOver_due_dt_yn(request.getParameter("over_due_dt_yn"));

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
            PJTE9900C.setDept_cd("10200000");   //부문코드
            PJTE9900C.setDept_etc("F");   //부문코드가 TTT(전체)일 경우 Dept_etc : F
        }else if(PJTE9900C.getDept_cd().equals("10100000")){
            PJTE9900C.setDept_etc("R");   //부문코드가 10100000(리스크부문)일 경우 Dept_etc : R
        }else if(PJTE9900C.getDept_cd().equals("10200000")){
            PJTE9900C.setDept_etc("F");   //부문코드가 10200000(금융사업부문)일 경우 Dept_etc : F
        }else if(PJTE9900C.getDept_cd().equals("10300000")){
            PJTE9900C.setDept_etc("P");   //부문코드가 10300000(플랫폼부문)일 경우 Dept_etc : P
        }else if(PJTE9900C.getDept_cd().equals("10400000")){
            PJTE9900C.setDept_etc("D");   //부문코드가 10400000(DT부문)일 경우 Dept_etc : D
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

        PJTE9900U.setLogin_emp_no(PJTE9900.getLogin_emp_no());


        for(int i=0; i<PJTE9900.getUpdatedRows().size(); i++) {
            if (PJTE9900.getUpdatedRows().get(i).getCom_dt() != null && PJTE9900.getUpdatedRows().get(i).getCom_dt() != "") {
                PJTE9900U.setWork_step_cd("400");
            }else if(PJTE9900.getUpdatedRows().get(i).getRe_sta_dt() != null && PJTE9900.getUpdatedRows().get(i).getRe_sta_dt() != ""){
                if( Integer.parseInt(PJTE9900.getUpdatedRows().get(i).getRe_sta_dt().replace("-","")) >= Integer.parseInt(PJTE9900.getUpdatedRows().get(i).getStop_dt().replace("-",""))){
                    PJTE9900U.setWork_step_cd("200");
                }else{
                    PJTE9900U.setWork_step_cd("300");
                }
            }else if(PJTE9900.getUpdatedRows().get(i).getStop_dt() != null && PJTE9900.getUpdatedRows().get(i).getStop_dt() != ""){
                PJTE9900U.setWork_step_cd("300");
            }else if(PJTE9900.getUpdatedRows().get(i).getCom_due_dt() != null && PJTE9900.getUpdatedRows().get(i).getCom_due_dt() != ""){
                PJTE9900U.setWork_step_cd("200");
            }else{
                PJTE9900U.setWork_step_cd("100");
            }

            PJTE9900U.setPrjt_id(PJTE9900.getUpdatedRows().get(i).getPrjt_id());
            PJTE9900U.setBkup_id(PJTE9900.getUpdatedRows().get(i).getBkup_id());
            PJTE9900U.setDept_cd(PJTE9900.getUpdatedRows().get(i).getDept_cd());
            PJTE9900U.setMng_id(PJTE9900.getUpdatedRows().get(i).getMng_id());

            PJTE9900U.setWork_task(PJTE9900.getUpdatedRows().get(i).getWork_task());
            PJTE9900U.setCom_rgs_dt(PJTE9900.getUpdatedRows().get(i).getCom_rgs_dt());
            PJTE9900U.setCrpe_nm(PJTE9900.getUpdatedRows().get(i).getCrpe_nm());
            PJTE9900U.setPtcp_nm(PJTE9900.getUpdatedRows().get(i).getPtcp_nm());
            PJTE9900U.setCom_due_dt(PJTE9900.getUpdatedRows().get(i).getCom_due_dt());
            PJTE9900U.setStop_dt(PJTE9900.getUpdatedRows().get(i).getStop_dt());
            PJTE9900U.setRe_sta_dt(PJTE9900.getUpdatedRows().get(i).getRe_sta_dt());
            PJTE9900U.setCom_dt(PJTE9900.getUpdatedRows().get(i).getCom_dt());
            PJTE9900U.setBak_work_id(PJTE9900.getUpdatedRows().get(i).getBak_work_id());
            PJTE9900U.setCon_work_id(PJTE9900.getUpdatedRows().get(i).getCon_work_id());
            PJTE9900U.setMark(PJTE9900.getUpdatedRows().get(i).getMark());
            PJTE9900U.setRmrk(PJTE9900.getUpdatedRows().get(i).getRmrk());

            result = pjte9900Service.update_9900_01(PJTE9900U);
        }
        return result;
    }

    @PutMapping("/delete")
    boolean delete(HttpServletRequest request, @RequestBody PJTE9900DTO PJTE9900) throws Exception {
        boolean result = true;

        PJTE9900DTO PJTE9900D = new PJTE9900DTO();

        if (PJTE9900.getDeletedRows().size() != 0) {
            for (int i = 0; i < PJTE9900.getDeletedRows().size(); i++) {
                /* dto 값 셋팅*/
                PJTE9900D.setBkup_id(PJTE9900.getDeletedRows().get(i).getBkup_id());
                PJTE9900D.setPrjt_id(PJTE9900.getDeletedRows().get(i).getPrjt_id());
                PJTE9900D.setDept_cd(PJTE9900.getDeletedRows().get(i).getDept_cd());
                PJTE9900D.setMng_id(PJTE9900.getDeletedRows().get(i).getMng_id());

                result = pjte9900Service.delete_9900_01(PJTE9900D);
            }

        }
        return result;
    }

    @GetMapping(value = "/backup_select")
    public @ResponseBody String backup_select(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9900DTO PJTE9900 = new PJTE9900DTO();

        /* 서비스 요청**/
        List<PJTE9900DTO> list = pjte9900Service.select_9900_10(PJTE9900);

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

    @PostMapping("/backup_update")
    public @ResponseBody boolean backup_update(HttpServletRequest request, @RequestBody PJTE9900DTO PJTE9900) throws Exception{
        boolean result = false;

        PJTE9900DTO PJTE9900C = new PJTE9900DTO();
        PJTE9900DTO PJTE9900D = new PJTE9900DTO();


        PJTE9900D.setNew_bkup_id(PJTE9900.getNew_bkup_id());
        PJTE9900D.setPrjt_id(PJTE9900.getPrjt_id());

        result = pjte9900Service.delete_9900_10(PJTE9900D);

        PJTE9900C.setNew_bkup_id(PJTE9900.getNew_bkup_id());
        PJTE9900C.setNew_bkup_nm(PJTE9900.getNew_bkup_nm());
        PJTE9900C.setPrjt_id(PJTE9900.getPrjt_id());
        PJTE9900C.setLogin_emp_no(PJTE9900.getLogin_emp_no());

        result = pjte9900Service.insert_9900_10(PJTE9900C);

        result = pjte9900Service.delete_9900_20(PJTE9900D);

        result = pjte9900Service.insert_9900_20(PJTE9900C);

        return result;
    }
}
