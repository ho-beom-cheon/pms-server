package com.iteyes.service.impl.pms;

import java.util.List;

import com.iteyes.dto.pms.PJTE2100DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.mapper.pms.PJTE2100Mapper;
import com.iteyes.service.PJTE2100Service;

@Service
public class PJTE2100ServiceImpl implements PJTE2100Service {
	@Autowired
	private PJTE2100Mapper pjte2100Mapper;

	@Override
	public List<PJTE2100DTO> select_0000_01(PJTE2100DTO PJTE2100) throws Exception {

		return pjte2100Mapper.select_0000_01(PJTE2100);
	}

	@Override
	public List<PJTE2100DTO> select_2100_01(PJTE2100DTO PJTE2100) throws Exception {

		return pjte2100Mapper.select_2100_01(PJTE2100);
	}

	/* create */
	@Override
	public boolean insert_2100_01(PJTE2100DTO PJTE2100) throws Exception {

		return pjte2100Mapper.insert_2100_01(PJTE2100);
	}

	/* update */
	@Override
	public boolean update_2100_01(PJTE2100DTO PJTE2100) throws Exception {

		return pjte2100Mapper.update_2100_01(PJTE2100);
	}

	/* delete */
	@Override
	public boolean update_2100_02(PJTE2100DTO PJTE2100) throws Exception {

		return pjte2100Mapper.update_2100_02(PJTE2100);
	}
}
