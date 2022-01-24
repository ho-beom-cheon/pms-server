package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE6000DTO;
import com.iteyes.mapper.pms.PJTE6000Mapper;
import com.iteyes.service.PJTE6000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE6000ServiceImpl implements PJTE6000Service {
	@Autowired
	private PJTE6000Mapper PJTE6000Mapper;

	@Override
	public List<PJTE6000DTO> select_6000_01(PJTE6000DTO PJTE6000) throws Exception {

		return PJTE6000Mapper.select_6000_01(PJTE6000);
	}
}
