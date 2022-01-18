package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE3000DTO;
import com.iteyes.mapper.pms.PJTE3000Mapper;
import com.iteyes.service.PJTE3000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE3000ServiceImpl implements PJTE3000Service {
	@Autowired
	private PJTE3000Mapper PJTE3000Mapper;
	
	@Override
	public List<PJTE3000DTO> select_3000_01(PJTE3000DTO PJTE3000) throws Exception {
		return PJTE3000Mapper.select_3000_01(PJTE3000);
	}
}
