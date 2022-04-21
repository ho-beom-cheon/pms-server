package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9310DTO;
import com.iteyes.mapper.pms.PJTE9310Mapper;
import com.iteyes.service.PJTE9310Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE9310ServiceImpl implements PJTE9310Service {
	@Autowired
	private PJTE9310Mapper PJTE9310Mapper;

	@Override
	public List<PJTE9310DTO> select_0000_01(PJTE9310DTO PJTE9310) throws Exception {

		List<PJTE9310DTO> list =  PJTE9310Mapper.select_0000_01(PJTE9310);

		return list;
	}

	/*select*/
	@Override
	public List<PJTE9310DTO> select_9310_01(PJTE9310DTO PJTE9310) throws Exception {
		List<PJTE9310DTO> list = new ArrayList<>();

		list = PJTE9310Mapper.select_9310_01(PJTE9310);
		return list;
	}

	@Override
	public boolean delete_9310_01(PJTE9310DTO PJTE9310D) throws Exception {
		return PJTE9310Mapper.delete_9310_01(PJTE9310D);
	}

	@Override
	public boolean insert_9310_01(PJTE9310DTO PJTE9310C) throws Exception {
		return PJTE9310Mapper.insert_9310_01(PJTE9310C);
	}


}
