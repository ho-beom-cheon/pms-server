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
        PJTE9100.setBubun_cd(request.getParameter("bubun_cd_selected"));
        PJTE9100.setBsn_cls_cd(request.getParameter("bsn_cls_cd_selected"));
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

        PJTE9100DTO PJTE9100U = new PJTE9100DTO();

        PJTE9100U.setBkup_id     (PJTE9100.getBkup_id      ());
        PJTE9100U.setPrjt_id     (PJTE9100.getPrjt_id      ());
        PJTE9100U.setGesipan_id  (PJTE9100.getGesipan_id   ());    //게시판ID

        PJTE9100U.setBubun_cd     (PJTE9100.getBubun_cd     ());    //부문코드
        PJTE9100U.setBsn_cls_cd   (PJTE9100.getBsn_cls_cd   ());    //업무구분코드
        PJTE9100U.setGesipan_titl (PJTE9100.getGesipan_titl ());    //게시판제목
        PJTE9100U.setGesipan_dsc  (PJTE9100.getGesipan_dsc  ());    //게시판설명
        PJTE9100U.setAnnym_yn     (PJTE9100.getAnnym_yn     ());    //익명여부
        PJTE9100U.setCmnt_yn      (PJTE9100.getCmnt_yn      ());    //댓글여부
        PJTE9100U.setRply_yn      (PJTE9100.getRply_yn      ());    //답글여부
        PJTE9100U.setGood_yn      (PJTE9100.getGood_yn      ());    //좋아요여부
        PJTE9100U.setAfrm_yn      (PJTE9100.getAfrm_yn      ());    //소속확인여부
        PJTE9100U.setNmb_inq_yn   (PJTE9100.getNmb_inq_yn   ());    //조회횟수여부
        PJTE9100U.setPgn_yn       (PJTE9100.getPgn_yn       ());    //페이징여부
        PJTE9100U.setFile_upld_yn (PJTE9100.getFile_upld_yn ());    //파일업로드여부
        PJTE9100U.setLogin_emp_no (PJTE9100.getLogin_emp_no ());    //직원번호

        result = pjte9100Service.update_9100_01(PJTE9100U);

        return result;

    }

    @PostMapping("/insert")
    public @ResponseBody
    boolean create(HttpServletRequest request, @RequestBody PJTE9100DTO PJTE9100) throws Exception {
        boolean result = false;

        PJTE9100DTO PJTE9100C = new PJTE9100DTO();

        PJTE9100C.setPrjt_id     (PJTE9100.getPrjt_id());
        PJTE9100C.setBkup_id     (PJTE9100.getBkup_id());

        PJTE9100C.setLogin_emp_no (PJTE9100.getLogin_emp_no ());    //직원번호
        PJTE9100C.setBubun_cd     (PJTE9100.getBubun_cd     ());    //부문코드
        PJTE9100C.setBsn_cls_cd   (PJTE9100.getBsn_cls_cd   ());    //업무구분코드
        PJTE9100C.setGesipan_titl (PJTE9100.getGesipan_titl ());    //게시판제목
        PJTE9100C.setGood_yn      (PJTE9100.getGood_yn      ());    //좋아요여부
        PJTE9100C.setAnnym_yn     (PJTE9100.getAnnym_yn     ());    //익명여부
        PJTE9100C.setCmnt_yn      (PJTE9100.getCmnt_yn      ());    //댓글여부
        PJTE9100C.setRply_yn      (PJTE9100.getRply_yn      ());    //답글여부
        PJTE9100C.setGesipan_id   (PJTE9100.getGesipan_id   ());    //게시판ID
        PJTE9100C.setGesipan_dsc  (PJTE9100.getGesipan_dsc  ());    //게시판설명
        PJTE9100C.setAfrm_yn      (PJTE9100.getAfrm_yn      ());    //소속확인여부
        PJTE9100C.setNmb_inq_yn   (PJTE9100.getNmb_inq_yn   ());    //조회횟수여부
        PJTE9100C.setPgn_yn       (PJTE9100.getPgn_yn       ());    //페이징여부
        PJTE9100C.setFile_upld_yn (PJTE9100.getFile_upld_yn ());    //파일업로드여부

        result = pjte9100Service.insert_9100_01(PJTE9100C);

        return result;
    }
}
