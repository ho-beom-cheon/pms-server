package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9300DTO;
import com.iteyes.mapper.pms.PJTE9300Mapper;
import com.iteyes.service.PJTE9300Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE9300ServiceImpl implements PJTE9300Service {
	@Autowired
	private PJTE9300Mapper PJTE9300Mapper;

	@Override
	public List<PJTE9300DTO> select_9300_01(PJTE9300DTO PJTE9300) throws Exception {

		List<PJTE9300DTO> list =  PJTE9300Mapper.select_9300_01(PJTE9300);

		return list;
	}
	/*select*/
	@Override
	public List<PJTE9300DTO> select_9300_02(PJTE9300DTO PJTE9300) throws Exception {
		List<PJTE9300DTO> list = new ArrayList<>();

		list = PJTE9300Mapper.select_9300_02(PJTE9300);
		return list;
	}

	@Override
	public boolean insert_9300_01(PJTE9300DTO PJTE9300C) throws Exception {
		return PJTE9300Mapper.insert_9300_01(PJTE9300C);
	}
	@Override
	public boolean update_9300_01(PJTE9300DTO PJTE9300C) throws Exception {
		return PJTE9300Mapper.update_9300_01(PJTE9300C);
	}
	@Override
	public boolean update_9300_02(PJTE9300DTO PJTE9300C) throws Exception {
		return PJTE9300Mapper.update_9300_02(PJTE9300C);
	}
	@Override
	public boolean update_9300_03(PJTE9300DTO PJTE9300C) throws Exception {
		return PJTE9300Mapper.update_9300_03(PJTE9300C);
	}


}
