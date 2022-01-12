package com.iteyes.service.impl.pms;

import java.util.List;

import com.iteyes.mapper.pms.PJTE2200Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.pms.PJTE2200DTO;
import com.iteyes.service.PJTE2200Service;

@Service
public class PJTE2200ServiceImpl implements PJTE2200Service {
	@Autowired
	private PJTE2200Mapper PJTE2200Mapper;

	@Override
	public List<PJTE2200DTO> select_0030_01(PJTE2200DTO SWZP0030) throws Exception {

		return PJTE2200Mapper.select_0030_01(SWZP0030);
	}
	
	/* create */
	@Override
	public boolean insert_0030_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.insert_0030_01(PJTE2200);
	}

	/* update */
	@Override
	public boolean update_0030_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.update_0030_01(PJTE2200);
	}

	/* delete */
	@Override
	public boolean update_0030_02(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.update_0030_02(PJTE2200);
	}
}
