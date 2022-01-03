package com.iteyes.service.impl.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.MainDTO;
import com.iteyes.dto.User;
import com.iteyes.dto.pms.SWZP9000DTO;
import com.iteyes.mapper.MainMapper;
import com.iteyes.service.UserService;

/**
 * UserService
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private MainMapper mainMapper;
	
	@Override
	public List<MainDTO> userInfo(MainDTO mainDto) throws Exception {
		
		return mainMapper.select_0120_01(mainDto);
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
