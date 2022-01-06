package com.iteyes.service.impl.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.MainDTO;
import com.iteyes.dto.User;
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
    public List<String> select_0000() throws Exception {

        return mainMapper.select_0000_01();
    }

	@Override
	public List<MainDTO> userInfo(MainDTO mainDto) throws Exception {
		
		return mainMapper.select_0120_01(mainDto);
	}

    @Override
    public boolean pw_change_0000(MainDTO user) throws Exception {
        return mainMapper.pw_change_0000(user);
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
