package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE6001DTO;
import com.iteyes.mapper.pms.PJTE6001Mapper;
import com.iteyes.service.PJTE6001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE6001ServiceImpl implements PJTE6001Service {
	@Autowired
	private PJTE6001Mapper PJTE6001Mapper;

	@Override
	public List<PJTE6001DTO> select_6001_01(PJTE6001DTO PJTE6001) throws Exception {

		return PJTE6001Mapper.select_6001_01(PJTE6001);
	}

	@Override
	public boolean insert_6001_01(PJTE6001DTO PJTE6001) throws Exception {

		return PJTE6001Mapper.insert_6001_01(PJTE6001);
	}

	@Override
	public boolean update_6001_01(PJTE6001DTO PJTE6001) throws Exception {

		return PJTE6001Mapper.update_6001_01(PJTE6001);
	}
}
