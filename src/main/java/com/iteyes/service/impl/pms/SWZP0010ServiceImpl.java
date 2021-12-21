package com.iteyes.service.impl.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.pms.SWZP0010DTO;
import com.iteyes.mapper.pms.SWZP0010Mapper;
import com.iteyes.service.SWZP0010Service;

@Service
public class SWZP0010ServiceImpl implements SWZP0010Service{
	@Autowired
	private SWZP0010Mapper swzp0010Mapper;
	
	@Override
	public List<SWZP0010DTO> select_0010(SWZP0010DTO SWZP0010) throws Exception {
		
		
		return swzp0010Mapper.select_0010_01(SWZP0010);
	}
}
