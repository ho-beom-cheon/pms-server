package com.iteyes.service.impl.pms;

import java.util.List;

import com.iteyes.mapper.PJTE0000Mapper;
import com.iteyes.service.PJTE0000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.PJTE0000DTO;
import com.iteyes.dto.User;

/**
 * PJTE0000Service
 */
@Service
public class PJTE0000ServiceImpl implements PJTE0000Service {

	@Autowired
	private PJTE0000Mapper PJTE0000Mapper;

    @Override
    public List<String> select_0000() throws Exception {

        return PJTE0000Mapper.select_0000_01();
    }

	@Override
	public List<PJTE0000DTO> userInfo(PJTE0000DTO PJTE0000) throws Exception {
		
		return PJTE0000Mapper.select_0120_01(PJTE0000);
	}

    @Override
    public boolean pw_change_0000(PJTE0000DTO user) throws Exception {
        return PJTE0000Mapper.pw_change_0000(user);
    }

    // 로그인 계정은 고정값을 이용한다.
	@Override
    public User signin(String userId, String password, String prjt_id) {

        if (userId != null && password != null) {
            return new User(userId, password, prjt_id);
        } else {
            throw new RuntimeException("사용자가 없습니다");
        }
    }
    // 귀중한 정보를 전달한다.
	@Override
    public String getServerInfo() {
        return "중요정보";
    }
}
