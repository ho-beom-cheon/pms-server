package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE9120DTO;
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
    //조회
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
    //조회
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

//     * 요청인력내역저장
//     /**
//     * @author ys
//     * @param PJTE9300
//     * @return result (true)
//     * @throws Exception
//     */

    @PutMapping("/update_9300_01")
    public @ResponseBody boolean update_9300_01(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        if(PJTE9300.getGridData().size() != 0) {
            PJTE9300DTO PJTE9300C = new PJTE9300DTO();

            for (int i = 0; i < PJTE9300.getGridData().size(); i++) {
                PJTE9300C.setPrjt_id(PJTE9300.getPrjt_id());
        //        PJTE9300C.setDept_nm(PJTE9300.getGridData().get(i).getDept_nm());
                PJTE9300C.setReal_prjt_id(PJTE9300.getGridData().get(i).getReal_prjt_id());
                PJTE9300C.setSch_ent_dt(PJTE9300.getGridData().get(i).getSch_ent_dt());
                PJTE9300C.setSkill_grd(PJTE9300.getGridData().get(i).getSkill_grd());
                PJTE9300C.setMain_skill(PJTE9300.getGridData().get(i).getMain_skill());
                PJTE9300C.setDuty_txt(PJTE9300.getGridData().get(i).getDuty_txt());
                PJTE9300C.setOth_cnt(PJTE9300.getGridData().get(i).getOth_cnt());
                PJTE9300C.setNmbr_rcrt(PJTE9300.getGridData().get(i).getNmbr_rcrt());
                PJTE9300C.setOpr_nm(PJTE9300.getGridData().get(i).getOpr_nm());
                PJTE9300C.setAplc_dtls(PJTE9300.getGridData().get(i).getAplc_dtls());
                PJTE9300C.setBkup_id(PJTE9300.getGridData().get(i).getBkup_id());
                PJTE9300C.setSqno(PJTE9300.getGridData().get(i).getSqno());
                PJTE9300C.setOpr_no(PJTE9300.getGridData().get(i).getOpr_no());

                PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());

                result = PJTE9300Service.update_9300_01(PJTE9300C);
            }
        }
        return result;
    }
    //지원
    @PutMapping("/update_9300_02")
    public @ResponseBody boolean update_9300_02(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

            PJTE9300DTO PJTE9300C = new PJTE9300DTO();

                PJTE9300C.setPrjt_id(PJTE9300.getPrjt_id());
                PJTE9300C.setReal_prjt_id(PJTE9300.getReal_prjt_id());
                PJTE9300C.setSqno(PJTE9300.getSqno());
                PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());

                result = PJTE9300Service.update_9300_02(PJTE9300C);

        return result;
    }
    //삭제
    @PutMapping("/update_9300_03")
    public @ResponseBody boolean update_9300_03(@RequestBody PJTE9300DTO PJTE9300) throws Exception{
        boolean result = false;

        PJTE9300DTO PJTE9300C = new PJTE9300DTO();

            PJTE9300C.setPrjt_id(PJTE9300.getPrjt_id());
            PJTE9300C.setReal_prjt_id(PJTE9300.getReal_prjt_id());
            PJTE9300C.setSqno(PJTE9300.getSqno());
            PJTE9300C.setLogin_emp_no(PJTE9300.getLogin_emp_no());

        result = PJTE9300Service.update_9300_03(PJTE9300C);

        return result;
    }

}
