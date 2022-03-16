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
	/* select */
	@Override
	public List<PJTE2200DTO> select_2200_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.select_2200_01(PJTE2200);
	}
	/* create */
	@Override
	public boolean insert_2200_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.insert_2200_01(PJTE2200);
	}
	/* update */
	@Override
	public boolean update_2200_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.update_2200_01(PJTE2200);
	}
	/* delete */
	@Override
	public boolean delete_2200_01(PJTE2200DTO PJTE2200) throws Exception {

		return PJTE2200Mapper.delete_2200_01(PJTE2200);
	}
}
