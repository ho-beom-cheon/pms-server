package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE2100DTO;
import com.iteyes.dto.pms.PJTE2200DTO;
import com.iteyes.dto.pms.PJTE5000DTO;
import com.iteyes.dto.pms.PJTE9120DTO;
import com.iteyes.service.PJTE9120Service;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@CrossOrigin("*")
@RequestMapping(value = "/PJTE9120")
public class PJTE9120Controller {

    @Autowired
    private PJTE9120Service PJTE9120Service;

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
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_id"));

        /* 서비스 요청 - 공통콤보박스 select */
        List<PJTE9120DTO> list = PJTE9120Service.select_0000_01(PJTE9120);

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
     * 게시내역목록조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
    @GetMapping(value = "/select_9120_01")
    public @ResponseBody String select_9120_01(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9120.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE9120.setGesipan_id(request.getParameter("gesipan_id"));

        /* 서비스 요청**/
        List<PJTE9120DTO> list = PJTE9120Service.select_9120_01(PJTE9120);

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
     * 답글내역목록조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
    @GetMapping(value = "/select_9120_02")
    public @ResponseBody String select_9120_02(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9120.setPost_id(request.getParameter("post_id"));

        /* 서비스 요청**/
        List<PJTE9120DTO> list = PJTE9120Service.select_9120_02(PJTE9120);

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
     * 댓글내역목록조회
     * @author hib
     * @param request
     * @return jsonStr
     * @throws Exception
     */
    @GetMapping(value = "/select_9120_03")
    public @ResponseBody String select_9120_03(HttpServletRequest request) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        /* 빈 dto 생성 */
        PJTE9120DTO PJTE9120 = new PJTE9120DTO();

        /* dto 값 셋팅*/
        PJTE9120.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE9120.setPost_id(request.getParameter("post_id"));

        /* 서비스 요청**/
        List<PJTE9120DTO> list = PJTE9120Service.select_9120_03(PJTE9120);

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
     * 조회수 증가
     * @author hib
     * @param PJTE9120U
     * @return result
     * @throws Exception
     */
    @PutMapping("/update_9120_01")
    public @ResponseBody boolean update_9120_01(@RequestBody PJTE9120DTO PJTE9120U) throws Exception{
        boolean result = false;

        PJTE9120DTO PJTE9120 = new PJTE9120DTO();
        //Logger logger = LogManager.getLogger(this.getClass());

        PJTE9120.setPrjt_id(PJTE9120U.getPrjt_id());
        PJTE9120.setPost_id(PJTE9120U.getPost_id());

        PJTE9120.setLogin_aut_cd(PJTE9120.getLogin_aut_cd());
        PJTE9120.setLogin_emp_no(PJTE9120.getLogin_emp_no());
        PJTE9120.setLogin_bzcd(PJTE9120.getLogin_bzcd());
        PJTE9120.setLogin_proj_id(PJTE9120.getLogin_proj_id());

        result = PJTE9120Service.update_9120_01(PJTE9120);

        return result;
    }

    /**
     * 게시정보 등록
     * @author hib
     * @param PJTE9120
     * @return result (true)
     * @throws Exception
     */
    @PostMapping("/insert_9120_01")
    public @ResponseBody boolean insert_9120_01(@RequestBody PJTE9120DTO PJTE9120) throws Exception{
        boolean result = false;

        PJTE9120DTO PJTE9120C = new PJTE9120DTO();

        PJTE9120C.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120C.setGesipan_id(PJTE9120.getGesipan_id());
        PJTE9120C.setPost_titl(PJTE9120.getPost_titl());
        PJTE9120C.setPost_dsc(PJTE9120.getPost_dsc());
        PJTE9120C.setTxt_psw(PJTE9120.getTxt_psw());
        PJTE9120C.setAtfl_mng_id(PJTE9120.getAtfl_mng_id());

        PJTE9120C.setLogin_emp_no(PJTE9120.getLogin_emp_no());

        result = PJTE9120Service.insert_9120_01(PJTE9120C);

        return result;
    }

    /**
     * 게시정보 삭제
     * @author hib
     * @param request
     * @param PJTE9120
     * @return result
     * @throws Exception
     */
    @PutMapping(value = "/delete_9120_01")
    public @ResponseBody
    int delete_9120_01(HttpServletRequest request, @RequestBody PJTE9120DTO PJTE9120) throws Exception {
        int result = 0;
        int result_reply = 0;
        int result_comment = 0;

        PJTE9120DTO PJTE9120D = new PJTE9120DTO();
        /* dto 값 셋팅 */
        PJTE9120D.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120D.setPost_id(PJTE9120.getPost_id());
        PJTE9120D.setTxt_psw(PJTE9120.getTxt_psw());

        if(Integer.parseInt(PJTE9120.getRpl_cnt()) != 0) {
            result_reply = PJTE9120Service.delete_9120_10(PJTE9120D);
            result += result_reply;
        }

        if(Integer.parseInt(PJTE9120.getCmnt_cnt()) != 0) {
            result_comment = PJTE9120Service.delete_9120_11(PJTE9120D);
            result += result_comment;
        }

        result = PJTE9120Service.delete_9120_01(PJTE9120D);

        return result;
    }

    /**
     * 답글정보 등록
     * @author hib
     * @param PJTE9120
     * @return result (true)
     * @throws Exception
     */
    @PostMapping("/insert_9120_02")
    public @ResponseBody boolean insert_9120_02(@RequestBody PJTE9120DTO PJTE9120) throws Exception{
        boolean result = false;

        PJTE9120DTO PJTE9120C = new PJTE9120DTO();

        PJTE9120C.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120C.setPost_id(PJTE9120.getPost_id());
        PJTE9120C.setRpl_no(PJTE9120.getRpl_no());
        PJTE9120C.setRpl_titl(PJTE9120.getRpl_titl());
        PJTE9120C.setGood_cd(PJTE9120.getGood_cd());
        PJTE9120C.setTxt_psw(PJTE9120.getTxt_psw());

        PJTE9120C.setLogin_emp_no(PJTE9120.getLogin_emp_no());

        result = PJTE9120Service.insert_9120_02(PJTE9120C);

        return result;
    }

    /**
     * 답글내역 삭제
     * @author hib
     * @param request
     * @param PJTE9120
     * @return result
     * @throws Exception
     */
    @PutMapping(value = "/delete_9120_02")
    public @ResponseBody
    boolean delete_9120_02(HttpServletRequest request, @RequestBody PJTE9120DTO PJTE9120) throws Exception {
        boolean result = false;

        PJTE9120DTO PJTE9120D = new PJTE9120DTO();
        /* dto 값 셋팅 */
        PJTE9120D.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120D.setPost_id(PJTE9120.getPost_id());
        PJTE9120D.setRpl_no(PJTE9120.getRpl_no());
        PJTE9120D.setTxt_psw(PJTE9120.getTxt_psw());

        result = PJTE9120Service.delete_9120_02(PJTE9120D);

        return result;
    }

    /**
     * 댓글정보 등록
     * @author hib
     * @param PJTE9120
     * @return result (true)
     * @throws Exception
     */
    @PostMapping("/insert_9120_03")
    public @ResponseBody boolean insert_9120_03(@RequestBody PJTE9120DTO PJTE9120) throws Exception{
        boolean result = false;

        PJTE9120DTO PJTE9120C = new PJTE9120DTO();

        PJTE9120C.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120C.setPost_id(PJTE9120.getPost_id());
        PJTE9120C.setPrn_cmnt_cd(PJTE9120.getPrn_cmnt_cd());
        PJTE9120C.setCmnt_titl(PJTE9120.getCmnt_titl());
        PJTE9120C.setTxt_psw(PJTE9120.getTxt_psw());

        PJTE9120C.setLogin_emp_no(PJTE9120.getLogin_emp_no());

        result = PJTE9120Service.insert_9120_03(PJTE9120C);

        return result;
    }

    /**
     * 댓글내역 삭제
     * @author hib
     * @param request
     * @param PJTE9120
     * @return result
     * @throws Exception
     */
    @PutMapping(value = "/delete_9120_03")
    public @ResponseBody
    boolean delete_9120_03(HttpServletRequest request, @RequestBody PJTE9120DTO PJTE9120) throws Exception {
        boolean result = false;

        PJTE9120DTO PJTE9120D = new PJTE9120DTO();
        /* dto 값 셋팅 */
        PJTE9120D.setPrjt_id(PJTE9120.getPrjt_id());
        PJTE9120D.setPost_id(PJTE9120.getPost_id());
        PJTE9120D.setCmnt_no(PJTE9120.getCmnt_no());
        PJTE9120D.setPrn_cmnt_cd(PJTE9120.getPrn_cmnt_cd());
        PJTE9120D.setTxt_psw(PJTE9120.getTxt_psw());

        result = PJTE9120Service.delete_9120_03(PJTE9120D);

        return result;
    }

    /**
         * 게시정보 첨부 등록
         * @author
         * @param
         * @return result
         * @throws Exception
         */
        @PutMapping("/update_9120_02")
        public @ResponseBody boolean update_9120_02(@RequestBody PJTE9120DTO PJTE9120) throws Exception{
            boolean result = false;

            PJTE9120DTO PJTE9120U = new PJTE9120DTO();

            PJTE9120U.setPrjt_id(PJTE9120.getPrjt_id());
            PJTE9120U.setPost_id(PJTE9120.getPost_id());
            PJTE9120U.setAtfl_mng_id(PJTE9120.getAtfl_mng_id());
            PJTE9120U.setTxt_psw(PJTE9120.getTxt_psw());

            result = PJTE9120Service.update_9120_02(PJTE9120U);

            return result;
        }
}
