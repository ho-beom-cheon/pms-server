package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.PJTE0000DTO;
import com.iteyes.dto.User;


public interface PJTE0000Service {

    // 프로젝트 명 리스트 셋팅.
    List<String> select_0000() throws Exception ;

    // 로그인 계정은 고정값을 이용한다.
    User signin(String userId, String password, String pjt_selected, String btn_gubun);

    // 귀중한 정보를 전달한다.
    String getServerInfo();
    
    // 사용자 정보를 가져온다.
    List<PJTE0000DTO> userInfo(PJTE0000DTO PJTE0000Dto) throws Exception;
    List<PJTE0000DTO> pwdInfo(PJTE0000DTO PJTE0000Dto) throws Exception;

    // 비밀번호 변경 정보
    boolean pw_change_0000(PJTE0000DTO user) throws Exception;

    boolean update_0000_01(PJTE0000DTO PJTE0000) throws Exception;
}
