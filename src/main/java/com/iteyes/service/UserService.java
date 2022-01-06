package com.iteyes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iteyes.dto.MainDTO;
import com.iteyes.dto.User;
import com.iteyes.dto.pms.SWZP9000DTO;


public interface UserService {

    // 프로젝트 명 리스트 셋팅.
    public List<String> select_0000() throws Exception ;

    // 로그인 계정은 고정값을 이용한다.
    public User signin(String userId, String password, String pjt_selected);

    // 귀중한 정보를 전달한다.
    public String getServerInfo();
    
    // 사용자 정보를 가져온다.
    public List<MainDTO> userInfo(MainDTO mainDto) throws Exception;

    // 비밀번호 변경 정보
    public boolean pw_change_0000(MainDTO user) throws Exception;
}
