package com.iteyes.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.service.impl.pms.PJTE0000ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iteyes.dto.PJTE0000DTO;
import com.iteyes.dto.User;
import com.iteyes.service.JwtService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@CrossOrigin
@Slf4j
public class PJTE0000Controller {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private PJTE0000ServiceImpl userService;

    @GetMapping(value = "/pjtInfo")
    public @ResponseBody String projectInfo(HttpServletRequest request) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<String> list = userService.select_0000();

        HashMap<String, Object> hm = new HashMap();
        hm.put("data", list);

        String jsonStr = mapper.writeValueAsString(hm);

        return jsonStr;
    }
    @PutMapping(value = "/pwChange")
    public @ResponseBody boolean pwChange(@RequestBody User user) throws Exception{
        boolean result = false;
        Map<String, Object> resultMap = new HashMap<>();
        HttpStatus status = null;
        try {
            PJTE0000DTO updateUser = new PJTE0000DTO();

            updateUser.setEmpno(user.getUserId());
            updateUser.setLgn_pwd(user.getPassword());
            updateUser.setPrjt_id(user.getPjt_selected());

            result = userService.pw_change_0000(updateUser);
        } catch (RuntimeException e) {
            log.error("변경 실패", e);
            resultMap.put("message", e.getMessage());
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return result;
    }

    @PostMapping("/user/signin")
    public ResponseEntity<Map<String, Object>> signin(@RequestBody User user,
            HttpServletResponse res) throws Exception {
        Map<String, Object> resultMap = new HashMap<>();
        HttpStatus status = null;
        try {
        	PJTE0000DTO PJTE0000Dto = new PJTE0000DTO();
        	PJTE0000Dto.setEmpno(user.getUserId());
        	PJTE0000Dto.setLgn_pwd(user.getPassword());
        	PJTE0000Dto.setPrjt_id(user.getPjt_selected());

        	List<PJTE0000DTO> list = userService.userInfo(PJTE0000Dto);
        	
        	if(list.size() == 0){
        		User loginUser = userService.signin(null, null, null);
        	} else if (list.size() != 0) {
        		User loginUser = userService.signin(list.get(0).getEmpno(), list.get(0).getLgn_pwd(), list.get(0).getPrjt_id());
        		// 로그인 성공했다면 토큰을 생성한다.
                String token = jwtService.create(loginUser);
                // 토큰 정보는 request의 헤더로 보내고 나머지는 Map에 담아주자.
                res.setHeader("jwt-auth-token", token);
                
                resultMap.put("auth_token", token);
                resultMap.put("status", true);
                resultMap.put("data", list);
                status = HttpStatus.ACCEPTED;
        	}
        } catch (RuntimeException e) {
            log.error("로그인 실패", e);
            resultMap.put("message", e.getMessage());
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Map<String, Object>>(resultMap, status);
    }

    @PostMapping("/info")
    public ResponseEntity<Map<String, Object>> getInfo(HttpServletRequest req,
            @RequestBody User user) {
        Map<String, Object> resultMap = new HashMap<>();
        HttpStatus status = null;
        try {
            // 사용자에게 전달할 정보이다.
            String info = userService.getServerInfo();
            // 보너스로 토큰에 담긴 정보도 전달해보자. 서버에서 토큰을 사용하는 방법임을 알 수 있다.
            resultMap.putAll(jwtService.get(req.getHeader("jwt-auth-token")));

            resultMap.put("status", true);
            resultMap.put("info", info);
            resultMap.put("request_body", user);
            status = HttpStatus.ACCEPTED;
        } catch (RuntimeException e) {
            log.error("정보조회 실패", e);
            resultMap.put("message", e.getMessage());
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Map<String, Object>>(resultMap, status);
    }
}
