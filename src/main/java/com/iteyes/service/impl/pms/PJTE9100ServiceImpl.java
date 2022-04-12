package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9100DTO;
import com.iteyes.mapper.pms.PJTE9100Mapper;
import com.iteyes.service.PJTE9100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9100ServiceImpl implements PJTE9100Service {
	@Autowired
	private PJTE9100Mapper pjte9100Mapper;

	/* select */
	@Override
	public List<PJTE9100DTO> select_9100_01(PJTE9100DTO PJTE9100) throws Exception {

		return pjte9100Mapper.select_9100_01(PJTE9100);
	}

	/* create */
	@Override
	public boolean insert_9100_01(PJTE9100DTO PJTE9100) throws Exception {

		return pjte9100Mapper.insert_9100_01(PJTE9100);
	}


	/* update */
	@Override
	public boolean update_9100_01(PJTE9100DTO PJTE9100) throws Exception {

		return pjte9100Mapper.update_9100_01(PJTE9100);
	}
}
