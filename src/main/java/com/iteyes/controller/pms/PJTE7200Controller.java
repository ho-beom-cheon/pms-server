package com.iteyes.controller.pms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.pms.PJTE7200DTO;
import com.iteyes.service.PJTE7200Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@CrossOrigin
@Controller
@Log4j2
@RequestMapping(value = "/PJTE7200")
public class PJTE7200Controller {

    @Autowired
    private PJTE7200Service pjte7200Service;

    @GetMapping(value = "/select_7200_01")
    public @ResponseBody
    String select01(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200 = new PJTE7200DTO();

        PJTE7200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7200.setRqs_dt(request.getParameter("rqs_dt"));
        PJTE7200.setRls_dt(request.getParameter("rls_dt"));
        PJTE7200.setDstr(request.getParameter("dstr_selectedT"));
        PJTE7200.setPrcs_stts_cd(request.getParameter("prcs_stts_cd_selectedT"));
        PJTE7200.setRqs_no(request.getParameter("rqs_no"));
        PJTE7200.setRvw_no(request.getParameter("rvw_no"));
        PJTE7200.setAprv_no(request.getParameter("aprv_no"));
        PJTE7200.setCmpl_yn(request.getParameter("cmpl_yn"));

        List<PJTE7200DTO> list = pjte7200Service.select_7200_01(PJTE7200);
        HashMap<String, Object> hm = new HashMap();
        HashMap<String, Object> hm1 = new HashMap();
        HashMap<String, Object> hm1_pagination = new HashMap();
        hm.put("result", true);
        hm1.put("contents", list);
        hm1_pagination.put("page", 1);
        hm1_pagination.put("totalCount", 100);
        hm1.put("pagination", hm1_pagination);
        hm.put("data", hm1);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;
    }

    @GetMapping(value = "/select_7200_02")
    public @ResponseBody
    String select02(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200 = new PJTE7200DTO();


        PJTE7200.setPrjt_id(request.getParameter("prjt_nm_selected"));
        PJTE7200.setBkup_id(request.getParameter("bkup_id_selected"));
        PJTE7200.setRqs_id(request.getParameter("rqs_id"));

        List<PJTE7200DTO> list = pjte7200Service.select_7200_02(PJTE7200);

        HashMap<String, Object> hm = new HashMap();
        HashMap<String, Object> hm1 = new HashMap();
        HashMap<String, Object> hm1_pagination = new HashMap();
        hm.put("result", true);
        hm1.put("contents", list);
        hm1_pagination.put("page", 1);
        hm1_pagination.put("totalCount", 100);
        hm1.put("pagination", hm1_pagination);
        hm.put("data", hm1);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;
    }

