package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9120DTO;
import com.iteyes.mapper.pms.PJTE9120Mapper;
import com.iteyes.service.PJTE9120Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE9120ServiceImpl implements PJTE9120Service {
	@Autowired
	private PJTE9120Mapper PJTE9120Mapper;

	@Override
	public List<PJTE9120DTO> select_0000_01(PJTE9120DTO PJTE9120) throws Exception {

		List<PJTE9120DTO> list =  PJTE9120Mapper.select_0000_01(PJTE9120);

		return list;
	}

	/*select*/
	@Override
	public List<PJTE9120DTO> select_9120_01(PJTE9120DTO PJTE9120) throws Exception {
		List<PJTE9120DTO> list = new ArrayList<>();

		list = PJTE9120Mapper.select_9120_01(PJTE9120);
		/*연관작업조회*/
		/*
		if(PJTE9120.getGubun().equals("3")) {
			list = PJTE9120Mapper.select_9120_03(PJTE9120);
		}*/

		return list;
	}

	@Override
	public List<PJTE9120DTO> select_9120_02(PJTE9120DTO PJTE9120) throws Exception {
		List<PJTE9120DTO> list = new ArrayList<>();

		list = PJTE9120Mapper.select_9120_02(PJTE9120);
		return list;
	}


}