    @PostMapping("/insert_7200_01")
    public @ResponseBody boolean insert(@RequestBody PJTE7200DTO PJTE7200) throws Exception{
        boolean result = false;

        ObjectMapper mapper = new ObjectMapper();

        PJTE7200DTO PJTE7200S = new PJTE7200DTO();
        PJTE7200DTO PJTE7200D = new PJTE7200DTO();
        PJTE7200DTO PJTE7200N = new PJTE7200DTO();

        PJTE7200DTO PJTE7200I = new PJTE7200DTO();
        PJTE7200DTO PJTE7200U = new PJTE7200DTO();

        log.debug("PJTE7200_Controller :: Rqs_id :"+PJTE7200.getRqs_id());



        if(PJTE7200.getRqs_id().equals("")) {
            PJTE7200S.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200S.setBkup_id("0000000000");

            List<PJTE7200DTO> list1 = pjte7200Service.select_7200_03(PJTE7200S);

            PJTE7200I.setRqs_id(list1.get(0).getMax_rqs_id());

            PJTE7200N.setBkup_id("0000000000");
            PJTE7200N.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200N.setRqs_id(list1.get(0).getMax_rqs_id());
            PJTE7200N.setRsn_rqs(PJTE7200.getRsn_rqs());
            PJTE7200N.setRls_dt(PJTE7200.getRls_dt());
            PJTE7200N.setDstr(PJTE7200.getDstr());
            PJTE7200N.setPrcs_stts_cd(PJTE7200.getPrcs_stts_cd());
            PJTE7200N.setRqs_no(PJTE7200.getRqs_no());
            PJTE7200N.setRvw_no(PJTE7200.getRvw_no());
            PJTE7200N.setAprv_no(PJTE7200.getAprv_no());
            PJTE7200N.setRmrmk(PJTE7200.getRmrmk());
            PJTE7200N.setLogin_emp_no(PJTE7200.getLogin_emp_no());

            result = pjte7200Service.insert_7200_01(PJTE7200N);

        } else {
            PJTE7200I.setRqs_id(PJTE7200.getRqs_id());


            PJTE7200U.setBkup_id("0000000000");
            PJTE7200U.setPrjt_id(PJTE7200.getPrjt_id());
            PJTE7200U.setRqs_id(PJTE7200.getRqs_id());
            PJTE7200U.setRsn_rqs(PJTE7200.getRsn_rqs());
            PJTE7200U.setRls_dt(PJTE7200.getRls_dt());
            PJTE7200U.setDstr(PJTE7200.getDstr());
            PJTE7200U.setPrcs_stts_cd(PJTE7200.getPrcs_stts_cd());
            PJTE7200U.setRqs_no(PJTE7200.getRqs_no());
            PJTE7200U.setRvw_no(PJTE7200.getRvw_no());
            PJTE7200U.setAprv_no(PJTE7200.getAprv_no());
            PJTE7200U.setRmrmk(PJTE7200.getRmrmk());
            PJTE7200U.setLogin_emp_no(PJTE7200.getLogin_emp_no());

            result = pjte7200Service.update_7200_01(PJTE7200U);

            if(PJTE7200.getPrcs_stts_cd().equals("100") || PJTE7200.getPrcs_stts_cd().equals("180")) {
                /* dto 값 셋팅*/
                PJTE7200D.setPrjt_id(PJTE7200.getPrjt_id());
                PJTE7200D.setRqs_id(PJTE7200.getRqs_id());
                PJTE7200D.setBkup_id("0000000000");

                result = pjte7200Service.delete_7200_01(PJTE7200D);
            }
        }

        log.debug("PJTE7200_Controller :: getGridData :"+PJTE7200.getGridData());

        if(PJTE7200.getGridData() != null && (PJTE7200.getPrcs_stts_cd().equals("100") || PJTE7200.getPrcs_stts_cd().equals("180"))) {
            log.debug("PJTE7200_Controller :: getGridData.size :"+PJTE7200.getGridData().size());
            for (int i = 0; i < PJTE7200.getGridData().size(); i++) {
                PJTE7200I.setBkup_id("0000000000");
                PJTE7200I.setPrjt_id(PJTE7200.getPrjt_id());
                PJTE7200I.setSqno(i + 1);
                PJTE7200I.setTst_case_id(PJTE7200.getGridData().get(i).getTst_case_id());
                PJTE7200I.setMdfc(PJTE7200.getGridData().get(i).getMdfc());
                PJTE7200I.setRqs_pck_nm(PJTE7200.getGridData().get(i).getRqs_pck_nm());
                PJTE7200I.setLogin_emp_no(PJTE7200.getLogin_emp_no());
                result = pjte7200Service.insert_7200_02(PJTE7200I);
            }
        }

        return result;
    }
    @GetMapping(value = "/tarCreate")
    public @ResponseBody
    String tarCreate(HttpServletRequest request) throws Exception {
        /*[설 명]
         * 1. HttpURLConnection은 http 통신을 수행할 객체입니다
         * 2. URL 객체로 connection을 만듭니다
         * 3. 응답받은 결과를 InputStream으로 받아서 버퍼에 순차적으로 쌓습니다
         * */
        boolean result = false;
        boolean result1 = false;
        PJTE7200DTO PJTE7200U = new PJTE7200DTO();
        ObjectMapper mapper = new ObjectMapper();

        HashMap<String, Object> hm = new HashMap();
        HashMap<String, Object> hm1 = new HashMap();
        HashMap<String, Object> hm1_pagination = new HashMap();

        //데이터 정의 실시
        String url = "http://10.94.30.90:14444/nideploy/reqmktar.jsp";
        String data = "reqid=" + request.getParameter("reqid") + "&" +"reqrscs=" + request.getParameter("reqrscs");

        log.debug("url 데이터 : " + url);
        log.debug("data 데이터 : " + data);

        //메소드 호출 실시
        String responData = httpGetConnection(url, data);

        log.debug("응답 데이터 확인 : " + responData);


        //정규식 데이터 분리
        responData = responData + ",";
        int k = 0;
        String strArr[] = new String[5];

        //패턴설정
        Pattern pattern = Pattern.compile("[=](.*?)[,]");
        Matcher matcher = pattern.matcher(responData);

        while (matcher.find()){
            log.info("matcher : " + matcher.group(1));
            strArr[k] = matcher.group(1);
            k++;
            if(matcher.group(1) == null) {
                break;
            }
        }
        //값 세팅
        String issuc    = strArr[0];
        String reqid    = strArr[1];
        String tarname  = strArr[2];
        String reqrscs  = strArr[3];
        //값 확인 로그
        log.debug("issuc : "+ issuc);
        log.debug("reqid : "+ reqid);
        log.debug("tarname : "+ tarname);
        log.debug("reqrscs : "+ reqrscs);

        //배포요청 패키지명 분리
        String reqrscsArr[] = reqrscs.split("&");

        //배포메인 상태 업데이트
        PJTE7200U.setBkup_id("0000000000");
        PJTE7200U.setPrjt_id(request.getParameter("prjt_id"));
        PJTE7200U.setRqs_id(request.getParameter("reqid"));
        PJTE7200U.setLogin_emp_no(request.getParameter("login_emp_no"));
        if(issuc.equals("true")){
            PJTE7200U.setPrcs_stts_cd("190");
            hm.put("result", true);
        } else {
            PJTE7200U.setPrcs_stts_cd("180");
            hm.put("result", false);
        }

        result1 = pjte7200Service.update_7200_02(PJTE7200U);

        //배포목록 생성메시지 업데이트
        for(int i=0; i<reqrscsArr.length; i++){
            log.debug("reqrscs : " + reqrscsArr[i]);
            PJTE7200U.setSqno(i + 1);
            PJTE7200U.setErr_msg_cnt(reqrscsArr[i]);
            if(reqrscsArr[i].contains("FileNotFound")){
                PJTE7200U.setScs_yn("실패");
            } else {
                PJTE7200U.setScs_yn("성공");
            }
            result1 = pjte7200Service.update_7200_03(PJTE7200U);
        }

        hm.put("reqid", reqid);
        hm.put("reqrscs", reqrscs);
        hm1_pagination.put("page", 1);
        hm1_pagination.put("totalCount", 100);
        hm1.put("pagination", hm1_pagination);
        hm.put("data", hm1);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;
    }
    //http 요청 함수
    public static String httpGetConnection(String UrlData, String ParamData) {

        //http 요청 시 url 주소와 파라미터 데이터를 결합하기 위한 변수 선언
        String totalUrl = "";
        if(ParamData != null && ParamData.length() > 0 &&
                !ParamData.equals("") && !ParamData.contains("null")) { //파라미터 값이 널값이 아닌지 확인
            totalUrl = UrlData.trim().toString() + "?" + ParamData.trim().toString();
        }
        else {
            totalUrl = UrlData.trim().toString();
        }

        //http 통신을 하기위한 객체 선언 실시
        URL url = null;
        HttpURLConnection conn = null;

        //http 통신 요청 후 응답 받은 데이터를 담기 위한 변수
        String responseData = "";
        BufferedReader br = null;
        StringBuffer sb = null;

        //메소드 호출 결과값을 반환하기 위한 변수
        String returnData = "";

        try {
            //파라미터로 들어온 url을 사용해 connection 실시
            url = new URL(totalUrl);
            conn = (HttpURLConnection) url.openConnection();

            //http 요청에 필요한 타입 정의 실시
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestMethod("GET");

            //http 요청 실시
            conn.connect();
            log.debug("http 요청 방식 : "+"GET");
            log.debug("http 요청 타입 : "+"application/json");
            log.debug("http 요청 주소 : "+UrlData);
            log.debug("http 요청 데이터 : "+ParamData);
            log.debug("");

            //http 요청 후 응답 받은 데이터를 버퍼에 쌓는다
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            sb = new StringBuffer();
            while ((responseData = br.readLine()) != null) {
                sb.append(responseData); //StringBuffer에 응답받은 데이터 순차적으로 저장 실시
            }

            //메소드 호출 완료 시 반환하는 변수에 버퍼 데이터 삽입 실시
            returnData = sb.toString();

            //http 요청 응답 코드 확인 실시
            String responseCode = String.valueOf(conn.getResponseCode());
            log.debug("http 응답 코드 : " + responseCode);
            log.debug("http 응답 데이터 : " + returnData);
            return returnData;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //http 요청 및 응답 완료 후 BufferedReader를 닫아줍니다
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "http 통신 실패";
    }
}
